/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.Panel;

import FeedbackAnalytics.DBOperation.DBOperator;
import FeedbackAnalytics.Feedback.Customer;
import FeedbackAnalytics.Feedback.CustomerDirectory;
import FeedbackAnalytics.FeedbackProcessor.MySqlConnect;
import FeedbackAnalytics.FeedbackProcessor.WordProcessor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zi Wei Fan
 */
public class PanelSubmitFeedback extends javax.swing.JPanel {

  public CustomerDirectory cd;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Customer c = null;
    DBOperator dbOperator = new DBOperator();
    DefaultTableModel model;
    WordProcessor wp;
     List<String> stringList; 
  
    public PanelSubmitFeedback() {
        initComponents();
        conn = MySqlConnect.connectDB();
        cd = new CustomerDirectory();
        populateRestaurant(conn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSubmitFeedback = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFeedbackContent = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        comboxCustomer = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tblTip = new javax.swing.JLabel();
        comboxRestaurant = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboxProperty = new javax.swing.JComboBox<>();

        panelSubmitFeedback.setBackground(new java.awt.Color(255, 204, 204));
        panelSubmitFeedback.setForeground(new java.awt.Color(153, 153, 153));
        panelSubmitFeedback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Feedback Content:");
        panelSubmitFeedback.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        txtFeedbackContent.setColumns(20);
        txtFeedbackContent.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtFeedbackContent.setRows(5);
        txtFeedbackContent.setText("Not good as expected, just a little\ndiarrhea and feel uncomfortable after having.");
        jScrollPane1.setViewportView(txtFeedbackContent);

        panelSubmitFeedback.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 332, 121));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 0, 102));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/submit.png"))); // NOI18N
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        panelSubmitFeedback.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 70, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer Name:");
        panelSubmitFeedback.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 127, -1, -1));

        txtName.setText("Rahil Luo");
        panelSubmitFeedback.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 124, 143, -1));

        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/createUser.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        panelSubmitFeedback.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 70, 60));

        comboxCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelSubmitFeedback.add(comboxCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 132, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Name:");
        panelSubmitFeedback.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        tblTip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblTip.setForeground(new java.awt.Color(204, 0, 51));
        tblTip.setText("Test");
        panelSubmitFeedback.add(tblTip, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 750, 180, -1));

        comboxRestaurant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelSubmitFeedback.add(comboxRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Restaurant");
        panelSubmitFeedback.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("My Information");
        panelSubmitFeedback.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Submit My Feedback");
        panelSubmitFeedback.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 216, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Feedback Property:");
        panelSubmitFeedback.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        txtProductName.setText("Scramble Egg");
        panelSubmitFeedback.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Customer Name:");
        panelSubmitFeedback.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        comboxProperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "negative", "positive" }));
        panelSubmitFeedback.add(comboxProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSubmitFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSubmitFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Customer c = (Customer) comboxCustomer.getSelectedItem();
        Long customerID = c.getId();
        String feedback = txtFeedbackContent.getText().trim();
        String restaurantName = comboxRestaurant.getSelectedItem().toString();
        String productName = txtProductName.getText().toString();
        String feedbackProperty = comboxProperty.getSelectedItem().toString();
                
        c.getFeedbackDirectory().CreateFeedback(feedback);

        boolean isInserted = insertIntoFeedback(customerID, feedback, feedbackProperty, productName, restaurantName);
        if (isInserted == true) {
            populateFeedback();
            JOptionPane.showMessageDialog(null, "Submitted !");
        } else {
            tblTip.setText("feedback inserted error.");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String name = txtName.getText().trim();

        c = cd.createCustomer(name);
        populateComboxCustomer();

        long customerID = c.getId();

        boolean isInserted = InsertCustomerIntoDB(name);

        if (isInserted == true) {
            tblTip.setText("Created! ID: " + customerID);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

private boolean insertIntoFeedback(Long customerID, String feedback, String feedbackProperty, String productName, String restaurantName) {
        boolean isInserted = false;
        conn = MySqlConnect.connectDB();
        
        String sqlGetRestaurantNameID = "SELECT RestaurantId FROM feedbackanalysis.restaurant WHERE RestaurantName = '"+restaurantName+"'";
        String sqlDate = "SELECT CURDATE()";
        
        String sqlInsert = "INSERT INTO feedbackanalysis.feedback(FeedbackDate, content, customerID,  property, targetProduct, RestaurantID)" +
                                   " VALUES (("+sqlDate+"), '"+feedback+"', '"+customerID+"', '" +feedbackProperty+"', '" +productName+"', "+
                                   "(SELECT RestaurantId FROM feedbackanalysis.restaurant WHERE RestaurantName = '"+restaurantName+"'))";

        try {
            pst = conn.prepareStatement(sqlInsert);
            int result = pst.executeUpdate();

            if (result > 0) {
                isInserted = true;
                rs.close();
                pst.close();
                conn.close();
            } else {
                isInserted = false;
                rs.close();
                pst.close();
                conn.close();
            }

        } catch (Exception e) {
            tblTip.setText(e.getMessage());
        }
        return isInserted;
    }

public boolean InsertCustomerIntoDB(String customerName) {
        boolean isInserted = false;
        long customerID = c.getId();
        conn = MySqlConnect.connectDB();
        String sqlInsert = "INSERT INTO feedbackanalysis.customer(CustomerID, CustomerName) VALUES ('" + customerID + "','" + customerName + "')";

        try {
            pst = conn.prepareStatement(sqlInsert);
            int result = pst.executeUpdate();

            if (result > 0) {
                isInserted = true;
                rs.close();
                pst.close();
                conn.close();
            } else {
                isInserted = false;
                rs.close();
                pst.close();
                conn.close();
            }

        } catch (Exception e) {
            tblTip.setText(e.getMessage());
        }
        return isInserted;
    }

public void populateComboxCustomer() {
        comboxCustomer.removeAllItems();

        for (Customer c : cd.getCustomerDirectoryArrayList()) {
            comboxCustomer.addItem(c);
        }
    }
    
 public void populateFeedback() {
        /*
        Customer c = (Customer) comboxCustomer.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblFeedback.getModel();
        model.setRowCount(0);

        for (Feedback f : c.getFeedbackDirectory().getFeedbackArrayList()) {
            Object[] row = new Object[2];
            row[0] = c;
            row[1] = f.getContent();
            model.addRow(row);
        }
*/
        dbOperator.getFeedbacks(conn);
    }
 
    public void populateRestaurant(Connection conn) {
        //comboxRestaurant
        rs = null;
        try {
            rs = dbOperator.getRestaurantList(conn);

            while (rs.next()) {
                String restaurantName = rs.getString("RestaurantName");
                comboxRestaurant.addItem(restaurantName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboxCustomer;
    private javax.swing.JComboBox<String> comboxProperty;
    private javax.swing.JComboBox comboxRestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSubmitFeedback;
    private javax.swing.JLabel tblTip;
    private javax.swing.JTextArea txtFeedbackContent;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
