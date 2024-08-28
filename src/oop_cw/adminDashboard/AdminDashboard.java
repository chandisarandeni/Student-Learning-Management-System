/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_cw.adminDashboard;

import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import oop_cw.Frames.*;

/**
 * @author Chandisa
 */
public class AdminDashboard extends javax.swing.JFrame {

    //Custom Code
    private DrawerController drawer;

    public AdminDashboard() {
        initComponents();

        // Initialize the drawer
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

        loadRecentStudentsData();
        loadUpcomingLecturesData();
    }

    //Implement the recenlt added student table data
    private void loadRecentStudentsData() {
        
        //Connection String
        String connectionString = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(connectionString);

            // Create a statement
            stmt = conn.createStatement();

            // Execute the query to retrieve recent students
            String query = "SELECT studentID, studentName FROM Student";
            rs = stmt.executeQuery(query);

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) tbl_RecentStudents.getModel();

            // Clear existing data
            model.setRowCount(0);

            // Load data into the table model
            while (rs.next()) {
                String studentID = rs.getString("studentID");
                String studentName = rs.getString("studentName");
                model.addRow(new Object[]{studentID, studentName});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Load upcoming lectures
    private void loadUpcomingLecturesData() {
        
        //Connection String
        String connectionString = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(connectionString);

            // Create a statement
            stmt = conn.createStatement();

            // Execute the query to retrieve upcoming lectures
            String query = "SELECT lecturerName, hallNumber FROM UpcomingLectures";
            rs = stmt.executeQuery(query);

            // Get the table model for tbl_UpcomingLectures
            DefaultTableModel model = (DefaultTableModel) tbl_UpcomingLectures.getModel();

            // Clear existing data
            model.setRowCount(0);

            // Load data into the table model
            while (rs.next()) {
                String lecturerName = rs.getString("lecturerName");
                String hallNumber = rs.getString("hallNumber");
                model.addRow(new Object[]{lecturerName, hallNumber});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
                AdminViewLecturer adminViewLecturer = new AdminViewLecturer();
                adminViewLecturer.setVisible(true);
                this.setVisible(false);
                break;
            case "Examination":
                // Show the Examination screen
                AdminViewExamination adminViewExamination = new AdminViewExamination();
                adminViewExamination.setVisible(true);
                this.setVisible(false);
                break;
            case "Logout":
                Home home = new Home();
                home.setVisible(true);
                this.setVisible(false);
                break;
            default:
                // Handle unknown cases
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeMenu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_RecentStudents = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_UpcomingLectures = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/Images/menu.png"))); // NOI18N
        HomeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMenuMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Recently added students");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Upcoming Lectures");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Xylon");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbl_RecentStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_RecentStudents);
        tbl_RecentStudents.getAccessibleContext().setAccessibleName("tbl_RecentStudents");

        tbl_UpcomingLectures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lecturer Name", "Hall Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_UpcomingLectures);
        tbl_UpcomingLectures.getAccessibleContext().setAccessibleName("tbl_UpcomingLectures");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HomeMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(125, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeMenu)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Home menu click event
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeMenu;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_RecentStudents;
    private javax.swing.JTable tbl_UpcomingLectures;
    // End of variables declaration//GEN-END:variables
}
