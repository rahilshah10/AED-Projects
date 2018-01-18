/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.AirlineDirectory;
import Business.Airlines;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rahil
 */
public class SearchJPanel extends javax.swing.JPanel {
 private AirlineDirectory ad;
         String yes;
         String no;

    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel(AirlineDirectory ad) {
        initComponents();
        this.ad = ad;
        availibilitybuttongroup.add(availYes);
        availibilitybuttongroup.add(availNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availibilitybuttongroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        searchserialnoTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        manuYearTxtField = new javax.swing.JTextField();
        airportTxtField = new javax.swing.JTextField();
        viewDetailsBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        lastupdatedTxtField = new javax.swing.JTextField();
        lastupdated = new javax.swing.JLabel();
        availibilityChkbox = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        modelnoTxtField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        timeTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serialNoTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        destinationTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        availSeatsTcxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maintainanceTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manufacturerTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        availYes = new javax.swing.JRadioButton();
        availNo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        searchManufacturerTxtField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        searchManuyearTxtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        srchseatfrom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        srchseatto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        searchmodelnotxtField = new javax.swing.JTextField();
        srchlastupadtedTxtField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        searchairportTxtField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        maintainYes = new javax.swing.JRadioButton();
        mainTainNo = new javax.swing.JRadioButton();
        firstAvailable = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();

        jLabel1.setText("Serial No:");

        searchserialnoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchserialnoTxtFieldActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model No", "Destination", "Manufacturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        lastupdated.setText("Last Updated:");

        availibilityChkbox.setText("Availability");

        jLabel10.setText("Model No:");

        jLabel2.setText("Time:");

        jLabel9.setText("Serial No:");

        jLabel3.setText("Airport:");

        jLabel4.setText("Destination:");

        jLabel5.setText("Available Seats:");

        jLabel6.setText("Maintainance:");

        jLabel7.setText("Manufacturer:");

        jLabel8.setText("Manufacture Year:");

        availYes.setText("yes");
        availYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availYesActionPerformed(evt);
            }
        });

        availNo.setText("no");
        availNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availNoActionPerformed(evt);
            }
        });

        jLabel11.setText("Availaible:");

        jLabel12.setText("Manufacturer:");

        searchManufacturerTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchManufacturerTxtFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Manufacturing Year:");

        searchManuyearTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchManuyearTxtFieldActionPerformed(evt);
            }
        });

        jLabel14.setText("Seats:");

        srchseatfrom.setText("0");

        jLabel15.setText("to");

        srchseatto.setText("1000");
        srchseatto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchseattoActionPerformed(evt);
            }
        });

        jLabel16.setText("Model No:");

        searchmodelnotxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchmodelnotxtFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Available at Airport:");

        jLabel18.setText("First Available:");

        jLabel19.setText("Last Updated:");

        jLabel20.setText("Maintainance Certificate Expired?");

        buttonGroup1.add(maintainYes);
        maintainYes.setText("Yes");
        maintainYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintainYesActionPerformed(evt);
            }
        });

        buttonGroup1.add(mainTainNo);
        mainTainNo.setText("No");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchserialnoTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchManufacturerTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchManuyearTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(srchseatfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(srchseatto))
                            .addComponent(searchmodelnotxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(availNo))
                            .addComponent(firstAvailable))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(33, 33, 33)
                            .addComponent(searchairportTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(srchlastupadtedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maintainYes)
                        .addGap(10, 10, 10)
                        .addComponent(mainTainNo)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airportTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelnoTxtField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(availSeatsTcxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destinationTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serialNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastupdated)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(maintainanceTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(manufacturerTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(manuYearTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lastupdatedTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availibilityChkbox)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(viewDetailsBtn)
                                .addGap(22, 22, 22)
                                .addComponent(updateBtn))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewDetailsBtn)
                            .addComponent(updateBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(searchairportTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstAvailable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availYes)
                            .addComponent(availNo)
                            .addComponent(jLabel11)
                            .addComponent(srchlastupadtedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(searchManufacturerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(searchManuyearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintainYes)
                            .addComponent(mainTainNo)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(srchseatfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(srchseatto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(searchserialnoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(searchmodelnotxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(modelnoTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availibilityChkbox))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(availSeatsTcxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastupdated)
                    .addComponent(lastupdatedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(serialNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(209, 209, 209))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        
         searchTable();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();

        if(selectedrow >=0)
        {
            Airlines a = (Airlines)jTable.getValueAt(selectedrow, 0);
            modelnoTxtField1.setText(String.valueOf(a.getModelNo()));
            timeTxtField.setText(String.valueOf(a.getTime()));
            airportTxtField.setText(a.getAirport());
            destinationTxtField.setText(a.getDestination());
            availSeatsTcxtField.setText(String.valueOf(a.getAvailSeats()));
             maintainanceTxtField.setText(String.valueOf(a.getMaintainance()));
            manufacturerTxtField.setText(a.getManufacturer());
            manuYearTxtField.setText(String.valueOf(a.getManufactureYear()));
            serialNoTxtField.setText(a.getSerialNo());
            if(a.getAvalibility().equalsIgnoreCase("Yes"))
            {
                availibilityChkbox.setSelected(true);
            }
            else
            {
                availibilityChkbox.setSelected(false);
            }
        }
        else
        JOptionPane.showMessageDialog(null, "Please select any row");
        modelnoTxtField1.setEnabled(false);
        timeTxtField.setEnabled(false);
        airportTxtField.setEnabled(false);
        destinationTxtField.setEnabled(false);
        availSeatsTcxtField.setEnabled(false);
        maintainanceTxtField.setEnabled(false);
        manufacturerTxtField.setEnabled(false);
        manuYearTxtField.setEnabled(false);
        serialNoTxtField.setEnabled(false);
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();

        if(selectedrow >=0)
        {
            Airlines a = (Airlines)jTable.getValueAt(selectedrow, 0);
            modelnoTxtField1.setEnabled(true);
            timeTxtField.setEnabled(true);
            airportTxtField.setEnabled(true);
            destinationTxtField.setEnabled(true);
            availSeatsTcxtField.setEnabled(true);
            maintainanceTxtField.setEnabled(true);
            manufacturerTxtField.setEnabled(true);
            manuYearTxtField.setEnabled(true);
            serialNoTxtField.setEnabled(true);
            modelnoTxtField1.setText(String.valueOf(a.getModelNo()));
            timeTxtField.setText(String.valueOf(a.getTime()));
            airportTxtField.setText(a.getAirport());
            destinationTxtField.setText(a.getDestination());
            availSeatsTcxtField.setText(String.valueOf(a.getAvailSeats()));
            maintainanceTxtField.setText(String.valueOf(a.getMaintainance()));
            manufacturerTxtField.setText(a.getManufacturer());
            manuYearTxtField.setText(String.valueOf(a.getManufactureYear()));
            serialNoTxtField.setText(a.getSerialNo());
    }//GEN-LAST:event_updateBtnActionPerformed
    }
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();

        if(selectedrow >=0)
        {
            DateFormat df1 = new SimpleDateFormat("DD/MM/YYYY");
            DateFormat df2 = new SimpleDateFormat("HH:MM");
            Airlines a = (Airlines)jTable.getValueAt(selectedrow, 0);
            String modelNo = modelnoTxtField1.getText();
            String time = timeTxtField.getText();
            String airport = airportTxtField.getText();
            String destination = destinationTxtField.getText();
            int availSeats = Integer.parseInt(availSeatsTcxtField.getText());
            String maintainance =(maintainanceTxtField.getText());
            String manufacturer = manufacturerTxtField.getText();
            int manufactureyear = Integer.parseInt(manuYearTxtField.getText());
            //String avial =availibilityYes.isSelected() ? "Yes":"No";
            a.setModelNo(modelNo);
            try {
                a.setTime(df2.parse(time));
            } catch (ParseException ex) {
                Logger.getLogger(SearchJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            a.setAirport(airport);
            a.setDestination(destination);
            a.setAvailSeats(availSeats);
            try {
                a.setMaintainance(df1.parse(maintainance));
            } catch (ParseException ex) {
                Logger.getLogger(SearchJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            a.setManufacturer(manufacturer);
            a.setManufactureYear(manufactureyear);
            //a.setAvalibility(avial);
            searchTable();
    }//GEN-LAST:event_saveButtonActionPerformed
    }
    private void availNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availNoActionPerformed
     // TODO add your handling code here:
     no = "no";
    }//GEN-LAST:event_availNoActionPerformed

    private void searchManuyearTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchManuyearTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchManuyearTxtFieldActionPerformed

    private void searchserialnoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchserialnoTxtFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_searchserialnoTxtFieldActionPerformed

    private void searchmodelnotxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchmodelnotxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchmodelnotxtFieldActionPerformed

    private void availYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availYesActionPerformed
        // TODO add your handling code here:
        yes = "yes";
    }//GEN-LAST:event_availYesActionPerformed

    private void searchManufacturerTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchManufacturerTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchManufacturerTxtFieldActionPerformed

    private void srchseattoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchseattoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchseattoActionPerformed

    private void maintainYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintainYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maintainYesActionPerformed
    
 
       public void searchTable()
    {
    
     
       DefaultTableModel dtm = (DefaultTableModel)jTable.getModel();
       dtm.setRowCount(0);
       Date currentDate =new Date();
        Collections.sort(ad.getAirlinedirectory(),Comparator.comparing(Airlines::getCatlogUpdateTime));
        srchlastupadtedTxtField.setText(String.valueOf(ad.getAirlinedirectory().get(ad.getAirlinedirectory().size()-1).getCatlogUpdateTime()));
        Collections.sort(ad.getAirlinedirectory(),Comparator.comparing(Airlines::getTime));
        System.out.println(ad.getAirlinedirectory().get(0).getTime());
        
       for(Airlines a : ad.getAirlinedirectory())
           
       {
           
            boolean check=false;
           Object row[] = new Object[3];
           row[0] = a;
           row[1] = a.getDestination();
           row[2] = a.getManufacturer();
//           SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");
//           Date i=sdf.parse(a.getTime());
           //String k=sdf.toString(i);
           //i.before(new Date());
           if((searchserialnoTxtField.getText().equalsIgnoreCase(a.getSerialNo()) || searchserialnoTxtField.getText().isEmpty()) && 
          (searchmodelnotxtField.getText().equalsIgnoreCase(a.getModelNo()) || searchmodelnotxtField.getText().isEmpty()) && 
          ((availYes.isSelected() && yes.equalsIgnoreCase(a.getAvalibility()) || !availYes.isSelected()) && 
          (availNo.isSelected() && no.equalsIgnoreCase(a.getAvalibility()) || !availNo.isSelected())) &&
          ( (searchManufacturerTxtField.getText().equalsIgnoreCase(a.getManufacturer())  )  || searchManufacturerTxtField.getText().isEmpty() )  && 
          ( (searchManuyearTxtField.getText().equalsIgnoreCase(String.valueOf(a.getManufactureYear())) || searchManuyearTxtField.getText().isEmpty())) && 
          ( ((a.getAvailSeats()>Integer.parseInt(srchseatfrom.getText())) && (a.getAvailSeats()<Integer.parseInt(srchseatto.getText()))) ) &&
           ( searchairportTxtField.getText().equalsIgnoreCase(a.getAirport()) || searchairportTxtField.getText().isEmpty()) && 
            (((mainTainNo.isSelected() && !(currentDate.compareTo(a.getMaintainance())>0) && !maintainYes.isSelected())) ||
            ((maintainYes.isSelected() && (currentDate.compareTo(a.getMaintainance())>0) && !mainTainNo.isSelected())) || (!mainTainNo.isSelected() && !maintainYes.isSelected())) && 
                 //  (a.getMaintainance()).compareTo(currentDate))>0&&maintainYes.isSelected())|| mainTainNo.isSelected()) &&
            ((firstAvailable.isSelected() && currentDate.compareTo(a.getTime())<0) || !firstAvailable.isSelected())
                           )                 
           {
               
               System.out.println("right");
          check=true;
           }
//           if ( (( !srchseatfrom.getText().isEmpty() && !srchseatto.getText().isEmpty() ) && (a.getAvailSeats()>Integer.parseInt(srchseatfrom.getText())) && (a.getAvailSeats()<Integer.parseInt(srchseatto.getText()))  
//           ) )
//           {
//               System.out.println("right");
//               

//               check = true;
//           }
//          if 
//           //if(availibilityChkbox.isSelected().equalsIgnoreCase()){}
//           //else{check = false;}
                   
//                   
//            if(searchManufacturerTxtField.getText().equalsIgnoreCase(a.getManufacturer()))     
//            {
//                check=true;
//            }
               
//              if((availYes.isSelected() && yes.equalsIgnoreCase(a.getAvalibility()) || !availYes.isSelected()) && (availNo.isSelected() && no.equalsIgnoreCase(a.getAvalibility()) || !availNo.isSelected()))
//                   {
//                    check=true;
//                    }
                   
                   
                   
                   
           if(check)
           {
        dtm.addRow(row);
           }
       }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airportTxtField;
    private javax.swing.JRadioButton availNo;
    private javax.swing.JTextField availSeatsTcxtField;
    private javax.swing.JRadioButton availYes;
    private javax.swing.JCheckBox availibilityChkbox;
    private javax.swing.ButtonGroup availibilitybuttongroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JCheckBox firstAvailable;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lastupdated;
    private javax.swing.JTextField lastupdatedTxtField;
    private javax.swing.JRadioButton mainTainNo;
    private javax.swing.JRadioButton maintainYes;
    private javax.swing.JTextField maintainanceTxtField;
    private javax.swing.JTextField manuYearTxtField;
    private javax.swing.JTextField manufacturerTxtField;
    private javax.swing.JTextField modelnoTxtField1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchManufacturerTxtField;
    private javax.swing.JTextField searchManuyearTxtField;
    private javax.swing.JTextField searchairportTxtField;
    private javax.swing.JTextField searchmodelnotxtField;
    private javax.swing.JTextField searchserialnoTxtField;
    private javax.swing.JTextField serialNoTxtField;
    private javax.swing.JTextField srchlastupadtedTxtField;
    private javax.swing.JTextField srchseatfrom;
    private javax.swing.JTextField srchseatto;
    private javax.swing.JTextField timeTxtField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
