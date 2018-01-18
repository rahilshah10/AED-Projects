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
            case Hospital:
                enterprise = new HospitalEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case CDC:
                enterprise = new CDC(name);
                enterpriseList.add(enterprise);
                break;
            case DOPH:
                enterprise = new DOPH(name);
                enterpriseList.add(enterprise);
                break;
            case EnterpriseInventoryManger:
                enterprise = new EnterpriseInventoryManager(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
    
}
