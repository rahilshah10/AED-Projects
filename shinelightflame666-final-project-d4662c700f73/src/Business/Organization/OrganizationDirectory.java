/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.FoodProcess.ProcessorProductionLineOrganization;
import Business.Organization.FoodProcess.ProcessorPurchaseOrganization;
import Business.Organization.FoodProcess.ProcessorSalesOrganization;
import Business.Organization.FoodProcess.ProcessorStorageOrganziation;
import Business.Organization.FoodProduce.ProducerProductOrganization;
import Business.Organization.FoodProduce.ProducerSalesOrganization;
import Business.Organization.FoodProduce.ProducerSterelizationOrganization;
import Business.Organization.FoodServer.ServerMarketAdminOrganization;
import Business.Organization.FoodServer.ServerMarketPurchaserOrganization;
import Business.Organization.FoodServer.ServerRestaurantAdminOrganization;
import Business.Organization.FoodServer.ServerRestaurantCustomerServiceOrganization;
import Business.Organization.FoodServer.ServerRestaurantPurchaserOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
       if (type.getValue().equalsIgnoreCase(Type.ProducerProduct.getValue())) {
            organization = new ProducerProductOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equalsIgnoreCase(Type.Producersales.getValue())) {
            organization = new ProducerSalesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equalsIgnoreCase(Type.ProducerSter.getValue())) {
            organization = new ProducerSterelizationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equalsIgnoreCase(Type.ProcessorSales.getValue())) {
            organization = new ProcessorSalesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equalsIgnoreCase(Type.ProcessorPurchase.getValue())) {
            organization = new ProcessorPurchaseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equalsIgnoreCase(Type.ProcessorStorage.getValue())) {
            organization = new ProcessorStorageOrganziation();
            organizationList.add(organization);
        }else if (type.getValue().equalsIgnoreCase(Type.ProcessorProductionLine.getValue())) {
            organization = new ProcessorProductionLineOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equalsIgnoreCase(Type.FoodServerRestaurantAdmin.getValue())) {
            organization = new ServerRestaurantAdminOrganization();
            organizationList.add(organization);
        }
       else if (type.getValue().equalsIgnoreCase(Type.FoodServerRestaurantCustomerService.getValue())) {
            organization = new ServerRestaurantCustomerServiceOrganization();
            organizationList.add(organization);
        }
       else if (type.getValue().equalsIgnoreCase(Type.FoodServerRestaurantPurchaser.getValue())) {
            organization = new ServerRestaurantPurchaserOrganization();
            organizationList.add(organization);
        }
       else if (type.getValue().equalsIgnoreCase(Type.FoodServerMarketAdmin.getValue())) {
            organization = new ServerMarketAdminOrganization();
            organizationList.add(organization);
        }
       else if (type.getValue().equalsIgnoreCase(Type.FoodServerMarketPurchaser.getValue())) {
            organization = new ServerMarketPurchaserOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
