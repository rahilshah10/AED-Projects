/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodProcess;
import Business.Organization.Organization;
import Business.Role.FoodProcess.FoodProcessPurchaseRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author apple
 */
public class ProcessorPurchaseOrganization extends Organization {
    
    public ProcessorPurchaseOrganization(){
        super(Type.ProcessorPurchase.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FoodProcessPurchaseRole());
        return roles;
    }
}
