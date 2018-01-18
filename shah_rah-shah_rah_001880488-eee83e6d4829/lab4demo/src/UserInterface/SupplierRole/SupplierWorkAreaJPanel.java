/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.SupplierRole;

import Business.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;
//    MasterOrderCatalog masterOrderCatalog;
    
    /** Creates new form ProductManagerWorkAreaJPanel */
    public SupplierWorkAreaJPanel(JPanel upc, Supplier s) {

        initComponents();
       userProcessContainer = upc;
       supplier = s;
//       masterOrderCatalog = moc;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        reportButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Product Manager Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Product Catalog >>");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Update Personal Profile >>");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 260, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Manage Staff");
        jButton3.setEnabled(false);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        reportButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reportButton4.setText("Review Product Performance >>");
        reportButton4.setEnabled(false);
        reportButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButton4ActionPerformed(evt);
            }
        });
        add(reportButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed
        // TODO add your handling code here:
       ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier);
        userProcessContainer.add("ManageProductCatalogJPanel",mpcjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed

    private void reportButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButton4ActionPerformed
        // TODO add your handling code here:
//        ProductReportJPanel prjp = new ProductReportJPanel(userProcessContainer, supplier);
//        userProcessContainer.add("ProductReportJPanelSupplier", prjp);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    private javax.swing.JButton reportButton4;
    // End of variables declaration//GEN-END:variables
}
