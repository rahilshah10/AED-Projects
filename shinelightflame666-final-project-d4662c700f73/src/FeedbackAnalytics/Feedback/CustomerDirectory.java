/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.Feedback;

import java.util.ArrayList;

/**
 *
 * @author Zi Wei Fan
 */
public class CustomerDirectory {
    private ArrayList<Customer> CustomerDirectoryArrayList;

    public CustomerDirectory() {
        this.CustomerDirectoryArrayList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDirectoryArrayList() {
        return CustomerDirectoryArrayList;
    }
    
    public Customer createCustomer(String name){
        Customer c = new Customer(name);
        c.setCustomerName(name);
        CustomerDirectoryArrayList.add(c);
        return c;
    }
}
