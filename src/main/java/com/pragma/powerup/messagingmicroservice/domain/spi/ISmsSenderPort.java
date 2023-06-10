package com.pragma.powerup.messagingmicroservice.domain.spi;

public interface ISmsSenderPort {
    void sendSms(String phone, String smsBody);
}
