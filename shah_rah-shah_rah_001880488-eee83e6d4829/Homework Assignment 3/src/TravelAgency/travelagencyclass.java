/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author rahil
 */
import java.text.ParseException;import java.util.ArrayList;
/**
 *
 * @author rahil
 */
public class travelagencyclass {
    
public static void main(String[] args) throws ParseException {
    Airlinerdirectory ad= getAirliner();
    int totrev=0;
    int seatA=1000;
    int seatB=700;
    int seatC=500;
   
    for(int k=0;k<ad.getAirlinerdirectory().size();k++){
    {int airlinerinc=0;
    for(int i=0; i< ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().size(); i++)
    {
        int revflight = 0;
        for (int j=0; j< ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getSeatlst().size();j++)
        {
            if(!ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getSeatlst().get(j).getSeatType().equalsIgnoreCase("A"))
            {
            totrev+=seatA;
            revflight+=seatA;
            airlinerinc+=seatA;
            }
            if(!ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getSeatlst().get(j).getSeatType().equalsIgnoreCase("B"))
            {
            totrev+=seatB;
            revflight+=seatB;
            airlinerinc+=seatB;
            }
            if(!ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getSeatlst().get(j).getSeatType().equalsIgnoreCase("C"))
            {
            totrev+=seatC;
            revflight+=seatC;
            airlinerinc+=seatC;
            }
            
        }
        System.out.println("Flight Revenue:"+revflight);
    System.out.println(ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getSerialNo()+" "+
            ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getAirport()+" "+ad.getAirlinerdirectory().get(k).getAirline().getAirlinedirectory().get(i).getDestination()+" "+revflight);
    }
        System.out.println("");
        System.out.println("Total revenue of airliner ="+airlinerinc);





}   
    
    System.out.println("");
    System.out.println("Total revenue ="+totrev);
}
    }
public static Airlinerdirectory getAirliner() throws ParseException
{
    String csvFile = "src\\airliner.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        Airlinerdirectory airlinerlist = new Airlinerdirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airl = line.split(cvsSplitBy);
                Airliner a = airlinerlist.addData();
                a.setAirliner(airl[0]);
                a.setAirline(getairline(airl[0]));
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
    return airlinerlist;


}
 
public static AirlineDirectory getairline(String airliner) throws ParseException
{
    String csvFile = "src\\Book1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        AirlineDirectory airplaneList = new AirlineDirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airline = line.split(cvsSplitBy);
//                System.out.println("airline="+airline[11]);
                 if(airliner.equalsIgnoreCase(airline[11]))
                 {
                Airlines a = airplaneList.addData();
                a.setModelNo(airline[0]);
                a.setTime((airline[1]));
                a.setAirport((airline[2]));
                a.setDestination(airline[3]);
                a.setSerialNo(airline[10]);
                
                a.setSeatlst(addseats(airline[0]));
                a.setAirliner(airline[11]);
            }
            }
            int i=1;
            for (Airlines a : airplaneList.getAirlinedirectory()) {
                System.out.println(i+":Airport-->"+a.getAirport()+"\tModel-->"+a.getModelNo()+"\tTime-->"+a.getTime()+"\tDestination-->"+a.getDestination()+"\tSerialNo-->"+a.getSerialNo());
                i++;
                

            }

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