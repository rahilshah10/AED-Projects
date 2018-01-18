/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAnalytics.Panel;

import FeedbackAnalytics.FeedbackProcessor.SendMail;
import javax.swing.JOptionPane;

/**
 *
 * @author Zi Wei Fan
 */
public class Email extends javax.swing.JPanel {

    /**
     * Creates new form Email
     */
    public Email() {
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

        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMessageText = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Step 4: Notice! Annoucement!");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Title");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("To:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtTo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTo.setText("ziweifan7@gmail.com");
        add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 310, -1));

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FeedbackAnalytics/Picture/mail.png"))); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, 180, 50));

        txtMessageText.setColumns(20);
        txtMessageText.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtMessageText.setForeground(new java.awt.Color(255, 51, 51));
        txtMessageText.setRows(5);
        txtMessageText.setText("Hi Restaurant Manager:\n\nThis is APHA organization(American Public\nHealth Association).We wrote this email is \nto notice you that there might be a serious\nissue of food safety in the city.\n\nThe main symptom of disease is:\n\n\nThe city affected:\n\n\nPlease kindly pay more attention to the \nsource of your input production.\n\n\n\nAPHAh");
        jScrollPane4.setViewportView(txtMessageText);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 570, 420));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Message");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitle.setText("[APHA Alert!] Pay attention to the potential issue");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 310, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String from = "ziweifan177@yahoo.com";
        String password = "Fzw1985!!!!";
        String to = txtTo.getText().trim();
        String subject = txtTitle.getText().trim();
        String messageText = txtMessageText.getText().trim();
        String host = "smtp.mail.yahoo.com";
        try{

            boolean isSend = SendMail.sendMessage(host,from , password, to, subject, messageText, "text/html;charset=utf-8");
            if(isSend == true){
                JOptionPane.showMessageDialog(null, "Announced!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtMessageText;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
