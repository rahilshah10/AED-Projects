/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Disease.Disease;
import Business.Disease.DiseaseCatalog;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineCatalog;
import static com.db4o.qlin.QLinSupport.p;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shah.rah
 */
public class NewDiseaseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form NewPersonJPanel
     */

    NewDiseaseJPanel(JPanel userProcessContainer, EcoSystem system) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDiseaseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDiseaseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiseaseNameActionPerformed(evt);
            }
        });
        add(txtDiseaseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 108, 120, -1));

        jLabel1.setText("Disease Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 111, -1, -1));

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

    private void txtDiseaseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiseaseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiseaseNameActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        //        UserAccount a=business.getuDir().searchAccountbyPerson(String.valueOf(comboPerson.getSelectedItem()));
        if(!(txtDiseaseName.getText().isEmpty()))
        {
            
        String diseaseName=txtDiseaseName.getText();
        
        DiseaseCatalog diseaseCatalog =Business.EcoSystem.getInstance().getDiseaseCatalog();
        Disease disease =diseaseCatalog.addDisease();
        disease.setName(diseaseName);
        VaccineCatalog vaccineCatalog=Business.EcoSystem.getInstance().getVaccineCatalog();
        Vaccine vaccine=vaccineCatalog.addVaccine();
            vaccine.setDisease(disease);
            vaccine.setVaccineName("");
            vaccine.setQuantity(0);
        
        JOptionPane.showMessageDialog(null, "Created Succesfully");
               
        }

        else
        {JOptionPane.showMessageDialog(null, "All the fields are mandatory.Please fill up all the fields");}
    
    
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDiseaseJPanel muad = (ManageDiseaseJPanel) component;
        muad.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDiseaseName;
    // End of variables declaration//GEN-END:variables
}
