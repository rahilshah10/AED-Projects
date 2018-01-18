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
public class AirlineDirectory {
     private ArrayList<Airlines> airlinedirectory;

    public AirlineDirectory() throws ParseException
    {
    airlinedirectory = new ArrayList<>();
    }

    public ArrayList<Airlines> getAirlinedirectory() {
        return airlinedirectory;
    }

    public void setAirlinedirectory(ArrayList<Airlines> airlinedirectory) {
        this.airlinedirectory = airlinedirectory;
    }
   
    public Airlines addData()
    {
    
        Airlines air = new Airlines();
        airlinedirectory.add(air);
        return air;
    
    }
    
}