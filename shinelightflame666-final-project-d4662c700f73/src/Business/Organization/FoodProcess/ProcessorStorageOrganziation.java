/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodProcess;
import Business.Organization.Organization;
import Business.Role.FoodProcess.FoodProcessStorageRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author apple
 */
public class ProcessorStorageOrganziation extends Organization {
    
    public ProcessorStorageOrganziation(){
        super(Type.ProcessorStorage.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FoodProcessStorageRole());
        return roles;
    }
}
