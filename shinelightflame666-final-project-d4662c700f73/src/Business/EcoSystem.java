package Business;

import Business.Network.APHA;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Poultry.ChickenShedDirectory;
import Business.ProcessedProduct.ProductionLineDirectory;
import Business.ProcessedProduct.StorageProductDirectory;
import Business.storageclass.productDirectory;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ChickenShedDirectory chickenShedDirectory;
    private StorageProductDirectory storageProductDirectory;
    private ProductionLineDirectory productionLineDirectory;
    private productDirectory productdirectory;

   

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        chickenShedDirectory = new ChickenShedDirectory();
        storageProductDirectory = new StorageProductDirectory();
        productionLineDirectory = new ProductionLineDirectory();
        productdirectory = new productDirectory();

    }
 public productDirectory getProductdirectory() {
        return productdirectory;
    }

    public void setProductdirectory(productDirectory productdirectory) {
        this.productdirectory = productdirectory;
    }
    
    public ChickenShedDirectory getChickenShedDirectory() {
        return chickenShedDirectory;
    }

    public void setChickenShedDirectory(ChickenShedDirectory chickenShedDirectory) {
        this.chickenShedDirectory = chickenShedDirectory;
    }

    public StorageProductDirectory getStorageProductDirectory() {
        return storageProductDirectory;
    }

    public void setStorageProductDirectory(StorageProductDirectory storageProductDirectory) {
        this.storageProductDirectory = storageProductDirectory;
    }

    public ProductionLineDirectory getProductionLineDirectory() {
        return productionLineDirectory;
    }

    public void setProductionLineDirectory(ProductionLineDirectory productionLineDirectory) {
        this.productionLineDirectory = productionLineDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork(String name, Network.NetworkType type) {
        Network network = null;
        if (type == Network.NetworkType.APHA) {
            network = new APHA(name);
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
