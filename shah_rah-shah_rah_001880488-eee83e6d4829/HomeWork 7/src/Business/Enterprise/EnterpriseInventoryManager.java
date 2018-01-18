/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.EnterpriseAdminRole;
import Business.Role.NetworkAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shah.rah
 */
public class EnterpriseInventoryManager extends Enterprise
{

    public EnterpriseInventoryManager(String name) {
        super(name, EnterpriseType.EnterpriseInventoryManger);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new EnterpriseAdminRole());
       return roles;
    }
    
}
