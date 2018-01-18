/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (null != type)switch (type) {
            case Rest:
                enterprise = new Restaurant(name);
                enterpriseList.add(enterprise);
                break;
            case FoodProd:
                enterprise = new Food_Produce(name);
                enterpriseList.add(enterprise);
                break;
            case FoodProc:
                enterprise = new Food_Process(name);
                enterpriseList.add(enterprise);
                break;
            case Super:
                enterprise = new SuperMarket(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
    
}
