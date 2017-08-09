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

public class form_login extends javax.swing.JFrame {
    
static String login_type;
static String username_1;
static String ID;
String URL = "jdbc:mysql://localhost/attendance";
String USER = "root";
String PASS = "";
Connection con;
ResultSet rs;
Statement st;
PreparedStatement pst;
String ids;
  
    
public form_login() throws SQLException 
{
               
        con = (Connection) DriverManager.getConnection(URL, USER, PASS);
        st = (Statement) con.createStatement();
        int width = 380;        
        int height = 230;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
        initComponents();
        setDefaultCloseOperation(form_login.EXIT_ON_CLOSE);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        password_text = new javax.swing.JPasswordField();
        type_select = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        cancle_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(80, 119, 236));
        setForeground(new java.awt.Color(80, 119, 236));
        setResizable(false);

        jLabel1.setText("Username :");

        jLabel2.setText("Password :");

        username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textActionPerformed(evt);
            }
        });

        type_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "staff", "admin" }));

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        cancle_btn.setText("Cancle");
        cancle_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancle_btnMouseClicked(evt);
            }
        });
        cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancle_btnActionPerformed(evt);
            }
        });

        login_btn.setText("Login");
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(cancle_btn)
                .addGap(28, 28, 28)
                .addComponent(login_btn)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_btn)
                    .addComponent(cancle_btn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(type_select, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(20, 20, 20)
                            .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(type_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textActionPerformed
        
    }//GEN-LAST:event_username_textActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        
        dispose();
        loginCheck l1 = new loginCheck();
        String username= username_text.getText();
        String password = String.valueOf(password_text.getPassword());
        login_type = (String) type_select.getSelectedItem();
        username_1 = username;
        
        try{
                rs = st.executeQuery("select * from staff where Username='" + username +"'");
            
                if(rs.next())
                {
                    ID = rs.getString(1);
                }
        }
        catch(Exception e)
        {
            form_message.show_message("Problem in Fetch ID","Login Form");
        }
        
        l1.login_check(username, password, login_type);
        
        
    }//GEN-LAST:event_login_btnActionPerformed

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        
    }//GEN-LAST:event_login_btnMouseClicked

    private void cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancle_btnActionPerformed
       System.exit(0);
}//GEN-LAST:event_cancle_btnActionPerformed

    private void cancle_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancle_btnMouseClicked
        System.exit(0);
}//GEN-LAST:event_cancle_btnMouseClicked

    
    public static void main(String args[]) 
    {
          java.awt.EventQueue.invokeLater(new RunnableImpl());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancle_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JComboBox type_select;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            try 
            {
                new form_login().setVisible(true);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
}

