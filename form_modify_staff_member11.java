package attendance;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class form_modify_staff_member11 extends javax.swing.JFrame 
{
    static String id;
    int count=0;
    
    public void  modify_member() throws SQLException
    {
         
            String URL = "jdbc:mysql://localhost/attendance";
            String USER = "root";
            String PASS = "";
            Connection con;
            ResultSet rs;
            Statement st;
            PreparedStatement pst;
            String ids;     
            id = ID_LBL.getText();
            String uname = username_text.getText();
            String pass = String.valueOf(password_text.getPassword());
            String fullname = full_name_text.getText();
            String address = address_text.getText();
            String mobile = mobile_text.getText();
            String email = email_text.getText();
            String dob = dob_text.getText();
            String desg = desg_text.getText();
            String dep = depart_text.getText();
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();
        
            String sql = "update `staff` SET `Username` = '"+uname+"' , `Password` = '"+pass+"' , `Full_name` = '"+fullname+"' , `Address` = '"+address+"' , `Email` = '"+email+"' , `Mobile` = '"+mobile+"' , `Designation` = '"+desg+"' , `Department` = '"+dep+"' , `DOB` = '"+dob+"' where S_ID = '"+id+"' ";             
            form_message.show_message("update `staff` SET `Username` = '"+uname+"' , `Password` = '"+pass+"' , `Full_name` = '"+fullname+"' , `Address` = '"+address+"' , `Email` = '"+email+"' , `Mobile` = '"+mobile+"' , `Designation` = '"+desg+"' , `Department` = '"+dep+"' , `DOB` = '"+dob+"' where S_ID = '"+id+"' ", "Success");
            int executeUpdate = st.executeUpdate(sql);    
            dispose();
            form_message.show_message("User "+uname+" Detail Successfully Inserted ..!!", "Success");
    }

    public form_modify_staff_member11() 
    {
        initComponents();
        ID_LBL.setText("");
        int width = 443;
        int height = 597;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width)/2;
        int y = (screen.height - height - 130)/2;
        setBounds(x, y, width, height);
        setDefaultCloseOperation(form_modify_staff_member11.DISPOSE_ON_CLOSE); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        password_lbl = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        password_text = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        last_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        previous_btn = new javax.swing.JButton();
        first_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_text = new javax.swing.JTextArea();
        depart_text = new javax.swing.JTextField();
        dob_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mob_lbl = new javax.swing.JLabel();
        full_name_text = new javax.swing.JTextField();
        desg_lbl = new javax.swing.JLabel();
        depart_lbl = new javax.swing.JLabel();
        desg_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        dob_text = new javax.swing.JTextField();
        fullname_lbl = new javax.swing.JLabel();
        mobile_text = new javax.swing.JTextField();
        ID_LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Staff Member");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        username_lbl.setText("Username :");

        password_lbl.setText("Password :");

        username_text.setPreferredSize(new java.awt.Dimension(250, 20));

        password_text.setPreferredSize(new java.awt.Dimension(250, 20));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        last_btn.setText("< Last");
        last_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_btnActionPerformed(evt);
            }
        });

        next_btn.setText("Next >>");
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });

        previous_btn.setText("<< Previous");
        previous_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_btnActionPerformed(evt);
            }
        });

        first_btn.setText("First >");
        first_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_btnActionPerformed(evt);
            }
        });

        address_text.setColumns(20);
        address_text.setRows(5);
        address_text.setPreferredSize(new java.awt.Dimension(80, 50));
        jScrollPane1.setViewportView(address_text);

        depart_text.setText(" ");
        depart_text.setPreferredSize(new java.awt.Dimension(150, 20));
        depart_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depart_textActionPerformed(evt);
            }
        });

        dob_lbl.setText("Date Of Birth :");

        email_lbl.setText("Email :");

        jLabel2.setText("Address :");

        mob_lbl.setText("Mobile Number :");

        full_name_text.setToolTipText("");
        full_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_textActionPerformed(evt);
            }
        });

        desg_lbl.setText("Designation :");

        depart_lbl.setText("Department :");

        desg_text.setText(" ");
        desg_text.setPreferredSize(new java.awt.Dimension(150, 20));
        desg_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desg_textActionPerformed(evt);
            }
        });

        email_text.setText(" ");
        email_text.setPreferredSize(new java.awt.Dimension(150, 20));
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        dob_text.setText(" ");
        dob_text.setPreferredSize(new java.awt.Dimension(150, 20));
        dob_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_textActionPerformed(evt);
            }
        });

        fullname_lbl.setText("Full Name :");

        mobile_text.setText(" ");
        mobile_text.setPreferredSize(new java.awt.Dimension(150, 20));
        mobile_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_textActionPerformed(evt);
            }
        });

        ID_LBL.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password_lbl)
                    .addComponent(username_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(last_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previous_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(first_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mob_lbl)
                            .addComponent(dob_lbl)
                            .addComponent(email_lbl)
                            .addComponent(depart_lbl)
                            .addComponent(desg_lbl)
                            .addComponent(jLabel2)
                            .addComponent(fullname_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mobile_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(depart_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(desg_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dob_text, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(full_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {full_name_text, mobile_text});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_lbl)
                    .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_lbl)
                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(ID_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullname_lbl)
                            .addComponent(full_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mob_lbl)
                            .addComponent(mobile_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dob_lbl)
                            .addComponent(dob_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email_lbl)
                            .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depart_lbl)
                            .addComponent(depart_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desg_lbl)
                            .addComponent(desg_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_btn)
                    .addComponent(previous_btn)
                    .addComponent(next_btn)
                    .addComponent(first_btn))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void last_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_btnActionPerformed
    try
    {
            String URL = "jdbc:mysql://localhost/attendance";
            String USER = "root";
            String PASS = "";
            Connection con;
            ResultSet rs;
            Statement st = null;
            count--;
            PreparedStatement pst;
            String ids;     
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();
            ResultSet rs1 = st.executeQuery("Select * from staff");
      
            if(rs1.last())
            {
                      id = rs1.getString(1);
                      ID_LBL.setText(id);
                      username_text.setText(rs1.getString(2));
                      password_text.setText(rs1.getString(3));
                      full_name_text.setText(rs1.getString(4));
                      address_text.setText(rs1.getString(5));
                      mobile_text.setText(rs1.getString(7));
                      email_text.setText(rs1.getString(6));
                      dob_text.setText(rs1.getString(8));
                      desg_text.setText(rs1.getString(9));
                      depart_text.setText(rs1.getString(10));
            }
    
    
    }
    catch(Exception ex)
    {
        
    }
    }//GEN-LAST:event_last_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {
            modify_member();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(form_modify_staff_member11.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void first_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_btnActionPerformed
    try
    {
            String URL = "jdbc:mysql://localhost/attendance";
            String USER = "root";
            String PASS = "";
            Connection con;
            ResultSet rs;
            Statement st = null;
            count--;
            PreparedStatement pst;
            String ids;     
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();
            ResultSet rs1 = st.executeQuery("Select * from staff");
      
            if(rs1.first())
            {
                      id = rs1.getString(1);
                      ID_LBL.setText(id);
                      username_text.setText(rs1.getString(2));
                      password_text.setText(rs1.getString(3));
                      full_name_text.setText(rs1.getString(4));
                      address_text.setText(rs1.getString(5));
                      mobile_text.setText(rs1.getString(7));
                      email_text.setText(rs1.getString(6));
                      dob_text.setText(rs1.getString(8));
                      desg_text.setText(rs1.getString(9));
                      depart_text.setText(rs1.getString(10));
            }
    
    
    }
    catch(Exception ex)
    {
        
    }
    }//GEN-LAST:event_first_btnActionPerformed

    private void previous_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_btnActionPerformed
    try
    {
            String URL = "jdbc:mysql://localhost/attendance";
            String USER = "root";
            String PASS = "";
            Connection con;
            ResultSet rs;
            Statement st = null;
            count--;
            PreparedStatement pst;
            String ids;     
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();
            ResultSet rs1 = st.executeQuery("Select * from staff");
            for(int i=0;i<count;i++)
            {
                if(rs1.next())
                {
                      id = rs1.getString(1);
                      ID_LBL.setText(id);
                      username_text.setText(rs1.getString(2));
                      password_text.setText(rs1.getString(3));
                      full_name_text.setText(rs1.getString(4));
                      address_text.setText(rs1.getString(5));
                      mobile_text.setText(rs1.getString(7));
                      email_text.setText(rs1.getString(6));
                      dob_text.setText(rs1.getString(8));
                      desg_text.setText(rs1.getString(9));
                      depart_text.setText(rs1.getString(10));
                }
            }
    }
    catch(Exception ex)
    {
        
    }
    }//GEN-LAST:event_previous_btnActionPerformed

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
    try
    {
        String URL = "jdbc:mysql://localhost/attendance";
        String USER = "root";
        String PASS = "";
        Connection con;
        ResultSet rs;
        Statement st = null;
        PreparedStatement pst;
        count++;
        String ids;     
        con = (Connection) DriverManager.getConnection(URL, USER, PASS);
        st = (Statement) con.createStatement();
        ResultSet rs1 = st.executeQuery("Select * from staff");
        for(int i=0;i<count;i++)
        {
            if(rs1.next())
            {
                  id = rs1.getString(1);
                  ID_LBL.setText(id);
                  username_text.setText(rs1.getString(2));
                  password_text.setText(rs1.getString(3));
                  full_name_text.setText(rs1.getString(4));
                  address_text.setText(rs1.getString(5));
                  mobile_text.setText(rs1.getString(7));
                  email_text.setText(rs1.getString(6));
                  dob_text.setText(rs1.getString(8));
                  desg_text.setText(rs1.getString(9));
                  depart_text.setText(rs1.getString(10));
              }
        }
    
    }
    catch(Exception ex)
    {
        
    }
    
    }//GEN-LAST:event_next_btnActionPerformed

    private void full_name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_textActionPerformed
        
}//GEN-LAST:event_full_name_textActionPerformed

    private void desg_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desg_textActionPerformed
       
}//GEN-LAST:event_desg_textActionPerformed

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_email_textActionPerformed

    private void dob_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_textActionPerformed
       
}//GEN-LAST:event_dob_textActionPerformed

    private void mobile_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_textActionPerformed
    
}//GEN-LAST:event_mobile_textActionPerformed

    private void depart_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depart_textActionPerformed
        
}//GEN-LAST:event_depart_textActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {

            @Override
            public void run()
            {
                new form_modify_staff_member11().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_LBL;
    private javax.swing.JTextArea address_text;
    private javax.swing.JLabel depart_lbl;
    private javax.swing.JTextField depart_text;
    private javax.swing.JLabel desg_lbl;
    private javax.swing.JTextField desg_text;
    private javax.swing.JLabel dob_lbl;
    private javax.swing.JTextField dob_text;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_text;
    private javax.swing.JButton first_btn;
    private javax.swing.JTextField full_name_text;
    private javax.swing.JLabel fullname_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton last_btn;
    private javax.swing.JLabel mob_lbl;
    private javax.swing.JTextField mobile_text;
    private javax.swing.JButton next_btn;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JButton previous_btn;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
