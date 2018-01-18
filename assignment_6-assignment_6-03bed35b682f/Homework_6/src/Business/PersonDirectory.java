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
public class PersonDirectory {
     private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory= new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
     
     public Person addPerson()
    {
        Person per=new Person();
        personDirectory.add(per);
        return per;
    }
    
    public void removePerson(Person person)
    {
        personDirectory.remove(person);
    }
    
    public Person searchPerson(String fname,String lname)
    {
        for(Person person:personDirectory)
        {
            if(person.getFirstName().equalsIgnoreCase(fname) && person.getLastName().equalsIgnoreCase(lname))
            {
                return person;
            }
        }
        return null;
     }  
     
    
    
}
