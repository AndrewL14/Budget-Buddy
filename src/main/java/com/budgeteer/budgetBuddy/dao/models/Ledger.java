package com.budgeteer.budgetBuddy.dao.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

@DynamoDBTable(tableName = "Ledgers")
public class Ledger {
    private String ledgerId;
    private String firstName;
    private String lastName;
    private HashMap<String, Income> incomes;
    private HashMap<String, Expense> expenses;
    private Set<String> recordIds;
    private BigDecimal totalBalanceBeforeExpense;
    private BigDecimal totalBalanceAfterExpense;

    @DynamoDBHashKey(attributeName = "ledgerId")
    public String getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
    }

    @DynamoDBAttribute(attributeName = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @DynamoDBAttribute(attributeName = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @DynamoDBAttribute(attributeName = "incomes")
    public HashMap<String, Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(HashMap<String, Income> incomes) {
        this.incomes = incomes;
    }

    @DynamoDBAttribute(attributeName = "expenses")
    public HashMap<String, Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(HashMap<String, Expense> expenses) {
        this.expenses = expenses;
    }

    @DynamoDBRangeKey(attributeName = "recordId")
    public Set<String> getRecordIds() {
        return recordIds;
    }

    public void setRecordIds(Set<String> recordIds) {
        this.recordIds = recordIds;
    }

    @DynamoDBAttribute(attributeName = "totalBalanceBeforeExpense")
    public BigDecimal getTotalBalanceBeforeExpense() {
        return totalBalanceBeforeExpense;
    }

    public void setTotalBalanceBeforeExpense(BigDecimal totalBalanceBeforeExpense) {
        this.totalBalanceBeforeExpense = totalBalanceBeforeExpense;
    }

    @DynamoDBAttribute(attributeName = "totalBalanceAfterExpense")
    public BigDecimal getTotalBalanceAfterExpense() {
        return totalBalanceAfterExpense;
    }

    public void setTotalBalanceAfterExpense(BigDecimal totalBalanceAfterExpense) {
        this.totalBalanceAfterExpense = totalBalanceAfterExpense;
    }
}
