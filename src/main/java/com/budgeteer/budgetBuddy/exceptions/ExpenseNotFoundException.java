package com.budgeteer.budgetBuddy.exceptions;

public class ExpenseNotFoundException extends RuntimeException{
    private static final long serialVersionUID = -6786853533139063391L;

    public ExpenseNotFoundException(String message) {
        super(message);
    }

    public ExpenseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
