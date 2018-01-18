/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author rahil
 */
public class Account {
     private String routingNo;
    private String accountNo;
    private String bankName;
    private int bal;
    private Date createdOn;

    public Account() {
        this.createdOn =new Date(); 
    }

    public Date getCreatedOn() {
        return createdOn;
    }
   

    public String getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(String routingNo) {
        this.routingNo = routingNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
    
    @Override
    public String toString() {
        return bankName;
    }
}
