# Budget Buddy API Documentation

## Background
People all over the world come in contact with money every day yet most don't understand
manage it. Understandably managing and keeping track of all your money can be stress full and
tiring.

This design document describes the Budget Buddy API, a service providing the ability to keep and
manage all a persons finances.

## Glossary

**User** - A person that has a unique access code to a personalized budget plan.

**Ledger** - Entire set of personal finances.

**Income** - Keeps track of all income streams

**Expense** - Keeps track of all expenses.

## Business Requirements
* As a user, I want to retrieve my ledger.
* As a user, I want to retrieve my calendar.
* As a user, I want to retrieve my income.
* As a user, I want to retrieve my expenses.
* As a user, I want to add, remove, or edit my expenses, income, and calendar for my ledger

## Architecture
![Figure 1](src/main/resources/BudgetBuddyArchitecture.png)

Figure 1: Diagram showing the architecture of the Budget Buddy API. A user connects to the 
clients' website. the Client makes a API call to the Budget Buddy API with AWS load balancer.
This Forwards the request to ECS, which connects to a persistent data store for Ledger,
income, and expense responses then flow back to the client.

## Budget Buddy Service API Implementation Notes

### `CreateLedger`
* Creates a new empty ledger for a given user id.
* returns a new ledger.
* Throws a `ValidationException` when the given user id is an empty string

//TODO write a json formatted CreateLedgerRequest and CreateLedgerResult

### `GetLedger`
* Retrieves the clients entire financials from User given a user id.
* Returns a list of Incomes and Expenses.
* Returns a list only if the given user id is valid.
* Throws a `ValidationException` when the given user id is an empty string.
* Throws a `LedgerNotFoundException` when there is no ledger matching user id.

//TODO write a json formatted GetLedgerRequest and GetLedgerResponse

### `RemoveLedger`
* Removes all data connected to a given user id.
* After a successful call to `RemoveLedger` for a user id, the `GetLedger` call with the same
user id should throw a `LedgerNotFoundException`
* Throws a `LedgerNotFoundException` when the given user id is not found.
* Throws a `ValidationException` when the given user id is an empty string.

//TODO write a json formatted RemoveLedgerRequest and RemoveLedgerResponse

### `UpdateLedger`
* Can remove, add, or modify A expense or income object given a user id, incomeID/expenseID.
* Returns the modified Ledger with the updated expense or income object.
* Throws a `ValidationException` when the given user id or incomeID/expenseID is an empty string.
* Throws a `ExpenseNotFoundException` when there is no expense matching expenseID.
* Throws a `IncomeNotFoundException` when there is no income matching incomeID.

//TODO write a json formatted UpdateLedgerRequest and UpdateLedgerResponse


## Data Model

Ledgers: Stores data about the users incomes and expenses.

Below are the data models for the DynamoDB table

### Ledger
Note: for both incomes and expenses keys are their recordIds, the recordIds will be there sort keys.
* userId (String, partition key)
* incomes (HashMap, Maps key is sortKey)
* expenses (HashMap, Maps key is sortKey)
* totalBalanceBeforeExpense (Number attribute)
* totalBalanceAfterExpense (Number attribute)

### Income 
* amount (Number)
* incomeSource (String)
* dueDate (String)
* note (String)
* paid (boolean)

### Expense
* expenseName (String)
* amount (Number)
* dueDate (String)
* note (String)
* paid (boolean)

## Class Diagram