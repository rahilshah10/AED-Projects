/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodProduce;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FoodProduce.ProducerWorkArea;

/**
 *
 * @author Urja
 */
public class FoodProduceAdminRole extends Role {

    public FoodProduceAdminRole() {
        super(RoleType.FoodProduceAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
         return new ProducerWorkArea(userProcessContainer, account, organization, enterprise, business);
    }
    
}
