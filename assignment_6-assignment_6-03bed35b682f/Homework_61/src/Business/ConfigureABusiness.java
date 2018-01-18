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
        UserAccountDirectory userdir=business.getUserDirectory();
        
        DateFormat datefun = new SimpleDateFormat("MM/dd/yyyy");
        //person case 1
        Person person =business.getPersonDirectory().addPerson();
        person.setFirstName("Rahil");
        person.setLastName("Shah");
        person.setDateOfBirth(datefun.parse("12/18/1995"));
        
        Person person2 =business.getPersonDirectory().addPerson();
        person2.setFirstName("Kadeem");
        person2.setLastName("Allen");
        person2.setDateOfBirth(datefun.parse("2/18/1994"));
        
        
        UserAccount user10=userdir.addAccount();
        UserAccount user11=userdir.addAccount();
        UserAccount user12=userdir.addAccount();
        UserAccount user13=userdir.addAccount();
        UserAccount user14=userdir.addAccount();
        UserAccount user15=userdir.addAccount();
        UserAccount user16=userdir.addAccount();
        UserAccount user17=userdir.addAccount();
        UserAccount user18=userdir.addAccount();
        UserAccount user19=userdir.addAccount();
        UserAccount user20=userdir.addAccount();
        UserAccount user21=userdir.addAccount();
        UserAccount user22=userdir.addAccount();
        UserAccount user23=userdir.addAccount();
        
        
        
        
        
        
        
        
        
        

        Person p102 = business.getPersonDirectory().searchPerson("Kadeem","Allen");
        if(p102!=null)
        {
            
            user10.setUperson(p102);
            user10.setUserName("salesman2");
            user10.setPassWord("salesman2");
            user10.setRole("Salesman");
            user10.setAccountStatus(true);
        }
        
        
        
        Person person3 =business.getPersonDirectory().addPerson();
        person3.setFirstName("Aron");
        person3.setLastName("Baynes");
        person3.setDateOfBirth(datefun.parse("1/8/1992"));
        
        Person p03 = business.getPersonDirectory().searchPerson("Aron","Baynes");
        if(p03!=null)
        {
            
            user11.setUperson(p03);
            user11.setUserName("salesman3");
            user11.setPassWord("salesman3");
            user11.setRole("Salesman");
            user11.setAccountStatus(true);
        }
        
        Person person4 =business.getPersonDirectory().addPerson();
        person4.setFirstName("Jabari");
        person4.setLastName("Bird");
        person4.setDateOfBirth(datefun.parse("3/22/1990"));
        
        Person p04 = business.getPersonDirectory().searchPerson("Jabari","Bird");
        if(p04!=null)
        {
            
            user12.setUperson(p04);
            user12.setUserName("salesman4");
            user12.setPassWord("salesman4");
            user12.setRole("Salesman");
            user12.setAccountStatus(true);
        }
        
        Person person5 =business.getPersonDirectory().addPerson();
        person5.setFirstName("Jaylen");
        person5.setLastName("Brown");
        person5.setDateOfBirth(datefun.parse("11/21/1985"));
        
        Person p05 = business.getPersonDirectory().searchPerson("Jaylen","Brown");
        if(p05!=null)
        {
            
            user13.setUperson(p05);
            user13.setUserName("salesman5");
            user13.setPassWord("salesman5");
            user13.setRole("Salesman");
            user13.setAccountStatus(true);
            
        }
        
        
        Person person6 =business.getPersonDirectory().addPerson();
        person6.setFirstName("Gordon");
        person6.setLastName("Hayward");
        person6.setDateOfBirth(datefun.parse("5/26/1989"));
        
        Person p06 = business.getPersonDirectory().searchPerson("Gordon","Hayward");
        if(p06!=null)
        {
          
            user14.setUperson(p06);
            user14.setUserName("salesman6");
            user14.setPassWord("salesman6");
            user14.setRole("Salesman");
            user14.setAccountStatus(true);
        }
        
        Person person7 =business.getPersonDirectory().addPerson();
        person7.setFirstName("Al");
        person7.setLastName("Horford");
        person7.setDateOfBirth(datefun.parse("9/20/1991"));
        
        Person p07 = business.getPersonDirectory().searchPerson("Al","Horford");
        if(p07!=null)
        {
            user15.setUperson(p07);
            user15.setUserName("salesman7");
            user15.setPassWord("salesman7");
            user15.setRole("Salesman");
            user15.setAccountStatus(true);
        }
        
        Person person8 =business.getPersonDirectory().addPerson();
        person8.setFirstName("Kyrie");
        person8.setLastName("Irving");
        person8.setDateOfBirth(datefun.parse("6/22/1996"));
        
        Person p08 = business.getPersonDirectory().searchPerson("Kyrie","Irving");
        if(p08!=null)
        {
            user16.setUperson(p08);
            user16.setUserName("salesman8");
            user16.setPassWord("salesman8");
            user16.setRole("Salesman");
            user16.setAccountStatus(true);
        }
        
        Person person9 =business.getPersonDirectory().addPerson();
        person9.setFirstName("Shane");
        person9.setLastName("Larkin");
        person9.setDateOfBirth(datefun.parse("10/10/2000"));
        
        Person p09 = business.getPersonDirectory().searchPerson("Shane","Larkin");
        if(p09!=null)
        {
            
            user17.setUperson(p09);
            user17.setUserName("salesman9");
            user17.setPassWord("salesman9");
            user17.setRole("Salesman");
            user17.setAccountStatus(true);
        }
        
        Person person10 =business.getPersonDirectory().addPerson();
        person10.setFirstName("Abdel");
        person10.setLastName("Nader");
        person10.setDateOfBirth(datefun.parse("1/1/1995"));
        
        Person p010 = business.getPersonDirectory().searchPerson("Abdel","Nader");
        if(p010!=null)
        {
           
            user18.setUperson(p010);
            user18.setUserName("salesman10");
            user18.setPassWord("salesman10");
            user18.setRole("Salesman");
            user18.setAccountStatus(true);
        }
        
        Person person11 =business.getPersonDirectory().addPerson();
        person11.setFirstName("Semi");
        person11.setLastName("Ojeleye");
        person11.setDateOfBirth(datefun.parse("9/7/1997"));
        
        Person p011 = business.getPersonDirectory().searchPerson("Semi","Ojeleye");
        if(p011!=null)
        {
        
            user19.setUperson(p011);
            user19.setUserName("salesman11");
            user19.setPassWord("salesman11");
            user19.setRole("Salesman");
            user19.setAccountStatus(true);
        }
        
        Person person12 =business.getPersonDirectory().addPerson();
        person12.setFirstName("Terry");
        person12.setLastName("Rozier");
        person12.setDateOfBirth(datefun.parse("8/23/1987"));
        
        Person p012 = business.getPersonDirectory().searchPerson("Terry","Rozier");
        if(p012!=null)
        {
            
            user20.setUperson(p012);
            user20.setUserName("salesman12");
            user20.setPassWord("salesman12");
            user20.setRole("Salesman");
            user20.setAccountStatus(true);
        }
        
        Person person13 =business.getPersonDirectory().addPerson();
        person13.setFirstName("Marcus");
        person13.setLastName("Morris");
        person13.setDateOfBirth(datefun.parse("12/25/1986"));
        
        Person p013 = business.getPersonDirectory().searchPerson("Marcus","Morris");
        if(p013!=null)
        {
            
            user21.setUperson(p013);
            user21.setUserName("salesman13");
            user21.setPassWord("salesman13");
            user21.setRole("Salesman");
            user21.setAccountStatus(true);
        }
        
        Person person14 =business.getPersonDirectory().addPerson();
        person14.setFirstName("Jayson");
        person14.setLastName("Tatum");
        person14.setDateOfBirth(datefun.parse("12/5/1993"));
        
        Person p014 = business.getPersonDirectory().searchPerson("Jayson","Tatum");
        if(p014!=null)
        {
            
            user22.setUperson(p014);
            user22.setUserName("salesman14");
            user22.setPassWord("salesman14");
            user22.setRole("Salesman");
            user22.setAccountStatus(true);
        }
        
        Person person15 =business.getPersonDirectory().addPerson();
        person15.setFirstName("Daniel");
        person15.setLastName("Theis");
        person15.setDateOfBirth(datefun.parse("11/16/1989"));
        
        Person p015 = business.getPersonDirectory().searchPerson("Daniel","Theis");
        if(p015!=null)
        {
            
            user23.setUperson(p015);
            user23.setUserName("salesman15");
            user23.setPassWord("salesman15");
            user23.setRole("Salesman");
            user23.setAccountStatus(true);
        }
        
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
        Customer c10 = m1.addCustomer();
        Customer c11 = m1.addCustomer();
        Customer c12 = m1.addCustomer();
        c.setCustomerName("NorthEastern University");
        c.setCustomerType(m1.getMarketName());
        c.setCustomerID(1);
        c10.setCustomerName("Boston University");
        c10.setCustomerType(m1.getMarketName());
        c10.setCustomerID(3);
        c11.setCustomerName("MIT");
        c11.setCustomerType(m1.getMarketName());
        c11.setCustomerID(5);
        c12.setCustomerName("Boston College");
        c12.setCustomerType(m1.getMarketName());
        c12.setCustomerID(7);
        
        
        Market m2 = ml.addMarket();
        m2.setMarketName("Financial");
        Customer c20 =m2.addCustomer();
        Customer c21 = m2.addCustomer();
        Customer c22 = m2.addCustomer();
        c20.setCustomerName("Boston Consulting Group");
        c20.setCustomerType(m2.getMarketName());
        c20.setCustomerID(2);
        c21.setCustomerName("Bank of America");
        c21.setCustomerType(m2.getMarketName());
        c21.setCustomerID(4);
        c22.setCustomerName("Santander");
        c22.setCustomerType(m2.getMarketName());
        c22.setCustomerID(6);
        
        
        Supplier s = business.getSupplierDirectory().addSupplier();
        Supplier s1 = business.getSupplierDirectory().addSupplier();
        Supplier s2 = business.getSupplierDirectory().addSupplier();
        Supplier s3 = business.getSupplierDirectory().addSupplier();
        Supplier s4 = business.getSupplierDirectory().addSupplier();
        Supplier s5 = business.getSupplierDirectory().addSupplier();
        s.setSupplierName("Apple");
        s1.setSupplierName("Microsoft");
        s2.setSupplierName("Google");
        s3.setSupplierName("Nintendo");
        s4.setSupplierName("Dell");
        s5.setSupplierName("Sony");
        
        Product p = s.getPc().addProduct();
        p.setProductName("iPhone");
        p.setModelNumber(8);
        p.setAvailibility(100);
        Product p01 =s.getPc().addProduct();
        p01.setProductName("Macbookpro");
        p01.setModelNumber(2018);
        p01.setAvailibility(315);
        Product p02 = s.getPc().addProduct();
        p02.setProductName("iPad");
        p02.setModelNumber(21);
        p02.setAvailibility(675);
        
        Product p10 = s1.getPc().addProduct();
        p10.setProductName("Xbox");
        p10.setModelNumber(2015);
        p10.setAvailibility(999);
        Product p11 = s1.getPc().addProduct();
        p11.setProductName("Surface Book");
        p11.setModelNumber(2017);
        p11.setAvailibility(987);
        Product p12 = s1.getPc().addProduct();
        p12.setProductName("Surface Laptop");
        p12.setModelNumber(757);
        p12.setAvailibility(586);
        
        Product p20 = s2.getPc().addProduct();
        p20.setProductName("Nexus");
        p20.setModelNumber(2014);
        p20.setAvailibility(278);
        Product p21 = s2.getPc().addProduct();
        p21.setProductName("Pixel");
        p21.setModelNumber(2);
        p21.setAvailibility(465);
        
        Product p30 = s3.getPc().addProduct();
        p30.setProductName("Switch");
        p30.setModelNumber(2016);
        p30.setAvailibility(1625);
        Product p31 = s3.getPc().addProduct();
        p31.setProductName("3DS");
        p31.setModelNumber(52);
        p31.setAvailibility(674);
        Product p32 =s3.getPc().addProduct();
        p32.setProductName("2DS");
        p32.setModelNumber(4);
        p32.setAvailibility(536);
        
        Product p40 = s4.getPc().addProduct();
        p40.setProductName("Alienware r4");
        p40.setModelNumber(2011);
        p40.setAvailibility(100);
        Product p41 = s4.getPc().addProduct();
        p41.setProductName("XPS");
        p41.setModelNumber(2756);
        p41.setAvailibility(8574);
        Product p42 = s4.getPc().addProduct();
        p42.setProductName("Inspiron");
        p42.setModelNumber(4252);
        p42.setAvailibility(9578);
        
        Product p50 = s5.getPc().addProduct();
        p50.setProductName("Playstation4");
        p50.setModelNumber(2000);
        p50.setAvailibility(756);
        Product p51 = s5.getPc().addProduct();
        p51.setProductName("Walkman");
        p51.setModelNumber(30);
        p51.setAvailibility(252);
        Product p52 = s5.getPc().addProduct();
        p52.setProductName("XZ1");
        p52.setModelNumber(111);
        p52.setAvailibility(563);
        
        
        MarketOffer mo= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo01= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo02= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo10= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo11= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo12= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo20= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo21= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo30= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo31= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo32= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo40= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo41= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo42= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo50= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo51= m1.getMarketOfferCatalog().addOffer();
        MarketOffer mo52= m1.getMarketOfferCatalog().addOffer();
        
        MarketOffer mo0= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo001= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo002= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo010= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo011= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo012= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo020= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo021= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo030= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo031= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo032= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo040= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo041= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo042= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo050= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo051= m2.getMarketOfferCatalog().addOffer();
        MarketOffer mo052= m2.getMarketOfferCatalog().addOffer();
                    mo.setCeilingPrice(1000);
                    mo.setFloorPrice(750);
                    mo.setTargetPrice(800);
                    mo.setProduct(p);
                    mo.setMarket(m1.getMarketName());
                    
                    mo01.setCeilingPrice(1430);
                    mo01.setFloorPrice(850);
                    mo01.setTargetPrice(1200);
                    mo01.setProduct(p01);
                    mo01.setMarket(m1.getMarketName());
                    
                    mo02.setCeilingPrice(1440);
                    mo02.setFloorPrice(840);
                    mo02.setTargetPrice(1100);
                    mo02.setProduct(p02);
                    mo02.setMarket(m1.getMarketName());
                    
                    mo10.setCeilingPrice(1560);
                    mo10.setFloorPrice(980);
                    mo10.setTargetPrice(1300);
                    mo10.setProduct(p10);
                    mo10.setMarket(m1.getMarketName());
                    
                    mo11.setCeilingPrice(1780);
                    mo11.setFloorPrice(1000);
                    mo11.setTargetPrice(1400);
                    mo11.setProduct(p11);
                    mo11.setMarket(m1.getMarketName());
                    
                    mo12.setCeilingPrice(1230);
                    mo12.setFloorPrice(880);
                    mo12.setTargetPrice(1000);
                    mo12.setProduct(p12);
                    mo12.setMarket(m1.getMarketName());
                    
                    mo20.setCeilingPrice(2000);
                    mo20.setFloorPrice(1450);
                    mo20.setTargetPrice(1700);
                    mo20.setProduct(p20);
                    mo20.setMarket(m1.getMarketName());
                    
                    mo21.setCeilingPrice(990);
                    mo21.setFloorPrice(750);
                    mo21.setTargetPrice(850);
                    mo21.setProduct(p21);
                    mo21.setMarket(m1.getMarketName());
                    
                    mo30.setCeilingPrice(1000);
                    mo30.setFloorPrice(700);
                    mo30.setTargetPrice(850);
                    mo30.setProduct(p30);
                    mo30.setMarket(m1.getMarketName());
                    
                    mo31.setCeilingPrice(1450);
                    mo31.setFloorPrice(900);
                    mo31.setTargetPrice(1250);
                    mo31.setProduct(p31);
                    mo31.setMarket(m1.getMarketName());
                    
                    mo32.setCeilingPrice(1530);
                    mo32.setFloorPrice(950);
                    mo32.setTargetPrice(1300);
                    mo32.setProduct(p32);
                    mo32.setMarket(m1.getMarketName());
                    
                    mo40.setCeilingPrice(1600);
                    mo40.setFloorPrice(1200);
                    mo40.setTargetPrice(1385);
                    mo40.setProduct(p40);
                    mo40.setMarket(m1.getMarketName());
                    
                    mo41.setCeilingPrice(930);
                    mo41.setFloorPrice(850);
                    mo41.setTargetPrice(890);
                    mo41.setProduct(p41);
                    mo41.setMarket(m1.getMarketName());
                    
                    mo42.setCeilingPrice(2000);
                    mo42.setFloorPrice(1600);
                    mo42.setTargetPrice(1850);
                    mo42.setProduct(p42);
                    mo42.setMarket(m1.getMarketName());
                    
                    mo50.setCeilingPrice(890);
                    mo50.setFloorPrice(690);
                    mo50.setTargetPrice(790);
                    mo50.setProduct(p50);
                    mo50.setMarket(m1.getMarketName());
                    
                    mo51.setCeilingPrice(599);
                    mo51.setFloorPrice(499);
                    mo51.setTargetPrice(549);
                    mo51.setProduct(p51);
                    mo51.setMarket(m1.getMarketName());
                    
                    mo52.setCeilingPrice(999);
                    mo52.setFloorPrice(699);
                    mo52.setTargetPrice(849);
                    mo52.setProduct(p52);
                    mo52.setMarket(m1.getMarketName());
                    
                    mo0.setCeilingPrice(1100);
                    mo0.setFloorPrice(850);
                    mo0.setTargetPrice(900);
                    mo0.setProduct(p);
                    mo0.setMarket(m2.getMarketName());
                    
                    mo001.setCeilingPrice(1530);
                    mo001.setFloorPrice(950);
                    mo001.setTargetPrice(1300);
                    mo001.setProduct(p01);
                    mo001.setMarket(m2.getMarketName());
                    
                    mo002.setCeilingPrice(1540);
                    mo002.setFloorPrice(940);
                    mo002.setTargetPrice(1200);
                    mo002.setProduct(p02);
                    mo002.setMarket(m2.getMarketName());
                    
                    mo010.setCeilingPrice(1660);
                    mo010.setFloorPrice(1080);
                    mo010.setTargetPrice(1400);
                    mo010.setProduct(p10);
                    mo010.setMarket(m2.getMarketName());
                    
                    mo011.setCeilingPrice(1880);
                    mo011.setFloorPrice(1100);
                    mo011.setTargetPrice(1500);
                    mo011.setProduct(p11);
                    mo011.setMarket(m2.getMarketName());
                    
                    mo012.setCeilingPrice(1330);
                    mo012.setFloorPrice(980);
                    mo012.setTargetPrice(1100);
                    mo012.setProduct(p12);
                    mo012.setMarket(m2.getMarketName());
                    
                    mo020.setCeilingPrice(2100);
                    mo020.setFloorPrice(1550);
                    mo020.setTargetPrice(1800);
                    mo020.setProduct(p20);
                    mo020.setMarket(m2.getMarketName());
                    
                    mo021.setCeilingPrice(1090);
                    mo021.setFloorPrice(850);
                    mo021.setTargetPrice(950);
                    mo021.setProduct(p21);
                    mo021.setMarket(m2.getMarketName());
                    
                    mo030.setCeilingPrice(1100);
                    mo030.setFloorPrice(800);
                    mo030.setTargetPrice(950);
                    mo030.setProduct(p30);
                    mo030.setMarket(m2.getMarketName());
                    
                    mo031.setCeilingPrice(1550);
                    mo031.setFloorPrice(1000);
                    mo031.setTargetPrice(1350);
                    mo031.setProduct(p31);
                    mo031.setMarket(m2.getMarketName());
                    
                    mo032.setCeilingPrice(1630);
                    mo032.setFloorPrice(1050);
                    mo032.setTargetPrice(1400);
                    mo032.setProduct(p32);
                    mo032.setMarket(m2.getMarketName());
                    
                    mo040.setCeilingPrice(1700);
                    mo040.setFloorPrice(1300);
                    mo040.setTargetPrice(1485);
                    mo040.setProduct(p40);
                    mo040.setMarket(m2.getMarketName());
                    
                    mo041.setCeilingPrice(1030);
                    mo041.setFloorPrice(950);
                    mo041.setTargetPrice(990);
                    mo041.setProduct(p41);
                    mo041.setMarket(m2.getMarketName());
                    
                    mo042.setCeilingPrice(2100);
                    mo042.setFloorPrice(1700);
                    mo042.setTargetPrice(1950);
                    mo042.setProduct(p42);
                    mo042.setMarket(m2.getMarketName());
                    
                    mo050.setCeilingPrice(990);
                    mo050.setFloorPrice(790);
                    mo050.setTargetPrice(890);
                    mo050.setProduct(p50);
                    mo050.setMarket(m2.getMarketName());
                    
                    mo051.setCeilingPrice(699);
                    mo051.setFloorPrice(599);
                    mo051.setTargetPrice(649);
                    mo051.setProduct(p51);
                    mo051.setMarket(m2.getMarketName());
                    
                    mo052.setCeilingPrice(1099);
                    mo052.setFloorPrice(799);
                    mo052.setTargetPrice(949);
                    mo052.setProduct(p52);
                    mo052.setMarket(m2.getMarketName());
                    
                    
                    
                    Order o1 = new Order();
                    OrderItem oi1 = o1.addItem();
                    oi1.setOrderNumber(o1.getOrderNum());
                    oi1.setMarketOffer(mo52);
                    mo52.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo52.getProduct().setAvailibility(mo52.getProduct().getAvailibility()-2);
                    oi1.setQuantity(2);
                    oi1.setSellingPrice(1000);
                    
                    user10.getUperson().getOrderHistory().add(o1);
                    c.getOrderHistory().add(o1);
                    
                    Order o2 = new Order();
                    OrderItem oi2 = o2.addItem();
                    oi2.setOrderNumber(o2.getOrderNum());
                    oi2.setMarketOffer(mo51);
                    mo51.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo51.getProduct().setAvailibility(mo51.getProduct().getAvailibility()-5);
                    oi2.setQuantity(5);
                    oi2.setSellingPrice(540);
                    
                    user10.getUperson().getOrderHistory().add(o2);
                    c20.getOrderHistory().add(o2);
                    
                    Order o3 = new Order();
                    OrderItem oi3 = o3.addItem();
                    oi3.setOrderNumber(o3.getOrderNum());
                    oi3.setMarketOffer(mo50);
                    mo50.getProduct().setSoldNum(1);//to set the number of products for top3 product
                    mo50.getProduct().setAvailibility(mo50.getProduct().getAvailibility()-1);
                    oi3.setQuantity(1);
                    oi3.setSellingPrice(810);
                    
                    user11.getUperson().getOrderHistory().add(o3);
                    c21.getOrderHistory().add(o3);
                    
                    Order o4 = new Order();
                    OrderItem oi4 = o4.addItem();
                    oi4.setOrderNumber(o4.getOrderNum());
                    oi4.setMarketOffer(mo42);
                    mo42.getProduct().setSoldNum(4);//to set the number of products for top3 product
                    mo42.getProduct().setAvailibility(mo42.getProduct().getAvailibility()-4);
                    oi4.setQuantity(4);
                    oi4.setSellingPrice(1900);
                    
                    user11.getUperson().getOrderHistory().add(o4);
                    c10.getOrderHistory().add(o4);
                    
                    Order o5 = new Order();
                    OrderItem oi5 = o5.addItem();
                    oi5.setOrderNumber(o5.getOrderNum());
                    oi5.setMarketOffer(mo41);
                    mo41.getProduct().setSoldNum(10);//to set the number of products for top3 product
                    mo41.getProduct().setAvailibility(mo41.getProduct().getAvailibility()-10);
                    oi5.setQuantity(10);
                    oi5.setSellingPrice(870);
                    
                    user12.getUperson().getOrderHistory().add(o5);
                    c.getOrderHistory().add(o5);
                    
                    Order o6 = new Order();
                    OrderItem oi6 = o6.addItem();
                    oi6.setOrderNumber(o6.getOrderNum());
                    oi6.setMarketOffer(mo40);
                    mo40.getProduct().setSoldNum(15);//to set the number of products for top3 product
                    mo40.getProduct().setAvailibility(mo40.getProduct().getAvailibility()-15);
                    oi6.setQuantity(15);
                    oi6.setSellingPrice(1500);
                    
                    user12.getUperson().getOrderHistory().add(o5);
                    c.getOrderHistory().add(o5);
                    
                    Order o7 = new Order();
                    OrderItem oi7 = o7.addItem();
                    oi7.setOrderNumber(o7.getOrderNum());
                    oi7.setMarketOffer(mo32);
                    mo32.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo32.getProduct().setAvailibility(mo32.getProduct().getAvailibility()-2);
                    oi7.setQuantity(2);
                    oi7.setSellingPrice(1400);
                    
                    user13.getUperson().getOrderHistory().add(o7);
                    c.getOrderHistory().add(o7);
                    
                    Order o8 = new Order();
                    OrderItem oi8 = o8.addItem();
                    oi8.setOrderNumber(o8.getOrderNum());
                    oi8.setMarketOffer(mo31);
                    mo31.getProduct().setSoldNum(8);//to set the number of products for top3 product
                    mo31.getProduct().setAvailibility(mo31.getProduct().getAvailibility()-8);
                    oi8.setQuantity(8);
                    oi8.setSellingPrice(1200);
                    
                    user14.getUperson().getOrderHistory().add(o8);
                    c.getOrderHistory().add(o8);
                    
                    Order o9 = new Order();
                    OrderItem oi9 = o9.addItem();
                    oi9.setOrderNumber(o9.getOrderNum());
                    oi9.setMarketOffer(mo30);
                    mo30.getProduct().setSoldNum(20);//to set the number of products for top3 product
                    mo30.getProduct().setAvailibility(mo30.getProduct().getAvailibility()-20);
                    oi9.setQuantity(20);
                    oi9.setSellingPrice(990);
                    
                    user14.getUperson().getOrderHistory().add(o9);
                    c.getOrderHistory().add(o9);
                    
                    Order o10 = new Order();
                    OrderItem oi10 = o10.addItem();
                    oi10.setOrderNumber(o10.getOrderNum());
                    oi10.setMarketOffer(mo20);
                    mo20.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo20.getProduct().setAvailibility(mo20.getProduct().getAvailibility()-5);
                    oi10.setQuantity(5);
                    oi10.setSellingPrice(1990);
                    
                    user15.getUperson().getOrderHistory().add(o10);
                    c.getOrderHistory().add(o10);
                    
                    Order o11 = new Order();
                    OrderItem oi11 = o11.addItem();
                    oi11.setOrderNumber(o11.getOrderNum());
                    oi11.setMarketOffer(mo21);
                    mo21.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo21.getProduct().setAvailibility(mo21.getProduct().getAvailibility()-2);
                    oi11.setQuantity(2);
                    oi11.setSellingPrice(950);
                    
                    user15.getUperson().getOrderHistory().add(o11);
                    c.getOrderHistory().add(o11);
                    
                    Order o12 = new Order();
                    OrderItem oi12 = o12.addItem();
                    oi12.setOrderNumber(o12.getOrderNum());
                    oi12.setMarketOffer(mo11);
                    mo11.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo11.getProduct().setAvailibility(mo11.getProduct().getAvailibility()-5);
                    oi12.setQuantity(5);
                    oi12.setSellingPrice(1600);
                    
                    user16.getUperson().getOrderHistory().add(o12);
                    c.getOrderHistory().add(o12);
                    
                    Order o13 = new Order();
                    OrderItem oi13 = o13.addItem();
                    oi13.setOrderNumber(o13.getOrderNum());
                    oi13.setMarketOffer(mo12);
                    mo12.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo12.getProduct().setAvailibility(mo12.getProduct().getAvailibility()-2);
                    oi13.setQuantity(2);
                    oi13.setSellingPrice(1000);
                    
                    user16.getUperson().getOrderHistory().add(o13);
                    c.getOrderHistory().add(o13);
                    
                    Order o14 = new Order();
                    OrderItem oi14 = o14.addItem();
                    oi14.setOrderNumber(o14.getOrderNum());
                    oi14.setMarketOffer(mo01);
                    mo01.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo01.getProduct().setAvailibility(mo01.getProduct().getAvailibility()-5);
                    oi14.setQuantity(5);
                    oi14.setSellingPrice(1300);
                    
                    user17.getUperson().getOrderHistory().add(o14);
                    c.getOrderHistory().add(o14);
                    
                    Order o15 = new Order();
                    OrderItem oi15 = o15.addItem();
                    oi15.setOrderNumber(o15.getOrderNum());
                    oi15.setMarketOffer(mo10);
                    mo10.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo10.getProduct().setAvailibility(mo10.getProduct().getAvailibility()-2);
                    oi15.setQuantity(2);
                    oi15.setSellingPrice(1450);
                    
                    user17.getUperson().getOrderHistory().add(o15);
                    c.getOrderHistory().add(o15);
                    
                    Order o16 = new Order();
                    OrderItem oi16 = o16.addItem();
                    oi16.setOrderNumber(o16.getOrderNum());
                    oi16.setMarketOffer(mo051);
                    mo051.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo051.getProduct().setAvailibility(mo051.getProduct().getAvailibility()-5);
                    oi16.setQuantity(5);
                    oi16.setSellingPrice(640);
                    
                    user18.getUperson().getOrderHistory().add(o16);
                    c.getOrderHistory().add(o16);
                    
                    Order o17 = new Order();
                    OrderItem oi17 = o17.addItem();
                    oi17.setOrderNumber(o17.getOrderNum());
                    oi17.setMarketOffer(mo02);
                    mo02.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo02.getProduct().setAvailibility(mo02.getProduct().getAvailibility()-2);
                    oi17.setQuantity(2);
                    oi17.setSellingPrice(1400);
                    
                    user18.getUperson().getOrderHistory().add(o17);
                    c.getOrderHistory().add(o17);
                    
                    Order o18 = new Order();
                    OrderItem oi18 = o18.addItem();
                    oi18.setOrderNumber(o18.getOrderNum());
                    oi18.setMarketOffer(mo041);
                    mo041.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo041.getProduct().setAvailibility(mo041.getProduct().getAvailibility()-5);
                    oi18.setQuantity(5);
                    oi18.setSellingPrice(1000);
                    
                    user19.getUperson().getOrderHistory().add(o18);
                    c.getOrderHistory().add(o18);
                    
                    Order o19 = new Order();
                    OrderItem oi19 = o19.addItem();
                    oi19.setOrderNumber(o19.getOrderNum());
                    oi19.setMarketOffer(mo0);
                    mo0.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo0.getProduct().setAvailibility(mo0.getProduct().getAvailibility()-2);
                    oi19.setQuantity(2);
                    oi19.setSellingPrice(1000);
                    
                    user19.getUperson().getOrderHistory().add(o19);
                    c.getOrderHistory().add(o19);
                    
                    Order o20 = new Order();
                    OrderItem oi20 = o20.addItem();
                    oi20.setOrderNumber(o20.getOrderNum());
                    oi20.setMarketOffer(mo031);
                    mo031.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo031.getProduct().setAvailibility(mo031.getProduct().getAvailibility()-5);
                    oi20.setQuantity(5);
                    oi20.setSellingPrice(1300);
                    
                    user20.getUperson().getOrderHistory().add(o20);
                    c.getOrderHistory().add(o20);
                    
                    Order o21 = new Order();
                    OrderItem oi21 = o21.addItem();
                    oi21.setOrderNumber(o21.getOrderNum());
                    oi21.setMarketOffer(mo052);
                    mo052.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo052.getProduct().setAvailibility(mo052.getProduct().getAvailibility()-2);
                    oi21.setQuantity(2);
                    oi21.setSellingPrice(1000);
                    
                    user20.getUperson().getOrderHistory().add(o21);
                    c.getOrderHistory().add(o21);
                    
                    Order o22 = new Order();
                    OrderItem oi22 = o22.addItem();
                    oi22.setOrderNumber(o22.getOrderNum());
                    oi22.setMarketOffer(mo021);
                    mo021.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo021.getProduct().setAvailibility(mo021.getProduct().getAvailibility()-5);
                    oi22.setQuantity(5);
                    oi22.setSellingPrice(999);
                    
                    user21.getUperson().getOrderHistory().add(o22);
                    c.getOrderHistory().add(o22);
                    
                    Order o23 = new Order();
                    OrderItem oi23 = o23.addItem();
                    oi23.setOrderNumber(o23.getOrderNum());
                    oi23.setMarketOffer(mo050);
                    mo050.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo050.getProduct().setAvailibility(mo050.getProduct().getAvailibility()-2);
                    oi23.setQuantity(2);
                    oi23.setSellingPrice(800);
                    
                    user21.getUperson().getOrderHistory().add(o23);
                    c.getOrderHistory().add(o23);
                    
                    Order o24 = new Order();
                    OrderItem oi24 = o24.addItem();
                    oi24.setOrderNumber(o24.getOrderNum());
                    oi24.setMarketOffer(mo042);
                    mo042.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo042.getProduct().setAvailibility(mo042.getProduct().getAvailibility()-5);
                    oi24.setQuantity(5);
                    oi24.setSellingPrice(2000);
                    
                    user22.getUperson().getOrderHistory().add(o24);
                    c.getOrderHistory().add(o24);
                    
                    Order o25 = new Order();
                    OrderItem oi25 = o25.addItem();
                    oi25.setOrderNumber(o25.getOrderNum());
                    oi25.setMarketOffer(mo040);
                    mo040.getProduct().setSoldNum(2);//to set the number of products for top3 product
                    mo040.getProduct().setAvailibility(mo040.getProduct().getAvailibility()-2);
                    oi25.setQuantity(2);
                    oi25.setSellingPrice(1650);
                    
                    user22.getUperson().getOrderHistory().add(o25);
                    c.getOrderHistory().add(o25);
                    
                    Order o26 = new Order();
                    OrderItem oi26 = o26.addItem();
                    oi26.setOrderNumber(o26.getOrderNum());
                    oi26.setMarketOffer(mo032);
                    mo032.getProduct().setSoldNum(5);//to set the number of products for top3 product
                    mo032.getProduct().setAvailibility(mo51.getProduct().getAvailibility()-5);
                    oi26.setQuantity(5);
                    oi26.setSellingPrice(1500);
                    
                    user12.getUperson().getOrderHistory().add(o26);
                    c.getOrderHistory().add(o26);
        return business;
    }
    
}

