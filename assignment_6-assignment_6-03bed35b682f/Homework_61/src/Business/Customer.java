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
public class Customer {
    private String customerName;
    private int customerID;
    private ArrayList<Order> orderHistory;
    private String customerType;//Market Name
    
    public int Spending()
    {
        int spending = 0;
        for(Order o : this.getOrderHistory())
        {
            spending+=o.SellingTotal();
        }
        return spending;
    }
    public int supposeToSpend()
    {
        int suppose =0;
        for(Order o : this.getOrderHistory())
        {
            suppose+=o.targetTotal();
        }
        return suppose;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Customer() {
        this.orderHistory = new ArrayList<Order>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }  

    @Override
    public String toString() {
        return customerName;
    }
    
}
