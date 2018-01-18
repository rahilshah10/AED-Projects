/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FoodServer.FoodServer_RestaurantAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Restaurant extends Enterprise{

    public Restaurant(String name) {
        super(name, EnterpriseType.Rest);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new FoodServer_RestaurantAdminRole());
       return roles;
    }
    
    
    
}
