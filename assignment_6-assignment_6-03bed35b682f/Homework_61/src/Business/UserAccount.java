/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rahil
 */
public class UserAccount {
    private String userName;
    private int passWord;
    private String role;
    private boolean accountStatus;
    private Person uperson;

    public String getUserName() {
        return userName;
    }
    
    public int Selling()
    {
        return uperson.Selling();
    }
    public int Target()
    {
        return uperson.Target();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord.hashCode();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Person getUperson() {
        return uperson;
    }

    public void setUperson(Person uperson) {
        this.uperson = uperson;
    }
    
    public String toString()
    {
        return userName;
    }
}
