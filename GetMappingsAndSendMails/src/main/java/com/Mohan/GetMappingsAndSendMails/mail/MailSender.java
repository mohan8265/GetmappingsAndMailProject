package com.Mohan.GetMappingsAndSendMails.mail;

import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@Component
public class MailSender {
    public void sendMail(String myMessage){

        Properties properties = System.getProperties();

        System.out.println(properties);

        properties.put("mail.smtp.host",MailMetadata.hostServer);
        properties.put("mail.smtp.port",MailMetadata.emailPort);
        properties.put(MailMetadata.sslProperty,"true");
        properties.put(MailMetadata.authPermission,"true");

        Authenticator authenticator = new MailAuthentication();
        Session session = Session.getInstance(properties,authenticator);

        MimeMessage mailMessage = new MimeMessage(session);

        try {
            mailMessage.setFrom(MailMetadata.myMail);
            mailMessage.setSubject("For testing purpose");
            mailMessage.setText(myMessage);

            Address receiverEmail = new InternetAddress(MailMetadata.receiverEmail);
            mailMessage.setRecipient(Message.RecipientType.TO, receiverEmail);

            Transport.send(mailMessage);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
