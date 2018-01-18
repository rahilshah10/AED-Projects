/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    private String name;
    
    public Role(String Name){
    this.name = Name; 
    }
    public enum RoleType{
        EnterpriseAdmin("EnterpriseAdmin"),FoodProcessAdmin("Food Process Admin"),NetworkAdmin("Network Admin"),Provider("Provider"),SystemAdmin("System Admin"),
        FoodProduceAdmin("FoodProduceAdmin"),ProducerProduct("Food Producer Product"),ProducerSterelization("Producer Sterelization"),ProducerSales("ProducerSales"),
        ProcessorProductionLine("ProcessorProductionLine"),ProcessorPurchase("ProcessorPurchase"),ProcessorSales("ProcessorSales"),ProcessorStorage("ProcessorStorage"),
        ServerRestaurantAdmin("ServerRestaurantAdmin"),ServerRestaurantPurchaser("ServerRestaurantPurchaser"),ServerRestaurantCustomerService("ServerRestaurantCustomerService"),
        MarketAdmin("MarketAdmin"), MarketPurchaser("MarketPurchaser");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return name;
    }
    
    
}