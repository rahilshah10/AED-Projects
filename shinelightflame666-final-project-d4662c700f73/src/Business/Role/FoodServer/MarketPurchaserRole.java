/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodServer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodServer.ServerMarketPurchaserOrganization;
import Business.Organization.FoodServer.ServerRestaurantPurchaserOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.FoodServer_Market.PurchaserWorkArea;
import userinterface.FoodServer_Restaurant.RestaurantPurchaserJPanel;

/**
 *
 * @author Zi Wei Fan
 */
public class MarketPurchaserRole extends Role{
        public MarketPurchaserRole() {
        super(RoleType.MarketPurchaser.getValue());
    }
        
            @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new PurchaserWorkArea(userProcessContainer, account, (ServerMarketPurchaserOrganization)organization, enterprise, business);
    }
  }
