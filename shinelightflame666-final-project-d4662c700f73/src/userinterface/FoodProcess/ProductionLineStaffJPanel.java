/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodProcess;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.ProcessedProduct.ProductionLineDirectory;
import Business.ProcessedProduct.ProductionLine;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class ProductionLineStaffJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;

    /**
     * Creates new form ProductionLineStaffJPanel
     */
    public ProductionLineStaffJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        System.out.println(account);
        System.out.println(enterprise);
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblProductionLine.getModel();
        dtm.setRowCount(0);
        int rowCount = dtm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (ProductionLine pl : system.getProductionLineDirectory().getProductionLineList()) {

            Object[] row = new Object[5];
            row[0] = pl;
            row[1] = pl.getName();
            row[2] = pl.getLineHumidity();
            row[3] = pl.getLineTempreture();
            row[4] = pl.getStatus();
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductionLine = new javax.swing.JTable();
        txtHumidity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboStatus = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProductionLineID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Production Lines Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        btnBack.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/back.png"))); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        tblProductionLine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblProductionLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Production Line ID", "Product Name", "Humidity", "Tempreture", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductionLine);
        if (tblProductionLine.getColumnModel().getColumnCount() > 0) {
            tblProductionLine.getColumnModel().getColumn(0).setResizable(false);
            tblProductionLine.getColumnModel().getColumn(1).setResizable(false);
            tblProductionLine.getColumnModel().getColumn(2).setResizable(false);
            tblProductionLine.getColumnModel().getColumn(3).setResizable(false);
            tblProductionLine.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 780, 320));

        txtHumidity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHumidityActionPerformed(evt);
            }
        });
        add(txtHumidity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 120, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Humidity:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Temperature:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 160, 20));
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 120, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        ComboStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processing", "Complete" }));
        add(ComboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 120, -1));

        btnCreate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/submit.png"))); // NOI18N
        btnCreate.setText("Submit");
        btnCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 180, 70));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Product Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 120, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Production Line ID:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        txtProductionLineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductionLineIDActionPerformed(evt);
            }
        });
        add(txtProductionLineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 120, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("Manager Advise:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, -1, -1));

        jLabel8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtHumidityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHumidityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHumidityActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtProductionLineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductionLineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductionLineIDActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
       try{
           Pattern p1 = Pattern.compile("^[0-9]+$");
           Matcher m1 =p1.matcher(txtProductionLineID.getText());
           Matcher m2 = p1.matcher(txtHumidity.getText());
           Matcher m3 = p1.matcher(txtTemperature.getText());
            if (!m1.matches() || !m2.matches() || !m3.matches()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
                txtProductionLineID.setText("");
                txtHumidity.setText("");
                txtTemperature.setText("");
            } 
            else {
        ProductionLine product = system.getProductionLineDirectory().addProductionLine();
        product.setStatus(String.valueOf(ComboStatus.getSelectedItem()));
        product.setProductionLineID(txtProductionLineID.getText());
        product.setName(txtProductName.getText());
        product.setLineHumidity(txtHumidity.getText());
        product.setLineTempreture(txtTemperature.getText());
        populateTable();
           JOptionPane.showMessageDialog(null, "ProductionLine Data Successfully Created!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter correct data!");
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboStatus;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductionLine;
    private javax.swing.JTextField txtHumidity;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductionLineID;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
