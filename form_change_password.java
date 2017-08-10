package attendance;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class form_change_password extends javax.swing.JFrame 
{
    String old_password;
    String new_pass;
    String verify_pass;
    String URL = "jdbc:mysql://localhost/attendance";
    String USER = "root";
    String PASS = "";
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement pst;
    String ids;
    
    public void change_pass()
    {
       old_password = String.valueOf(old_pass.getPassword());
       new_pass = String.valueOf(new_password.getPassword());
       verify_pass = String.valueOf(verify_password.getPassword());
       String u1 = form_login.username_1;
       String type = form_login.login_type;
       
       try
       {
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();
            int i = 0;
            if(old_password.length() <= 0 &&  new_pass.length() <= 0 &&  verify_pass.length() <= 0)
            {
                form_message.show_message("Please Fill Out All Password..!!", type);
            }
            else
            {
                if(verify_pass.equals(new_pass))
                {
                    rs = st.executeQuery("select * from " +type+ " where Username='" + u1 + "' and Password ='"+old_password+"'");
                   
                    if (rs.next()) 
                    {
                        i++;
                    }
                    
                    if(i>0)
                    {     
                       String sql = "UPDATE "+type+" SET `Password` = '"+verify_pass+"' WHERE `Username` ='"+u1+"'";
                       int executeUpdate = st.executeUpdate(sql,3);
                       form_message.show_message("Password Successfully Changed..!!", type);
                    }
                    else
                    {
                         form_message.show_message("Old Password Is Wrong..!!", type);
                    }
                    
                }
                else
                {
                    form_message.show_message("New Password And Confirm Password Does Not Match..!!", type);
                }
            }
        
       }
       catch(Exception e)
       {
            System.out.println(e.getStackTrace());
            System.out.println(e);
            System.out.println(e.toString());
       }
       
       
       
    }
    
    public form_change_password() 
    {
        initComponents();
        setDefaultCloseOperation(form_change_password.DISPOSE_ON_CLOSE);                       
        int width = 380;
        int height = 200;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cancle = new javax.swing.JButton();
        change_password_btn = new javax.swing.JButton();
        old_pass = new javax.swing.JPasswordField();
        new_password = new javax.swing.JPasswordField();
        verify_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(250, 180));
        setResizable(false);

        jLabel1.setText("Cuurent Password :");

        jLabel2.setText("New Password :");

        jLabel3.setText("Confirm Password :");

        jPanel2.setBackground(new java.awt.Color(80, 119, 236));

        cancle.setText("Cancle");
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });

        change_password_btn.setText("Change ");
        change_password_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_password_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(cancle)
                .addGap(28, 28, 28)
                .addComponent(change_password_btn)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancle)
                    .addComponent(change_password_btn))
                .addContainerGap())
        );

        old_pass.setPreferredSize(new java.awt.Dimension(120, 20));

        new_password.setPreferredSize(new java.awt.Dimension(120, 20));

        verify_password.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verify_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(verify_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-376)/2, (screenSize.height-227)/2, 376, 227);
    }// </editor-fold>//GEN-END:initComponents
 
    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
            dispose();       
    }//GEN-LAST:event_cancleActionPerformed

    private void change_password_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_password_btnActionPerformed
         change_pass(); 
    }//GEN-LAST:event_change_password_btnActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new form_change_password().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancle;
    private javax.swing.JButton change_password_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField new_password;
    private javax.swing.JPasswordField old_pass;
    private javax.swing.JPasswordField verify_password;
    // End of variables declaration//GEN-END:variables
}
