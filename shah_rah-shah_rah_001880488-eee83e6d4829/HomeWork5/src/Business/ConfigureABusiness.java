/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author rahil
 */
public class ConfigureABusiness {
    
    public static Business xyz() throws ParseException {
    
        DateFormat datefun = new SimpleDateFormat("MM/dd/yyyy");
        Business business=new Business();
        Person person =business.getpDir().addPerson();
 
        person.setFirstName("Rahil");
        person.setLastName("Shah");
        person.setDateOfBirth(datefun.parse("12/18/1995"));
        
        Person p3= business.getpDir().addPerson();
        p3.setFirstName("Urja");
        p3.setLastName("Shah");
        p3.setDateOfBirth(datefun.parse("11/23/1999"));
        
        UserAccountDirectory userdir=business.getuDir();
        
        Person p2 =business.getpDir().searchPerson("Rahil","Shah");
        if(p2!=null)
        {
            UserAccount user=userdir.addAccount();
            user.setUperson(p2);
            user.setUserName("rahilshah10");
            user.setPassWord("animepahe");
            user.setRole("SystemAdmin");
            user.setAccountStatus(true);
        }
        Person p4 = business.getpDir().searchPerson("Urja","Shah");
        if(p4!=null)
        {
            UserAccount user2=userdir.addAccount();
            user2.setUperson(p4);
            user2.setUserName("urjashah23");
            user2.setPassWord("23111999");
            user2.setRole("HRManager");
            user2.setAccountStatus(true);
        }
       
        return business;
    }
    
}

