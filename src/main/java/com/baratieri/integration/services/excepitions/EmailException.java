package com.baratieri.integration.services.excepitions;

public class EmailException extends RuntimeException {
    private static final long serialVersionUID = 1l;

    public EmailException(String msg) {
        super(msg);
    }
}
