/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.InventoryManager;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private InventoryManager enterpriseInventory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
        this.enterpriseInventory= new InventoryManager();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),CDC("Center of Disease Control and Prevention"),DOPH("Department of Public Health"),EnterpriseInventoryManger("Enterprise Inventory Manager");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
