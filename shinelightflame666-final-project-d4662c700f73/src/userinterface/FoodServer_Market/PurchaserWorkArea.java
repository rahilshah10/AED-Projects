/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FoodServer_Market;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodProcess.ProcessorSalesOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodServer.MarketPurchasingWorkRequest;
import Business.WorkQueue.FoodServer.RestaurantPurchasingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class PurchaserWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;
    
    public PurchaserWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        
         populateTable();
    }

        public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblProductList.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = ((MarketPurchasingWorkRequest) request);
            row[1] = ((MarketPurchasingWorkRequest) request).getQuantity();
            row[2] = ((MarketPurchasingWorkRequest) request).getProcessorName();
            row[3] = ((MarketPurchasingWorkRequest) request).getDate();
            String result = ((MarketPurchasingWorkRequest) request).getStatus();
            row[4] = result == null ? "Waiting" : result;

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

        jLabel1 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ComboProduct = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProcessorName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Market Purchaser Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 59, -1, -1));

        btnOrder.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/SubmitGreen.png"))); // NOI18N
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 375, 181, -1));

        tblProductList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Processor", "Record Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductList);
        if (tblProductList.getColumnModel().getColumnCount() > 0) {
            tblProductList.getColumnModel().getColumn(0).setResizable(false);
            tblProductList.getColumnModel().getColumn(1).setResizable(false);
            tblProductList.getColumnModel().getColumn(2).setResizable(false);
            tblProductList.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 128, 790, 173));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Product Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 352, -1, -1));

        ComboProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egg" }));
        add(ComboProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 354, 105, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Quantity");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 352, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Processor Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        txtProcessorName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtProcessorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 402, 105, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Date");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 400, -1, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDate.setText("12/12/2017");
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 402, 105, -1));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQuantity.setText("17");
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 354, 102, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
       try{
        Pattern p1 = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
            Pattern p2 = Pattern.compile("^[0-9]+$");
            Matcher m1 = p1.matcher(txtDate.getText());
            Matcher m2 = p2.matcher(txtQuantity.getText());
              if (!m1.matches() || !m2.matches()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
                txtDate.setText("");
                txtQuantity.setText("");
                } else {
        String productName = String.valueOf(ComboProduct.getSelectedItem());
        int quantity = Integer.parseInt(txtQuantity.getText());
        String processorName = txtProcessorName.getText();
        String date = txtDate.getText();
        
         WorkRequest request = new MarketPurchasingWorkRequest();
        ((MarketPurchasingWorkRequest) request).setProductName(productName);
        ((MarketPurchasingWorkRequest) request).setQuantity(quantity);
        ((MarketPurchasingWorkRequest) request).setProcessorName(processorName);
        ((MarketPurchasingWorkRequest) request).setDate(date);
        

        Organization org = null;
        for (Enterprise ent : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization organ : ent.getOrganizationDirectory().getOrganizationList()) {
                if (organ instanceof ProcessorSalesOrganization) {
                    org = organ;
                    break;
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
        populateTable();
               JOptionPane.showMessageDialog(null, "Order added successfully!");
              }
               } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter correct data!");
        }
    }//GEN-LAST:event_btnOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboProduct;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtProcessorName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
