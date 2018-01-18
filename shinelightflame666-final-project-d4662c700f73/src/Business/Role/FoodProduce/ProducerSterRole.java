/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodProduce;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodProduce.ProducerProductOrganization;
import Business.Organization.FoodProduce.ProducerSterelizationOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FoodProduce.SterilizationWorkAreaJPanel1;

/**
 *
 * @author Urja
 */
public class ProducerSterRole extends Role {

    public ProducerSterRole() {
        super(RoleType.ProducerSterelization.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new SterilizationWorkAreaJPanel1(userProcessContainer, account, (ProducerSterelizationOrganization)organization, enterprise, business);
    }
    
}
