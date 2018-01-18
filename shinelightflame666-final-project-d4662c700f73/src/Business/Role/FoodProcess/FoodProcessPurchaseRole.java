/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.FoodProcess;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FoodProcess.PurchasingStaffWorkAreaJPanel;
/**
 *
 * @author apple
 */
public class FoodProcessPurchaseRole extends Role {
    
    public FoodProcessPurchaseRole(){
        super(RoleType.ProcessorPurchase.getValue());
    }
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new PurchasingStaffWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
}
