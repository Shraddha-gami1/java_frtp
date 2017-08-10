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
import javax.swing.JFrame;


public class form_add_staff_member extends javax.swing.JFrame 
{
    public form_add_staff_member() 
    {
        initComponents();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 544;
        int height = 594;
        int x = (screen.width - width)/2;
        int y = (screen.height - height)/2;
        setBounds(x, y, width, height);
        setDefaultCloseOperation(form_add_staff_member.DISPOSE_ON_CLOSE);                       
    }
    
    public void insert_staff_member() throws SQLException
    {
        String URL = "jdbc:mysql://localhost/attendance";
        String USER = "root";
        String PASS = "";
        Connection con;
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String ids;     
        con = (Connection) DriverManager.getConnection(URL, USER, PASS);
        st = (Statement) con.createStatement();
        String uname = username_text.getText();
        String pass = String.valueOf(password_text.getPassword());
        String fullname = full_name_text.getText();
        String address = address_text.getText();
        String mobile = mobile_text.getText();
        String email = email_text.getText();
        String dob = dob_text.getText();
        String desg = desg_text.getText();
        String dep = depart_text.getText();
        
        
        setDefaultCloseOperation(form_add_staff_member.EXIT_ON_CLOSE);
        String sql = "INSERT INTO `attendance`.`staff` (`Username` ,`Password` ,`Full_name` ,`Address` ,`Email` ,`Mobile` ,`DOB` ,`Designation` ,`Department`) VALUES ('"+uname+"', '"+pass+"', '"+fullname+"', '"+address+"', '"+email+"', '"+mobile+"', '"+dob+"', '"+desg+"', '"+dep+"')";     
        int executeUpdate = st.executeUpdate(sql);    
        dispose();
        form_message.show_message("User "+uname+" Detail Successfully Inserted ..!!", "Success");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_lbl = new javax.swing.JLabel();
        password_lbl = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        password_text = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        fullname_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mob_lbl = new javax.swing.JLabel();
        dob_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        desg_lbl = new javax.swing.JLabel();
        depart_lbl = new javax.swing.JLabel();
        full_name_text = new javax.swing.JTextField();
        mobile_text = new javax.swing.JTextField();
        dob_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        desg_text = new javax.swing.JTextField();
        depart_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_text = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        add_btn = new javax.swing.JButton();
        cancle_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        username_lbl.setText("Username :");

        password_lbl.setText("Password :");

        username_text.setPreferredSize(new java.awt.Dimension(250, 20));

        password_text.setPreferredSize(new java.awt.Dimension(250, 20));

        fullname_lbl.setText("Full Name :");

        jLabel2.setText("Address :");

        mob_lbl.setText("Mobile Number :");

        dob_lbl.setText("Date Of Birth :");

        email_lbl.setText("Email :");

        desg_lbl.setText("Designation :");

        depart_lbl.setText("Department :");

        full_name_text.setToolTipText("");
        full_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_textActionPerformed(evt);
            }
        });

        mobile_text.setText(" ");
        mobile_text.setPreferredSize(new java.awt.Dimension(150, 20));
        mobile_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_textActionPerformed(evt);
            }
        });

        dob_text.setText(" ");
        dob_text.setPreferredSize(new java.awt.Dimension(150, 20));
        dob_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_textActionPerformed(evt);
            }
        });

        email_text.setText(" ");
        email_text.setPreferredSize(new java.awt.Dimension(150, 20));
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        desg_text.setText(" ");
        desg_text.setPreferredSize(new java.awt.Dimension(150, 20));
        desg_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desg_textActionPerformed(evt);
            }
        });

        depart_text.setText(" ");
        depart_text.setPreferredSize(new java.awt.Dimension(150, 20));
        depart_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depart_textActionPerformed(evt);
            }
        });

        address_text.setColumns(20);
        address_text.setRows(5);
        address_text.setPreferredSize(new java.awt.Dimension(80, 50));
        jScrollPane1.setViewportView(address_text);

        add_btn.setText("Add Member");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        cancle_btn.setText("Cancle");
        cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancle_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Staff Member");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password_lbl)
                            .addComponent(username_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mob_lbl)
                                    .addComponent(dob_lbl)
                                    .addComponent(email_lbl)
                                    .addComponent(depart_lbl)
                                    .addComponent(desg_lbl)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(fullname_lbl)))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancle_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {depart_text, desg_text, full_name_text, mobile_text});

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
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(desg_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {depart_text, desg_text, dob_text, email_text, mobile_text});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void full_name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_textActionPerformed
      
    }//GEN-LAST:event_full_name_textActionPerformed

    private void mobile_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_textActionPerformed
        
    }//GEN-LAST:event_mobile_textActionPerformed

    private void dob_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_textActionPerformed
    
    }//GEN-LAST:event_dob_textActionPerformed

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
      
    }//GEN-LAST:event_email_textActionPerformed

    private void desg_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desg_textActionPerformed
       
    }//GEN-LAST:event_desg_textActionPerformed

    private void depart_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depart_textActionPerformed
       
    }//GEN-LAST:event_depart_textActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        try 
        {
            insert_staff_member();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(form_add_staff_member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancle_btnActionPerformed
        dispose();
    }//GEN-LAST:event_cancle_btnActionPerformed

   
public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                new form_add_staff_member().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextArea address_text;
    private javax.swing.JButton cancle_btn;
    private javax.swing.JLabel depart_lbl;
    private javax.swing.JTextField depart_text;
    private javax.swing.JLabel desg_lbl;
    private javax.swing.JTextField desg_text;
    private javax.swing.JLabel dob_lbl;
    private javax.swing.JTextField dob_text;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_text;
    private javax.swing.JTextField full_name_text;
    private javax.swing.JLabel fullname_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mob_lbl;
    private javax.swing.JTextField mobile_text;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
