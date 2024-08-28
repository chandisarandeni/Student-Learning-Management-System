/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_cw.Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import oop_cw.studentDashboard.*;

/**
 * @author Chandisa
 */
public class StudentLogin extends javax.swing.JFrame {

    public StudentLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt_studentUsername = new javax.swing.JTextField();
        AdminLogin4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AdminLogin2 = new javax.swing.JButton();
        AdminLogin3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_studentPassword = new javax.swing.JTextField();
        adminForgot = new javax.swing.JLabel();
        adminBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Student Login");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_studentUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_studentUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_studentUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_studentUsernameActionPerformed(evt);
            }
        });

        AdminLogin4.setBackground(new java.awt.Color(102, 0, 153));
        AdminLogin4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdminLogin4.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin4.setText("Back");
        AdminLogin4.setBorder(null);
        AdminLogin4.setFocusPainted(false);
        AdminLogin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogin4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Username  ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AdminLogin2.setBackground(new java.awt.Color(102, 0, 153));
        AdminLogin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdminLogin2.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin2.setText("Login");
        AdminLogin2.setBorder(null);
        AdminLogin2.setFocusPainted(false);
        AdminLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogin2ActionPerformed(evt);
            }
        });

        AdminLogin3.setBackground(new java.awt.Color(102, 0, 153));
        AdminLogin3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdminLogin3.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin3.setText("Cancel");
        AdminLogin3.setBorder(null);
        AdminLogin3.setFocusPainted(false);
        AdminLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogin3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Forgot Password ?");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_studentPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_studentPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        adminForgot.setText("Click Here");

        adminBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/Images/Student Login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(adminBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addComponent(txt_studentUsername)
                                .addComponent(txt_studentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(AdminLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(AdminLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminForgot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(AdminLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_studentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_studentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdminLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(adminForgot))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(AdminLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_studentUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_studentUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_studentUsernameActionPerformed

    private void AdminLogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogin4ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(rootPaneCheckingEnabled);
        this.setVisible(false);
    }//GEN-LAST:event_AdminLogin4ActionPerformed

    //Student Dashboard Login
    private void AdminLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogin2ActionPerformed
        // TODO add your handling code here:
        
        // Database connection string
        String connectionString = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            con = DriverManager.getConnection(connectionString);

            // SQL statement
            String sql = "SELECT studentID, studentPassword FROM Student WHERE studentID = ? AND studentPassword = ?";
            stmt = con.prepareStatement(sql);

            // Set parameters
            stmt.setString(1, txt_studentUsername.getText());
            stmt.setString(2, new String(txt_studentPassword.getText()));

            // Execute query
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Login successful, open the home screen
                StudentDashboard studentDashboard = new StudentDashboard();
                studentDashboard.setVisible(true);
                this.setVisible(false);
            } else {
                // Invalid username or password
                JOptionPane.showMessageDialog(this, "Invalid username or password");

                // Clear the input fields
                txt_studentUsername.setText("");
                txt_studentPassword.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        } finally {
            // Ensure resources are closed
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_AdminLogin2ActionPerformed

    private void AdminLogin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogin3ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminLogin3ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin2;
    private javax.swing.JButton AdminLogin3;
    private javax.swing.JButton AdminLogin4;
    private javax.swing.JLabel adminBanner;
    private javax.swing.JLabel adminForgot;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_studentPassword;
    private javax.swing.JTextField txt_studentUsername;
    // End of variables declaration//GEN-END:variables
}
