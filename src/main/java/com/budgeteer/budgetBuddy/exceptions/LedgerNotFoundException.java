package com.budgeteer.budgetBuddy.exceptions;

public class LedgerNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1781383784870457183L;

    public LedgerNotFoundException(String message) {
        super(message);
    }

    public LedgerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
