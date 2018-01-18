/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierManager;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.Order;
import Business.Product;
import Business.Supplier;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rahil
 */
public class SalesPerormanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPerormanceJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private ArrayList<UserAccount> salesman;
    private ArrayList<Product> product;

    public SalesPerormanceJPanel(Business business, JPanel upc) {
        initComponents();
        this.userProcessContainer = upc;
        this.business = business;
        this.salesman = new ArrayList<UserAccount>();
        this.product = new ArrayList<Product>();
        for (UserAccount u : business.getUserDirectory().getUserAccountDir()) {
            if (u.getRole().equalsIgnoreCase("Salesman")) {
                salesman.add(u);
            }
        }
        txtTotalRevenue.setText("Total Revenue: " + (business.getMarketList().Selling()));
        populateCombo();
        populateTable();
        populateProduct();
    }
    
    private void populateProduct()
    {
        sortProduct();
        
        int rowNum = tblProduct.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        for (int i = rowNum - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (int i = 0; i<3;i++) {
            Object row[] = new Object[4];
            row[0] = product.get(i);
            row[1] = product.get(i).getSoldNum();
            row[2] = product.get(i).getAvailibility();
            row[3] = product.get(i).getModelNumber();
            model.addRow(row);
        }
    }
    
    private void sortProduct()
    {
        //load all products from each supplier
        for(Supplier s : business.getSupplierDirectory().getSupplierList())
        {
            for(Product p : s.getPc().getProductCatalog())
            {
                product.add(p);
            }
        }
        
        //sort by sold number
        int n = product.size();
        for(int i =1; i<n;i++)
        {
            for(int j = i; j>0&&(!lessthan(product.get(j),product.get(j-1)));j--)
            {
                Product temp =  product.get(j);
                product.set(j, product.get(j-1));
                product.set(j-1,temp);
            }
        }
    }
    private void populateCombo() {
        ComboBoxMarket.removeAll();
        ArrayList<Market> ml = business.getMarketList().getMarketList();
        if (ml.size() != 0) {
            for (Market m : ml) {
                ComboBoxMarket.addItem(m);
            }
        }
    }

    private void populateTable() {
        int rowNum = tblMarket.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblMarket.getModel();
        for (int i = rowNum - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Market m : business.getMarketList().getMarketList()) {
            Object row[] = new Object[4];
            row[0] = m;
            row[1] = m.marketTarget();
            row[2] = m.marketSelling();
            row[3] = m.marketSelling() - m.marketTarget();
            model.addRow(row);
        }
    }

    private void populateSalesmanTable(ArrayList<UserAccount> sm) {
        int rowNum = tblSalesman.getRowCount();
        int n = sm.size();
        UserAccount temp;
        for(int i =1; i<n;i++)
        {
            for(int j = i; j>0&&(!lessthan(sm.get(j), sm.get(j-1)));j--)
            {
                temp = sm.get(j);
                sm.set(j, sm.get(j-1));
                sm.set(j-1,temp);
            }
        }
        DefaultTableModel model = (DefaultTableModel) tblSalesman.getModel();
        for (int i = rowNum - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (UserAccount s : sm) {
            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getUperson().getTargetCount();
            row[2] = s.getUperson().getSaleCount();
            row[3] =s.getUperson().getSaleCount()-s.getUperson().getTargetCount();
            model.addRow(row);
            
            s.getUperson().setSaleCount(s.Selling());
            s.getUperson().setTargetCount(s.Target());
        }
    }
    
    private boolean lessthan(UserAccount ua1,UserAccount ua2)
    {
        int c1 = ua1.getUperson().getSaleCount()-ua1.getUperson().getTargetCount();
        int c2 = ua2.getUperson().getSaleCount()-ua2.getUperson().getTargetCount();
        if(c1<c2)
            return true;
        return false;
    }
    
    private boolean lessthan(Product p1, Product p2)
    {
        if(p1.getSoldNum()<p2.getSoldNum())
            return true;
        else 
            return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTotalRevenue = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSalesman = new javax.swing.JTable();
        btnUnder = new javax.swing.JButton();
        btnAbove = new javax.swing.JButton();
        btnBreakByMarket = new javax.swing.JButton();
        ComboBoxMarket = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMarket = new javax.swing.JTable();

        txtTotalRevenue.setText("jLabel1");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Sold Number", "Ava Number", "Model Num"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setResizable(false);
            tblProduct.getColumnModel().getColumn(1).setResizable(false);
            tblProduct.getColumnModel().getColumn(2).setResizable(false);
            tblProduct.getColumnModel().getColumn(3).setResizable(false);
        }

        tblSalesman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salesman", "Target", "Selling", "Gap"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSalesman);
        if (tblSalesman.getColumnModel().getColumnCount() > 0) {
            tblSalesman.getColumnModel().getColumn(0).setResizable(false);
            tblSalesman.getColumnModel().getColumn(1).setResizable(false);
            tblSalesman.getColumnModel().getColumn(2).setResizable(false);
            tblSalesman.getColumnModel().getColumn(3).setResizable(false);
        }

        btnUnder.setText("Salesman Under Target");
        btnUnder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnderActionPerformed(evt);
            }
        });

        btnAbove.setText("Salesman Above Target");
        btnAbove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboveActionPerformed(evt);
            }
        });

        btnBreakByMarket.setText("Select And See Detail");
        btnBreakByMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBreakByMarketActionPerformed(evt);
            }
        });

        jLabel1.setText("Revenuew of Each Market:");

        jLabel2.setText("Top 3 Product:");

        tblMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Target", "Selling", "Gap"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMarket);
        if (tblMarket.getColumnModel().getColumnCount() > 0) {
            tblMarket.getColumnModel().getColumn(0).setResizable(false);
            tblMarket.getColumnModel().getColumn(1).setResizable(false);
            tblMarket.getColumnModel().getColumn(2).setResizable(false);
            tblMarket.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtTotalRevenue)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnUnder)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbove))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnBreakByMarket)
                                .addGap(103, 103, 103))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(582, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtTotalRevenue))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUnder)
                            .addComponent(btnAbove))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBreakByMarket, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComboBoxMarket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(206, 206, 206)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUnderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnderActionPerformed
        // TODO add your handling code here:
        ArrayList<UserAccount> under = new ArrayList<UserAccount>();
        for (UserAccount u : salesman) {
            if (u.Selling() <= u.Target()) {
                
                u.getUperson().setSaleCount(u.Selling());
                u.getUperson().setTargetCount(u.Target());
                under.add(u);
            }
        }
        populateSalesmanTable(under);
    }//GEN-LAST:event_btnUnderActionPerformed

    private void btnAboveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboveActionPerformed
        // TODO add your handling code here:
        ArrayList<UserAccount> above = new ArrayList<UserAccount>();
        for (UserAccount u : salesman) {
            if (u.Selling() > u.Target()) {
                u.getUperson().setSaleCount(u.Selling());
                u.getUperson().setTargetCount(u.Target());
                above.add(u);
            }
        }
        populateSalesmanTable(above);
    }//GEN-LAST:event_btnAboveActionPerformed

    private void btnBreakByMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreakByMarketActionPerformed
        // TODO add your handling code here:

        Market market = (Market) ComboBoxMarket.getSelectedItem();

        for (UserAccount ua : salesman) {
            ua.getUperson().setSaleCount(0);
            ua.getUperson().setTargetCount(0);
            int target = 0;
            int selling= 0;
            for (Order order : ua.getUperson().getOrderHistory()) {
                for (Customer cus : market.getCustomerList()) {
                    for (Order order2 : cus.getOrderHistory()) {
                        if(order.getOrderNum().equals(order2.getOrderNum())){
                            target += order.targetTotal();
                            selling+= order.SellingTotal();
                        }
                    }
                }
            }
            ua.getUperson().setSaleCount(selling);
            ua.getUperson().setTargetCount(target);
            
        }
        populateSalesmanTable(salesman);
        
        
        

        

    }//GEN-LAST:event_btnBreakByMarketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxMarket;
    private javax.swing.JButton btnAbove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBreakByMarket;
    private javax.swing.JButton btnUnder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMarket;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTable tblSalesman;
    private javax.swing.JLabel txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
