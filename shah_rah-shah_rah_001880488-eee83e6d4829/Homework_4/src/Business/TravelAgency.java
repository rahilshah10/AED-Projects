/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;

/**
 *
 * @author rahil
 */
public class TravelAgency {
    private Airlinerdirectory ad;
    private CustomerDirectory cd;

    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }
    

    public TravelAgency() throws ParseException {
        ad = new Airlinerdirectory();
        cd = new CustomerDirectory();
    }
    
    

    public Airlinerdirectory getAd() {
        return ad;
    }

    public void setAd(Airlinerdirectory ad) {
        this.ad = ad;
    }
    
    
}
