package com.budgeteer.budgetBuddy.dao.models;

import java.math.BigDecimal;

public class Expense {
    private String expenseName;
    private String dueDate;
    private BigDecimal amount;
    private boolean paid;
    private String notes;

    public Expense(String expenseName , String dueDate , BigDecimal amount , boolean paid , String notes) {
        this.expenseName = expenseName;
        this.dueDate = dueDate;
        this.amount = amount;
        this.paid = paid;
        this.notes = notes;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
