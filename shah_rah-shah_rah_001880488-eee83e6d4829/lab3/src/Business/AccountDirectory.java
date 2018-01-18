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
public class AccountDirectory {
 private ArrayList<Account> accountlist;

 public AccountDirectory() {
     this.accountlist= new ArrayList<Account>();
    }
    public ArrayList<Account> getAccountlist() {
        return accountlist;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountlist = accountlist;
    }
    
    public Account addAccount()
    {
    Account account = new Account();
    accountlist.add(account);
    return account;
    }
    
    public void deleteAccount(Account account)
    {   
        accountlist.remove(account);    
    }
    
    public Account searchAccount (String accountNo)
    {
    for(Account a: accountlist)
    {
    if(a.getAccountNo().equals(accountNo))
    { return a;
    }
    }
     return null;
    }
}