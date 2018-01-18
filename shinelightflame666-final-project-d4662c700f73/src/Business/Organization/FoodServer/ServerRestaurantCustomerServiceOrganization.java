/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodServer;

import Business.Organization.Organization;
import Business.Role.FoodServer.CustomerServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Urja
 */
public class ServerRestaurantCustomerServiceOrganization extends Organization{

    public ServerRestaurantCustomerServiceOrganization() {
        super(Type.FoodServerRestaurantCustomerService.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerServiceRole());
        return roles;
    }
    
}
