/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rasystem;
 
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pwdT = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        newpwd1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        user = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        proceedB = new javax.swing.JButton();
        confirm = new javax.swing.JPasswordField();
        newpwd = new javax.swing.JPasswordField();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pwdT.setColumns(20);
        pwdT.setRows(5);
        jScrollPane1.setViewportView(pwdT);

        jLabel5.setText("Password : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHANGE PASSWORD");

        jLabel6.setText("New Password : ");

        jLabel7.setText("Username : ");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        user.setColumns(20);
        user.setRows(5);
        jScrollPane3.setViewportView(user);

        jLabel9.setText("Confirm Password : ");

        backB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backB.setText("<< BACK");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        proceedB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proceedB.setText("PROCEED");
        proceedB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBActionPerformed(evt);
            }
        });

        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceedB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newpwd)
                            .addComponent(confirm))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(newpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceedB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed

        Open1 x=new Open1();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose() ;
         
    }//GEN-LAST:event_backBActionPerformed
    
boolean checkinput()
{
    String s ; 
    
    s = user.getText() ; 
    if ( s.equals("") ) return false ; 
    
    s = newpwd.getText() ; 
    if ( s.equals("") ) return false ; 
    
    s = confirm.getText() ; 
    if ( s.equals("") ) return false  ; 
    
    return true ; 
}
    private void proceedBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBActionPerformed

        if ( checkinput() ) 
        {     
                try 
                {
                    Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS","root","go5a1on1");
                    Statement st = con.createStatement();
                    
                    String q1 = "Select UName, Pwd from Manager where UName = \"" + user.getText() +  "\"; ";
                    System.out.println(q1); 
                    
                    ResultSet rs=st.executeQuery(q1);
                    
                    if ( !rs.isBeforeFirst() ) 
                    {                           
                        JOptionPane.showMessageDialog
                        (     null,    "USERNAME NOT FOUND !!"   ,   "LOGIN FAILED "   ,   JOptionPane.ERROR_MESSAGE    );                        
                              
                              newpwd.setText(null);   
                              confirm.setText(null); 
                              return; 
                    } 
                    else
                    {     
                       String user1 = "\"" + user.getText() + "\"" ; 
                       String pwd1 = "\"" + newpwd.getText() + "\"" ; 
                       String confirm1 = "\"" + confirm.getText() + "\"" ; 
                       
                       if ( pwd1.equals(confirm1) == false ) 
                       {
                           JOptionPane.showMessageDialog(null, "PASSWORDS DO NOT MATCH ! ","Alert",JOptionPane.ERROR_MESSAGE);
                           newpwd.setText(null);   
                           confirm.setText(null); 
                           return; 
                       }
                       else
                       {
                            String q2 = "update Manager set pwd = " + pwd1 + " where UName = " + user1 +  ";"  ; 
                            st.executeUpdate(q2) ;     
                       
                            ManHP x = new ManHP();
                            x.setVisible(true);        
                            x.setLocationRelativeTo(null);        
                            this.dispose() ;                         
                        }
                    }
                } 
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null,ex,"Alert",JOptionPane.ERROR_MESSAGE);
                    return; 
                } 
        }
        else if ( !checkinput()  )
        {
            JOptionPane.showMessageDialog(null, "INCOMPLETE INPUT ! ","Alert",JOptionPane.ERROR_MESSAGE);
            return; 
        }
                         
         
    }//GEN-LAST:event_proceedBActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPasswordField newpwd;
    private javax.swing.JPasswordField newpwd1;
    private javax.swing.JButton proceedB;
    private javax.swing.JTextArea pwdT;
    private javax.swing.JTextArea user;
    // End of variables declaration//GEN-END:variables
}
