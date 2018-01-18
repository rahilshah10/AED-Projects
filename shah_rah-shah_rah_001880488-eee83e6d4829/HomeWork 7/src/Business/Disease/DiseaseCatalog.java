/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author shah.rah
 */
public class DiseaseCatalog {

    private ArrayList<Disease> diseaseCatalog;

    public DiseaseCatalog() {
        this.diseaseCatalog = new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(ArrayList<Disease> diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }

    public Disease addDisease() {
        Disease d = new Disease();
        diseaseCatalog.add(d);
        return d;
    }

    public void deleteDisease(Disease d) {
        diseaseCatalog.remove(d);
    }

}
