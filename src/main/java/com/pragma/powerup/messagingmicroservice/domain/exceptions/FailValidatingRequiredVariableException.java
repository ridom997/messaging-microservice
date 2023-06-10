package com.pragma.powerup.messagingmicroservice.domain.exceptions;

public class FailValidatingRequiredVariableException extends RuntimeException{
    public FailValidatingRequiredVariableException(String message) {
        super(message);
    }
}
