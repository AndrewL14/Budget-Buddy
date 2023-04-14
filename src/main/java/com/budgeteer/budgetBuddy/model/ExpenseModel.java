package com.budgeteer.budgetBuddy.model;

import java.math.BigDecimal;
import java.util.Objects;

public class ExpenseModel {
    private String expenseName;
    private String dueDate;
    private BigDecimal amount;
    private boolean paid;
    private String notes;

    public ExpenseModel(String expenseName , String dueDate , BigDecimal amount , boolean paid , String notes) {
        this.expenseName = expenseName;
        this.dueDate = dueDate;
        this.amount = amount;
        this.paid = paid;
        this.notes = notes;
    }

    public ExpenseModel(Builder builder) {
        this.expenseName = builder.expenseName;
        this.dueDate = builder.dueDate;
        this.amount = builder.amount;
        this.paid = builder.paid;
        this.notes = builder.notes;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseModel that = (ExpenseModel) o;
        return paid == that.paid && expenseName.equals(that.expenseName)
                && dueDate.equals(that.dueDate) && amount.equals(that.amount) && notes.equals(that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expenseName , dueDate , amount , paid , notes);
    }

    @Override
    public String toString() {
        return "ExpenseModel{" +
                "expenseName='" + expenseName + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", amount=" + amount +
                ", paid=" + paid +
                ", notes='" + notes + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String expenseName;
        private String dueDate;
        private BigDecimal amount;
        private boolean paid;
        private String notes;

        public Builder withExpenseName(String expenseName) {
            this.expenseName = expenseName;
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

        public Builder withPaid(boolean paid) {
            this.paid = paid;
            return this;
        }

        public Builder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public ExpenseModel build() {
            return new ExpenseModel(this);
        }
    }
}
