package com.pragma.powerup.messagingmicroservice.domain.api;

public interface ISmsServicePort {
    void sendSms(String phone, String smsBody);
}
