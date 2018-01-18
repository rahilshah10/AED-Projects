/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FoodProcessAdminRole;
import Business.Role.FoodProduce.FoodProduceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shah.rah
 */
public class Food_Process extends Enterprise
{

    public Food_Process(String name) {
        super(name, EnterpriseType.FoodProc);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new FoodProcessAdminRole());
       return roles;
    }
    
}
