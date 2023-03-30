package com.budgeteer.budgetBuddy.exceptions;

public class ValidationException extends IllegalArgumentException{
    private static final long serialVersionUID = 6196320673855894350L;

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
