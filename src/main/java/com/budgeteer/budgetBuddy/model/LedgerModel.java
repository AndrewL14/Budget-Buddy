package com.budgeteer.budgetBuddy.model;

import com.budgeteer.budgetBuddy.dao.models.Expense;
import com.budgeteer.budgetBuddy.dao.models.Income;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class LedgerModel {
    private String firstName;
    private String lastName;
    private HashMap<String, Income> incomes;
    private HashMap<String, Expense> expenses;
    private BigDecimal totalBalanceBeforeExpense;
    private BigDecimal totalBalanceAfterExpense;

    public LedgerModel(String firstName, String lastName,
                       HashMap<String, Income> incomes, HashMap<String, Expense> expenses,
                       BigDecimal totalBalanceBeforeExpense, BigDecimal totalBalanceAfterExpense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.incomes = incomes;
        this.expenses = expenses;
        this.totalBalanceBeforeExpense = totalBalanceBeforeExpense;
        this.totalBalanceAfterExpense = totalBalanceAfterExpense;
    }

    public LedgerModel(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.incomes = builder.incomes;
        this.expenses = builder.expenses;
        this.totalBalanceBeforeExpense = builder.totalBalanceBeforeExpense;
        this.totalBalanceAfterExpense = builder.totalBalanceAfterExpense;
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
        return firstName.equals(that.firstName) && lastName.equals(that.lastName)
                && Objects.equals(incomes , that.incomes) && Objects.equals(expenses , that.expenses)
                && Objects.equals(totalBalanceBeforeExpense , that.totalBalanceBeforeExpense)
                && Objects.equals(totalBalanceAfterExpense , that.totalBalanceAfterExpense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName , lastName ,incomes
                ,expenses , totalBalanceBeforeExpense , totalBalanceAfterExpense);
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private HashMap<String, Income> incomes;
        private HashMap<String, Expense> expenses;
        private BigDecimal totalBalanceBeforeExpense;
        private BigDecimal totalBalanceAfterExpense;

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
