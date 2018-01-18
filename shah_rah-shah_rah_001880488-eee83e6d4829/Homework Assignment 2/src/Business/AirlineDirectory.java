/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    updateCsv();
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
    
        private void updateCsv() throws ParseException 
        {
        String csvFile = "src\\Book1.csv";
        BufferedReader br = null;
        String line = null;
        String cvsSplitBy = ",";

        try {
            DateFormat df1 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airline = line.split(cvsSplitBy);
                System.out.println("ad"+airline);
                Airlines a = addData();
                a.setModelNo(airline[0]);
                a.setTime(df1.parse(airline[1]));
                a.setAirport((airline[2]));
                a.setDestination(airline[3]);
                a.setAvailSeats(Integer.parseInt(airline[4]));
                a.setMaintainance(df1.parse(airline[5]));
                a.setManufacturer(airline[6]);
                a.setManufactureYear(Integer.parseInt(airline[7]));
                a.setAvalibility(airline[8]);
                a.setCatlogUpdateTime(df1.parse(airline[9]));  
                a.setSerialNo(airline[10]);
                
            }

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }

    }

}