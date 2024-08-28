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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

import oop_cw.Frames.*;
import oop_cw.OOP_CW;
import oop_cw.adminDashboard.*;

/**
 *
 * @author Chandisa
 */
public class AdminViewExamination extends javax.swing.JFrame {

    private DrawerController drawer;

    /**
     * Creates new form AdminViewStudent
     */
    public AdminViewExamination() {
        initComponents();

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

        // Hide components
        lbl_studentID.setVisible(false);
        lbl_studentName.setVisible(false);
        lbl_showStudentID.setVisible(false);
        lbl_showStudentName.setVisible(false);
        lbl_studentResults.setVisible(false);
        tbl_showStudentResults.setVisible(false);
        pnl_tableIn.setVisible(false);

// Update layout
        java.awt.Container parent = tbl_showStudentResults.getParent();
        if (parent == null) {
            parent.revalidate();
            parent.repaint();
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

        jLabel6 = new javax.swing.JLabel();
        txt_SearchStudent = new javax.swing.JTextField();
        AdminLogin4 = new javax.swing.JButton();
        HomeMenu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_studentID = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        lbl_showStudentID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_showStudentName = new javax.swing.JLabel();
        lbl_studentID = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JLabel();
        lbl_studentResults = new javax.swing.JLabel();
        pnl_tableIn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_showStudentResults = new javax.swing.JTable();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Search Student :");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/Images/menu.png"))); // NOI18N
        HomeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMenuMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("View Student Results");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Search Student :");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_search.setBackground(new java.awt.Color(102, 0, 153));
        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.setBorder(null);
        btn_search.setFocusPainted(false);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        lbl_showStudentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showStudentID.setText("Sample Data");
        lbl_showStudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Enter Student ID to View Student Results");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_showStudentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showStudentName.setText("Sample Data");
        lbl_showStudentName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_studentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_studentID.setText("Studdent ID   :  ");
        lbl_studentID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_studentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_studentName.setText("Name            :  ");
        lbl_studentName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_studentResults.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_studentResults.setText("Results          :  ");
        lbl_studentResults.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbl_showStudentResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Subject", "Marks", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_showStudentResults);

        javax.swing.GroupLayout pnl_tableInLayout = new javax.swing.GroupLayout(pnl_tableIn);
        pnl_tableIn.setLayout(pnl_tableInLayout);
        pnl_tableInLayout.setHorizontalGroup(
            pnl_tableInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tableInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnl_tableInLayout.setVerticalGroup(
            pnl_tableInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tableInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addGap(298, 298, 298)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_studentID)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_showStudentID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_studentName)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_showStudentName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_studentResults)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl_tableIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(HomeMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_studentID)
                    .addComponent(lbl_showStudentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_studentName)
                    .addComponent(lbl_showStudentName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_studentResults))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pnl_tableIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void AdminLogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogin4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminLogin4ActionPerformed

    private Connection connect() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";
        return DriverManager.getConnection(url);
    }

    //Search button
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        //
        lbl_studentID.setVisible(true);
        lbl_studentName.setVisible(true);
        lbl_studentResults.setVisible(true);
        jLabel9.setVisible(false);

        String studentID = txt_studentID.getText().trim();
        if (studentID.isEmpty()) {
            lbl_studentID.setVisible(false);
            lbl_studentName.setVisible(false);
            lbl_studentResults.setVisible(false);
            JOptionPane.showMessageDialog(this, "Student ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "SELECT * FROM Student WHERE studentID = ?";

        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, studentID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                lbl_showStudentID.setText(resultSet.getString("studentID"));
                lbl_showStudentName.setText(resultSet.getString("studentName"));

                lbl_showStudentID.setVisible(true);
                lbl_showStudentName.setVisible(true);
                loadStudentResults();
            } else {
                lbl_studentID.setVisible(false);
                lbl_studentName.setVisible(false);
                lbl_studentResults.setVisible(false);
                JOptionPane.showMessageDialog(this, "No student found with ID " + studentID, "Error", JOptionPane.ERROR_MESSAGE);
                clearStudentDetails();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving student details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadStudentResults() {

        String studentID = txt_studentID.getText().trim();
        String query = "SELECT subjectName, marks, grade FROM Result WHERE studentID = ?";

        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, studentID);
            ResultSet resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tbl_showStudentResults.getModel();
            model.setRowCount(0); // Clear existing rows

            while (resultSet.next()) {
                String subjectName = resultSet.getString("subjectName");
                double marks = resultSet.getDouble("marks");
                String grade = resultSet.getString("grade");
                model.addRow(new Object[]{subjectName, marks, grade});
            }

            if (model.getRowCount() > 0) {
                // Center align marks and grade columns
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                tbl_showStudentResults.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); // Marks column
                tbl_showStudentResults.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); // Grade column

                tbl_showStudentResults.setVisible(true);
                pnl_tableIn.setVisible(true);
                pnl_tableIn.revalidate();
                pnl_tableIn.repaint();
            } else {
                JOptionPane.showMessageDialog(this, "No results found for the student", "No Data", JOptionPane.INFORMATION_MESSAGE);
                tbl_showStudentResults.setVisible(false);
                pnl_tableIn.setVisible(false);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving student results: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearStudentDetails() {
        lbl_showStudentID.setText("");
        lbl_showStudentName.setText("");
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewExamination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin4;
    private javax.swing.JLabel HomeMenu;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_showStudentID;
    private javax.swing.JLabel lbl_showStudentName;
    private javax.swing.JLabel lbl_studentID;
    private javax.swing.JLabel lbl_studentName;
    private javax.swing.JLabel lbl_studentResults;
    private javax.swing.JPanel pnl_tableIn;
    private javax.swing.JTable tbl_showStudentResults;
    private javax.swing.JTextField txt_SearchStudent;
    private javax.swing.JTextField txt_studentID;
    // End of variables declaration//GEN-END:variables
}
