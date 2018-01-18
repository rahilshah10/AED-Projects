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
public class CreditcardData {
    private int cardnumber;
    private String validfrom;
    private String untilend;
    private String companyname;
    private String cardtype;

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getValidfrom() {
        return validfrom;
    }

    public void setValidfrom(String validfrom) {
        this.validfrom = validfrom;
    }

    public String getUntilend() {
        return untilend;
    }

    public void setUntilend(String untilend) {
        this.untilend = untilend;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }
   
}
