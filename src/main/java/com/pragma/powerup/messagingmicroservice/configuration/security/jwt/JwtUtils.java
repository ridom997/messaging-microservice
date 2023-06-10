package com.pragma.powerup.messagingmicroservice.configuration.security.jwt;

import org.springframework.stereotype.Component;

@Component
public class JwtUtils {
    private JwtUtils (){}
    public static String getTokenFromRequestHeaders() {
        return JwtTokenFilter.getToken();
    }

}
