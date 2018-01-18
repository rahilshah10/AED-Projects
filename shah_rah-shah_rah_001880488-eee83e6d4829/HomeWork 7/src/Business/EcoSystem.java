package Business;

import Business.Disease.DiseaseCatalog;
import Business.Network.MANetwork;
import Business.Network.NYNetwork;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;
import Business.Inventory.InventoryManager;
import Business.Network.NetworkInventoryManager;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private DiseaseCatalog diseaseCatalog;
    private VaccineCatalog vaccineCatalog;
    private InventoryManager SystemInventory;

    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(DiseaseCatalog diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(VaccineCatalog vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }

    public InventoryManager getSystemInventory() {
        return SystemInventory;
    }

    public void setSystemInventory(InventoryManager SystemInventory) {
        this.SystemInventory = SystemInventory;
    }


    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        diseaseCatalog = new DiseaseCatalog();
        vaccineCatalog = new VaccineCatalog();
        SystemInventory = new InventoryManager();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork(String name, Network.NetworkType type) {
        Network network = null;
        if (type == Network.NetworkType.Mass) {
            network = new MANetwork(name);
            networkList.add(network);
        } else if (type == Network.NetworkType.New) {
            network = new NYNetwork(name);
            networkList.add(network);
        }
        else if(type == Network.NetworkType.InventoryManager)
        {
        network = new NetworkInventoryManager(name);
        networkList.add(network);
        }
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        return true;
    }
}
