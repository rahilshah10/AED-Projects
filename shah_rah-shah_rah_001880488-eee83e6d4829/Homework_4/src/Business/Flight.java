/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;



/**
 *
 * @author rahil
 */
public class Flight{
    private String modelNo;
    private String date;
    private String airport;
    private String destination;
    private String preferredtime;
    private String serialNo;
    private ArrayList<Seat> seatlst;
    private String Airliner;
    private String Price;
    private String time;
    private String availSeats;

    public String getAvailSeats() {
        return availSeats;
    }

    public void setAvailSeats(String availSeats) {
        this.availSeats = availSeats;
    }
    
    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
    
    public String getPreferredtime() {
        return preferredtime;
    }

    public void setPreferredtime(String preferredtime) {
        this.preferredtime = preferredtime;
    }
    
    @Override   
    public String toString()
    {
   return this.modelNo; 
    }
}