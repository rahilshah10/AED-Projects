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
    static Business b;
    private synchronized static Business getInstance() {
        
        if(b==null)
        { Business B = new Business();
        }
        return b;
    }
    
    
}
