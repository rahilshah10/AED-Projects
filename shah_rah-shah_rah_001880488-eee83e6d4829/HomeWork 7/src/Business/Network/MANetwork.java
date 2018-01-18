/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shah.rah
 */
public class MANetwork extends Network {

    public MANetwork(String name) {
        super(name, NetworkType.Mass);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
