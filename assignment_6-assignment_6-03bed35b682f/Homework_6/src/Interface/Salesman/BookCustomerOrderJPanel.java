/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Salesman;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.MarketOffer;
import Business.Order;
import Business.OrderItem;
import Business.Product;
import Business.Supplier;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rahil
 */
public class BookCustomerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookCustomerOrderJPanel
     */
    private Business business;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Market market;
    private Order order;
    private Customer c;
    private Boolean isCheckedOut = false;

    public BookCustomerOrderJPanel(Business business, JPanel userProcessContainer, int id, UserAccount userAccount, Market market,Customer c) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.market = market;
        this.c= c;        
        populateSupplierCombo();
        this.order = new Order();
//        populateCommission();

    }
    
    public void populateCommission(){
        int sum = 0;
        for (Order order : userAccount.getUperson().getOrderHistory()) {
            for (OrderItem orderItem : order.getOrder()) {

                int com = 0;
                if (orderItem.getSellingPrice() > orderItem.getMarketOffer().getTargetPrice()) {
                    com = (orderItem.getSellingPrice() - orderItem.getMarketOffer().getTargetPrice())*orderItem.getQuantity();
                } else {
                    com = 0;
                }               
                sum += com;
            }

        }
        txtCommission.setText(String.valueOf(sum));
    }

    private void populateSupplierCombo() {
        comboSupplier.removeAllItems();

        for (Supplier s : business.getSupplierDirectory().getSupplierList()) {
            comboSupplier.addItem(s);
        }
    }

    private void populateProductTable() {

        DefaultTableModel dtm = (DefaultTableModel) tableProduct.getModel();
        dtm.setRowCount(0);
        Supplier supplier = (Supplier) comboSupplier.getSelectedItem();
        
        Market market = business.getMarketList().searchMarket(c.getCustomerType());
        
        for (MarketOffer marketOffer : market.getMarketOfferCatalog().getProductsOffer()) {
            for (Product p : supplier.getPc().getProductCatalog()) {
                if (p == marketOffer.getProduct()) {
                    Object row[] = new Object[6];
                    row[0] = p;
                    row[1] = p.getModelNumber();
                    row[2] = marketOffer.getFloorPrice();
                    row[3] = marketOffer.getCeilingPrice();
                    row[4] = marketOffer;
                    row[5] = p.getAvailibility();

                    dtm.addRow(row);
                }

            }
        }
    }

    public void refreshProductTable(String productName) {
        DefaultTableModel dtm = (DefaultTableModel) tableProduct.getModel();
        dtm.setRowCount(0);
        Market market = business.getMarketList().searchMarket(c.getCustomerType());
        for (MarketOffer marketOffer : market.getMarketOfferCatalog().getProductsOffer()) {
                for (Supplier sp : business.getSupplierDirectory().getSupplierList()) {
                    for (Product p : sp.getPc().getProductCatalog()) {
                        if (p == marketOffer.getProduct() && p.getProductName().equalsIgnoreCase(productName)) {
                            Object row[] = new Object[6];
                            row[0] = p.getModelNumber();
                            row[1] = p;
                            row[2] = marketOffer.getFloorPrice();
                            row[3] = marketOffer.getCeilingPrice();
                            row[4] = marketOffer;
                            row[5] = p.getAvailibility();

                            dtm.addRow(row);
                        }
                    }
                
                }
        }
    }

    public void refreshOrderTable() {
        DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
        dtm.setRowCount(0);
        
        for (OrderItem oi: order.getOrder()) 
        {
            Market market = business.getMarketList().searchMarket(c.getCustomerType());
             for (MarketOffer marketOffer : market.getMarketOfferCatalog().getProductsOffer()) {
                for (Supplier sp : business.getSupplierDirectory().getSupplierList()) {
                    for (Product p : sp.getPc().getProductCatalog()) {
                if (p == marketOffer.getProduct()) {
                            Object row[] = new Object[4];
                            row[0] = p;
                            row[1] = oi.getSellingPrice();
                            row[2] = oi;
                            row[3] = oi.getSellingPrice()*oi.getQuantity();
                            

                            dtm.addRow(row);
                }
            }
                }
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
        txtCommission = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        comboSupplier = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        btnViewProductDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSalePrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnShowProducts = new javax.swing.JButton();

        jLabel1.setText("My Commission");

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrder);

        comboSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupplierActionPerformed(evt);
            }
        });

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnViewProductDetails.setText("View Product Details");
        btnViewProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductDetailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Sales Price:");

        txtSalePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalePriceActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantity:");

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Floor Price", "Ceiling Price", "Target Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableProduct);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Item in Cart");

        jButton1.setText("Submit Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnShowProducts.setText("Show Products");
        btnShowProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnShowProducts)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearchProduct))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewProductDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnAddToCart)))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(59, 59, 59)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct)
                    .addComponent(btnShowProducts))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProductDetails)
                    .addComponent(jLabel2)
                    .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnBack))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupplierActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        // TODO add your handling code here:
        String productName = txtSearch.getText();
        refreshProductTable(productName);

    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductDetailsActionPerformed
        // TODO add your handling code here:
        int row = tableProduct.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product)tableProduct.getValueAt(row, 0);
        ViewProductJPanel panel = new ViewProductJPanel(business, userProcessContainer, p, market,c);
        userProcessContainer.add("ViewProductJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewProductDetailsActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        Order o= new Order();
        int selectedRow = tableProduct.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product selectedProduct = (Product) tableProduct.getValueAt(selectedRow, 0);
        MarketOffer selectedMO = (MarketOffer) tableProduct.getValueAt(selectedRow, 4);
        int fetchQty = (Integer) spinnerQuantity.getValue();
        if (fetchQty <= 0) {
            JOptionPane.showMessageDialog(null, "Quatity cannot be less than equal to 0", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
            int salesPrice = Integer.parseInt(txtSalePrice.getText());
            int targetprice= (selectedMO.getTargetPrice());
            if (salesPrice <= selectedMO.getFloorPrice()) {
                JOptionPane.showMessageDialog(null, "Salesprice can not less than Floor Price!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (fetchQty <= selectedProduct.getAvailibility()) {
                boolean alreadyPresent = false;
                
                if(!o.getOrder().isEmpty())
                {
                    for (OrderItem oi : o.getOrder()) //judge if there is a same product in the cart or not
                    {
                        if (oi.getMarketOffer().getProduct() == selectedProduct) {
                            int oldAvail = selectedProduct.getAvailibility();
                            int newAvail = oldAvail - fetchQty;
                            selectedProduct.setAvailibility(newAvail);
                            oi.setQuantity(fetchQty + oi.getQuantity());
                            alreadyPresent = true;
                            populateProductTable();
                            refreshOrderTable();
                            break;
                        }
                    }
                }
                else  
                {
                    if(!alreadyPresent){//not in cart, creat a new order
                        int oldAvail = selectedProduct.getAvailibility();
                            int newAvail = oldAvail - fetchQty;
                            selectedProduct.setAvailibility(newAvail); 
                            OrderItem oi = order.addItem();
                            oi.setQuantity(fetchQty);
                            oi.setSellingPrice(salesPrice);
                            oi.getMarketOffer().setProduct(selectedProduct);
                            populateProductTable();
                            refreshOrderTable();
                            String Commission = (String.valueOf((0.5*(salesPrice-targetprice))*oi.getQuantity()));
                    }
                }   
                            
            }
            else{
                JOptionPane.showMessageDialog(null, "Quantity > Availibility!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(order.getOrder().size()>0)
        {
            c.getOrderHistory().add(order);
            userAccount.getUperson().getOrderHistory().add(order);
            order.setCustomer(c);
            JOptionPane.showMessageDialog(null, "Order placed successfully!", "Warning", JOptionPane.WARNING_MESSAGE);
            order = new Order();            
            refreshOrderTable();
            populateProductTable();
            isCheckedOut = true;
        }
        else
        {
             JOptionPane.showMessageDialog(null, "No order placed!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = tableOrder.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderItem oi = (OrderItem)tableOrder.getValueAt(row, 2);
        Product p = (Product)tableOrder.getValueAt(row, 0);
        int oldAvail = p.getAvailibility();
        int oldQty = oi.getQuantity();
        int newQty =oldAvail+oldQty;
        p.setAvailibility(newQty);
        order.getOrder().remove(oi);
        JOptionPane.showMessageDialog(null, "Order Item canceled!!", "Warning", JOptionPane.WARNING_MESSAGE);
        refreshOrderTable();
        populateProductTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnShowProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowProductsActionPerformed
        // TODO add your handling code here:
                populateProductTable();
    }//GEN-LAST:event_btnShowProductsActionPerformed

    private void txtSalePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalePriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnShowProducts;
    private javax.swing.JButton btnViewProductDetails;
    private javax.swing.JComboBox comboSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtCommission;
    private javax.swing.JTextField txtSalePrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
