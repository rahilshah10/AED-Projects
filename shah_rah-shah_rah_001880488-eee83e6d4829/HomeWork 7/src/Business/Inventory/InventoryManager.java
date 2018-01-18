/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Vaccine.VaccineCatalog;

/**
 *
 * @author shah.rah
 */
public class InventoryManager {
    private VaccineCatalog vaccinelist;

    public VaccineCatalog getVaccinelist() {
        return vaccinelist;
    }

    public void setVaccinelist(VaccineCatalog vaccinelist) {
        this.vaccinelist = vaccinelist;
    }
    
    
}
