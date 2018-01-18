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
public class PoultryDirectory {

    private ArrayList<Poultry> poultryList;

    public PoultryDirectory() {
        this.poultryList = new ArrayList<>();
    }

    public ArrayList<Poultry> getPoultryList() {
        return poultryList;
    }

    public void setPoultryList(ArrayList<Poultry> poultryList) {
        this.poultryList = poultryList;
    }

    public Poultry addPoultry() {
        Poultry poultry = new Poultry();
        poultryList.add(poultry);
        return poultry;
    }

    public void removePoultry(Poultry poultry) {
        poultryList.remove(poultry);
    }

}
