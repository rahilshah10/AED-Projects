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
public class Business {
      
    private PersonDirectory pDir;
    private UserAccountDirectory uDir;

    public Business() {
        pDir= new PersonDirectory();
        uDir= new UserAccountDirectory();
    }
 

    public PersonDirectory getpDir() {
        return pDir;
    }

    public void setpDir(PersonDirectory pDir) {
        this.pDir = pDir;
    }

    public UserAccountDirectory getuDir() {
        return uDir;
    }

    public void setuDir(UserAccountDirectory uDir) {
        this.uDir = uDir;
    }
    
    

    
}
