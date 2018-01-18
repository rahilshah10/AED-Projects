/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Poultry;

/**
 *
 * @author Urja
 */
public class Poultry {
    private String farmName;
    private int id;
    private static int count = 1;
    ChickenShedDirectory chickenShedList;

    public Poultry() {
        id = count;
        count++;
        this.chickenShedList = new ChickenShedDirectory();
    }

    public int getId() {
        return id;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public ChickenShedDirectory getChickenShedList() {
        return chickenShedList;
    }

    public void setChickenShedList(ChickenShedDirectory chickenShedList) {
        this.chickenShedList = chickenShedList;
    }
    
}
