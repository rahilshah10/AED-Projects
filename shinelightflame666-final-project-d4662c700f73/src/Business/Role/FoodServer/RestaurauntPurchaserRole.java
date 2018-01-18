/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodServer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodServer.ServerRestaurantPurchaserOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FoodServer_Restaurant.RestaurantPurchaserJPanel;

/**
 *
 * @author Urja
 */
public class RestaurauntPurchaserRole extends Role{

    public RestaurauntPurchaserRole() {
        super(RoleType.ServerRestaurantPurchaser.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new RestaurantPurchaserJPanel(userProcessContainer, account, (ServerRestaurantPurchaserOrganization)organization, enterprise, business);
    }
    
}
