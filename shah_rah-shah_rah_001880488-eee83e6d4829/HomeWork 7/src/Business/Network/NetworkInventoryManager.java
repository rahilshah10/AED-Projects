/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Role.EnterpriseAdminRole;
import Business.Role.NetworkAdminRole;
import Business.Role.ProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shah.rah
 */
public class NetworkInventoryManager extends Network{

    public NetworkInventoryManager(String name) {
        super(name,NetworkType.InventoryManager);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new NetworkAdminRole());
       return roles;
    }
    
}
