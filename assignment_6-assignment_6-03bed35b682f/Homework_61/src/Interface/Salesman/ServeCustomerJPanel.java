/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Salesman;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rahil
 */
public class ServeCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServeCustomerJPanel
     */
    private Business business;
    private JPanel userProcessContainer;
    private int id;
    private UserAccount userAccount;
    private Market market;
    private Customer c;
    public ServeCustomerJPanel(Business business, JPanel userProcessContainer, int id,UserAccount userAccount,Market market,Customer c) {
        initComponents();
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        this.id = id;
        this.userAccount = userAccount;
        this.market = market;
        this.c= c;
        display();
    }
    
    
    private void display(){
        lblCustomerName.setText(c.getCustomerName());
        lblMarket.setText(market.getMarketName());
        lblSalesmanName.setText(userAccount.getUperson().toString());
//        for(Market market : business.getMarketList().getMarketList()){
//        for(Customer customer : market.getCustomerList()){
//            if(customer.getCustomerID()==(id)){
//        
//            lblSalesmanName.setText(userAccount.getUperson().getFirstName()+" "+userAccount.getUperson().getLastName());
//            lblCustomerName.setText(customer.getCustomerName());
//            lblMarket.setText(market.getMarketName());
//            }
//        }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMarket = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSalesmanName = new javax.swing.JLabel();
        btnViewCustomerHistory1 = new javax.swing.JButton();
        btnViewCustomerHistory3 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        btnBack.setText("<Back");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Customer Name:");

        lblCustomerName.setText("jLabel2");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Market:");

        lblMarket.setText("jLabel6");

        jLabel7.setText("Salesman Name:");

        lblSalesmanName.setText("jLabel8");

        btnViewCustomerHistory1.setText("Book Customer Order");
        btnViewCustomerHistory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerHistory1ActionPerformed(evt);
            }
        });

        btnViewCustomerHistory3.setText("Browse Product Catalog");
        btnViewCustomerHistory3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerHistory3ActionPerformed(evt);
            }
        });

        btnBack1.setText("<Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMarket)
                        .addGap(424, 424, 424)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalesmanName)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnBack1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnViewCustomerHistory1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewCustomerHistory3))
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCustomerName)
                    .addComponent(jLabel7)
                    .addComponent(lblSalesmanName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarket)
                    .addComponent(jLabel5))
                .addGap(168, 168, 168)
                .addComponent(btnViewCustomerHistory1)
                .addGap(59, 59, 59)
                .addComponent(btnViewCustomerHistory3)
                .addGap(132, 132, 132)
                .addComponent(btnBack1)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomerHistory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerHistory1ActionPerformed
        // TODO add your handling code here:
        BookCustomerOrderJPanel panel = new BookCustomerOrderJPanel(business,userProcessContainer,id, userAccount,market,c);
        userProcessContainer.add("BookCustomerOrderJPanel",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewCustomerHistory1ActionPerformed

    private void btnViewCustomerHistory3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerHistory3ActionPerformed
        // TODO add your handling code here:
        BrowseProductCatalogJPanel panel = new BrowseProductCatalogJPanel(business,userProcessContainer,id, userAccount,market,c);
                userProcessContainer.add("BrowseProductCatalogJPanel",panel);
                CardLayout layout=(CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewCustomerHistory3ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnViewCustomerHistory1;
    private javax.swing.JButton btnViewCustomerHistory3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblMarket;
    private javax.swing.JLabel lblSalesmanName;
    // End of variables declaration//GEN-END:variables
}
