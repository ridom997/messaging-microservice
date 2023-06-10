package com.pragma.powerup.messagingmicroservice.domain.usecase;

import com.pragma.powerup.messagingmicroservice.domain.spi.ISmsSenderPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SmsUseCaseTest {
    @Mock
    private ISmsSenderPort smsSenderPort;

    @InjectMocks
    private SmsUseCase useCaseTest;

    @Test
    void sendSms(){
        String phone = "123";
        String smsBody = "... PIN 1233";

        useCaseTest.sendSms(phone,smsBody);

        verify(smsSenderPort, times(1)).sendSms(phone,smsBody);
    }
}
