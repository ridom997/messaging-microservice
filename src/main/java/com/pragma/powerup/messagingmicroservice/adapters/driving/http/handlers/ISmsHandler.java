package com.pragma.powerup.messagingmicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.messagingmicroservice.adapters.driving.http.dto.request.SmsInfoDto;

public interface ISmsHandler {
    void sendSms(SmsInfoDto smsInfoDto);
}
