package com.pragma.powerup.messagingmicroservice.configuration;

import com.pragma.powerup.messagingmicroservice.configuration.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {


    private final JwtProvider jwtProvider;

}
