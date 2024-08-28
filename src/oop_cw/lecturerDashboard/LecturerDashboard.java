/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_cw.lecturerDashboard;

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
public class LecturerDashboard extends javax.swing.JFrame {

    private DrawerController drawer;

    /**
     * Creates new form AdminViewStudent
     */
    public LecturerDashboard() {
        initComponents();

        drawer = Drawer.newDrawer(this)
                .header(new Header1())
                .separator(2, new Color(173, 173, 173))
                .background(new Color(65, 65, 65))
                .backgroundTransparent(0.3f)
                .drawerBackground(Color.decode("#FFFFFF"))
                .addChild(createDrawerItem("Dashboard", "dashboard 1.1.png"))
                .addChild(createDrawerItem("Examination", "exam 1.2.png"))
                .addFooter(createDrawerItem("Logout", "power 1.1.png"))
                .build();
        
        
        lbl_studentID.setVisible(false);
        lbl_studentName.setVisible(false);
        lbl_showStudentID.setVisible(false);
        lbl_showStudentName.setVisible(false);
        lbl_studentResults.setVisible(false);
        tbl_showStudentResults.setVisible(false);
        pnl_tableIn.setVisible(false);
        
        loadRecentlyUpdatedResults();
    }
    
    private void loadRecentlyUpdatedResults() {
        DefaultTableModel model = (DefaultTableModel) tbl_showRecentlyUpdatedResults.getModel();
        model.setRowCount(0);

        String query = "SELECT subjectName, marks, grade FROM Result";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;")) {
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String subjectName = rs.getString("subjectName");
                double marks = rs.getDouble("marks");
                String grade = rs.getString("grade");

                model.addRow(new Object[]{subjectName, marks, grade});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading recently updated results.");
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
                    LecturerDashboard lecturerDashboard = new LecturerDashboard();
                    lecturerDashboard.setVisible(true);
                    this.setVisible(false);
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Examination":
                // Show the Examination screen
                LectureUploadResults lectureUploadResults = new LectureUploadResults();
                lectureUploadResults.setVisible(true);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_studentID = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbl_studentID = new javax.swing.JLabel();
        lbl_showStudentID = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JLabel();
        lbl_showStudentName = new javax.swing.JLabel();
        lbl_studentResults = new javax.swing.JLabel();
        pnl_tableIn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_showStudentResults = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_showRecentlyUpdatedResults = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_cw/Images/menu.png"))); // NOI18N
        HomeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMenuMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Enter Student ID to View Student Results");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_studentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_studentID.setText("Studdent ID   :  ");
        lbl_studentID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_showStudentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showStudentID.setText("Sample Data");
        lbl_showStudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_studentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_studentName.setText("Name            :  ");
        lbl_studentName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_showStudentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_showStudentName.setText("Sample Data");
        lbl_showStudentName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_tableInLayout.setVerticalGroup(
            pnl_tableInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tableInLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_studentID)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_showStudentID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_studentName)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_showStudentName))
                    .addComponent(lbl_studentResults, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(pnl_tableIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txt_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_studentID)
                    .addComponent(lbl_showStudentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_studentName)
                    .addComponent(lbl_showStudentName))
                .addGap(18, 18, 18)
                .addComponent(lbl_studentResults)
                .addGap(18, 18, 18)
                .addComponent(pnl_tableIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_showRecentlyUpdatedResults.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_showRecentlyUpdatedResults);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Recently Added Results");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(HomeMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(HomeMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Connection connect() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-3RD2OGB;Database=OOP_CW;integratedSecurity=true;TrustServerCertificate=true;";
        return DriverManager.getConnection(url);
    }
    
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
                    //pnl_tableIn.setVisible(false);
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
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeMenu;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_showStudentID;
    private javax.swing.JLabel lbl_showStudentName;
    private javax.swing.JLabel lbl_studentID;
    private javax.swing.JLabel lbl_studentName;
    private javax.swing.JLabel lbl_studentResults;
    private javax.swing.JPanel pnl_tableIn;
    private javax.swing.JTable tbl_showRecentlyUpdatedResults;
    private javax.swing.JTable tbl_showStudentResults;
    private javax.swing.JTextField txt_studentID;
    // End of variables declaration//GEN-END:variables

}
