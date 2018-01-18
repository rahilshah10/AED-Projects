/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import Business.Disease.Disease;
import java.util.ArrayList;

/**
 *
 * @author shah.rah
 */
public class VaccineCatalog {

    public ArrayList<Vaccine> vaccineCatalog;

    public VaccineCatalog() {
        this.vaccineCatalog = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(ArrayList<Vaccine> vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }

    public Vaccine addVaccine() {
        Vaccine v = new Vaccine();
        vaccineCatalog.add(v);
        return v;
    }

    public void deleteVaccine(Vaccine v) {
        vaccineCatalog.remove(v);
    }
public void deleteAll(Disease d)
     {
     for(Vaccine v :vaccineCatalog)
        {
            if(v.getDisease().equals(d))
            {
                vaccineCatalog.remove(v);
            }
        }
     }
}
