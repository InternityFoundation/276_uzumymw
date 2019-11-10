package com.example.vmac.WatBot;

import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import static com.twilio.example.Example.ACCOUNT_SID;
import static com.twilio.example.Example.AUTH_TOKEN;

public class TwilioClass {

public TwilioClass()

{
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
}
    public static void twiliocall() {
        final String ACCOUNT_SID = "AC1f07cd78041e86b20685c361f14dc1b6";
        final String AUTH_TOKEN = "e40c4258cdd49538ea6ee2bf543eab83";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = com.twilio.rest.api.v2010.account.Message.creator(
                new PhoneNumber("+12132842834"),
                new PhoneNumber("+12133207439"),
                "Hey! Testing TwilioClass Messaging").create();
        System.out.println(message.getSid());
    }
}
