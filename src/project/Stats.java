/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paida
 */
public class Stats extends javax.swing.JFrame {

     Connection conn;
    public Stats() {
        initComponents();
        jLabel5.setVisible(false);
          jTextField1.setVisible(false);
          jComboBox4.setVisible(false);
          try{
        Class.forName("com.mysql.jdbc.Driver");  
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","sai.1919");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATISTICS");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENROLLMENT NO.", "PERCENTAGE", "SECTION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusCycleRoot(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ENROLLMENT NO.");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("PERCENTAGE");
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setHeaderValue("SECTION");
        }

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 220));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("List the students with attendence:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "80", "75", "60", "50", "0" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("%");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEC 1", "SEC 2", "SEC 3", "ALL" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel3)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 220));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("Average attendance of :");

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEC 1", "SEC 2", "SEC 3", "ALL" }));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton3.setText("CHECK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButton1.setText("Section");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButton2.setText("Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("Enter Enrollment No. :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(36, 36, 36))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 51, 51));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 204));
        jButton7.setText("Refresh");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(574, 574, 574))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(482, 482, 482)
                        .addComponent(jButton5)
                        .addGap(79, 79, 79))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                        .addGap(240, 240, 240)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 80, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
         DefaultTableModel model =(DefaultTableModel) jTable1.getModel(); 
         float result[]=new float[10];
        //  model.setRowCount(0);
  
        try{
                Statement stmt=conn.createStatement();
                ResultSet rs;

            if(jComboBox3.getItemAt(jComboBox3.getSelectedIndex()).equals("SEC 1"))
                    {
                        int j=1;
                           
           rs=stmt.executeQuery("select avg(AR001)*100,avg(AR002)*100,avg(AR003)*100,avg(AR004)*100,avg(AR005)*100,avg(AR006)*100,avg(AR007)*100,avg(AR008)*100,avg(AR009)*100,avg(AR010)*100 from sec1 "); 
          rs.absolute(1);
                           
          String percent=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
            int per=Integer.parseInt(percent);
                         // model.addRow(new Object[] {"AR001",rs.getFloat(1),1});
                          
                          for(int i=0;i<10;i++){
                             result[i]=rs.getFloat(j);
                             j++;
                          }
                   if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals(">"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]>per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR001",result[i],1});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR002",result[i],1});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR003",result[i],1});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR004",result[i],1});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR005",result[i],1});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR006",result[i],1});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR007",result[i],1});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR008",result[i],1});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR009",result[i],1});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR010",result[i],1});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
                   else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals("<"))
                   {
                               for(int i=0;i<10;i++)
                          {
                           if(result[i]<per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR001",result[i],1});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR002",result[i],1});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR003",result[i],1});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR004",result[i],1});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR005",result[i],1});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR006",result[i],1});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR007",result[i],1});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR008",result[i],1});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR009",result[i],1});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR010",result[i],1});
                                                break;
                                       
                                  }
                                
                              }
                          }
                   }
                   else
                   {
                               for(int i=0;i<10;i++)
                          {
                           if(result[i]==per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR001",result[i],1});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR002",result[i],1});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR003",result[i],1});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR004",result[i],1});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR005",result[i],1});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR006",result[i],1});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR007",result[i],1});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR008",result[i],1});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR009",result[i],1});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR010",result[i],1});
                                                break;
                                       
                                  }
                                
                              }
                        }
                   }                      
             }
            else  if(jComboBox3.getItemAt(jComboBox3.getSelectedIndex()).equals("SEC 2"))
            {
                 int j=1;
             rs=stmt.executeQuery("select avg(AR011)*100,avg(AR012)*100,avg(AR013)*100,avg(AR014)*100,avg(AR015)*100,avg(AR016)*100,avg(AR017)*100,avg(AR018)*100,avg(AR019)*100,avg(AR020)*100 from sec2");          
          rs.absolute(1);
                           
          String percent=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
            int per=Integer.parseInt(percent);
                         // model.addRow(new Object[] {"AR001",rs.getFloat(1),1});
                          
                          for(int i=0;i<10;i++){
                             result[i]=rs.getFloat(j);
                             j++;
                          }
                   if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals(">"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]>per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR011",result[i],2});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR012",result[i],2});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR013",result[i],2});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR014",result[i],2});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR015",result[i],2});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR016",result[i],2});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR017",result[i],2});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR018",result[i],2});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR019",result[i],2});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR020",result[i],2});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
                   else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals("<"))
                   {
                                for(int i=0;i<10;i++)
                          {
                           if(result[i]<per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR011",result[i],2});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR012",result[i],2});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR013",result[i],2});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR014",result[i],2});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR015",result[i],2});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR016",result[i],2});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR017",result[i],2});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR018",result[i],2});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR019",result[i],2});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR020",result[i],2});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
                   else
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]==per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR011",result[i],2});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR012",result[i],2});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR013",result[i],2});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR014",result[i],2});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR015",result[i],2});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR016",result[i],2});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR017",result[i],2});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR018",result[i],2});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR019",result[i],2});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR020",result[i],2});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
            }
            else  if(jComboBox3.getItemAt(jComboBox3.getSelectedIndex()).equals("SEC 3"))
            {
                  int j=1;
             rs=stmt.executeQuery("select avg(AR021)*100,avg(AR022)*100,avg(AR023)*100,avg(AR024)*100,avg(AR025)*100,avg(AR026)*100,avg(AR027)*100,avg(AR028)*100,avg(AR029)*100,avg(AR030)*100 from sec3  ");          
          rs.absolute(1);
                           
          String percent=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
            int per=Integer.parseInt(percent);
                         // model.addRow(new Object[] {"AR001",rs.getFloat(1),1});
                          
                          for(int i=0;i<10;i++){
                             result[i]=rs.getFloat(j);
                             j++;
                          }
                   if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals(">"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]>per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR021",result[i],3});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR022",result[i],3});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR023",result[i],3});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR024",result[i],3});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR025",result[i],3});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR026",result[i],3});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR027",result[i],3});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR028",result[i],3});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR029",result[i],3});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR030",result[i],3});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
            }
                   else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals("<"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]<per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR021",result[i],3});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR022",result[i],3});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR023",result[i],3});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR024",result[i],3});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR025",result[i],3});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR026",result[i],3});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR027",result[i],3});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR028",result[i],3});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR029",result[i],3});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR030",result[i],3});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
            }
                   else
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]==per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR021",result[i],3});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR022",result[i],3});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR023",result[i],3});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR024",result[i],3});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR025",result[i],3});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR026",result[i],3});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR027",result[i],3});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR028",result[i],3});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR029",result[i],3});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR030",result[i],3});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
            }
            else
            {
                  int j=1;
                     
          rs=stmt.executeQuery("select avg(AR001)*100,avg(AR002)*100,avg(AR003)*100,avg(AR004)*100,avg(AR005)*100,avg(AR006)*100,avg(AR007)*100,avg(AR008)*100,avg(AR009)*100,avg(AR010)*100 from sec1 "); 
          rs.absolute(1);
                           
          String percent=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
            int per=Integer.parseInt(percent);
                         // model.addRow(new Object[] {"AR001",rs.getFloat(1),1});
                          
                          for(int i=0;i<10;i++){
                             result[i]=rs.getFloat(j);
                             j++;
                          }
                   if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals(">"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]>per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR001",result[i],1});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR002",result[i],1});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR003",result[i],1});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR004",result[i],1});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR005",result[i],1});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR006",result[i],1});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR007",result[i],1});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR008",result[i],1});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR009",result[i],1});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR010",result[i],1});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
                   else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals("<"))
                   {
                               for(int i=0;i<10;i++)
                          {
                           if(result[i]<per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR001",result[i],1});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR002",result[i],1});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR003",result[i],1});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR004",result[i],1});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR005",result[i],1});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR006",result[i],1});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR007",result[i],1});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR008",result[i],1});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR009",result[i],1});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR010",result[i],1});
                                                break;
                                       
                                  }
                                
                              }
                          }
                   }
                   else
                   {
                               for(int i=0;i<10;i++)
                          {
                           if(result[i]==per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR001",result[i],1});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR002",result[i],1});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR003",result[i],1});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR004",result[i],1});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR005",result[i],1});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR006",result[i],1});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR007",result[i],1});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR008",result[i],1});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR009",result[i],1});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR010",result[i],1});
                                                break;
                                       
                                  }
                                
                              }
                        }
                   }                      
             
         
                  j=1;
                  rs=stmt.executeQuery("select avg(AR011)*100,avg(AR012)*100,avg(AR013)*100,avg(AR014)*100,avg(AR015)*100,avg(AR016)*100,avg(AR017)*100,avg(AR018)*100,avg(AR019)*100,avg(AR020)*100 from sec2 ");          
                
          rs.absolute(1);
                           
        percent=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
             per=Integer.parseInt(percent);
                         // model.addRow(new Object[] {"AR001",rs.getFloat(1),1});
                          
                          for(int i=0;i<10;i++){
                             result[i]=rs.getFloat(j);
                             j++;
                          }
                   if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals(">"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]>per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR011",result[i],2});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR012",result[i],2});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR013",result[i],2});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR014",result[i],2});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR015",result[i],2});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR016",result[i],2});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR017",result[i],2});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR018",result[i],2});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR019",result[i],2});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR020",result[i],2});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
                   else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals("<"))
                   {
                                for(int i=0;i<10;i++)
                          {
                           if(result[i]<per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR011",result[i],2});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR012",result[i],2});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR013",result[i],2});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR014",result[i],2});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR015",result[i],2});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR016",result[i],2});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR017",result[i],2});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR018",result[i],2});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR019",result[i],2});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR020",result[i],2});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
                   else
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]==per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR011",result[i],2});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR012",result[i],2});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR013",result[i],2});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR014",result[i],2});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR015",result[i],2});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR016",result[i],2});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR017",result[i],2});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR018",result[i],2});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR019",result[i],2});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR020",result[i],2});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
          
                   j=1;
                     rs=stmt.executeQuery("select avg(AR021)*100,avg(AR022)*100,avg(AR023)*100,avg(AR024)*100,avg(AR025)*100,avg(AR026)*100,avg(AR027)*100,avg(AR028)*100,avg(AR029)*100,avg(AR030)*100 from sec3 ");          
                    
          rs.absolute(1);
                           
         percent=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
         per=Integer.parseInt(percent);
                         // model.addRow(new Object[] {"AR001",rs.getFloat(1),1});
                          
                          for(int i=0;i<10;i++){
                             result[i]=rs.getFloat(j);
                             j++;
                          }
                   if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals(">"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]>per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR021",result[i],3});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR022",result[i],3});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR023",result[i],3});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR024",result[i],3});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR025",result[i],3});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR026",result[i],3});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR027",result[i],3});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR028",result[i],3});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR029",result[i],3});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR030",result[i],3});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
            }
                   else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equals("<"))
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]<per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR021",result[i],3});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR022",result[i],3});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR023",result[i],3});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR024",result[i],3});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR025",result[i],3});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR026",result[i],3});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR027",result[i],3});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR028",result[i],3});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR029",result[i],3});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR030",result[i],3});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
            }
                   else
                   {
                          for(int i=0;i<10;i++)
                          {
                           if(result[i]==per)
                              {
                                  switch(i)
                                  {
                                      case 0:   model.addRow(new Object[] {"AR021",result[i],3});
                                                break;
                                      case 1:   model.addRow(new Object[] {"AR022",result[i],3});
                                                break;
                                      case 2:   model.addRow(new Object[] {"AR023",result[i],3});
                                                break;
                                      case 3:   model.addRow(new Object[] {"AR024",result[i],3});
                                                break;
                                      case 4:   model.addRow(new Object[] {"AR025",result[i],3});
                                                break;
                                      case 5:   model.addRow(new Object[] {"AR026",result[i],3});
                                                break;
                                      case 6:   model.addRow(new Object[] {"AR027",result[i],3});
                                                break;
                                      case 7:   model.addRow(new Object[] {"AR028",result[i],3});
                                                break;
                                      case 8:   model.addRow(new Object[] {"AR029",result[i],3});
                                                break;
                                      case 9:   model.addRow(new Object[] {"AR030",result[i],3});
                                                break;
                                       
                                  }
                                
                              }
                       
                          }
                   }
            }
            

     if(jTable1.getRowCount()==0)
          JOptionPane.showMessageDialog(null,"No records available");
        conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        float avg=0f;
        
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs;
        if(jRadioButton1.isSelected()==true)
        {
            String selected=jComboBox4.getItemAt(jComboBox4.getSelectedIndex());
            if(selected.equals("SEC 1"))
            {
                
                rs=stmt.executeQuery("select (avg(AR001)+avg(AR002)+avg(AR003)+avg(AR004)+avg(AR005)+avg(AR006)+avg(AR007)+avg(AR008)+avg(AR009)+avg(AR010))*10 from sec1");
                rs.absolute(1);
                jTextField2.setText(Float.toString(rs.getFloat(1))+" %");
              
            }
            else if(selected.equals("SEC 2"))
            {
              
               rs=stmt.executeQuery("select (avg(AR011)+avg(AR012)+avg(AR013)+avg(AR014)+avg(AR015)+avg(AR016)+avg(AR017)+avg(AR018)+avg(AR019)+avg(AR020))*10 from sec2");
                rs.absolute(1);
                jTextField2.setText(Float.toString(rs.getFloat(1))+" %");
             
            }
            else if(selected.equals("SEC 3"))
            {
             rs=stmt.executeQuery("select (avg(AR021)+avg(AR022)+avg(AR023)+avg(AR024)+avg(AR025)+avg(AR026)+avg(AR027)+avg(AR028)+avg(AR029)+avg(AR030))*10 from sec3");
                rs.absolute(1);
                jTextField2.setText(Float.toString(rs.getFloat(1))+" %");
            }
            else
            {
               rs=stmt.executeQuery("select (avg(AR001)+avg(AR002)+avg(AR003)+avg(AR004)+avg(AR005)+avg(AR006)+avg(AR007)+avg(AR008)+avg(AR009)+avg(AR010))*10 from sec1");
                 rs.absolute(1);
                 avg=avg+rs.getFloat(1);
                 rs=stmt.executeQuery("select (avg(AR011)+avg(AR012)+avg(AR013)+avg(AR014)+avg(AR015)+avg(AR016)+avg(AR017)+avg(AR018)+avg(AR019)+avg(AR020))*10 from sec2");
                 rs.absolute(1);
                 avg=avg+rs.getFloat(1);   
                 rs=stmt.executeQuery("select (avg(AR021)+avg(AR022)+avg(AR023)+avg(AR024)+avg(AR025)+avg(AR026)+avg(AR027)+avg(AR028)+avg(AR029)+avg(AR030))*10 from sec3");
                     rs.absolute(1);
                 avg=avg+rs.getFloat(1);
                jTextField2.setText(Float.toString(avg/3)+" %");
            }
        }
        else
        {
            String enroll=jTextField1.getText();
  
            switch (enroll) {
                case "AR001":  
                                rs=stmt.executeQuery("select sum(AR001)/(count(*)-1)*100 from sec1");
                                break;
                case "AR002":   rs=stmt.executeQuery("select sum(AR002)/(count(*)-1)*100 from sec1");
                                break;
                case "AR003":   rs=stmt.executeQuery("select sum(AR003)/(count(*)-1)*100 from sec1");
                                break;
                case "AR004":   rs=stmt.executeQuery("select sum(AR004)/(count(*)-1)*100 from sec1");
                                break;
                case "AR005"    :rs=stmt.executeQuery("select sum(AR005)/(count(*)-1)*100 from sec1");
                                break;
                case "AR006":   rs=stmt.executeQuery("select sum(AR006)/(count(*)-1)*100 from sec1");
                                break;
                case "AR007":   rs=stmt.executeQuery("select sum(AR007)/(count(*)-1)*100 from sec1");
                                break;
                case "AR008":   rs=stmt.executeQuery("select sum(AR008)/(count(*)-1)*100 from sec1");
                                break;
                case "AR009":   rs=stmt.executeQuery("select sum(AR009)/(count(*)-1)*100 from sec1");
                                break;
                case "AR010":   rs=stmt.executeQuery("select sum(AR010)/(count(*)-1)*100 from sec1");
                                break;
                case "AR011":   rs=stmt.executeQuery("select sum(AR011)/(count(*)-1)*100 from sec2");
                                break;
                case "AR012":   rs=stmt.executeQuery("select sum(AR012)/(count(*)-1)*100 from sec2");
                                break;
                case "AR013":   rs=stmt.executeQuery("select sum(AR013)/(count(*)-1)*100 from sec2");
                                break;
                case "AR014":   rs=stmt.executeQuery("select sum(AR014)/(count(*)-1)*100 from sec2");
                                break;
                case "AR015":   rs=stmt.executeQuery("select sum(AR015)/(count(*)-1)*100 from sec2");
                                break;
                case "AR016":   rs=stmt.executeQuery("select sum(AR016)/(count(*)-1)*100 from sec2");
                                break;
                case "AR017":   rs=stmt.executeQuery("select sum(AR017)/(count(*)-1)*100 from sec2");
                                break;
                case "AR018":   rs=stmt.executeQuery("select sum(AR018)/(count(*)-1)*100 from sec2");
                                break;
                case "AR019":   rs=stmt.executeQuery("select sum(AR019)/(count(*)-1)*100 from sec2");
                                break;
                case "AR020":   rs=stmt.executeQuery("select sum(AR020)/(count(*)-1)*100 from sec2");
                                break;
                case "AR021":   rs=stmt.executeQuery("select sum(AR021)/(count(*)-1)*100 from sec3");
                                break;
                case "AR022":   rs=stmt.executeQuery("select sum(AR022)/(count(*)-1)*100 from sec3");
                                break;
                case "AR023":   rs=stmt.executeQuery("select sum(AR023)/(count(*)-1)*100 from sec3");
                                break;
                case "AR024":   rs=stmt.executeQuery("select sum(AR024)/(count(*)-1)*100 from sec3");
                                break;
                case "AR025":   rs=stmt.executeQuery("select sum(AR025)/(count(*)-1)*100 from sec3");
                                break;                 
                case "AR026":   rs=stmt.executeQuery("select sum(AR026)/(count(*)-1)*100 from sec3");
                                 break;                 
                case "AR027":   rs=stmt.executeQuery("select sum(AR027)/(count(*)-1)*100 from sec3");
                                  break;                 
                case "AR028":   rs=stmt.executeQuery("select sum(AR028)/(count(*)-1)*100 from sec3");
                                break;                 
                case "AR029":   rs=stmt.executeQuery("select sum(AR029)/(count(*)-1)*100 from sec3");
                                break;                 
                case "AR030":   rs=stmt.executeQuery("select sum(AR030)/(count(*)-1)*100 from sec3");
                                break;      
                default: 
                            jTextField2.setText("ENTER VALID ENROLLMENT NUMBER...");
                            rs=stmt.executeQuery("");
                            break;
            }

            rs.absolute(1);
            jTextField2.setText(Float.toString(rs.getFloat(1))+" %");
        }
    
        conn.close();
        }
        catch(SQLException e){
            System.out.println(e);          
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setVisible(false);
        jComboBox4.setVisible(true);
          jLabel5.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jComboBox4.setVisible(false);
        jTextField1.setVisible(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        User ob=new User();ob.setBounds(200,0,1500,1000);
        ob.setTitle("Attendance Repository");
        ob.setBounds(200,0,1500,1000);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        setVisible(false);
        Stats ob=new Stats();
        ob.setTitle("Attendance Repository");
        ob.setBounds(200,0,1500,1000);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        boolean compelete=jTable1.print();
        }
        catch(PrinterException e){
            System.out.println(e);
        }
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
