/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Poultry;

import java.util.ArrayList;

/**
 *
 * @author Urja
 */
public class ChickenShedDirectory {
    private ArrayList<ChickenShed> chickenShedList;

    public ChickenShedDirectory() {
        this.chickenShedList = new ArrayList<>();
    }

    public ArrayList<ChickenShed> getChickenShedList() {
        return chickenShedList;
    }

    public void setChickenShedList(ArrayList<ChickenShed> chickenShedList) {
        this.chickenShedList = chickenShedList;
    }

    public ChickenShed addChickenShed() {
        ChickenShed chickenShed = new ChickenShed();
        chickenShedList.add(chickenShed);
        return chickenShed;
    }

    public void removeChickenShed(ChickenShed chickenshed) {
        chickenShedList.remove(chickenshed);
    }
}
