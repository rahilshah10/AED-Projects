/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FoodServer.FoodServer_MarketAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Urja
 */
public class SuperMarket extends Enterprise {

    public SuperMarket(String name) {
        super(name, EnterpriseType.Super);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new FoodServer_MarketAdminRole());
       return roles;
    }
    
}
