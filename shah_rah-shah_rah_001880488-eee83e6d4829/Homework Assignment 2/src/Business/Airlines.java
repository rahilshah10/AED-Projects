/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;


/**
 *
 * @author rahil
 */
public class Airlines{
    private String modelNo;
    private Date time;
    private String airport;
    private String destination;
    private int availSeats;
    private Date maintainance;
    private String manufacturer;
    private int manufactureYear;
    private String avalibility;
    private Date catlogUpdateTime;
    private String serialNo;
    
    
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getCatlogUpdateTime() {
        return catlogUpdateTime;
    }

    public void setCatlogUpdateTime(Date catlogUpdateTime) {
        this.catlogUpdateTime = catlogUpdateTime;
    }
    
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public Date getMaintainance() {
        return maintainance;
    }

    public void setMaintainance(Date maintainance) {
        this.maintainance = maintainance;
    }
   
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }


    public String getAvalibility() {
        return avalibility;
    }

    public void setAvalibility(String avalibility) {
        this.avalibility = avalibility;
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

    public int getAvailSeats() {
        return availSeats;
    }

    public void setAvailSeats(int availSeats) {
        this.availSeats = availSeats;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    @Override   
    public String toString()
    {
   return this.modelNo; 
    }
}