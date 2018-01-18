package FeedbackAnalytics.FeedbackProcessor;

import java.security.Security;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static boolean sendMessage(String smtpHost, String from,
            String fromUserPassword, String to, String subject,
            String messageText, String messageType) throws MessagingException {
        boolean isSent = false;
       // String host = "smtp.mail.yahoo.com";
        // 第一步：配置javax.mail.Session对象
        Properties props = System.getProperties();
        //props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "587");

        //props.put("mail.smtp.EnableSSL.enable","true");
        // props.put("mail.debug", "true");
        
        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, fromUserPassword);
            }
          });
        
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(from));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        
        msg.setSubject(subject);
        msg.setContent(messageText,  "text/html;charset=utf-8");
        
        Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,    InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
        
        isSent = true;
        return isSent;
    }

}
