/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;

/**
 *
 * @author rahil
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalJPanel
     * @param vsh
     */
private VitalSignHistory vsh;
    public CreateVitalJPanel(VitalSignHistory vsh) {
         initComponents();
         this.vsh = vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemp = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        lblTemp.setText("Temperature:");

        lblBloodPressure.setText("Blood Pressure:");

        lblPulse.setText("Pulse:");

        lblDate.setText("Date:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Create Vital Signs");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addGap(30, 30, 30)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPulse)
                                .addGap(30, 30, 30)
                                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBloodPressure)
                                .addGap(30, 30, 30)
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTemp)
                                .addGap(30, 30, 30)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnSave)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSave)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        double temperature = Double.parseDouble(txtTemperature.getText());
        double bp = Double.parseDouble(txtBloodPressure.getText());
        int pulse = Integer.parseInt(txtPulse.getText());
        String date = txtDate.getText();
        VitalSigns v = vsh.addVitals();
        v.setBloodPressure(bp);
        v.setTemperature(temperature);
        v.setDate(date);
        v.setPulse(pulse);
        
        JOptionPane.showMessageDialog(null, "VitalSigns Added Successfully ");
        
        txtBloodPressure.setText("");
        txtDate.setText("");
        txtPulse.setText("");
        txtTemperature.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
