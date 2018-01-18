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
public class UserAccountDirectory {
    
      private ArrayList<UserAccount> userAccountDir;

    public UserAccountDirectory() {
        userAccountDir = new ArrayList<UserAccount>();
        }

    public ArrayList<UserAccount> getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(ArrayList<UserAccount> userAccountDir) {
        this.userAccountDir = userAccountDir;
    }
    
    public UserAccount addAccount()
    {
        UserAccount a=new UserAccount();
        userAccountDir.add(a);
        return a;
    }
    
    public void deleteAccount(UserAccount a)
    {
        userAccountDir.remove(a);
    }
    
    public UserAccount searchAccount(String name)
    {
        for(UserAccount u:userAccountDir)
        {
//            System.out.println(u.getUserName());
            if(name.equalsIgnoreCase(u.getUserName()))
            {
                return u;
            }
        }
        return null;
     }    
    
     public UserAccount searchAccountbyPerson(String name)
    {
      String[] name1 = name.split(" ");

        for(UserAccount u:userAccountDir)
        {
            if((name1[0].equalsIgnoreCase(u.getUperson().getFirstName()) && (name1[1].equalsIgnoreCase(u.getUperson().getLastName()))))
            {
                return u;
            }
        }
        return null;
     }
      
     public void deleteAll(Person p)
     {
     for(UserAccount u:userAccountDir)
        {
            if(u.getUperson().equals(p))
            {
                userAccountDir.remove(u);
            }
        }
     }
     
     public Person searchPersonbyCombi(String name)
    {
      String[] name1 = name.split(" ");
      
        for(UserAccount u:userAccountDir)
        {
            if((name1[0].equalsIgnoreCase(u.getUperson().getFirstName()) && (name1[1].equalsIgnoreCase(u.getUperson().getLastName()))))
            {
                return u.getUperson();
            }
        }
        return null;
    }
}
