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
        this.address = new AddressData();
        this.checkingbank = new BankData();
        this.savingsbank = new BankData();
        this.license = new LicenseData();
        this.creditcard = new CreditcardData();
    }
    private String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    private String firstname;
    private String lastname;
    private String gender;
    private String dateofbirth;
    private String phoneno;
    AddressData address;
    BankData checkingbank;
    BankData savingsbank;
    LicenseData license;
    CreditcardData creditcard;

    public BankData getCheckingbank() {
        return checkingbank;
    }

    public void setCheckingbank(BankData checkingbank) {
        this.checkingbank = checkingbank;
    }

    public BankData getSavingsbank() {
        return savingsbank;
    }

    public void setSavingsbank(BankData savingsbank) {
        this.savingsbank = savingsbank;
    }

    public AddressData getAddress() {
        return address;
    }

    public void setAddress(AddressData address) {
        this.address = address;
    }

        public LicenseData getLicense() {
        return license;
    }

    public void setLicense(LicenseData license) {
        this.license = license;
    }

    public CreditcardData getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(CreditcardData creditcard) {
        this.creditcard = creditcard;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}