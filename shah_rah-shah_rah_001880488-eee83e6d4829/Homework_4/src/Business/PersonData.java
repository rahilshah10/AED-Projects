/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rahil
 */
public class PersonData {

    public PersonData() {
    }
    
    private String firstname;
    private String SeatNo;

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

   
}