package com.pragma.powerup.messagingmicroservice.adapters.driven.sms.twilio.adapter;

import com.pragma.powerup.messagingmicroservice.adapters.driven.sms.twilio.eceptions.TwilioUnexpectedErrorException;
import com.pragma.powerup.messagingmicroservice.domain.spi.ISmsSenderPort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSenderTwilioAdapter implements ISmsSenderPort {


    private static final String TWILIO_ACCOUNT_SID = System.getenv("twilioAccountSID");
    private static final String TWILIO_AUTH_TOKEN = System.getenv("twilioAuthToken");
    private static final String TWILIO_MESSAGING_SERVICE_SID = System.getenv("twilioMessagingServiceSID");
    private static final String TWILIO_REGISTERED_PHONE = System.getenv("twilioRegisteredPhone");

    @Override
    public void sendSms(String phone, String smsBody) {
        try{
            Twilio.init(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN);
            Message.creator(
                    new PhoneNumber(TWILIO_REGISTERED_PHONE),
                    TWILIO_MESSAGING_SERVICE_SID,
                    phone + " - " + smsBody
            ).create();
        } catch (Exception e){
            throw new TwilioUnexpectedErrorException();
        }
    }
}

