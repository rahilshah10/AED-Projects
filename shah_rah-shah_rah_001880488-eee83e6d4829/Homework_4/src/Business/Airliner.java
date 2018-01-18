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
public class Airliner {
    private String Airliner;
    private FlightDirectory flight = new FlightDirectory();
    private String Origin;

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getAirliner() {
        return Airliner;
    }

    public void setAirliner(String Airliner) {
        this.Airliner = Airliner;
    }

    public FlightDirectory getFlight() {
        return flight;
    }

    public void setFlight(FlightDirectory flight) {
        this.flight = flight;
    }
    @Override
        public String toString()
        {
        return this.Airliner; 
        }
}
