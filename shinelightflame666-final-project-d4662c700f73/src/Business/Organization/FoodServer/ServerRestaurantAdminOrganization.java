/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodServer;

import Business.Organization.Organization;
import Business.Role.FoodProduce.ProducerProductRole;
import Business.Role.FoodServer.FoodServer_RestaurantAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Zi Wei Fan
 */
public class ServerRestaurantAdminOrganization extends Organization{
    
    public ServerRestaurantAdminOrganization() {
        super(Type.FoodServerRestaurantAdmin.getValue());
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FoodServer_RestaurantAdminRole());
        return roles;
    }
    
}
