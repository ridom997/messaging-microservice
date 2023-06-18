package com.pragma.powerup.messagingmicroservice.domain.validations;

import com.pragma.powerup.messagingmicroservice.domain.exceptions.FailValidatingRequiredVariableException;

public class ArgumentValidations {

    private ArgumentValidations() {
    }

    public static void validateString(String str, String nameVariable){
        if(str == null)
            throw new FailValidatingRequiredVariableException(nameVariable + " is not present");
    }
}
