package com.pragma.powerup.messagingmicroservice.domain.usecase;

import com.pragma.powerup.messagingmicroservice.domain.api.ISmsServicePort;
import com.pragma.powerup.messagingmicroservice.domain.spi.ISmsSenderPort;
import com.pragma.powerup.messagingmicroservice.domain.validations.ArgumentValidations;

public class SmsUseCase implements ISmsServicePort {

    private final ISmsSenderPort smsSenderPort;

    public SmsUseCase(ISmsSenderPort smsSenderPort) {
        this.smsSenderPort = smsSenderPort;
    }

    @Override
    public void sendSms(String phone, String smsBody) {
        ArgumentValidations.validateString(phone,"phone");
        ArgumentValidations.validateString(smsBody,"smsBody");
        smsSenderPort.sendSms(phone,smsBody);
    }
}
