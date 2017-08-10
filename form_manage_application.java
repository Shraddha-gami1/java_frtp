package attendance;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class form_manage_application extends javax.swing.JFrame 
{
   String URL = "jdbc:mysql://localhost/attendance";
   String USER = "root";
   String PASS = "";
   Connection con;
   int id[];
   ResultSet rs,rs1,rs2;
   Statement st,st1,st2;
   PreparedStatement pst;
   String ids;
   static  String staff_member_selected;
   public void update_leave_app()
    {
            String view_status = (String)view_type.getSelectedItem();
            String acc_status = (String)acc_type.getSelectedItem();
            String app = (String)leave_type.getSelectedItem();
            try
            {
                   con = (Connection) DriverManager.getConnection(URL, USER, PASS);
                   String s = "UPDATE `attendance`.`leave` SET `subject` = '"+app+" ' , `status` = '"+view_status+"' , `acc_status` = '"+acc_status+"' WHERE `leave`.`subject` = '"+app+"';"  ;
                   int executeUpdate = st.executeUpdate(s);    
            }
            catch(Exception e)
            {
            }
    }
    
    public void set_leave_app()
    {
             try
             {
                   leave_type.removeAllItems();
                   con = (Connection) DriverManager.getConnection(URL, USER, PASS);
                   st1 = (Statement) con.createStatement();
                   rs1 = st1.executeQuery("select * from staff where Username = '"+staff_member_selected+"'");
                   while (rs1.next()) 
                   {
                        ids = rs1.getString(1);
                   }
                   rs1 = st1.executeQuery("select * from `leave` where `S_ID` = '"+ids+"' ");
                   while (rs1.next()) 
                   {
                     leave_type.addItem(rs1.getString(4));
                     
                   }
             }
             catch(Exception e)
             {
             }
      }
    
      public form_manage_application() 
      {
            initComponents();
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            int width = 463;
            int h =370;
            int x = (screen.width - width) /2;
            int y = (screen.height - h) / 2;
            setBounds(x, y, width, h);
            setDefaultCloseOperation(form_manage_application.DISPOSE_ON_CLOSE);            
            try
            {
                    con = (Connection) DriverManager.getConnection(URL, USER, PASS);
                    st = (Statement) con.createStatement();
                    rs = st.executeQuery("select * from staff");
                    while (rs.next()) 
                    {
                          member_type.addItem(rs.getString(3));
                    }
            }
            catch(Exception e)
            {
            }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        member_type = new javax.swing.JComboBox();
        leave_type = new javax.swing.JComboBox();
        view_type = new javax.swing.JComboBox();
        acc_type = new javax.swing.JComboBox();
        update_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Leave Application");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setText("Leave Application :");

        jLabel3.setText("Set As :");

        jLabel4.setText("Set As :");

        jLabel5.setText("Staff Member :");

        member_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_typeActionPerformed(evt);
            }
        });

        view_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Not Viewed", "Viewed" }));
        view_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_typeActionPerformed(evt);
            }
        });

        acc_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Accept", "Decline" }));

        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(member_type, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(view_type, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acc_type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(leave_type, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(member_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(leave_type, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(view_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(acc_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void member_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_typeActionPerformed
        staff_member_selected = (String) member_type.getSelectedItem();  
        set_leave_app();
    }//GEN-LAST:event_member_typeActionPerformed

    private void view_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_typeActionPerformed
        
    }//GEN-LAST:event_view_typeActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        dispose(); 
        update_leave_app();
        form_message.show_message("Succesfully Updated..!!","Leave Application");
    }//GEN-LAST:event_update_btnActionPerformed

    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {

            @Override
            public void run() 
            {
                new form_manage_application().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox acc_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox leave_type;
    private javax.swing.JComboBox member_type;
    private javax.swing.JButton update_btn;
    private javax.swing.JComboBox view_type;
    // End of variables declaration//GEN-END:variables
}
