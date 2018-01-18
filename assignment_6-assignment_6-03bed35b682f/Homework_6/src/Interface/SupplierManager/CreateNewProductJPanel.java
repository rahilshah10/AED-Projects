package Interface.SupplierManager;

import Business.Business;
import Business.Market;
import Business.MarketOffer;
import Business.MarketOfferCatalog;
import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    private Business business;
    public CreateNewProductJPanel(JPanel upc, Supplier s,Business business){
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        this.business = business;
    }
    
//    private void initPanel()
//    {
////        comboBoxMarket.removeAll();
//        for(Market m : business.getMarketList().getMarketList())
//        {
//            comboBoxMarket.addItem(m);
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtAvaNum1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 30));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Avaliability Number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, 30));
        add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 210, 30));
        add(txtAvaNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 210, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if(txtName.getText().isEmpty()==false)
        {
            //validation of price
           
                    Product p = supplier.getPc().addProduct();
                    p.setAvailibility(Integer.parseInt(txtAvaNum1.getText()));
                    p.setProductName(txtName.getText());
                    p.setModelNumber(Integer.parseInt(txtProductID.getText()));
                    
                    JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Product Name is Needed!");
        
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAvaNum1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProductID;
    // End of variables declaration//GEN-END:variables
}
