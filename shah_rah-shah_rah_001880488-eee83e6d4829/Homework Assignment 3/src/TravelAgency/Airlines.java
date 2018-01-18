/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.util.ArrayList;



/**
 *
 * @author rahil
 */
public class Airlines{
    private String modelNo;
    private String time;
    private String airport;
    private String destination;
    private String manufacturer;
    private String serialNo;
    private ArrayList<Seat> seatlst;
    private String Airliner;
    
      public String getAirliner() {
        return Airliner;
    }

    public void setAirliner(String Airliner) {
        this.Airliner = Airliner;
    }
    

    public ArrayList<Seat> getSeatlst() {
        return seatlst;
    }

    public void setSeatlst(ArrayList<Seat> seatlst) {
        this.seatlst = seatlst;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
        
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

   
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }


    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
  

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    @Override   
    public String toString()
    {
   return this.modelNo; 
    }
}