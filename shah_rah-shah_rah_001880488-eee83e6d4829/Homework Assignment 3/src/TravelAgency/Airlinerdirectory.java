/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author rahil
 */
public class Airlinerdirectory {
    private ArrayList<Airliner> airlinerdirectory;

    public Airlinerdirectory() throws ParseException
    {
    airlinerdirectory = new ArrayList<>();
    }

    public ArrayList<Airliner> getAirlinerdirectory() {
        return airlinerdirectory;
    }

    public void setAirlinerdirectory(ArrayList<Airliner> airlinerdirectory) {
        this.airlinerdirectory = airlinerdirectory;
    }

    public Airliner addData()
    {
    
        Airliner air = new Airliner();
        airlinerdirectory.add(air);
        return air;
    
    }
    
}
