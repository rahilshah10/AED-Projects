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
import userinterface.FoodProcess.ProductionLineStaffJPanel;
/**
 *
 * @author apple
 */
public class FoodProcessProductionLineRole extends Role {
    
    public FoodProcessProductionLineRole(){
        super(RoleType.ProcessorProductionLine.getValue());
    }
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ProductionLineStaffJPanel(userProcessContainer, account, organization, enterprise, business);
    }
}
