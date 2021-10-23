/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDBMysql;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
/**
 *
 * @author Jorda
 */
public class StudentDBMysql extends javax.swing.JFrame {

    private static final String username="root";
    private static final String password="Learn2code!";
    private static final String dataConn="jdbc:mysql://localhost:3306/studentdata";
    
   
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs =null; 
    
    /**
     * Creates new form StudentDBMysql
     */
    public StudentDBMysql() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cboMath = new javax.swing.JComboBox<>();
        cboGames = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboAnalysis = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboDataSci = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cboGraphic = new javax.swing.JComboBox<>();
        cboEnglish = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cboDatabase = new javax.swing.JComboBox<>();
        cboScience = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText("Student Database Management System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1420, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 4));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        txtStudentID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 380, -1));

        cboGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });
        jPanel1.add(cboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        txtFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 380, -1));

        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 380, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 380, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Phone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Math");

        cboMath.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboMath.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboMath.setName(""); // NOI18N
        cboMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMathActionPerformed(evt);
            }
        });

        cboGames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboGames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGamesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Analysis");

        cboAnalysis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboAnalysis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnalysisActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Data Sci");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Games");

        cboDataSci.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboDataSci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboDataSci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDataSciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cboGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(cboDataSci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cboGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDataSci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 250, 170));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("English");

        cboGraphic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboGraphic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboGraphic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGraphicActionPerformed(evt);
            }
        });

        cboEnglish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboEnglish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEnglishActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Science");

        cboDatabase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboDatabase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDatabaseActionPerformed(evt);
            }
        });

        cboScience.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboScience.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", "Core unit", "Complete" }));
        cboScience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboScienceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Graphic");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Database");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboGraphic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cboDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(cboScience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGraphic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cboDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboScience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 250, 170));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 610, 410));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateColumnsFromModel(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student ID", "Firstname", "Lastname", "Gender", "Mobile", "Math", "Games", "Data Sci", "Analysis", "Graphic", "Database", "Science", "Add math", "Lastname"
            }
        ));
        jTable1.setRowHeight(15);
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 380));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 760, 400));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        btnReset.setText("Reset");
        jPanel5.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 220, -1));

        btnAddNew.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        jPanel5.add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        btnDelete.setText("Delete");
        jPanel5.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 210, -1));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel5.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 190, -1));

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jButton25.setText("jButton1");
        jPanel5.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 50, -1, 10));

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jButton26.setText("jButton1");
        jPanel5.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, -1, -1));

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jButton27.setText("jButton1");
        jPanel5.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 230, -1));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel5.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 220, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1380, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1420, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGenderActionPerformed

    private void cboMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMathActionPerformed

    private void cboGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGamesActionPerformed

    private void cboAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAnalysisActionPerformed

    private void cboDataSciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDataSciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDataSciActionPerformed

    private void cboGraphicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGraphicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGraphicActionPerformed

    private void cboDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDatabaseActionPerformed

    private void cboScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboScienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboScienceActionPerformed

    private void cboEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEnglishActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            try {
                pst = sqlConn.prepareStatement("insert into studentdata(studentid,firstname,lastname,address,"
                        + "gender,phone,math,games,datasci,analysis,graphic,database1,science,english)values"
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBMysql.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            pst.setString(1, txtStudentID.getText());
            pst.setString(2, txtFirstName.getText());
            pst.setString(3, txtLastName.getText());
            pst.setString(4, txtAddress.getText());
            pst.setString(5, (String)cboGender.getSelectedItem());
            pst.setString(6, txtPhone.getText());
            pst.setString(7, (String)cboMath.getSelectedItem());
            pst.setString(8, (String)cboGames.getSelectedItem());
            pst.setString(9, (String)cboDataSci.getSelectedItem());
            pst.setString(10, (String)cboAnalysis.getSelectedItem());
            pst.setString(11, (String)cboGraphic.getSelectedItem());
            pst.setString(12, (String)cboDatabase.getSelectedItem());
            pst.setString(13, (String)cboScience.getSelectedItem());
            pst.setString(14, (String)cboEnglish.getSelectedItem());
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Record Added");
            
            
    }//GEN-LAST:event_btnAddNewActionPerformed
         catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDBMysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed
private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Management System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnExitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDBMysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentDBMysql().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboAnalysis;
    private javax.swing.JComboBox<String> cboDataSci;
    private javax.swing.JComboBox<String> cboDatabase;
    private javax.swing.JComboBox<String> cboEnglish;
    private javax.swing.JComboBox<String> cboGames;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboGraphic;
    private javax.swing.JComboBox<String> cboMath;
    private javax.swing.JComboBox<String> cboScience;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables

  
}
