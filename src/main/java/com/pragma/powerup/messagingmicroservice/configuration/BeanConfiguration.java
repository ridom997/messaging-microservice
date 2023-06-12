package com.pragma.powerup.messagingmicroservice.configuration;

import com.pragma.powerup.messagingmicroservice.adapters.driven.sms.twilio.adapter.SmsSenderTwilioAdapter;
import com.pragma.powerup.messagingmicroservice.domain.api.ISmsServicePort;
import com.pragma.powerup.messagingmicroservice.domain.spi.ISmsSenderPort;
import com.pragma.powerup.messagingmicroservice.domain.usecase.SmsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Bean
    public ISmsSenderPort smsSenderPort(){
        return new SmsSenderTwilioAdapter();
    }
    @Bean
    public ISmsServicePort servicePort(){
        return new SmsUseCase(smsSenderPort());
    }

}
