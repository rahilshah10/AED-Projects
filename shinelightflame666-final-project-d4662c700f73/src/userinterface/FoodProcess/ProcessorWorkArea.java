/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodProcess;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.FoodProcess.ProcessorWorkArea;

/**
 *
 * @author apple
 */
public class ProcessorWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;

    /**
     * Creates new form ProcessorWorkArea
     */

    public ProcessorWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        labStaffName.setText(account.getEmployee().getName());
        labStaffId.setText(String.valueOf(account.getEmployee().getId()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        btnProcessorManager = new javax.swing.JButton();
        labStaffId = new javax.swing.JLabel();
        labStaffName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("My Work Area- Food Processor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Process");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, 30));

        btnProcessorManager.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnProcessorManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/process.png"))); // NOI18N
        btnProcessorManager.setText("Process Manager");
        btnProcessorManager.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcessorManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessorManagerActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcessorManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 320, 80));

        labStaffId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labStaffId.setText("jLabel5");
        jPanel1.add(labStaffId, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        labStaffName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labStaffName.setText("jLabel6");
        jPanel1.add(labStaffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText(" Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Staff ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessorManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessorManagerActionPerformed
        // TODO add your handling code here:
        ProcessorManagerJPanel manager = new ProcessorManagerJPanel(userProcessContainer,account,organization,enterprise, system);
        userProcessContainer.add("manager", manager);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessorManagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessorManager;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labStaffId;
    private javax.swing.JLabel labStaffName;
    // End of variables declaration//GEN-END:variables
}
