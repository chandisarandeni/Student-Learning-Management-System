/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_cw.adminDashboard;

import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import oop_cw.Frames.*;
import oop_cw.OOP_CW;
import oop_cw.adminDashboard.*;

/**
 *
 * @author Chandisa
 */
public class AdminViewLecturer extends javax.swing.JFrame {

    private DrawerController drawer;

    /**
     * Creates new form AdminViewStudent
     */
    public AdminViewLecturer() {
        initComponents();

        lbl_lecturerID.setVisible(false);
        lbl_lecturerName.setVisible(false);
        lbl_lecturerSubject.setVisible(false);
        lbl_lecturerDepartment.setVisible(false);
        lbl_lecturerEmail.setVisible(false);

        lbl_showLecturerID.setVisible(false);
        lbl_showLecturerName.setVisible(false);
        lbl_showLecturerSubject.setVisible(false);
        lbl_showLecturerDepartment.setVisible(false);
        lbl_showLecturerEmail.setVisible(false);

        drawer = Drawer.newDrawer(this)
                .header(new Header())
                .separator(2, new Color(173, 173, 173))
                .background(new Color(65, 65, 65))
                .backgroundTransparent(0.3f)
                .drawerBackground(Color.decode("#FFFFFF"))
                .addChild(createDrawerItem("Dashboard", "dashboard 1.1.png"))
                .addChild(createDrawerItem("Students", "studentIcon.png"))
                .addChild(createDrawerItem("Lecturer", "LecturerIcon.png"))
                .addChild(createDrawerItem("Examination", "exam 1.2.png"))
                .addFooter(createDrawerItem("Logout", "power 1.1.png"))
                .build();
    }

    private DrawerItem createDrawerItem(String title, String iconPath) {
        DrawerItem item = new DrawerItem(title)
                .icon(new ImageIcon(getClass().getResource(iconPath)))
                .build();

        // Add an action listener to handle item selection
        item.addActionListener(e -> handleDrawerItemSelection(title));

        return item;
    }

    private void handleDrawerItemSelection(String title) {
        switch (title) {
            case "Dashboard":

                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                    AdminDashboard adminDashboard = new AdminDashboard();
                    adminDashboard.setVisible(rootPaneCheckingEnabled);
                    this.setVisible(false);
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Students":
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                    AdminViewStudent adminViewStudent = new AdminViewStudent();
                    adminViewStudent.setVisible(rootPaneCheckingEnabled);
                    this.setVisible(false);
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                break;
            case "Lecturer":
                // Show the Lecturer screen
                //new LecturerScreen().setVisible(true);
                AdminViewLecturer adminViewLecturer = new AdminViewLecturer();
                adminViewLecturer.setVisible(true);
                this.setVisible(false); // Hide the current frame
                break;
            case "Examination":
                // Show the Examination screen
                AdminViewExamination adminViewExamination = new AdminViewExamination();
                adminViewExamination.setVisible(true);
                this.setVisible(false); // Hide the current frame
                break;
            case "Logout":
                Home home = new Home();
                home.setVisible(true);
                this.setVisible(false);
                // Handle logout
                //handleLogout();
                break;
            default:
                // Handle unknown cases
                break;
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

        HomeMenu = new javax.swing.JLabel();
        lbl_showLecturerDepartment = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_showLecturerEmail = new javax.swing.JLabel();
        lbl_lecturerID = new javax.swing.JLabel();
        AdminLogin4 = new javax.swing.JButton();
        lbl_lecturerName = new javax.swing.JLabel();
        lbl_lecturerSubject = new javax.swing.JLabel();
        lbl_lecturerDepartment = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_lecturerEmail = new javax.swing.JLabel();
        lbl_showLecturerID = new javax.swing.JLabel();
        lbl_AddStudent = new javax.swing.JLabel();
        lbl_showLecturerName = new javax.swing.JLabel();
        lbl_deleteLecturer = new javax.swing.JLabel();
        lbl_showLecturerSubject = new javax.swing.JLabel();
        txt_SearchLecturer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/Images/menu.png"))); // NOI18N
        HomeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMenuMouseClicked(evt);
            }
        });

        lbl_showLecturerDepartment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showLecturerDepartment.setText("Sample Data");
        lbl_showLecturerDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Search Lecturer :");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_showLecturerEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showLecturerEmail.setText("Sample Data");
        lbl_showLecturerEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_lecturerID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_lecturerID.setText("Lecturer ID  :  ");
        lbl_lecturerID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AdminLogin4.setBackground(new java.awt.Color(102, 0, 153));
        AdminLogin4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdminLogin4.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin4.setText("Search");
        AdminLogin4.setBorder(null);
        AdminLogin4.setFocusPainted(false);
        AdminLogin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogin4ActionPerformed(evt);
            }
        });

        lbl_lecturerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_lecturerName.setText("Name           :  ");
        lbl_lecturerName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_lecturerSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_lecturerSubject.setText("Subject        :  ");
        lbl_lecturerSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_lecturerDepartment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_lecturerDepartment.setText("Department :  ");
        lbl_lecturerDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Lecturer Activities");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_lecturerEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_lecturerEmail.setText("Email           :  ");
        lbl_lecturerEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_showLecturerID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showLecturerID.setText("Sample Data");
        lbl_showLecturerID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/adminDashboard/add.png"))); // NOI18N
        lbl_AddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AddStudentMouseClicked(evt);
            }
        });

        lbl_showLecturerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showLecturerName.setText("Sample Data");
        lbl_showLecturerName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_deleteLecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/adminDashboard/delete.png"))); // NOI18N
        lbl_deleteLecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_deleteLecturerMouseClicked(evt);
            }
        });

        lbl_showLecturerSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showLecturerSubject.setText("Sample Data");
        lbl_showLecturerSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_SearchLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SearchLecturerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HomeMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_lecturerID)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_showLecturerID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_lecturerName)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_showLecturerName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_lecturerSubject)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_showLecturerSubject))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_lecturerEmail)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_showLecturerEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_lecturerDepartment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_showLecturerDepartment)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(364, 364, 364))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_SearchLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdminLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(lbl_AddStudent)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_deleteLecturer)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(HomeMenu)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_deleteLecturer)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_AddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SearchLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lecturerID)
                    .addComponent(lbl_showLecturerID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lecturerName)
                    .addComponent(lbl_showLecturerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lecturerSubject)
                    .addComponent(lbl_showLecturerSubject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lecturerEmail)
                    .addComponent(lbl_showLecturerEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lecturerDepartment)
                    .addComponent(lbl_showLecturerDepartment))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMenuMouseClicked
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
            Timer timer = new Timer(1000, e -> drawer.hide());
        } else {
            drawer.show();
            Timer timer = new Timer(1000, e -> drawer.hide());
        }
    }//GEN-LAST:event_HomeMenuMouseClicked

    private static final String URL = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    private Connection connect() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";
        return DriverManager.getConnection(url);
    }

    //Search button
    private void AdminLogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogin4ActionPerformed
        // TODO: Add your handling code here
        // Set the x-coordinate for alignment
        int alignmentX = 50; // Replace 50 with the desired x-coordinate for positioning the labels

// Assuming all labels are being positioned with similar y-coordinates and widths
        int yPosition = 50; // Replace with the actual y-coordinate you want to use
        int labelWidth = 200; // Replace with the actual width of your labels
        int labelHeight = 30; // Replace with the actual height of your labels

        lbl_lecturerID.setVisible(true);
        lbl_lecturerID.setBounds(alignmentX, yPosition, labelWidth, labelHeight);

        lbl_lecturerName.setVisible(true);
        lbl_lecturerName.setBounds(alignmentX, yPosition + 40, labelWidth, labelHeight);

        lbl_lecturerSubject.setVisible(true);
        lbl_lecturerSubject.setBounds(alignmentX, yPosition + 80, labelWidth, labelHeight);

        lbl_lecturerDepartment.setVisible(true);
        lbl_lecturerDepartment.setBounds(alignmentX, yPosition + 120, labelWidth, labelHeight);

        lbl_lecturerEmail.setVisible(true);
        lbl_lecturerEmail.setBounds(alignmentX, yPosition + 160, labelWidth, labelHeight);

// Assume lbl_showLecturerID is already positioned correctly
        int lblShowLecturerID_X = lbl_showLecturerID.getX();
        int lblShowLecturerID_Y = lbl_showLecturerID.getY();

// Set visibility and position for each label
        lbl_showLecturerID.setVisible(true);
        lbl_showLecturerID.setBounds(lblShowLecturerID_X, lblShowLecturerID_Y, labelWidth, labelHeight);

        lbl_showLecturerName.setVisible(true);
        lbl_showLecturerName.setBounds(lblShowLecturerID_X + 30, lblShowLecturerID_Y, labelWidth, labelHeight);

        lbl_showLecturerSubject.setVisible(true);
        lbl_showLecturerSubject.setBounds(lblShowLecturerID_X + 30, lblShowLecturerID_Y + labelHeight + 10, labelWidth, labelHeight);

        lbl_showLecturerDepartment.setVisible(true);
        lbl_showLecturerDepartment.setBounds(lblShowLecturerID_X + 30, labelHeight + 10, labelWidth, labelHeight);

        lbl_showLecturerEmail.setVisible(true);
        lbl_showLecturerEmail.setBounds(lblShowLecturerID_X + 30, labelHeight + 10, labelWidth, labelHeight);

        // Get the lecturer ID from the search field
        String lecturerID = txt_SearchLecturer.getText().trim();
        if (lecturerID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lecturer ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // SQL query to retrieve lecturer details
        String query = "SELECT * FROM Lecturer WHERE lecturerID = ?";

        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, lecturerID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                lbl_showLecturerID.setText(resultSet.getString("lecturerID"));
                lbl_showLecturerName.setText(resultSet.getString("lecturerName"));
                lbl_showLecturerSubject.setText(resultSet.getString("lecturerSubject"));
                lbl_showLecturerDepartment.setText(resultSet.getString("department"));
                lbl_showLecturerEmail.setText(resultSet.getString("lecturerEmail"));

                lbl_showLecturerID.setVisible(true);
                lbl_showLecturerName.setVisible(true);
                lbl_showLecturerSubject.setVisible(true);
                lbl_showLecturerDepartment.setVisible(true);
                lbl_showLecturerEmail.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No lecturer found with ID " + lecturerID, "Error", JOptionPane.ERROR_MESSAGE);
                clearLecturerDetails();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving lecturer details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_AdminLogin4ActionPerformed

    private void clearLecturerDetails() {
        lbl_showLecturerID.setText("");
        lbl_showLecturerName.setText("");
        lbl_showLecturerSubject.setText("");
        lbl_showLecturerDepartment.setText("");
        lbl_showLecturerEmail.setText("");
    }


    private void lbl_AddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AddStudentMouseClicked
        // TODO add your handling code here:
        AdminRegisterLecturer adminRegisterLecturer = new AdminRegisterLecturer();
        adminRegisterLecturer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_AddStudentMouseClicked

    private void lbl_deleteLecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_deleteLecturerMouseClicked
        // TODO add your handling code here:
        String lecturerID = txt_SearchLecturer.getText(); // Get the lecturer ID from the text field

        int response = JOptionPane.showConfirmDialog(null,
                "Do you want to delete this lecturer?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            // Proceed with the deletion
            try {
                Connection conn = connect(); // Ensure your connect() method is correct
                String query = "DELETE FROM Lecturer WHERE lecturerID = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, lecturerID);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    lbl_lecturerID.setVisible(false);
                    lbl_lecturerName.setVisible(false);
                    lbl_lecturerSubject.setVisible(false);
                    lbl_lecturerDepartment.setVisible(false);
                    lbl_lecturerEmail.setVisible(false);

                    lbl_showLecturerID.setVisible(false);
                    lbl_showLecturerName.setVisible(false);
                    lbl_showLecturerSubject.setVisible(false);
                    lbl_showLecturerDepartment.setVisible(false);
                    lbl_showLecturerEmail.setVisible(false);
                    
                    JOptionPane.showMessageDialog(null, "Lecturer deleted successfully.");
                } else {
                    lbl_lecturerID.setVisible(false);
                    lbl_lecturerName.setVisible(false);
                    lbl_lecturerSubject.setVisible(false);
                    lbl_lecturerDepartment.setVisible(false);
                    lbl_lecturerEmail.setVisible(false);

                    lbl_showLecturerID.setVisible(false);
                    lbl_showLecturerName.setVisible(false);
                    lbl_showLecturerSubject.setVisible(false);
                    lbl_showLecturerDepartment.setVisible(false);
                    lbl_showLecturerEmail.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No lecturer found with the given ID.");
                }

                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                lbl_lecturerID.setVisible(false);
                lbl_lecturerName.setVisible(false);
                lbl_lecturerSubject.setVisible(false);
                lbl_lecturerDepartment.setVisible(false);
                lbl_lecturerEmail.setVisible(false);

                lbl_showLecturerID.setVisible(false);
                lbl_showLecturerName.setVisible(false);
                lbl_showLecturerSubject.setVisible(false);
                lbl_showLecturerDepartment.setVisible(false);
                lbl_showLecturerEmail.setVisible(false);
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error occurred while deleting the lecturer.");
            }
        } else {
            // Deletion was canceled
            JOptionPane.showMessageDialog(null, "Deletion canceled.");
        }
    }//GEN-LAST:event_lbl_deleteLecturerMouseClicked

    private void txt_SearchLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SearchLecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SearchLecturerActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin4;
    private javax.swing.JLabel HomeMenu;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_AddStudent;
    private javax.swing.JLabel lbl_deleteLecturer;
    private javax.swing.JLabel lbl_lecturerDepartment;
    private javax.swing.JLabel lbl_lecturerEmail;
    private javax.swing.JLabel lbl_lecturerID;
    private javax.swing.JLabel lbl_lecturerName;
    private javax.swing.JLabel lbl_lecturerSubject;
    private javax.swing.JLabel lbl_showLecturerDepartment;
    private javax.swing.JLabel lbl_showLecturerEmail;
    private javax.swing.JLabel lbl_showLecturerID;
    private javax.swing.JLabel lbl_showLecturerName;
    private javax.swing.JLabel lbl_showLecturerSubject;
    private javax.swing.JTextField txt_SearchLecturer;
    // End of variables declaration//GEN-END:variables
}
