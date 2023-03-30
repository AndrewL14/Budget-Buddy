package com.budgeteer.budgetBuddy.dao.models;

import java.math.BigDecimal;

public class Income {
    private String incomeSource;
    private String DueDate;
    private BigDecimal amount;
    private boolean given;
    private String notes;

    public Income(String incomeSource , String dueDate , BigDecimal amount , boolean given , String notes) {
        this.incomeSource = incomeSource;
        DueDate = dueDate;
        this.amount = amount;
        this.given = given;
        this.notes = notes;
    }

    public Income() {
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isGiven() {
        return given;
    }

    public void setGiven(boolean given) {
        this.given = given;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
