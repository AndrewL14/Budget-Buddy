package com.budgeteer.budgetBuddy.model.responses;

import com.budgeteer.budgetBuddy.model.ExpenseModel;

import java.util.Objects;

public class CreateExpenseResponse {
    private ExpenseModel model;

    public CreateExpenseResponse(ExpenseModel model) {
        this.model = model;
    }

    public ExpenseModel getModel() {
        return model;
    }

    public void setModel(ExpenseModel model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateExpenseResponse that = (CreateExpenseResponse) o;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "CreateExpenseResponse{" +
                "model=" + model +
                '}';
    }
}
