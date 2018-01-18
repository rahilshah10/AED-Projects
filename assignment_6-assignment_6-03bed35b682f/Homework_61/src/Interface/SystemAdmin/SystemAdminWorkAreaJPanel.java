/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

import Business.Business;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sunwe_000
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {
    private Business business;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Business business, UserAccount u) {
       initComponents();
        this.business=business;
        this.userAccount=u;
        this.userProcessContainer=userProcessContainer;
        populateUserFields();
    }
     public void populateUserFields()
    {
        labUserName.setText(userAccount.getUserName());
        labName.setText(userAccount.getUperson().getFirstName());
        labRole.setText(userAccount.getRole());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageSuppliers = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labUserName = new javax.swing.JLabel();
        labName = new javax.swing.JLabel();
        labRole = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("System Admin Work Area");

        btnManageSuppliers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnManageSuppliers.setText("Manage Suppliers >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        btnManageUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnManageUser.setText("Manage User>>");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Manage Market>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("User Name:");

        jLabel4.setText("Name:");

        jLabel5.setText("Role:");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnManageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(156, 156, 156))))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labUserName)
                            .addComponent(labName)
                            .addComponent(labRole)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(184, 184, 184)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labRole))
                .addGap(66, 66, 66)
                .addComponent(btnBack)
                .addGap(2, 2, 2)
                .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
                 ManageSupplierJPanel panel=new ManageSupplierJPanel(userProcessContainer,business);
                 userProcessContainer.add("ManageSupplierJPanel",panel);
                 CardLayout layout=(CardLayout) userProcessContainer.getLayout();
                 layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
                 ManageUserAccountDirectoryJPanel panel=new ManageUserAccountDirectoryJPanel(userProcessContainer,business,userAccount);
                 userProcessContainer.add("ManageUserAccountDirectoryJPanel",panel);
                 CardLayout layout=(CardLayout) userProcessContainer.getLayout();
                 layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageMarketJPanel panel=new ManageMarketJPanel(userProcessContainer,business);
        userProcessContainer.add("ManageMarketJPanel",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labRole;
    private javax.swing.JLabel labUserName;
    // End of variables declaration//GEN-END:variables
}