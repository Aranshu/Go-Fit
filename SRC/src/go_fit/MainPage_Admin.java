/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package go_fit;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class MainPage_Admin extends javax.swing.JFrame {

    /**
     * Creates new form MainPage_Admin
     */
    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Main_Logo.jpg"));   

    public void switchPanel(JPanel panel)
	{
		jLayeredPane2.removeAll();
		jLayeredPane2.add(panel);
		jLayeredPane2.repaint();
		jLayeredPane2.revalidate();
	}
    
    public void switchPanels(JPanel panel)
	{
		jLayeredPane1.removeAll();
		jLayeredPane1.add(panel);
		jLayeredPane1.repaint();
		jLayeredPane1.revalidate();
	}
    
     Connection con;
	PreparedStatement ps;
	ResultSet rs;
    public MainPage_Admin() {
        initComponents();
        displayfield();
         display();
    }
    
    private void total()
   {
         PreparedStatement ps1;
        ResultSet rs1;
    try
    {                   
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
            System.out.println("Connection Established...");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
             ps1 = con.prepareStatement("");
            String AdminQuery="Select sum(amount) from customer_fees_details";
            rs1= ps1.executeQuery(AdminQuery);
            rs1.next();
            jTextField36.setText(rs1.getString(1));
            
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
   }
    
     private void total_order()
   {
         PreparedStatement ps1;
        ResultSet rs1;
    try
    {                   
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
            System.out.println("Connection Established...");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
             ps1 = con.prepareStatement("");
            String AdminQuery="Select sum(amount) from order_payment";
            rs1= ps1.executeQuery(AdminQuery);
            rs1.next();
            jTextField37.setText(rs1.getString(1));
            
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
   }
    
    private void display()
    {
        PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from equipment ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }
private void displayfield()
{
     PreparedStatement ps1;
	ResultSet rs1;
       
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                        
                                        String AdminQuery="Select * from admin where username= '"+LoginPage_Admin.s+"'";
                                         ps1 = con.prepareStatement(AdminQuery);
                                       rs1= ps1.executeQuery();
                                       while(rs1.next())
                                       {
                                            jTextField22.setText(rs1.getString("username"));
                                             jTextField24.setText(rs1.getString("first_name"));
                                               jTextField25.setText(rs1.getString("last_name"));
                                                 jTextField30.setText(rs1.getString("gender"));
                                                   jTextField26.setText(rs1.getString("date_of_birth"));
                                                     jTextField27.setText(rs1.getString("age"));
                                                       jTextField34.setText(rs1.getString("phone_number"));
                                                       jTextField28.setText(rs1.getString("aadhar_number"));
                                                         jTextField29.setText(rs1.getString("address"));
                                       }
                                      
                                     
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jTextField41 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField21 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jTextField31 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Go Fit");
        setIconImage(icon);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 600));

        jButton3.setText("User Acc Activation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Change Password");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Change Credientials");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Feedback Got");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Trainer Information");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Equipments");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setText("Trainer Allotment");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton30.setText("User Information");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton17.setText("User Payment Detail");
        jButton17.setToolTipText("");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton41.setText("Fees Recipt");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton34.setText("Order Recived ");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("Order Payment Detail");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton8)
                .addGap(2, 2, 2)
                .addComponent(jButton30)
                .addGap(2, 2, 2)
                .addComponent(jButton17)
                .addGap(2, 2, 2)
                .addComponent(jButton3)
                .addGap(2, 2, 2)
                .addComponent(jButton35)
                .addGap(2, 2, 2)
                .addComponent(jButton34)
                .addGap(2, 2, 2)
                .addComponent(jButton7)
                .addGap(2, 2, 2)
                .addComponent(jButton12)
                .addGap(2, 2, 2)
                .addComponent(jButton41)
                .addGap(2, 2, 2)
                .addComponent(jButton6)
                .addGap(2, 2, 2)
                .addComponent(jButton5)
                .addGap(2, 2, 2)
                .addComponent(jButton4)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jLayeredPane2.setBackground(new java.awt.Color(102, 102, 255));
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(310, 510));
        jLayeredPane2.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(51, 102, 255));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Admin");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("First Name");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Username");

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(51, 102, 255));
        jTextField22.setForeground(new java.awt.Color(255, 255, 255));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(51, 102, 255));
        jTextField24.setForeground(new java.awt.Color(255, 255, 255));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Last Name");

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(51, 102, 255));
        jTextField25.setForeground(new java.awt.Color(255, 255, 255));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Date of Birth");

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(51, 102, 255));
        jTextField26.setForeground(new java.awt.Color(255, 255, 255));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Gender");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Age");

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(51, 102, 255));
        jTextField27.setForeground(new java.awt.Color(255, 255, 255));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Aadhar Number");

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(51, 102, 255));
        jTextField28.setForeground(new java.awt.Color(255, 255, 255));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Address");

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(51, 102, 255));
        jTextField29.setForeground(new java.awt.Color(255, 255, 255));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(51, 102, 255));
        jTextField30.setForeground(new java.awt.Color(255, 255, 255));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Phone Number");

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(51, 102, 255));
        jTextField34.setForeground(new java.awt.Color(255, 255, 255));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField29))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField24)
                            .addComponent(jTextField22)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel7, "card2");

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone Number");

        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(51, 102, 255));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last Name");

        jTextField3.setBackground(new java.awt.Color(51, 102, 255));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Date of Birth");

        jTextField4.setBackground(new java.awt.Color(51, 102, 255));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Age");

        jTextField5.setBackground(new java.awt.Color(51, 102, 255));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Aadhar Number");

        jTextField6.setBackground(new java.awt.Color(51, 102, 255));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Address");

        jTextField7.setBackground(new java.awt.Color(51, 102, 255));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Submit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(51, 102, 255));
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(51, 102, 255));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Logout");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 91, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel4, "card2");

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Trainer");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("First Name");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Username");

        jTextField8.setBackground(new java.awt.Color(51, 102, 255));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(51, 102, 255));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Last Name");

        jTextField11.setBackground(new java.awt.Color(51, 102, 255));
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Date of Birth");

        jTextField12.setBackground(new java.awt.Color(51, 102, 255));
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Gender");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Age");

        jTextField13.setBackground(new java.awt.Color(51, 102, 255));
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Aadhar Number");

        jTextField14.setBackground(new java.awt.Color(51, 102, 255));
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Address");

        jTextField15.setBackground(new java.awt.Color(51, 102, 255));
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 102, 255));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextField16.setBackground(new java.awt.Color(51, 102, 255));
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 102, 255));
        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Done");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Phone Number");

        jTextField35.setBackground(new java.awt.Color(51, 102, 255));
        jTextField35.setForeground(new java.awt.Color(255, 255, 255));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField16))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField8))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLayeredPane2.add(jPanel5, "card2");

        jPanel36.setBackground(new java.awt.Color(51, 102, 255));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Fees Receipt");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Name");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Email");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Phone Number");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Amount");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Choose Plan");

        jTextField38.setBackground(new java.awt.Color(51, 102, 255));
        jTextField38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(255, 255, 255));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField39.setEditable(false);
        jTextField39.setBackground(new java.awt.Color(51, 102, 255));
        jTextField39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(255, 255, 255));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField42.setBackground(new java.awt.Color(51, 102, 255));
        jTextField42.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(255, 255, 255));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField43.setBackground(new java.awt.Color(51, 102, 255));
        jTextField43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(255, 255, 255));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton38.setText("Generate Recipt");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton40.setText("Print Recipt");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(51, 102, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Your Plan", "Basic Plan (1 month)", "Brown Plan (3 month)", "Silver Plan (9 month)", "Gold Plan (12 month + 1 month free)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField38)
                            .addComponent(jTextField39)
                            .addComponent(jTextField42)
                            .addComponent(jTextField43)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 83, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField38, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton38)
                .addGap(18, 18, 18)
                .addComponent(jButton40)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel36, "card5");

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 320, 600));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel39.setText("Name");

        jButton20.setText("Refresh");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Edit");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21)
                .addGap(15, 15, 15)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton20)
                        .addComponent(jButton21)
                        .addComponent(jTextField17)
                        .addComponent(jButton10)))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Equipment");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(jPanel3, "card2");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Cutomer Information");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jTable9.setAutoCreateRowSorter(true);
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane9.setViewportView(jTable9);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel11, "card8");

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Customer Payment Detail");

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(jTable12);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel51.setText("Total");

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel18, "card10");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jButton23.setText("Refresh");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel20.setText("Fees ");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton31.setText("Edit");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton33.setText("Delete");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addComponent(jButton33)
                .addGap(2, 2, 2)
                .addComponent(jButton31)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(jButton31)
                    .addComponent(jButton33))
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Customer Detail");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Customer Fees Detail");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(jPanel2, "card4");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Order Payment Detail");

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(jTable13);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel59.setText("Total");

        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel22, "card13");

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Order Recived");

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(jTable14);

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Update Status :");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel62.setText("Email");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel63.setText("Status");

        jButton36.setText("Update");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton36)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton36)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel37, "card12");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jButton14.setText("Add");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton18.setText("Delete");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton22.setText("Refresh");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton11.setText("Edit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jLabel22.setText("Username");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton18)
                    .addComponent(jButton22)
                    .addComponent(jButton11)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Trainer Detail");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(jPanel6, "card3");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Customer Trainer Detail");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jButton25.setText("Refresh");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("Edit");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("Add");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel42.setText("Username");

        jButton24.setText("Delete");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton25)
                        .addComponent(jButton26)
                        .addComponent(jButton27))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton24)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(jPanel27, "card7");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Customer");

        jLabel21.setText("Trainer");

        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField20KeyPressed(evt);
            }
        });

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField23KeyPressed(evt);
            }
        });

        jButton13.setText("Enter");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton13KeyPressed(evt);
            }
        });

        jButton29.setText("Back");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jButton29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton29KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jButton29))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Customer");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Trainer");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(jPanel15, "card6");

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setText("Customer");

        jLabel45.setText("Trainer");

        jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField32KeyPressed(evt);
            }
        });

        jTextField33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField33KeyPressed(evt);
            }
        });

        jButton32.setText("Enter");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jButton32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton32KeyPressed(evt);
            }
        });

        jButton28.setText("Back");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jButton28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton28KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton32)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton32)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField33)
                            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addComponent(jButton28))
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Customer");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Trainer");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(jPanel26, "card6");

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane14.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel32, "card11");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Feedback");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel13, "card5");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 530, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
        
       switchPanels(jPanel2);
       switchPanel(jPanel7);
        PreparedStatement ps1;
	ResultSet rs1;
        PreparedStatement ps2;
	ResultSet rs2;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select username from customer_fees_details ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable3.setModel(DbUtils.resultSetToTableModel(rs1));
                                       ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer_fees ";
                                       rs2= ps2.executeQuery(AdminQuery1);
                                       jTable4.setModel(DbUtils.resultSetToTableModel(rs2));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
Audio.playmusic("Music\\\\Button.wav");     // TODO add your handling code here:

	PreparedStatement ps1;
	ResultSet rs1;
         try
				{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
           
                                             if(jTextField1.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set phone_number ='"+jTextField1 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                            }
                                            if(jTextField2.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set first_name ='"+jTextField2 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                            }
                                            if(jTextField3.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set last_name ='"+jTextField3 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                             }
                                            if(jTextField9.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set gender ='"+jTextField9 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                             }
                                            if(jTextField4.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set date_of_birth ='"+jTextField4 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                             }
                                             if(jTextField5.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set age ='"+jTextField5 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                             }
                                              if(jTextField6.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set aadhar_number ='"+jTextField6 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                             }
                                               if(jTextField7.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update admin set address ='"+jTextField7 .getText()+"' where  username='"+LoginPage_Admin.s+"'");
                                                ps.executeUpdate();
                                            } 
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                            
                                            displayfield();
                                            switchPanel(jPanel7);
                                            
                                        }
                                
                                    
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
Audio.playmusic("Music\\\\Button.wav");         // TODO add your handling code here:
Audio.playmusic("Music\\\\Logof_Successfull.wav");   
        new LoginPage_Admin().setVisible(true);
        this.setVisible(false);      

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanel(jPanel7);
        new LoginPage_ChangePassword_Admin().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
         switchPanel(jPanel4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");
        switchPanels(jPanel3);
        switchPanel(jPanel7);
         PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from equipment ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
         switchPanels(jPanel6);
         switchPanel(jPanel7);
          PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select username, first_name, last_name, phone_number, date_of_birth, age, aadhar_number, gender, address from trainer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable5.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
switchPanel(jPanel7);
    PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable8.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
    switchPanels(jPanel13);
    switchPanel(jPanel7);
     PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from feedback ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
        

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
 PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from  customer where username='"+jTextField18.getText()+"'";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       if(rs1.next())
                                       {
                                        if(jTextField18.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField19.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
		else
                                           {
                                             ps = con.prepareStatement("insert into customer_fees values ('"+jTextField18.getText()+"','"+jTextField19.getText()+"')");
                                              ps.executeUpdate(); 
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                           }
                                       }
                                       else
                                       {
                                                Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_incorrect().setVisible(true); 
                                       }
                                }
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                                        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
 PreparedStatement ps1;
	ResultSet rs1;
   try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from equipment where name='"+jTextField17.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                        
                                        if(!rs1.next())
                                        {
                                              Audio.playmusic("Music\\\\Error.wav");
                                               new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else
                                        {
                                            ps = con.prepareStatement("delete from equipment where name='"+jTextField17.getText()+"'");
                                            ps.executeUpdate(); 
                                              Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                        }
}
    catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
    switchPanel(jPanel5);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       // TODO add your handling code here:
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
         PreparedStatement ps3;
	ResultSet rs3;
try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                        ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField20.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                           
                                          ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer where username='"+jTextField20.getText()+"'";
		rs2= ps2.executeQuery(AdminQuery1);
                                        ps3 = con.prepareStatement("");
                                        String AdminQuery2="Select * from trainer where username='"+jTextField23.getText()+"'";
		rs3= ps3.executeQuery(AdminQuery2);
                                        
		if(!rs2.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else if(!rs3.next()) 
                                            {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);  
                                            }
                                            else if(rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                else
                                            {
                                        if(jTextField20.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField23.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
		else
                                           {
                                             ps = con.prepareStatement("insert into customer_trainer values ('"+jTextField20.getText()+"','"+jTextField23.getText()+"')");
                                              ps.executeUpdate(); 
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                            switchPanels(jPanel27);
                                           }
                                }
}
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}


    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav"); 
        new SignupPage_Trainer().setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");
        PreparedStatement ps1;
	ResultSet rs1;
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from trainer where username='"+jTextField8.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                        
		if(!rs1.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_incorrect().setVisible(true);
                                        }
		else
		{
                                              if(jTextField35.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set phone_number ='"+jTextField35 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                            }
                                            if(jTextField10.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set first_name ='"+jTextField10 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                            }
                                            if(jTextField11.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set last_name ='"+jTextField11 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                             }
                                            if(jTextField16.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set gender ='"+jTextField16 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                             }
                                            if(jTextField12.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set date_of_birth ='"+jTextField12 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                             }
                                             if(jTextField13.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set age ='"+jTextField13 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                             }
                                              if(jTextField14.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set aadhar_number ='"+jTextField14 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                             }
                                               if(jTextField15.getText().length()==0 )
                                            {
                                                    
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update trainer set address ='"+jTextField15 .getText()+"' where  username='"+jTextField8.getText()+"'");
                                                ps.executeUpdate();
                                            } 
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                              displayfield();
                                            switchPanel(jPanel7);
                                            
                                        }
                                
                                    }
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
Audio.playmusic("Music\\\\Button.wav");         // TODO add your handling code here:
        switchPanel(jPanel7);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
   try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from trainer where username='"+jTextField21.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                        
                                        if(!rs1.next())
                                        {
                                              Audio.playmusic("Music\\\\Error.wav");
                                               new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else
                                        {
                                            ps = con.prepareStatement("delete from trainer where username='"+jTextField21.getText()+"'");
                                            ps.executeUpdate(); 
                                              Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                        }
}
    catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
        new MainPage_Admin_Equipment_Add().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
 PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from equipment ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
              new MainPage_Admin_Equipment_Edit().setVisible(true);
         
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         Audio.playmusic("Music\\\\Button.wav");   
         PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from trainer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable5.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel15);
         PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select username from customer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable6.setModel(DbUtils.resultSetToTableModel(rs1));
                                        ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select username from trainer  ";
                                       rs2= ps2.executeQuery(AdminQuery1);
                                       jTable7.setModel(DbUtils.resultSetToTableModel(rs2));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel26);
  PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable10.setModel(DbUtils.resultSetToTableModel(rs1));
                                        ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select username from trainer  ";
                                       rs2= ps2.executeQuery(AdminQuery1);
                                       jTable11.setModel(DbUtils.resultSetToTableModel(rs2));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
       Audio.playmusic("Music\\\\Button.wav");
        PreparedStatement ps1;
	ResultSet rs1;
        PreparedStatement ps2;
	ResultSet rs2;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select username from customer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable3.setModel(DbUtils.resultSetToTableModel(rs1));
                                       ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer_fees ";
                                       rs2= ps2.executeQuery(AdminQuery1);
                                       jTable4.setModel(DbUtils.resultSetToTableModel(rs2));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
         Audio.playmusic("Music\\\\Button.wav");
           PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable8.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
         Audio.playmusic("Music\\\\Button.wav");
         switchPanels(jPanel11);
         switchPanel(jPanel7);
           PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select username, first_name, last_name, phone_number, date_of_birth, age, aadhar_number, gender, address from customer ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable9.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
            Audio.playmusic("Music\\\\Button.wav");  
          PreparedStatement ps1;
	ResultSet rs1;
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_fees where username='"+jTextField18.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                        
		if(!rs1.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_incorrect().setVisible(true);
                                        }
                                       
                                        else
                                          {
                                        if(jTextField19.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update customer_fees set fees ='"+jTextField19 .getText()+"' where  username='"+jTextField18 .getText()+"'");
                                                ps.executeUpdate();
                                            }
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                            
                                        
                                          }
                                    }
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
 PreparedStatement ps1;
	ResultSet rs1;
   try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField31.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                        
                                        if(!rs1.next())
                                        {
                                              Audio.playmusic("Music\\\\Error.wav");
                                               new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else
                                        {
                                            ps = con.prepareStatement("delete from customer_trainer where username_customer='"+jTextField31.getText()+"'");
                                            ps.executeUpdate(); 
                                              Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                        }
}
    catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
             Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
       
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField32.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                            if(!rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                                            
                                     
                                       
                                        else
                                          {
                                        if(jTextField33.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update customer_trainer set  usename_trainer ='"+jTextField33 .getText()+"' where username_customer='"+jTextField32 .getText()+"'");
                                                ps.executeUpdate();
                                            }  
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                                switchPanels(jPanel27);
                                            
                                               }
                                        }
                                          
                                    
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
        
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
 PreparedStatement ps1;
	ResultSet rs1;
   try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from  customer_fees where username='"+jTextField18.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                        
                                        if(!rs1.next())
                                        {
                                              Audio.playmusic("Music\\\\Error.wav");
                                               new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else
                                        {
                                            ps = con.prepareStatement("delete from customer_fees where username='"+jTextField18.getText()+"'");
                                            ps.executeUpdate(); 
                                              Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                        }
}
    catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                        Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
       
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField32.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                            if(!rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                                            
                                     
                                       
                                        else
                                          {
                                        if(jTextField33.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update customer_trainer set  usename_trainer ='"+jTextField33 .getText()+"' where username_customer='"+jTextField32 .getText()+"'");
                                                ps.executeUpdate();
                                            }  
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                                switchPanels(jPanel27);
                                            
                                               }
                                        }
                                          
                                    
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }           // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32KeyPressed

    private void jTextField33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField33KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                        Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
       
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField32.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                            if(!rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                                            
                                     
                                       
                                        else
                                          {
                                        if(jTextField33.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update customer_trainer set  usename_trainer ='"+jTextField33 .getText()+"' where username_customer='"+jTextField32 .getText()+"'");
                                                ps.executeUpdate();
                                            }  
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                                switchPanels(jPanel27);
                                            
                                               }
                                        }
                                          
                                    
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }           // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33KeyPressed

    private void jButton32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton32KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                        Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
       
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField32.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                            if(!rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                                            
                                     
                                       
                                        else
                                          {
                                        if(jTextField33.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update customer_trainer set  usename_trainer ='"+jTextField33 .getText()+"' where username_customer='"+jTextField32 .getText()+"'");
                                                ps.executeUpdate();
                                            }  
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                                switchPanels(jPanel27);
                                            
                                               }
                                        }
                                          
                                    
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }     
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {        // TODO add your handling code here:
                         Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
                }
    }//GEN-LAST:event_jButton32KeyPressed

    private void jButton28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton28KeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                        Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
       
         try
{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                       ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField32.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                            if(!rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                                            
                                     
                                       
                                        else
                                          {
                                        if(jTextField33.getText().length()==0 )
                                            {
						
                                            }
                                            else
                                            {
                                                ps = con.prepareStatement("update customer_trainer set  usename_trainer ='"+jTextField33 .getText()+"' where username_customer='"+jTextField32 .getText()+"'");
                                                ps.executeUpdate();
                                            }  
                                               Audio.playmusic("Music\\\\Successfull.wav");
                                                new successfull().setVisible(true);
                                                switchPanels(jPanel27);
                                            
                                               }
                                        }
                                          
                                    
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }     
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {        // TODO add your handling code here:
                         Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
                }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28KeyPressed

    private void jButton29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton29KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
         PreparedStatement ps3;
	ResultSet rs3;
try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                        ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField20.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                           
                                          ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer where username='"+jTextField20.getText()+"'";
		rs2= ps2.executeQuery(AdminQuery1);
                                        ps3 = con.prepareStatement("");
                                        String AdminQuery2="Select * from trainer where username='"+jTextField23.getText()+"'";
		rs3= ps3.executeQuery(AdminQuery2);
                                        
		if(!rs2.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else if(!rs3.next()) 
                                            {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);  
                                            }
                                            else if(rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                else
                                            {
                                        if(jTextField20.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField23.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
		else
                                           {
                                             ps = con.prepareStatement("insert into customer_trainer values ('"+jTextField20.getText()+"','"+jTextField23.getText()+"')");
                                              ps.executeUpdate(); 
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                            switchPanels(jPanel27);
                                           }
                                }
}
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }    
 if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {        // TODO add your handling code here:
                    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
                }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton29KeyPressed

    private void jButton13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton13KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
         PreparedStatement ps3;
	ResultSet rs3;
try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                        ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField20.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                           
                                          ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer where username='"+jTextField20.getText()+"'";
		rs2= ps2.executeQuery(AdminQuery1);
                                        ps3 = con.prepareStatement("");
                                        String AdminQuery2="Select * from trainer where username='"+jTextField23.getText()+"'";
		rs3= ps3.executeQuery(AdminQuery2);
                                        
		if(!rs2.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else if(!rs3.next()) 
                                            {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);  
                                            }
                                            else if(rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                else
                                            {
                                        if(jTextField20.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField23.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
		else
                                           {
                                             ps = con.prepareStatement("insert into customer_trainer values ('"+jTextField20.getText()+"','"+jTextField23.getText()+"')");
                                              ps.executeUpdate(); 
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                            switchPanels(jPanel27);
                                           }
                                }
}
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }    
 if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {        // TODO add your handling code here:
                    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
switchPanels(jPanel27);
                }   
    }//GEN-LAST:event_jButton13KeyPressed

    private void jTextField20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
         PreparedStatement ps3;
	ResultSet rs3;
try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                        ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField20.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                           
                                          ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer where username='"+jTextField20.getText()+"'";
		rs2= ps2.executeQuery(AdminQuery1);
                                        ps3 = con.prepareStatement("");
                                        String AdminQuery2="Select * from trainer where username='"+jTextField23.getText()+"'";
		rs3= ps3.executeQuery(AdminQuery2);
                                        
		if(!rs2.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else if(!rs3.next()) 
                                            {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);  
                                            }
                                            else if(rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                else
                                            {
                                        if(jTextField20.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField23.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
		else
                                           {
                                             ps = con.prepareStatement("insert into customer_trainer values ('"+jTextField20.getText()+"','"+jTextField23.getText()+"')");
                                              ps.executeUpdate(); 
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                            switchPanels(jPanel27);
                                           }
                                }
}
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }            // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20KeyPressed

    private void jTextField23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
                {        // TODO add your handling code here:
                    Audio.playmusic("Music\\\\Button.wav");        // TODO add your handling code here:
PreparedStatement ps1;
	ResultSet rs1;
         PreparedStatement ps2;
	ResultSet rs2;
         PreparedStatement ps3;
	ResultSet rs3;
try
{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
					System.out.println("Connection Established...");	
                                        ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_trainer where username_customer='"+jTextField20.getText()+"'";
		rs1= ps1.executeQuery(AdminQuery);
                                      
                                           
                                          ps2 = con.prepareStatement("");
                                        String AdminQuery1="Select * from customer where username='"+jTextField20.getText()+"'";
		rs2= ps2.executeQuery(AdminQuery1);
                                        ps3 = con.prepareStatement("");
                                        String AdminQuery2="Select * from trainer where username='"+jTextField23.getText()+"'";
		rs3= ps3.executeQuery(AdminQuery2);
                                        
		if(!rs2.next()) 
                                        {
                                            Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);
                                        }
                                            else if(!rs3.next()) 
                                            {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                new ErrorPage_incorrect().setVisible(true);  
                                            }
                                            else if(rs1.next()) 
                                                {
                                                Audio.playmusic("Music\\\\Error.wav");
                                                 new ErrorPage_incorrect().setVisible(true);
                                                }
                else
                                            {
                                        if(jTextField20.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField23.getText().isEmpty())
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
		else
                                           {
                                             ps = con.prepareStatement("insert into customer_trainer values ('"+jTextField20.getText()+"','"+jTextField23.getText()+"')");
                                              ps.executeUpdate(); 
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                            new successfull().setVisible(true);
                                            switchPanels(jPanel27);
                                           }
                                }
}
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
                }            // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23KeyPressed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
       Audio.playmusic("Music\\\\Button.wav");
         switchPanels(jPanel18);
         switchPanel(jPanel7);
           PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from customer_fees_details ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable12.setModel(DbUtils.resultSetToTableModel(rs1));
                                       total();
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");   
        switchPanel(jPanel36);
         switchPanels(jPanel32);
        
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
         Audio.playmusic("Music\\\\Button.wav");          
               try
                            {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
                                    System.out.println("Connection Established...");	
                                        if(jTextField38.getText().length()==0)
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                            new ErrorPage_DataFieldEmpty().setVisible(true);    
                                        }
                                        else if(jTextField43.getText().length()==0)
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                             new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
                                        else if(jTextField42.getText().length()==0)
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                             new ErrorPage_DataFieldEmpty().setVisible(true); 
                                        }
                                        else if(jComboBox1.getSelectedItem().toString().length()==0)
                                        {
                                             Audio.playmusic("Music\\\\Error.wav");
                                             new ErrorPage_incorrect().setVisible(true); 
                                        }
                                    else
                                    {
                                               
                                                Audio.playmusic("Music\\\\Successfull.wav");
                                                ps = con.prepareStatement("insert into customer_fees_details values ('"+jTextField38.getText()+"','"+jTextField43.getText()+"','"+jTextField42.getText()+"','"+jComboBox1.getSelectedItem().toString()+"','"+jTextField39.getText()+"','cash','offline')");
                                                ps.executeUpdate(); 
                                                jTextArea1.setText("*******************************************************\n");
        jTextArea1.setText(jTextArea1.getText()+"                                       FEES RECIPT    \n");
        jTextArea1.setText(jTextArea1.getText()+"*******************************************************\n");
        
        Date obj = new Date();
       String date = obj.toString();
       
             jTextArea1.setText( jTextArea1.getText()+"\n"+date+"\n\n");
             jTextArea1.setText(jTextArea1.getText()+"*******************************************************\n");
             jTextArea1.setText( jTextArea1.getText()+"\nName            : "+jTextField38.getText()+"\n\n");
             jTextArea1.setText( jTextArea1.getText()+"Email               : "+jTextField43.getText()+"\n\n");
             jTextArea1.setText( jTextArea1.getText()+"Phone Number : "+jTextField42.getText()+"\n\n");
             jTextArea1.setText( jTextArea1.getText()+"Choose Plan     : "+jComboBox1.getSelectedItem().toString()+"\n\n");
             jTextArea1.setText( jTextArea1.getText()+"Amount            : "+jTextField39.getText()+"\n\n");
             jTextArea1.setText( jTextArea1.getText()+"Mode               : Cash\n\n");
             jTextArea1.setText(jTextArea1.getText()+"*******************************************************\n\n");
             jTextArea1.setText(jTextArea1.getText()+"                                                                        Aranshu\n");
              jTextArea1.setText(jTextArea1.getText()+"                                                                       Signature\n");
                 
                                        }
                                }
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
        
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        try
        {
             Audio.playmusic("Music\\\\Button.wav");   
          jTextArea1.print();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String x = jComboBox1.getSelectedItem().toString();
        if(x=="Basic Plan (1 month)")
                jTextField39.setText("700");
        else if(x=="Brown Plan (3 month)")
                jTextField39.setText("1800");
        else if(x=="Silver Plan (9 month)")
                jTextField39.setText("5600");
        else if(x=="Gold Plan (12 month + 1 month free)")
                jTextField39.setText("7500");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
             Audio.playmusic("Music\\\\Button.wav");
         switchPanels(jPanel37);
         switchPanel(jPanel7);
           PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from order_details_permanent ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable14.setModel(DbUtils.resultSetToTableModel(rs1));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        Audio.playmusic("Music\\\\Button.wav");
         switchPanels(jPanel22);
         switchPanel(jPanel7);
           PreparedStatement ps1;
	ResultSet rs1;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
                                         ps1 = con.prepareStatement("");
                                        String AdminQuery="Select * from order_payment ";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       jTable13.setModel(DbUtils.resultSetToTableModel(rs1));
                                       total_order();
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
         Audio.playmusic("Music\\\\Button.wav");  
         PreparedStatement ps1;
	ResultSet rs1;
         try
        {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                                        ps1 = con.prepareStatement("");
                                       String AdminQuery="Select * from order_details_permanent where email='"+jTextField40 .getText()+"'";
                                       rs1= ps1.executeQuery(AdminQuery);
                                       if(rs1.next())
                                       {
                                       
                                                if(jTextField40.getText().length()==0 )
                                                    {
                                                            Audio.playmusic("Music\\\\Error.wav");
                                                     new ErrorPage_DataFieldEmpty().setVisible(true); 
                                                    }
                                                else if(jTextField41.getText().length()==0 )
                                                    {
                                                            Audio.playmusic("Music\\\\Error.wav");
                                                            new ErrorPage_DataFieldEmpty().setVisible(true); 
                                                    }
                                                    else
                                                    {
                                                        ps = con.prepareStatement("update order_details_permanent set status='"+jTextField41 .getText()+"' where  email='"+jTextField40 .getText()+"'");
                                                        ps.executeUpdate();
                                                         Audio.playmusic("Music\\\\Successfull.wav");
                                                        new successfull().setVisible(true);
                                                     }
                                       }
                                       else
                                       {
                                            Audio.playmusic("Music\\\\Error.wav");
                                                    new ErrorPage_incorrect().setVisible(true);
                                       }
                                            
                                        
                                          
                                    }
        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this, "Exception : "+ex);
				}
            PreparedStatement ps2;
	ResultSet rs2;
    try
    {
            
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
		System.out.println("Connection Established...");
                		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root" , "root");
                                         ps2 = con.prepareStatement("");
                                        String AdminQuery="Select * from order_details_permanent ";
                                       rs2= ps2.executeQuery(AdminQuery);
                                       jTable14.setModel(DbUtils.resultSetToTableModel(rs2));
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton36ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
