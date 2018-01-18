/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodServer;

import Business.Organization.Organization;
import Business.Role.FoodServer.RestaurauntPurchaserRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Urja
 */
public class ServerRestaurantPurchaserOrganization extends Organization{

    public ServerRestaurantPurchaserOrganization() {
        super(Type.FoodServerRestaurantPurchaser.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RestaurauntPurchaserRole());
        return roles;
    }
    
}
