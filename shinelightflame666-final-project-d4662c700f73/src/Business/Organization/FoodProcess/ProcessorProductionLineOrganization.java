/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodProcess;
import Business.Organization.Organization;
import Business.Role.FoodProcess.FoodProcessProductionLineRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author apple
 */
public class ProcessorProductionLineOrganization extends Organization {
    
    public ProcessorProductionLineOrganization(){
        super(Type.ProcessorProductionLine.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FoodProcessProductionLineRole());
        return roles;
    }
}
