/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import Database.ConnectDB;

/**
 *
 * @author PlonGaming
 */
public final class LogIn_frame extends javax.swing.JFrame {

    /**
     * Creates new form LogIn_frame
     */
    public LogIn_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        enableTime();
        Date();
    }

    void Date() {
        Date date = new Date();
        SimpleDateFormat time = new SimpleDateFormat("MM-dd-yyyy");
        enableDate.setText(time.format(date));
    }

    void enableTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date date = new Date();
                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
                enableTime.setText(time.format(date));
            }
        }
        ).start();
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
        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        enableDate = new javax.swing.JLabel();
        enableTime = new javax.swing.JLabel();
        Login1 = new javax.swing.JButton();
        lblNotif = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsproject/usersmall.png"))); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 100, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsproject/Lock.png"))); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 30));

        Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 230, 30));

        Pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassKeyReleased(evt);
            }
        });
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 230, 30));

        Login.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 0, 0));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsproject/pics.png"))); // NOI18N
        Login.setText("LOGIN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginKeyPressed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 50));

        jLabel4.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsproject/0ac570de9e.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 50, 50));

        enableDate.setFont(new java.awt.Font("COUTURE", 1, 18)); // NOI18N
        enableDate.setText("Date");
        getContentPane().add(enableDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        enableTime.setFont(new java.awt.Font("COUTURE", 1, 18)); // NOI18N
        enableTime.setText("Time");
        getContentPane().add(enableTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        Login1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        Login1.setForeground(new java.awt.Color(0, 0, 0));
        Login1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsproject/add-userSmall.png"))); // NOI18N
        Login1.setText("CREATE ACCOUNT");
        Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login1ActionPerformed(evt);
            }
        });
        getContentPane().add(Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 210, 50));
        getContentPane().add(lblNotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 263, 230, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsproject/sign_incover.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        
        Login();
        
    }//GEN-LAST:event_LoginActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        int response = JOptionPane.showConfirmDialog(null, "Do you wish to EXIT?", "Student Academic Overview", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank You!\nDesigned by: RUS2019", "Student Academic Overview", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (response == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login1ActionPerformed
        Sign_up d = new Sign_up();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_Login1ActionPerformed

    private void PassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_PassKeyReleased

    private void PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_PassKeyPressed

    private void LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_LoginKeyPressed

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
            java.util.logging.Logger.getLogger(LogIn_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Login1;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel enableDate;
    private javax.swing.JLabel enableTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNotif;
    // End of variables declaration//GEN-END:variables
 
    private void Login() {
        String username = Username.getText();
        String password = String.valueOf(Pass.getPassword());

        String q = "SELECT * FROM account WHERE username = \"%s\" AND password = \"%s\"";
        q = String.format(q, username, password);

        try {
            ResultSet res = ConnectDB.Query(q);
            if (!res.next()) {
                showError("Account is Unavailable!");
                return;
            }
            JOptionPane.showMessageDialog(null, "WELCOME!","Student Academic Overview", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Front_Page f = new Front_Page(username);
            f.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(LogIn_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showError(String error) {
        lblNotif.setText(error);
        lblNotif.setForeground(Color.RED);
    }

}
