/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.AirlineDirectory;
import Business.Airlines;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rahil
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private AirlineDirectory ad;
    public CreateJPanel(AirlineDirectory ad) {
        initComponents();
        this.ad = ad;
        availabilityGrp.add(availibilityYes);
        availabilityGrp.add(availibiltyNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availabilityGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modelnoTxtField = new javax.swing.JTextField();
        timeTxtField = new javax.swing.JTextField();
        airportTxtField = new javax.swing.JTextField();
        destinationTxtField = new javax.swing.JTextField();
        maintainanceTxtField = new javax.swing.JTextField();
        availSeatsTcxtField = new javax.swing.JTextField();
        manufacturerTxtField = new javax.swing.JTextField();
        manuYearTxtField = new javax.swing.JTextField();
        cr8Btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        availibilityYes = new javax.swing.JRadioButton();
        availibiltyNo = new javax.swing.JRadioButton();
        lastupdated = new javax.swing.JLabel();
        lastupdatedTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        serialNoTxtField = new javax.swing.JTextField();

        jLabel1.setText("Model No:");

        jLabel2.setText("Time:");

        jLabel3.setText("Airport:");

        jLabel4.setText("Destination:");

        jLabel5.setText("Available Seats:");

        jLabel6.setText("Maintainace:");

        jLabel7.setText("Manufacturer:");

        jLabel8.setText("Manufacture Year:");

        cr8Btn.setText("Create");
        cr8Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr8BtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Availibility:");

        availabilityGrp.add(availibilityYes);
        availibilityYes.setText("Yes");
        availibilityYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availibilityYesActionPerformed(evt);
            }
        });

        availabilityGrp.add(availibiltyNo);
        availibiltyNo.setText("No");

        lastupdated.setText("Last Updated:");

        jLabel10.setText("Serial No:");

        serialNoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNoTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(cr8Btn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availSeatsTcxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastupdated))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airportTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelnoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maintainanceTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(manufacturerTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(manuYearTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availibilityYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(availibiltyNo))
                            .addComponent(lastupdatedTxtField))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serialNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(modelnoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintainanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(timeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(airportTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manuYearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(availibilityYes)
                    .addComponent(availibiltyNo))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(availSeatsTcxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastupdated)
                    .addComponent(lastupdatedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(serialNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(cr8Btn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cr8BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr8BtnActionPerformed
        // TODO add your handling code here:
        if (validateValues())
        {
        DateFormat df1 = new SimpleDateFormat("DD/MM/YYYY");
        DateFormat df2 = new SimpleDateFormat("HH:MM");
        String modelNo = modelnoTxtField.getText();
        String time = timeTxtField.getText();
        String airport = airportTxtField.getText();
        String destination = destinationTxtField.getText();
        int availSeats = Integer.parseInt(availSeatsTcxtField.getText());
        String maintainance = maintainanceTxtField.getText();
        String manufacturer = manufacturerTxtField.getText();
        int manufactureyear = Integer.parseInt(manuYearTxtField.getText());
        String avial =availibilityYes.isSelected() ? "Yes":"No";
        String updatetime = lastupdatedTxtField.getText();
        String serialNo = serialNoTxtField.getText();
        
        Airlines a = ad.addData();
        a.setModelNo(modelNo);
            try {
                a.setTime(df2.parse(time));
            } catch (ParseException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        a.setAirport(airport);
        a.setDestination(destination);
        a.setAvailSeats(availSeats);
            try {
                a.setMaintainance(df1.parse(maintainance));
            } catch (ParseException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        a.setManufacturer(manufacturer);
        a.setManufactureYear(manufactureyear);
        a.setAvalibility(avial);
            try {   
                a.setCatlogUpdateTime(df2.parse(updatetime));
            } catch (ParseException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        a.setSerialNo(serialNo);
        JOptionPane.showMessageDialog(null, "Airplane Added Successfully ");
        
        modelnoTxtField.setText("");
        timeTxtField.setText("");
        airportTxtField.setText("");
        destinationTxtField.setText("");
        availSeatsTcxtField.setText("");
        maintainanceTxtField.setText("");
        manufacturerTxtField.setText("");
        manuYearTxtField.setText("");
        lastupdatedTxtField.setText("");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Please enter correct input values");
        }
       
    }//GEN-LAST:event_cr8BtnActionPerformed

    private boolean validateValues()
    {
        boolean check=false;
   if(!modelnoTxtField.getText().equalsIgnoreCase(""))
   {
       check=true;
       /* String time = timeTxtField.getText();
        String source = sourceTxtField.getText();
        String destination = destinationTxtField.getText();
        int availSeats = Integer.parseInt(availSeatsTcxtField.getText());
        int price = Integer.parseInt(priceTxtField.getText());
        String manufacturer = manufacturerTxtField.getText();
        int manufactureyear = Integer.parseInt(manuYearTxtField.getText());
        String avial =availibilityYes.isSelected() ? "Yes":"No";
        String updatetime = lastupdatedTxtField.getText();*/
   }
   else {
       check=false;
   } 
    if(!(availSeatsTcxtField.getText().equalsIgnoreCase("")) && Integer.parseInt(availSeatsTcxtField.getText())>0)
   {
       System.out.println(Integer.parseInt(availSeatsTcxtField.getText()));
       check=true;
   }
    else {
       check=false;
   } 
   
        return check;
    }
    
    
    
    private void availibilityYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availibilityYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availibilityYesActionPerformed

    private void serialNoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNoTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airportTxtField;
    private javax.swing.JTextField availSeatsTcxtField;
    private javax.swing.ButtonGroup availabilityGrp;
    private javax.swing.JRadioButton availibilityYes;
    private javax.swing.JRadioButton availibiltyNo;
    private javax.swing.JButton cr8Btn;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lastupdated;
    private javax.swing.JTextField lastupdatedTxtField;
    private javax.swing.JTextField maintainanceTxtField;
    private javax.swing.JTextField manuYearTxtField;
    private javax.swing.JTextField manufacturerTxtField;
    private javax.swing.JTextField modelnoTxtField;
    private javax.swing.JTextField serialNoTxtField;
    private javax.swing.JTextField timeTxtField;
    // End of variables declaration//GEN-END:variables
}
