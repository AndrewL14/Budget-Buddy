package com.budgeteer.budgetBuddy.exceptions;

public class IncomeNotFoundException extends RuntimeException{
    private static final long serialVersionUID = -6313154852932941629L;

    public IncomeNotFoundException(String message) {
        super(message);
    }

    public IncomeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
