package com.budgeteer.budgetBuddy.activities;

import com.budgeteer.budgetBuddy.converters.ModelConverter;
import com.budgeteer.budgetBuddy.dao.LedgerDao;
import com.budgeteer.budgetBuddy.dao.models.Expense;
import com.budgeteer.budgetBuddy.dao.models.Ledger;
import com.budgeteer.budgetBuddy.model.requests.CreateExpenseRequest;
import com.budgeteer.budgetBuddy.model.responses.CreateExpenseResponse;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

public class CreateExpenseActivity {
    private final LedgerDao dao;

    public CreateExpenseActivity(LedgerDao dao) {
        this.dao = dao;
    }

    public CreateExpenseResponse execute(CreateExpenseRequest request) {
        if (request == null) {
            throw new InvalidParameterException();
        }
        UUID uuid = UUID.randomUUID();

        Ledger ledger = dao.get(request.getLedgerId()).get(0);
        HashMap<String, Expense> expenses = ledger.getExpenses();
        String recordId = uuid.toString();
        Expense expense = new Expense(request.getExpenseName(),
                request.getDueDate(),
                request.getAmount(), request.isPaid(),
                request.getNotes());

        expenses.put(recordId, expense);
        ledger.setExpenses(expenses);

        Set<String> recordIds = ledger.getRecordIds();

        recordIds.add(recordId);
        ledger.setRecordIds(recordIds);

        return new CreateExpenseResponse.Builder()
                .withModel(ModelConverter.expenseToModel(expense))
                .build();
    }
}
