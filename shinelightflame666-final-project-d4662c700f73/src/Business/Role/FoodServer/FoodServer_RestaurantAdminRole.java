/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodServer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodServer.ServerRestaurantAdminOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FoodServer_Restaurant.RestaurantWorkArea;

/**
 *
 * @author Zi Wei Fan
 */
public class FoodServer_RestaurantAdminRole extends Role{

    public FoodServer_RestaurantAdminRole() {
        super(RoleType.ServerRestaurantAdmin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
         return new RestaurantWorkArea(userProcessContainer, account, (ServerRestaurantAdminOrganization)organization, enterprise, business);
    }
}
