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
    updateCsv();
//    Airlinerdirectory airlinerlist = new Airlinerdirectory();
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
    public void updateCsv() throws ParseException 
    {
        String csvFile = "src\\airliner.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airl = line.split(cvsSplitBy);
                Airliner a = addData();
                a.setAirliner(airl[0]);
                a.setOrigin(airl[1]);
                a.setFlight(getairline(airl[0]));
            }
//            int i=1;
//            for (Airlines a : airplaneList.getAirlinedirectory()) {
//                System.out.println(i+":Airport-->"+a.getAirport()+"\tModel-->"+a.getModelNo()+"\tTime-->"+a.getTime()+"\tDestination-->"+a.getDestination()+"\tSerialNo-->"+a.getSerialNo());
//                i++;
//                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    public static FlightDirectory getairline(String airliner) throws ParseException
{
    String csvFile = "src\\Book1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        FlightDirectory airplaneList = new FlightDirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airline = line.split(cvsSplitBy);
//                System.out.println("airline="+airline[11]);
                 if(airliner.equalsIgnoreCase(airline[11]))
                 {
                Flight a = airplaneList.addData();
                a.setModelNo(airline[0]);
                a.setDate((airline[1]));
                a.setAirport((airline[2]));
                a.setDestination(airline[3]);
                a.setPreferredtime(airline[4]);
                a.setAvailSeats(airline[5]);
                a.setSerialNo(airline[10]);
                
//                a.setSeatlst(addseats(airline[0]));
                a.setAirliner(airline[11]);
                a.setPrice(airline[12]);
                a.setTime(airline[13]);
            }
            }
//            int i=1;
//            for (Flight a : airplaneList.getAirlinedirectory()) {
//                System.out.println(i+":Airport-->"+a.getAirport()+"\tModel-->"+a.getModelNo()+"\tTime-->"+a.getTime()+"\tDestination-->"+a.getDestination()+"\tSerialNo-->"+a.getSerialNo());
//                i++;
                

//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    return airplaneList;
    








}
public static ArrayList<Seat> addseats(String modelNo)
{
    String csvFile = "src\\seats.csv";
        boolean avail = false;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<Seat> seatList = new ArrayList();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            System.out.println(br.readLine());
            while ((line = br.readLine()) != null) {
                Seat s = new Seat();
                // use comma as separator
                String[] airline = line.split(cvsSplitBy);
                if(modelNo.equalsIgnoreCase(airline[0]))
                {
                s.setModelNo(airline[0]);
                s.setCustId(airline[1]);
                s.setSeatNo(airline[2]);
                s.setSeatType(airline[3]);
                if(airline[4].equalsIgnoreCase("y")){avail=true;}
                if(airline[4].equalsIgnoreCase("N")){avail=false;}
                s.setSeatAvailibility(avail);
                s.setPrice(airline[5]);
                seatList.add(s);
            }
            }
//                int i=1;
//            for (Seat a:seatList) {
//                //System.out.println(i+":Airport-->"+a.getAirport()+"\tModel-->"+a.getModelNo()+"\tTime-->"+a.getTime()+"\tDestination-->"+a.getDestination()+"\tSerialNo-->"+a.getSerialNo());
//                //System.out.println(a.getSeatNo());
//                i++;
                
//            }
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return seatList;
}
}
