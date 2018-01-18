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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rahil
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private AirlineDirectory ad;
    public ViewJPanel(AirlineDirectory ad) {
        initComponents();
        this.ad = ad;
        populateTable();
    }
public void populateTable()
    {
    
     
       DefaultTableModel dtm = (DefaultTableModel)jTable.getModel();
       dtm.setRowCount(0);
       
       for(Airlines a : ad.getAirlinedirectory())
       {
       
           Object row[] = new Object[2];
           row[0] = a;
           row[1] = a.getDestination();
           dtm.addRow(row);
           
       
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        modelnoTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        timeTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        destinationTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        availSeatsTcxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maintainanceTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manufacturerTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        manuYearTxtField = new javax.swing.JTextField();
        airportTxtField = new javax.swing.JTextField();
        viewDetailsBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        availibilityChkbox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        serialNoTxtField = new javax.swing.JTextField();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model No", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel1.setText("Model No:");

        jLabel2.setText("Time:");

        jLabel3.setText("Airport:");

        jLabel4.setText("Destination:");

        jLabel5.setText("Available Seats:");

        jLabel6.setText("Maintainance:");

        jLabel7.setText("Manufacturer:");

        jLabel8.setText("Manufacture Year:");

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

        availibilityChkbox.setText("Availability");
        availibilityChkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availibilityChkboxActionPerformed(evt);
            }
        });

        jLabel9.setText("Serial No:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(modelnoTxtField)
                            .addComponent(airportTxtField)
                            .addComponent(destinationTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(availSeatsTcxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serialNoTxtField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(manuYearTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(maintainanceTxtField)
                                    .addComponent(manufacturerTxtField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availibilityChkbox)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(viewDetailsBtn)
                                .addGap(22, 22, 22)
                                .addComponent(updateBtn))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsBtn)
                    .addComponent(updateBtn))
                .addGap(27, 27, 27)
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availibilityChkbox))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(availSeatsTcxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(serialNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();
        
        if(selectedrow >=0)
        {
        Airlines a = (Airlines)jTable.getValueAt(selectedrow, 0);
        modelnoTxtField.setText(String.valueOf(a.getModelNo()));
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
        modelnoTxtField.setEnabled(false);
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
        modelnoTxtField.setEnabled(true);
        timeTxtField.setEnabled(true);
        airportTxtField.setEnabled(true);
        destinationTxtField.setEnabled(true);
        availSeatsTcxtField.setEnabled(true);
        maintainanceTxtField.setEnabled(true);
        manufacturerTxtField.setEnabled(true);
        manuYearTxtField.setEnabled(true);
        serialNoTxtField.setEnabled(true);
        modelnoTxtField.setText(String.valueOf(a.getModelNo()));
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
        String modelNo = modelnoTxtField.getText();
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
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setAirport(airport);
        a.setDestination(destination);
        a.setAvailSeats(availSeats);
        try {
            a.setMaintainance(df2.parse(maintainance));
        } catch (ParseException ex) {
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setManufacturer(manufacturer);
        a.setManufactureYear(manufactureyear);
        //a.setAvalibility(avial);
        a.setCatlogUpdateTime(Calendar.getInstance().getTime());
        populateTable();
    }//GEN-LAST:event_saveButtonActionPerformed
    }
    private void availibilityChkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availibilityChkboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availibilityChkboxActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airportTxtField;
    private javax.swing.JTextField availSeatsTcxtField;
    private javax.swing.JCheckBox availibilityChkbox;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField maintainanceTxtField;
    private javax.swing.JTextField manuYearTxtField;
    private javax.swing.JTextField manufacturerTxtField;
    private javax.swing.JTextField modelnoTxtField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField serialNoTxtField;
    private javax.swing.JTextField timeTxtField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
