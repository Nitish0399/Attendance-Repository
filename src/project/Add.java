/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author paida
 */
public class Add extends javax.swing.JFrame {

  Connection conn;
    public Add() {
        initComponents();
        try{
        Class.forName("com.mysql.jdbc.Driver");  
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","sai.1919");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         icon.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sec1sp = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        sec2sp = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        sec3sp = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        lect = new javax.swing.JTextField();
        lecno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 850, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATTENDANCE");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Section:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Lecture number:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("Enrollment numbers:");

        sec1sp.setBorder(null);
        sec1sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sec1sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sec1sp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sec1sp.setPreferredSize(new java.awt.Dimension(150, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setText("AR001");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox3.setText("AR002");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox4.setText("AR003");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox5.setText("AR004");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox6.setText("AR005");

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox7.setText("AR006");

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox8.setText("AR007");

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox9.setText("AR008");

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox10.setText("AR009");

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox11.setText("AR010");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sec1sp.setViewportView(jPanel2);

        sec2sp.setBackground(new java.awt.Color(255, 255, 255));
        sec2sp.setBorder(null);
        sec2sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sec2sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sec2sp.setPreferredSize(new java.awt.Dimension(150, 320));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox2.setText("AR011");

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox12.setText("AR012");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox13.setText("AR013");

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox14.setText("AR014");

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox15.setText("AR015");

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox16.setText("AR016");

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox17.setText("AR017");

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox18.setText("AR018");

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox19.setText("AR019");

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox20.setText("AR020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sec2sp.setViewportView(jPanel1);

        sec3sp.setBorder(null);
        sec3sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sec3sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sec3sp.setPreferredSize(new java.awt.Dimension(150, 320));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox21.setText("AR021");

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox22.setText("AR022");

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox23.setText("AR023");

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox24.setText("AR024");

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox25.setText("AR025");

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox26.setText("AR026");

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox27.setText("AR027");

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox28.setText("AR028");

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox29.setText("AR029");

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox30.setText("AR030");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox30))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBox21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox30)
                .addGap(0, 121, Short.MAX_VALUE))
        );

        sec3sp.setViewportView(jPanel3);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButton5.setText("SEC 1");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButton6.setText("SEC 2");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButton7.setText("SEC 3");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 20)); // NOI18N
        jLabel8.setText("{Lectures finished:");

        lect.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lect.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lecno.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        lecno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lecno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecnoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 20)); // NOI18N
        jLabel9.setText("}");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/tick.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(65, 65, 65)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sec1sp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lect, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lecno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(sec2sp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(sec3sp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(95, 95, 95))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton5)
                .addGap(154, 154, 154)
                .addComponent(jRadioButton6)
                .addGap(157, 157, 157)
                .addComponent(jRadioButton7)
                .addGap(128, 128, 128))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton5))))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lecno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(sec1sp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(sec2sp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(sec3sp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1326, 1326, 1326)
                                .addComponent(jButton2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1201, 1201, 1201)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(577, 577, 577)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 533, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(799, 799, 799))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        sec2sp.setEnabled(false);
        sec3sp.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jCheckBox13.setEnabled(false);
        jCheckBox14.setEnabled(false);
        jCheckBox15.setEnabled(false);
        jCheckBox16.setEnabled(false);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(false);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(false);
        jCheckBox25.setEnabled(false);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(false);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
        jCheckBox1.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        
     try{
         Statement stmt=conn.createStatement();
               ResultSet rs= stmt.executeQuery("select lecture from sec1");
               rs.last();
                lecno.setText(String.valueOf(rs.getInt(1)));
     }
      catch(Exception e)
        {
            System.out.println(e);
        }
     
               
      
         
        
    
        
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
            sec3sp.setEnabled(false);
            sec1sp.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(false);
        jCheckBox25.setEnabled(false);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(false);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
         jCheckBox2.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(true);
        jCheckBox18.setEnabled(true);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(true);
         try{
         Statement stmt=conn.createStatement();
               ResultSet rs= stmt.executeQuery("select lecture from sec2");
               rs.last();
                lecno.setText(String.valueOf(rs.getInt(1)));
     }
      catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
            sec1sp.setEnabled(false);
            sec2sp.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jCheckBox13.setEnabled(false);
        jCheckBox14.setEnabled(false);
        jCheckBox15.setEnabled(false);
        jCheckBox16.setEnabled(false);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(false);
        jCheckBox20.setEnabled(false);
         jCheckBox21.setEnabled(true);
        jCheckBox22.setEnabled(true);
        jCheckBox23.setEnabled(true);
        jCheckBox24.setEnabled(true);
        jCheckBox25.setEnabled(true);
        jCheckBox26.setEnabled(true);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(true);
        jCheckBox29.setEnabled(true);
        jCheckBox30.setEnabled(true);
         try{
         Statement stmt=conn.createStatement();
               ResultSet rs= stmt.executeQuery("select lecture from sec3");
               rs.last();
                lecno.setText(String.valueOf(rs.getInt(1)));
     }
      catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        User ob=new User();
        ob.setTitle("Attendance Repository");
        ob.setBounds(200,0,1500,1000);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int [] pre=new int[10];
        
      try{
               if(jRadioButton5.isSelected()==true)
        {

                pre[0]=(jCheckBox1.isSelected())? 1:0;
                pre[1]=(jCheckBox3.isSelected())? 1:0;
                pre[2]=(jCheckBox4.isSelected())? 1:0;
                pre[3]=(jCheckBox5.isSelected())? 1:0;
                pre[4]=(jCheckBox6.isSelected())? 1:0;
                pre[5]=(jCheckBox7.isSelected())? 1:0;
                pre[6]=(jCheckBox8.isSelected())? 1:0;
                pre[7]=(jCheckBox9.isSelected())? 1:0;
                pre[8]=(jCheckBox10.isSelected())? 1:0;
                pre[9]=(jCheckBox11.isSelected())? 1:0;
               
               
PreparedStatement st=conn.prepareStatement("insert into sec1 (lecture,AR001,AR002,AR003,AR004,AR005,AR006,AR007,AR008,AR009,AR010)values(?,?,?,?,?,?,?,?,?,?,?)");
                
                st.setInt(1,Integer.parseInt(lect.getText()));
                st.setInt(2,pre[0]);
                st.setInt(3,pre[1]);
                st.setInt(4,pre[2]);
                st.setInt(5,pre[3]);
                st.setInt(6,pre[4]);
                st.setInt(7,pre[5]);
                st.setInt(8,pre[6]);
                st.setInt(9,pre[7]);
                st.setInt(10,pre[8]);
                st.setInt(11,pre[9]);
                
             
               int n= st.executeUpdate();

        }
               else if(jRadioButton6.isSelected()==true)
        {

                pre[0]=(jCheckBox2.isSelected())? 1:0;
                pre[1]=(jCheckBox12.isSelected())? 1:0;
                pre[2]=(jCheckBox13.isSelected())? 1:0;
                pre[3]=(jCheckBox14.isSelected())? 1:0;
                pre[4]=(jCheckBox15.isSelected())? 1:0;
                pre[5]=(jCheckBox16.isSelected())? 1:0;
                pre[6]=(jCheckBox17.isSelected())? 1:0;
                pre[7]=(jCheckBox18.isSelected())? 1:0;
                pre[8]=(jCheckBox19.isSelected())? 1:0;
                pre[9]=(jCheckBox20.isSelected())? 1:0;

PreparedStatement st=conn.prepareStatement("insert into sec2 (lecture,AR011,AR012,AR013,AR014,AR015,AR016,AR017,AR018,AR019,AR020)values(?,?,?,?,?,?,?,?,?,?,?)");
                
                st.setInt(1,Integer.parseInt(lect.getText()));
                st.setInt(2,pre[0]);
                st.setInt(3,pre[1]);
                st.setInt(4,pre[2]);
                st.setInt(5,pre[3]);
                st.setInt(6,pre[4]);
                st.setInt(7,pre[5]);
                st.setInt(8,pre[6]);
                st.setInt(9,pre[7]);
                st.setInt(10,pre[8]);
                st.setInt(11,pre[9]);
                
               
               int n= st.executeUpdate();

        }
                  else
        {

                pre[0]=(jCheckBox21.isSelected())? 1:0;
                pre[1]=(jCheckBox22.isSelected())? 1:0;
                pre[2]=(jCheckBox23.isSelected())? 1:0;
                pre[3]=(jCheckBox24.isSelected())? 1:0;
                pre[4]=(jCheckBox25.isSelected())? 1:0;
                pre[5]=(jCheckBox26.isSelected())? 1:0;
                pre[6]=(jCheckBox27.isSelected())? 1:0;
                pre[7]=(jCheckBox28.isSelected())? 1:0;
                pre[8]=(jCheckBox29.isSelected())? 1:0;
                pre[9]=(jCheckBox30.isSelected())? 1:0;

PreparedStatement st=conn.prepareStatement("insert into sec3 (lecture,AR021,AR022,AR023,AR024,AR025,AR026,AR027,AR028,AR029,AR030)values(?,?,?,?,?,?,?,?,?,?,?)");
                
                st.setInt(1,Integer.parseInt(lect.getText()));
                st.setInt(2,pre[0]);
                st.setInt(3,pre[1]);
                st.setInt(4,pre[2]);
                st.setInt(5,pre[3]);
                st.setInt(6,pre[4]);
                st.setInt(7,pre[5]);
                st.setInt(8,pre[6]);
                st.setInt(9,pre[7]);
                st.setInt(10,pre[8]);
                st.setInt(11,pre[9]);
                
              
               int n= st.executeUpdate();

        }
               conn.close();
            }
                catch(Exception e)
        {
            System.out.println(e);
        }
      if(lect.getText().trim().length()==0 || lecno.getText().trim().length()==0)
      {
          JOptionPane.showMessageDialog(null,"Enter details");
      }
      else
          icon.setVisible(true);
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void lecnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecnoActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField lecno;
    private javax.swing.JTextField lect;
    private javax.swing.JScrollPane sec1sp;
    private javax.swing.JScrollPane sec2sp;
    private javax.swing.JScrollPane sec3sp;
    // End of variables declaration//GEN-END:variables
}
