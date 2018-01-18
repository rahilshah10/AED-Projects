/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Poultry;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Urja
 */
public class ChickenShed {

    private int chickenShedId;
    private float temperature;
    private float humidity;
    private float weatheroutside;
    private String date;
    private String EggType;
    private int EggQuantity;
    private String isSterelized;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public String getIsSterelized() {
        return isSterelized;
    }

    public void setIsSterelized(String isSterelized) {
        this.isSterelized = isSterelized;
    }

    public int getEggQuantity() {
        return EggQuantity;
    }

    public void setEggQuantity(int EggQuantity) {
        this.EggQuantity = EggQuantity;
    }

    public int getChickenShedId() {
        return chickenShedId;
    }

    public void setChickenShedId(int chickenShedId) {
        this.chickenShedId = chickenShedId;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getWeatheroutside() {
        return weatheroutside;
    }

    public void setWeatheroutside(float weatheroutside) {
        this.weatheroutside = weatheroutside;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEggType() {
        return EggType;
    }

    public void setEggType(String EggType) {
        this.EggType = EggType;
    }

    @Override
    public String toString() {
        return String.valueOf(chickenShedId);
    }

    

}
