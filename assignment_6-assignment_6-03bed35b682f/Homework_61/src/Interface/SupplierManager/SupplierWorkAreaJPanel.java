package Interface.SupplierManager;

import Business.Business;
import Business.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    private Business business;
    public SupplierWorkAreaJPanel(JPanel upc, Supplier s, Business business) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplier = s;
        this.business = business;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Product Manager Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Product Catalog >>");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 260, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 270, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier,business);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
}
