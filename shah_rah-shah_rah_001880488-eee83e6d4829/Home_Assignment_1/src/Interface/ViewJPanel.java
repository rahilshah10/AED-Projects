/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.PersonData;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author rahil
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(PersonData person) {
        initComponents();
        displayPerson(person); 
    }
public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(191,177, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    private void displayPerson(PersonData person)
    {
        String personimage= person.getPhoto();
        label.setIcon(ResizeImage(personimage));
        
        String personFirstName= person.getFirstname();
        firstnameTextField.setText(personFirstName);        
        
        String personLastName= person.getLastname();
        lastnameTextField.setText(personLastName);
        
        String personGender= person.getGender();
        genderTextField.setText(personGender);
        
        String personDateofbirth= person.getDateofbirth();
        dateofbirthTextField.setText(personDateofbirth);
        
        String personPhoneNo= String.valueOf(person.getPhoneno());
        phonenoTextField.setText(personPhoneNo);
        
        String personAddline1= person.getAddress().getAddressline1();
        addressline1TextField.setText(personAddline1);
        
        String personAddline2= person.getAddress().getAddressline2();
        addressline2TextField.setText(personAddline2);
        
        String personCity= person.getAddress().getCity();
        cityTextField.setText(personCity);
        
        String personState= person.getAddress().getState();
        stateTextField.setText(personState);
        
        String personZipcode= String.valueOf(person.getAddress().getZipcode());
        zipTextField.setText(personZipcode);
        
        String personLiscenseNo= String.valueOf(person.getLicense().getLicensenumber());
        liscensenumberTextField.setText(personLiscenseNo);
        
        String personIssuedate= person.getLicense().getIssuedate();
        issuedateTextField.setText(personIssuedate);
        
        String personExpirydate= person.getLicense().getExpirydate();
        expirydateTextField.setText(personExpirydate);
        
        String personHeight= String.valueOf(person.getLicense().getHeight());
        heightTextField.setText(personHeight);
        
        String personWeight= String.valueOf(person.getLicense().getWeight());
        weightTextField.setText(personWeight);
        
        String personCardNo= String.valueOf(person.getCreditcard().getCardnumber());
        cardnumberTextField.setText(personCardNo);
        
        String personValidfrom= person.getCreditcard().getValidfrom();
        validfromTextField.setText(personValidfrom);
        
        String personUntilend= person.getCreditcard().getUntilend();
        untilendTextField.setText(personUntilend);
        
        String personCompanyname= person.getCreditcard().getCompanyname();
        companynameTextField.setText(personCompanyname);
        
        String personCardtype= person.getCreditcard().getCardtype();
        cardtypeTextField.setText(personCardtype);
        
        String personCaccountno= String.valueOf(person.getCheckingbank().getAccountnumber());
        caccountnumberTextField.setText(personCaccountno);
        
        String personCdebt= String.valueOf(person.getCheckingbank().getDebt());
        cdebtTextField.setText(personCdebt);
        
        String personcactivity= person.getCheckingbank().getActivity();
        cactivityTextField.setText(personcactivity);
        
        String personccreationdate= person.getCheckingbank().getCreationdate();
        ccreationdateTextField.setText(personccreationdate);
        
        String personccredit= String.valueOf(person.getCheckingbank().getCredit());
        ccreditTextField.setText(personccredit);
        
        String personSaccountno=String.valueOf(person.getSavingsbank().getAccountnumber());
        saccountnumberTextField.setText(personSaccountno);
        
        String personSdebt=String.valueOf(person.getSavingsbank().getDebt());
        sdebtTextField.setText(personSdebt);
        
        String personsactivity= person.getSavingsbank().getActivity();
        sactivityTextField.setText(personsactivity);
        
        String personscreationdate= person.getSavingsbank().getCreationdate();
        screationdateTextField.setText(personscreationdate);
        
        String personscredit=String.valueOf(person.getSavingsbank().getCredit());
        screditTextField.setText(personscredit);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        genderTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateofbirthTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phonenoTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addressline1TextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressline2TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        liscensenumberTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        issuedateTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        expirydateTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cardnumberTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        validfromTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        untilendTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        companynameTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cardtypeTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        caccountnumberTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cdebtTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cactivityTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ccreationdateTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        ccreditTextField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        saccountnumberTextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        sdebtTextField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        sactivityTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        screationdateTextField = new javax.swing.JTextField();
        screditTextField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel37.setText("View");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Person");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Gender:");

        genderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Date of Birth:");

        jLabel6.setText("Phone No:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Address");

        jLabel7.setText("Address Line 1:");

        jLabel8.setText("Address Line 2:");

        addressline2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressline2TextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("City:");

        jLabel10.setText("State:");

        jLabel12.setText("Zip Code:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("License");

        jLabel14.setText("Liscense Number:");

        jLabel15.setText("Issue Date:");

        jLabel16.setText("Expiry Date:");

        jLabel17.setText("Height:");

        jLabel18.setText("Weight:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Credit Card");

        jLabel20.setText("Card Number:");

        jLabel21.setText("Valid From:");

        jLabel22.setText("Until End:");

        jLabel23.setText("Company Name:");

        jLabel24.setText("Card Type:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Checking Account");

        jLabel25.setText("Account Number:");

        jLabel26.setText("Debt:");

        jLabel28.setText("Activity:");

        jLabel29.setText("Creation Date:");

        jLabel30.setText("Credit:");

        ccreditTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccreditTextFieldActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Savings Account");

        jLabel32.setText("Account Number:");

        jLabel33.setText("Debt:");

        jLabel34.setText("Activity:");

        jLabel35.setText("Creation Date:");

        jLabel36.setText("Credit:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("Banking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(genderTextField)
                                            .addComponent(dateofbirthTextField)
                                            .addComponent(phonenoTextField)
                                            .addComponent(firstnameTextField))
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel20)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel24)))
                                            .addComponent(jLabel12)))
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(liscensenumberTextField)
                                    .addComponent(issuedateTextField)
                                    .addComponent(expirydateTextField)
                                    .addComponent(heightTextField)
                                    .addComponent(weightTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(stateTextField)
                                        .addComponent(zipTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(cardnumberTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(validfromTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(untilendTextField)
                                        .addComponent(companynameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cardtypeTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(133, 133, 133)
                                            .addComponent(jLabel29)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel30))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressline2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressline1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel27)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37)
                        .addGap(167, 167, 167)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ccreationdateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cactivityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cdebtTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caccountnumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ccreditTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saccountnumberTextField)
                                    .addComponent(sdebtTextField)
                                    .addComponent(sactivityTextField)
                                    .addComponent(screationdateTextField)
                                    .addComponent(screditTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(319, 319, 319))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressline1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(addressline2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateofbirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(phonenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(liscensenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(cardnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(caccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(saccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(issuedateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(validfromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(cdebtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(sdebtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(expirydateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(untilendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(cactivityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(sactivityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(companynameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(ccreationdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(screationdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(cardtypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(ccreditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(screditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void genderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextFieldActionPerformed

    private void addressline2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressline2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressline2TextFieldActionPerformed

    private void ccreditTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccreditTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccreditTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressline1TextField;
    private javax.swing.JTextField addressline2TextField;
    private javax.swing.JTextField caccountnumberTextField;
    private javax.swing.JTextField cactivityTextField;
    private javax.swing.JTextField cardnumberTextField;
    private javax.swing.JTextField cardtypeTextField;
    private javax.swing.JTextField ccreationdateTextField;
    private javax.swing.JTextField ccreditTextField;
    private javax.swing.JTextField cdebtTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField companynameTextField;
    private javax.swing.JTextField dateofbirthTextField;
    private javax.swing.JTextField expirydateTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JTextField issuedateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField liscensenumberTextField;
    private javax.swing.JTextField phonenoTextField;
    private javax.swing.JTextField saccountnumberTextField;
    private javax.swing.JTextField sactivityTextField;
    private javax.swing.JTextField screationdateTextField;
    private javax.swing.JTextField screditTextField;
    private javax.swing.JTextField sdebtTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField untilendTextField;
    private javax.swing.JTextField validfromTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
