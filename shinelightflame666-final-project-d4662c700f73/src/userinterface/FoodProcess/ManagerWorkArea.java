/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodProcess;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodProcess.ProcessorPurchaseOrganization;
import Business.Organization.FoodProcess.ProcessorSalesOrganization;
import Business.Organization.FoodProcess.ProcessorStorageOrganziation;
import Business.Organization.Organization;
import Business.ProcessedProduct.StorageProduct;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodProcess.PurchasingWorkRequest;
import Business.WorkQueue.FoodProcess.SalesWorkRequest;
import Business.WorkQueue.FoodProcess.StorageWorkRequest;
import Business.WorkQueue.FoodProduce.ProductionWorkRequest;
import Business.WorkQueue.FoodServer.MarketPurchasingWorkRequest;
import Business.WorkQueue.FoodServer.RestaurantPurchasingWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.storageclass.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static userinterface.FoodProcess.PurchasingStaffWorkAreaJPanel.purchasingaccount;
import static userinterface.FoodProcess.SalesStaffWorkArea.saleorganization;

/**
 *
 * @author apple
 */
public class ManagerWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;
    Organization salesorganization;
    /**
     * Creates new form ManagerWorkArea
     */
    public ManagerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.salesorganization = saleorganization;
        System.out.println(account);
        System.out.println(enterprise);
        populateTable1();
        if(purchasingaccount !=null){
        populateTable2();}
        if(salesorganization != null){
        populateTable3();}
        
    }

   public void populateTable1() {
        DefaultTableModel dtm = (DefaultTableModel) tblstorage.getModel();
        dtm.setRowCount(0);
        int rowCount = dtm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (Product sp : system.getProductdirectory().getProductlist()) {

            Object[] row = new Object[5];
            row[0] = sp.getProducerName();
            row[1] = sp;
            row[2] = sp.getQuantity();
            row[3] = sp.getTemperature();
            row[4] = sp.getHumidity();
            dtm.addRow(row);

        }
   }
   
   public void populateTable2() {
        DefaultTableModel dtm = (DefaultTableModel) tblProductList.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : purchasingaccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = ((PurchasingWorkRequest) request);
            row[1] = ((PurchasingWorkRequest) request).getQuantity();
            row[2] = ((PurchasingWorkRequest) request).getProducerName();
            row[3] = ((PurchasingWorkRequest) request).getDate();
            String result = ((PurchasingWorkRequest) request).getStatus();
            row[4] = result == null ? "Waiting" : result;

            dtm.addRow(row);
        }

    }

   public void populateTable3() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrderList.getModel();
        dtm.setRowCount(0);
        int rowCount = dtm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
        
        for (WorkRequest request : saleorganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            if (request instanceof RestaurantPurchasingWorkRequest) {
                
                row[0] = request;
                row[1] = ((RestaurantPurchasingWorkRequest) request).getDate();
                row[2] = ((RestaurantPurchasingWorkRequest) request).getProcessorName();
                row[3] = ((RestaurantPurchasingWorkRequest) request).getQuantity();
                String result = ((RestaurantPurchasingWorkRequest) request).getStatus();
                row[4] = result == null ? "Waiting" : result;
                row[5] = "Restaurant";
                
                dtm.addRow(row);                
            }
            
            if (request instanceof MarketPurchasingWorkRequest) {
                row[0] = request;
                row[1] = ((MarketPurchasingWorkRequest) request).getDate();
                row[2] = ((MarketPurchasingWorkRequest) request).getProcessorName();
                row[3] = ((MarketPurchasingWorkRequest) request).getQuantity();
                String result = ((MarketPurchasingWorkRequest) request).getStatus();
                row[4] = result == null ? "Waiting" : result;
                row[5] = "Market";
                dtm.addRow(row);                
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderList = new javax.swing.JTable();
        txtMessage1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAssignToPurchase = new javax.swing.JButton();
        txtMessage2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAssignToSales = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblstorage = new javax.swing.JTable();
        txtMessage3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAssignToStorage = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Processor Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 16, -1, 47));

        tblProductList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Producer Name", "Record Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 206, 586, 198));

        tblOrderList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Date", "Customer Name", "Product Name", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 431, 586, 209));
        add(txtMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 209, 220, 29));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Advise:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 206, -1, -1));

        btnAssignToPurchase.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnAssignToPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/Assign.png"))); // NOI18N
        btnAssignToPurchase.setText("Assign to Purchasing Section");
        btnAssignToPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToPurchaseActionPerformed(evt);
            }
        });
        add(btnAssignToPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 256, -1, 70));
        add(txtMessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 434, 220, 29));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Advise:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 431, -1, -1));

        btnAssignToSales.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnAssignToSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/Assign.png"))); // NOI18N
        btnAssignToSales.setText("Assign to Sales Section");
        btnAssignToSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToSalesActionPerformed(evt);
            }
        });
        add(btnAssignToSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 479, 371, 67));

        btnSubmit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 153, 51));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/SubmitGreen.png"))); // NOI18N
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 696, 178, 65));

        tblstorage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblstorage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producer Name", "Product Name", "Quantity", "Tempreture", "Humidity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblstorage);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 658, 586, 155));
        add(txtMessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 658, 220, 29));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Advise:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 658, -1, -1));

        btnAssignToStorage.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnAssignToStorage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/Assign.png"))); // NOI18N
        btnAssignToStorage.setText("Assign to Storage Section");
        btnAssignToStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToStorageActionPerformed(evt);
            }
        });
        add(btnAssignToStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 696, -1, 71));

        btnBack.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/back.png"))); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 89, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToStorageActionPerformed
        // TODO add your handling code here:
         String message = txtMessage3.getText();
        
        StorageWorkRequest request = new StorageWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        
        Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ProcessorStorageOrganziation){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_btnAssignToStorageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignToPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToPurchaseActionPerformed
        // TODO add your handling code here:
          String message = txtMessage1.getText();
        
        PurchasingWorkRequest request = new PurchasingWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        
        Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ProcessorPurchaseOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_btnAssignToPurchaseActionPerformed

    private void btnAssignToSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToSalesActionPerformed
        // TODO add your handling code here:
          String message = txtMessage2.getText();
        
        SalesWorkRequest request = new SalesWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        
        Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ProcessorSalesOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_btnAssignToSalesActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToPurchase;
    private javax.swing.JButton btnAssignToSales;
    private javax.swing.JButton btnAssignToStorage;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblOrderList;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable tblstorage;
    private javax.swing.JTextField txtMessage1;
    private javax.swing.JTextField txtMessage2;
    private javax.swing.JTextField txtMessage3;
    // End of variables declaration//GEN-END:variables
}
