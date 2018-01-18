/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sunwe_000
 */
public class Order {
    private String orderNum;
    private ArrayList<OrderItem> order;
    private Customer customer;
    private static int count=0;

    public Order() {
        this.order= new ArrayList<OrderItem>();
        this.customer=new Customer();
        this.orderNum = String.valueOf(count);
        count++;
    }

    public int SellingTotal()
    {
        int selling = 0;
        for(OrderItem oi : this.getOrder())
        {
            selling += oi.getSellingPrice()*oi.getQuantity();
        }
        return selling;
    }
    
    public int targetTotal()
    {
        int target = 0;
        for(OrderItem oi : this.getOrder())
        {
            target+=oi.getMarketOffer().getTargetPrice()*oi.getQuantity();
        }
        return target;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public ArrayList<OrderItem> getOrder() {
        return order;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setOrder(ArrayList<OrderItem> order) {
        this.order = order;
    }
    
    public OrderItem addItem()
    {
        OrderItem oi = new OrderItem();
        order.add(oi);
        return oi;
    }

    
    @Override
    public String toString(){
        return orderNum;
}
}
