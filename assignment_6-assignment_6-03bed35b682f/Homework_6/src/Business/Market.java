/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rahil
 */
public class Market {
    private String marketName;
    private ArrayList<Customer> customerList;
    private MarketOfferCatalog marketOfferCatalog;

    public Market() {
        this.customerList=new ArrayList<Customer>();
        this.marketOfferCatalog= new MarketOfferCatalog();
    }
    

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }
    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer ()
    {
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }
    public void removeCustomer(int cusID)
    {
        Customer c = searchCustomerID(cusID);
        customerList.remove(c);
    }
            
    public Customer searchCustomerID(int cusID)
    {
        for(Customer c : customerList)
        {
            if(c.getCustomerID()==cusID)
            {
                return c;
            }
          }
          return null;
    }
    public ArrayList<Customer> searchCustomerName(String name)//one customerName can have multiple real customers(customerID) 
    {
        ArrayList<Customer> cusList = new ArrayList<Customer>();
        for(Customer c : customerList)
        {
            if(c.getCustomerName().equals(name))
                cusList.add(c);
        }
        return cusList;
    } 
     @Override
    public String toString()
    {
        return marketName;
    }
}
