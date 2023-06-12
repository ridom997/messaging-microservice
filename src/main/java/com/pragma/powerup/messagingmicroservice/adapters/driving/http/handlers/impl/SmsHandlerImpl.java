package com.pragma.powerup.messagingmicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.messagingmicroservice.adapters.driving.http.dto.request.SmsInfoDto;
import com.pragma.powerup.messagingmicroservice.adapters.driving.http.handlers.ISmsHandler;
import com.pragma.powerup.messagingmicroservice.domain.api.ISmsServicePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SmsHandlerImpl implements ISmsHandler {

    private final ISmsServicePort servicePort;

    @Override
    public void sendSms(SmsInfoDto smsInfoDto) {
        servicePort.sendSms(smsInfoDto.getPhone(),smsInfoDto.getSmsBody());
    }
}
