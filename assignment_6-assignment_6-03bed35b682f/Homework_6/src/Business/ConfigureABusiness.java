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
    
        Business business=new Business();
        
        DateFormat datefun = new SimpleDateFormat("MM/dd/yyyy");
        //person case 1
        Person person =business.getPersonDirectory().addPerson();
        person.setFirstName("Rahil");
        person.setLastName("Shah");
        person.setDateOfBirth(datefun.parse("12/18/1995"));
        
        //person case 2
        Person p3= business.getPersonDirectory().addPerson();
        p3.setFirstName("Urja");
        p3.setLastName("Shah");
        p3.setDateOfBirth(datefun.parse("11/23/1999"));
        
        //person case 3
        Person p4= business.getPersonDirectory().addPerson();
        p4.setFirstName("Wen");
        p4.setLastName("Sun");
        p4.setDateOfBirth(datefun.parse("11/11/2000"));
        
        
        //person case 4
        Person p7= business.getPersonDirectory().addPerson();
        p7.setFirstName("Manager");
        p7.setLastName("Supplier");
        p7.setDateOfBirth(datefun.parse("11/11/2000"));
        
        UserAccountDirectory userdir=business.getUserDirectory();
        
        Person p2 =business.getPersonDirectory().searchPerson("Rahil","Shah");
        if(p2!=null)
        {
            UserAccount user=userdir.addAccount();
            user.setUperson(p2);
            user.setUserName("admin");
            user.setPassWord("admin");
            user.setRole("SystemAdmin");
            user.setAccountStatus(true);
        }
        Person p5 = business.getPersonDirectory().searchPerson("Urja","Shah");
        if(p5!=null)
        {
            UserAccount user2=userdir.addAccount();
            user2.setUperson(p5);
            user2.setUserName("hr");
            user2.setPassWord("hr");
            user2.setRole("HRManager");
            user2.setAccountStatus(true);
        }
        
        Person p6 = business.getPersonDirectory().searchPerson("Wen","Sun");
        if(p6!=null)
        {
            UserAccount user3=userdir.addAccount();
            user3.setUperson(p6);
            user3.setUserName("salesman");
            user3.setPassWord("salesman");
            user3.setRole("Salesman");
            user3.setAccountStatus(true);
        }
        
        Person p8  = business.getPersonDirectory().searchPerson("Manager","Supplier");
        if(p8!=null)
        {
            UserAccount user3=userdir.addAccount();
            user3.setUperson(p8);
            user3.setUserName("manager");
            user3.setPassWord("manager");
            user3.setRole("Manager");
            user3.setAccountStatus(true);
        }
        
        MarketList ml = business.getMarketList();
        Market m1 = ml.addMarket();
        m1.setMarketName("Education");
        Customer c = m1.addCustomer();
        c.setCustomerName("NorthEastern University");
        c.setCustomerType(m1.getMarketName());
        c.setCustomerID(1);
        
        Market m2 = ml.addMarket();
        m2.setMarketName("Financial");
        
        Supplier s = business.getSupplierDirectory().addSupplier();
        s.setSupplierName("apple");
        
        Product p = s.getPc().addProduct();
        p.setProductName("iphone");
        p.setModelNumber(8);
        p.setAvailibility(100);
        
        MarketOffer mo= m1.getMarketOfferCatalog().addOffer();
        mo.setCeilingPrice(1000);
                    mo.setFloorPrice(750);
                    mo.setTargetPrice(800);
                    mo.setProduct(p);
                    mo.setMarket(m1.getMarketName());
       
        return business;
    }
    
}

