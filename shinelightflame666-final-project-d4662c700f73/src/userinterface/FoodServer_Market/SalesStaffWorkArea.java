/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FoodServer_Market;

/**
 *
 * @author apple
 */
public class SalesStaffWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SalesStaffWorkArea
     */
    public SalesStaffWorkArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSterilizationProcess = new javax.swing.JButton();
        btnSterilizationProcess1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Market Sales Staff Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 55, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 147, 154, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Market");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 148, -1, -1));

        btnSterilizationProcess.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSterilizationProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/order.png"))); // NOI18N
        btnSterilizationProcess.setText("    Manage Sales Status          ");
        add(btnSterilizationProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 222, 453, 75));

        btnSterilizationProcess1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSterilizationProcess1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/feedback2.png"))); // NOI18N
        btnSterilizationProcess1.setText("Manage Customer Feedback");
        add(btnSterilizationProcess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 344, -1, -1));

        btnBack.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/back.png"))); // NOI18N
        btnBack.setText("Back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 45, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSterilizationProcess;
    private javax.swing.JButton btnSterilizationProcess1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
