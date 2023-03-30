package com.budgeteer.budgetBuddy.model;

import java.math.BigDecimal;
import java.util.Objects;

public class IncomeModel {
    private String incomeSource;
    private String dueDate;
    private BigDecimal amount;
    private boolean given;
    private String notes;

    public IncomeModel(String incomeSource , String dueDate , BigDecimal amount , boolean given , String notes) {
        this.incomeSource = incomeSource;
        this.dueDate = dueDate;
        this.amount = amount;
        this.given = given;
        this.notes = notes;
    }

    public IncomeModel(Builder builder) {
        this.incomeSource = builder.incomeSource;
        this.dueDate = builder.dueDate;
        this.amount = builder.amount;
        this.given = builder.given;
        this.notes = builder.notes;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncomeModel that = (IncomeModel) o;
        return given == that.given && incomeSource.equals(that.incomeSource)
                && dueDate.equals(that.dueDate) && amount.equals(that.amount) && notes.equals(that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incomeSource , dueDate , amount , given , notes);
    }

    @Override
    public String toString() {
        return "IncomeModel{" +
                "incomeSource='" + incomeSource + '\'' +
                ", DueDate='" + dueDate + '\'' +
                ", amount=" + amount +
                ", given=" + given +
                ", notes='" + notes + '\'' +
                '}';
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String incomeSource;
        private String dueDate;
        private BigDecimal amount;
        private boolean given;
        private String notes;

        public Builder withIncomeSource(String incomeSource) {
            this.incomeSource = incomeSource;
            return this;
        }

        public Builder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder withGiven(boolean given) {
            this.given = given;
            return this;
        }

        public Builder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public IncomeModel build() {
            return new IncomeModel(this);
        }
    }
}
