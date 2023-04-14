package com.budgeteer.budgetBuddy.model.requests;

import com.budgeteer.budgetBuddy.model.ExpenseModel;

import java.math.BigDecimal;
import java.util.Objects;

public class CreateExpenseRequest {
    private String ledgerId;
    private String expenseName;
    private String dueDate;
    private BigDecimal amount;
    private boolean paid;
    private String notes;

    public CreateExpenseRequest(String ledgerId , String expenseName , String dueDate
            ,BigDecimal amount , boolean paid , String notes) {
        this.ledgerId = ledgerId;
        this.expenseName = expenseName;
        this.dueDate = dueDate;
        this.amount = amount;
        this.paid = paid;
        this.notes = notes;
    }

    public CreateExpenseRequest(String expenseName , String dueDate
            , BigDecimal amount , boolean paid , String notes) {
        this.expenseName = expenseName;
        this.dueDate = dueDate;
        this.amount = amount;
        this.paid = paid;
        this.notes = notes;
    }

    public CreateExpenseRequest(Builder builder) {
        this.ledgerId = builder.ledgerId;
        this.expenseName = builder.expenseName;
        this.dueDate = builder.dueDate;
        this.amount = builder.amount;
        this.paid = builder.paid;
        this.notes = builder.notes;
    }

    public String getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
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
        CreateExpenseRequest that = (CreateExpenseRequest) o;
        return paid == that.paid && ledgerId.equals(that.ledgerId)
                && Objects.equals(expenseName , that.expenseName)
                && Objects.equals(dueDate , that.dueDate) && Objects.equals(amount , that.amount)
                && Objects.equals(notes , that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ledgerId , expenseName , dueDate , amount , paid , notes);
    }

    @Override
    public String toString() {
        return "CreateExpenseRequest{" +
                "ledgerId='" + ledgerId + '\'' +
                ", expenseName='" + expenseName + '\'' +
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
        private String ledgerId;
        private String expenseName;
        private String dueDate;
        private BigDecimal amount;
        private boolean paid;
        private String notes;

        public Builder withLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        public Builder withIncomeSource(String expenseName) {
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

        public Builder withGiven(boolean paid) {
            this.paid = paid;
            return this;
        }

        public Builder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public CreateExpenseRequest build() {
            return new CreateExpenseRequest(this);
        }
    }
}
