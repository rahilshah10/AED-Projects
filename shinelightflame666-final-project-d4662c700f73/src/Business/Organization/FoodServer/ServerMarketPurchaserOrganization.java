/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodServer;

import Business.Organization.Organization;
import Business.Role.FoodServer.MarketPurchaserRole;
import Business.Role.FoodServer.RestaurauntPurchaserRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Zi Wei Fan
 */
public class ServerMarketPurchaserOrganization  extends Organization{
    public ServerMarketPurchaserOrganization() {
        super(Type.FoodServerMarketPurchaser.getValue());
    }
        @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MarketPurchaserRole());
        return roles;
    }
}
