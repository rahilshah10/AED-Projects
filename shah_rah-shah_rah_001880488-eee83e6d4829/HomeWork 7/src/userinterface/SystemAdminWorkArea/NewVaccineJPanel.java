/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Disease.Disease;
import Business.Disease.DiseaseCatalog;
import Business.EcoSystem;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineCatalog;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shah.rah
 */
public class NewVaccineJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form NewVaccineJPanel
     */
    
    public NewVaccineJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateField();
    }

    public void populateField()
    {
        comboPerson.removeAllItems();
       
        for(Disease disease: Business.EcoSystem.getInstance().getDiseaseCatalog().getDiseaseCatalog())
        {      
            comboPerson.addItem(disease);
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

        txtVaccineName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboPerson = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVaccineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccineNameActionPerformed(evt);
            }
        });
        add(txtVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 108, 120, -1));

        jLabel1.setText("Vaccine Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 111, -1, -1));

        comboPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPersonActionPerformed(evt);
            }
        });
        add(comboPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 146, 120, -1));

        jLabel3.setText("Select a Disease");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 149, -1, -1));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 204, 65, -1));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 238, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtVaccineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccineNameActionPerformed

    private void comboPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPersonActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        //        UserAccount a=business.getuDir().searchAccountbyPerson(String.valueOf(comboPerson.getSelectedItem()));
        VaccineCatalog vaccineCatalog = Business.EcoSystem.getInstance().getVaccineCatalog();
        DiseaseCatalog diseaseCatalog = Business.EcoSystem.getInstance().getDiseaseCatalog();
        Disease d = (Disease)comboPerson.getSelectedItem();
        if (d != null) {
            Vaccine vaccine = vaccineCatalog.addVaccine();
            vaccine.setVaccineName(txtVaccineName.getText());
            vaccine.setDisease(d);
            JOptionPane.showMessageDialog(null, "Sucessfully created");
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageVaccineJPanel muad = (ManageVaccineJPanel) component;
        muad.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox comboPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtVaccineName;
    // End of variables declaration//GEN-END:variables
}