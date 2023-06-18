package com.pragma.powerup.messagingmicroservice.domain.validations;

import com.pragma.powerup.messagingmicroservice.domain.exceptions.FailValidatingRequiredVariableException;

import static com.pragma.powerup.messagingmicroservice.domain.constants.DomainConstants.PAGE_NOT_VALID_MESSAGE;
import static com.pragma.powerup.messagingmicroservice.domain.constants.DomainConstants.SIZE_PAGE_NOT_VALID_MESSAGE;


public class PaginationValidations {

    private PaginationValidations() {
    }

    public static void validatePageAndSizePage(Integer page, Integer sizePage){
        if(page == null || page < 0)
            throw new FailValidatingRequiredVariableException(PAGE_NOT_VALID_MESSAGE);
        if(sizePage == null || sizePage <= 0)
            throw new FailValidatingRequiredVariableException(SIZE_PAGE_NOT_VALID_MESSAGE);
    }
}
