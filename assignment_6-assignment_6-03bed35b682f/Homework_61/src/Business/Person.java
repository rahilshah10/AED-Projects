/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rahil
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private ArrayList<Order> orderHistory;
    private int saleCount;
    private int targetCount;
    
    
    
     public Person() {
        this.orderHistory = new ArrayList<>();
        saleCount = 0;
        targetCount = 0;
    }

    public int getTargetCount() {
        return targetCount;
    }

    public void setTargetCount(int targetCount) {
        this.targetCount = targetCount;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    
    public int Selling()
    {
        int spending = 0;
        for(Order o : this.getOrderHistory())
        {
            spending+=o.SellingTotal();
        }
        return spending;
    }
    public int Target()
    {
        int suppose =0;
        for(Order o : this.getOrderHistory())
        {
            suppose+=o.targetTotal();
        }
        return suppose;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }  
   
    
    public String toString()
    {
        return firstName+ " "+lastName;
    }
        
}
