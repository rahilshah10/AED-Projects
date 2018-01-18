/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodProduce;

import Business.Organization.Organization;
import Business.Role.FoodProduce.ProducerSterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Urja
 */
public class ProducerSterelizationOrganization extends Organization{

    public ProducerSterelizationOrganization() {
        super(Type.ProducerSter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProducerSterRole());
        return roles;
    }
    
}
