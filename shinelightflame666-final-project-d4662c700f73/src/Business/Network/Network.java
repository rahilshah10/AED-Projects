/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Network extends Organization{
    
    private NetworkType NetworkType;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name, NetworkType type) {
       super(name);
       this.NetworkType = type;
       this.enterpriseDirectory = new EnterpriseDirectory();
        
    }
    
    public enum NetworkType{
        APHA("American Public Health Association"),InventoryManager("Network Inventory Manager");
        
        private String value;

        private NetworkType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public NetworkType getNetworkType()
    {
    return NetworkType;
    }
            
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    

   

   
}
