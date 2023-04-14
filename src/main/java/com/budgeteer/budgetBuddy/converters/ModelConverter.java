package com.budgeteer.budgetBuddy.converters;

import com.budgeteer.budgetBuddy.dao.models.Expense;
import com.budgeteer.budgetBuddy.model.ExpenseModel;

public class ModelConverter {

    public static ExpenseModel expenseToModel(Expense expense) {
        return new ExpenseModel.Builder()
                .withExpenseName(expense.getExpenseName())
                .withDueDate(expense.getDueDate())
                .withAmount(expense.getAmount())
                .withPaid(expense.isPaid())
                .withNotes(expense.getNotes())
                .build();
    }
}
