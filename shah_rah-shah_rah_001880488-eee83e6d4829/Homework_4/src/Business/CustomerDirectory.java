/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author rahil
 */
public class CustomerDirectory {
    private ArrayList<PersonData> cutomerdir;

    public CustomerDirectory() throws ParseException
    {
    cutomerdir = new ArrayList<>();
    }

    public ArrayList<PersonData> getCutomerdir() {
        return cutomerdir;
    }

    public void setCutomerdir(ArrayList<PersonData> cutomerdir) {
        this.cutomerdir = cutomerdir;
    }

      
    public PersonData addData()
    {
    
        PersonData p = new PersonData();
        cutomerdir.add(p);
        return p;
    
    }
    
}
