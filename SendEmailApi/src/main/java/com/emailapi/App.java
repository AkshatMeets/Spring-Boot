package com.emailapi;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.SQLOutput;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("preparing to send message...");
        String message="Message for security check...";
        String subject="CodersArea: Confirmation";
        String to ="akshatmehta220@gmail.com";
        String from = "akshatmehta222@gmail.com";

//        sendEmail(message,subject,to,from);
        sendAttach(message,subject,to,from);
    }

    //responsible to send message with attachment
    private static void sendAttach(String message, String subject, String to, String from) {


    }

    //responsible to send email
    private static void sendEmail(String message, String subject, String to, String from) {
        //variable for gmail host
        String host="smtp.gmail.com";

        //get the system properties
        Properties properties=System.getProperties();
        System.out.println("PROPERTIES"+properties);

        //setting imp info to properties
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //step:1 get the session object
        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("your_email","your_password");
            }
        });

        session.setDebug(true);

        //step 2: compose the message
        MimeMessage m=new MimeMessage(session);

        try {
            //from email
            m.setFrom(from);

            //adding recipient
            m.addRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(to)});

            //adding subject to message
            m.setSubject(subject);

            //adding text to message
            m.setText(message);

            //send

            //step 3: send message using transport class

            Transport.send(m);
            System.out.println("sent success.....");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
