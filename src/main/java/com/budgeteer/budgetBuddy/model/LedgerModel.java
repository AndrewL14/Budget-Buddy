package com.budgeteer.budgetBuddy.model;

import com.budgeteer.budgetBuddy.dao.models.Expense;
import com.budgeteer.budgetBuddy.dao.models.Income;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class LedgerModel {
    private String ledgerId;
    private String firstName;
    private String lastName;
    private HashMap<String, Income> incomes;
    private HashMap<String, Expense> expenses;
    private Set<String> recordIds;
    private BigDecimal totalBalanceBeforeExpense;
    private BigDecimal totalBalanceAfterExpense;

    public LedgerModel(String ledgerId, String firstName, String lastName,
                       HashMap<String, Income> incomes, HashMap<String, Expense> expenses,
                       Set<String> recordIds, BigDecimal totalBalanceBeforeExpense, BigDecimal totalBalanceAfterExpense) {
        this.ledgerId = ledgerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.incomes = incomes;
        this.expenses = expenses;
        this.recordIds = recordIds;
        this.totalBalanceBeforeExpense = totalBalanceBeforeExpense;
        this.totalBalanceAfterExpense = totalBalanceAfterExpense;
    }

    public LedgerModel(Builder builder) {
        this.ledgerId = builder.ledgerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.incomes = builder.incomes;
        this.expenses = builder.expenses;
        this.recordIds = builder.recordIds;
        this.totalBalanceBeforeExpense = builder.totalBalanceBeforeExpense;
        this.totalBalanceAfterExpense = builder.totalBalanceAfterExpense;
    }

    public String getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(HashMap<String, Income> incomes) {
        this.incomes = incomes;
    }

    public HashMap<String, Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(HashMap<String, Expense> expenses) {
        this.expenses = expenses;
    }

    public Set<String> getRecordIds() {
        return recordIds;
    }

    public void setRecordIds(Set<String> recordIds) {
        this.recordIds = recordIds;
    }

    public BigDecimal getTotalBalanceBeforeExpense() {
        return totalBalanceBeforeExpense;
    }

    public void setTotalBalanceBeforeExpense(BigDecimal totalBalanceBeforeExpense) {
        this.totalBalanceBeforeExpense = totalBalanceBeforeExpense;
    }

    public BigDecimal getTotalBalanceAfterExpense() {
        return totalBalanceAfterExpense;
    }

    public void setTotalBalanceAfterExpense(BigDecimal totalBalanceAfterExpense) {
        this.totalBalanceAfterExpense = totalBalanceAfterExpense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LedgerModel that = (LedgerModel) o;
        return ledgerId.equals(that.ledgerId) && firstName.equals(that.firstName)
                && lastName.equals(that.lastName) && incomes.equals(that.incomes)
                && expenses.equals(that.expenses) && recordIds.equals(that.recordIds)
                && totalBalanceBeforeExpense.equals(that.totalBalanceBeforeExpense)
                && totalBalanceAfterExpense.equals(that.totalBalanceAfterExpense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ledgerId , firstName , lastName , incomes,
                expenses , recordIds , totalBalanceBeforeExpense , totalBalanceAfterExpense);
    }

    @Override
    public String toString() {
        return "LedgerModel{" +
                "ledgerId='" + ledgerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", incomes=" + incomes +
                ", expenses=" + expenses +
                ", recordIds=" + recordIds +
                ", totalBalanceBeforeExpense=" + totalBalanceBeforeExpense +
                ", totalBalanceAfterExpense=" + totalBalanceAfterExpense +
                '}';
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String ledgerId;
        private String firstName;
        private String lastName;
        private HashMap<String, Income> incomes;
        private HashMap<String, Expense> expenses;
        private Set<String> recordIds;
        private BigDecimal totalBalanceBeforeExpense;
        private BigDecimal totalBalanceAfterExpense;

        public Builder withLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withIncomes(HashMap<String, Income> incomes) {
            this.incomes = incomes;
            return this;
        }

        public Builder withExpenses(HashMap<String, Expense> expenses) {
            this.expenses = expenses;
            return this;
        }

        public Builder withRecordIds(Set<String> recordIds) {
            this.recordIds = recordIds;
            return this;
        }

        public Builder withTotalBalanceBeforeExpense(BigDecimal totalBalanceBeforeExpense) {
            this.totalBalanceBeforeExpense = totalBalanceBeforeExpense;
            return this;
        }

        public Builder withTotalBalanceAfterExpense(BigDecimal totalBalanceAfterExpense) {
            this.totalBalanceAfterExpense = totalBalanceAfterExpense;
            return this;
        }

        public LedgerModel build() {
            return new LedgerModel(this);
        }
    }
}
