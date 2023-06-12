package com.pragma.powerup.messagingmicroservice.configuration;

public class Constants {



    private Constants() {
        throw new IllegalStateException("Utility class");
    }


    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String WRONG_CREDENTIALS_MESSAGE = "Wrong credentials or role not allowed";
    public static final String SWAGGER_TITLE_MESSAGE = "Messaging API Pragma Power Up";
    public static final String SWAGGER_DESCRIPTION_MESSAGE = "Messaging microservice";
    public static final String SWAGGER_VERSION_MESSAGE = "1.0.0";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "http://springdoc.org";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "http://swagger.io/terms/";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String ERROR_PARSING_MESSAGE = "Error parsing a request variable";
    public static final String EMPLOYEE_ROLE_NAME = "ROLE_EMPLOYEE";
    public static final String PAGE_NOT_VALID_MESSAGE = "The Page index is not present or has a negative value";
    public static final String SIZE_PAGE_NOT_VALID_MESSAGE = "The Page size is not present or is <= 0";
    public static final String NOT_PRESENT_MESSAGE = " is not present";
    public static final String PHONE_REGEX = "^\\+?\\d{1,12}$";
}
