package com.pragma.powerup.messagingmicroservice.configuration.security.exception;

public class NonUniqueRequestParamException extends RuntimeException{
    public NonUniqueRequestParamException(String message) {
        super(message);
    }
}
