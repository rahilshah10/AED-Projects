/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.FeedbackProcessor;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author Zi Wei Fan
 */
public class MyAuthenticator extends Authenticator{
        String userName = "";
    String password = "";

    public MyAuthenticator() {

    }

    public MyAuthenticator(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);
    }
}
