package Interface.SupplierManager;

import Business.Business;
import Business.Market;
import Business.MarketOffer;
import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rushabh
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

    
  
    /** Creates new form ManageProductCatalogJPanel */
    private JPanel userProcessContainer;
    private Supplier supplier;
    private Business business;
    public ManageProductCatalogJPanel(JPanel upc, Supplier s,Business business) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        this.business = business;
        txtName.setText(s.getSupplierName());
        refreshTable();
    }

     public void refreshTable() {
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Product p : supplier.getPc().getProductCatalog()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getAvailibility();
            model.addRow(row);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCreate1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        productCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Avalibility Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productCatalog);
        if (productCatalog.getColumnModel().getColumnCount() > 0) {
            productCatalog.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 500, 170));

        btnView.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnView.setText("View Product Detail >>");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 220, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update Market Offer >>");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Search >>");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 150, 30));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete Product(s)");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 190, -1));

        btnCreate1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreate1.setText("Create New Product >>");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });
        add(btnCreate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = productCatalog.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Product p = (Product)productCatalog.getValueAt(row, 0);
            SearchResultJPanel vpdjp = new SearchResultJPanel(userProcessContainer, p);
            userProcessContainer.add("SearchResultJPanel", vpdjp);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        int row = productCatalog.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product s = (Product)productCatalog.getValueAt(row, 0);
        MarketOfferJPanel sfpjp = new MarketOfferJPanel(userProcessContainer, s, business);
        userProcessContainer.add("MarketOfferJPanel", sfpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
//        CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessContainer, supplier,business);
//        userProcessContainer.add("CreateNewProductJPanel", cnpjp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        SearchForProductJPanel sfpjp = new SearchForProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SearchForProductJPanel", sfpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int row = productCatalog.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product s = (Product)productCatalog.getValueAt(row, 0);
        //delete in all markets
        ArrayList<Market> ml = business.getMarketList().getMarketList();
        for(Market m : ml)
        {
            ArrayList<MarketOffer> ol = m.getMarketOfferCatalog().getProductsOffer();
            int n = ol.size();
            for(int i = 0;i<n;i++)
            {
                if(ol.get(i).getProduct().equals(s))
                    ol.remove(i);
            }
        }
        supplier.getPc().removeProductDirectory(s);//delete the product in product catalog
        refreshTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        // TODO add your handling code here:
//        int row = productCatalog.getSelectedRow();
//        
//        if(row<0) {
//            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        Product s = (Product)productCatalog.getValueAt(row, 0);
//        MarketOfferJPanel sfpjp = new MarketOfferJPanel(userProcessContainer, s, business);
//        userProcessContainer.add("MarketOfferJPanel", sfpjp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
        CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessContainer, supplier,business);
        userProcessContainer.add("CreateNewProductJPanel", cnpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreate1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
