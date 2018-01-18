package Interface.SupplierManager;

import Business.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class SearchResultJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public SearchResultJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtName.setText(p.getProductName());
        txtId.setText(String.valueOf(p.getModelNumber()));
        txtAvaNum.setText(String.valueOf(p.getAvailibility()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAvaNum = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 176, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 70, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Product Name:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, 30));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Product ID:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Avalibility Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 30));

        txtAvaNum.setEditable(false);
        add(txtAvaNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtName.setEditable(true);
        txtAvaNum.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
       Component component = componentArray[componentArray.length - 1];
       ManageProductCatalogJPanel dv = (ManageProductCatalogJPanel) component;
       dv.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        product.setAvailibility(Integer.parseInt(txtAvaNum.getText()));
        product.setProductName(txtName.getText());
        backAction();
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAvaNum;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
