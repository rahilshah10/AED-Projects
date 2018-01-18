/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import Business.Disease.Disease;

/**
 *
 * @author shah.rah
 */
public class Vaccine {

    private String vaccineName;
    private int quantity;
    private Disease disease;

    public Vaccine() {
        this.disease = new Disease();
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    
    @Override
    public String toString() {
        return vaccineName;
    }

}
