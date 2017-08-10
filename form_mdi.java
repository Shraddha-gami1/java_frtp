package attendance;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class form_mdi extends javax.swing.JFrame 
{

String URL = "jdbc:mysql://localhost/attendance";
String USER = "root";
String PASS = "";
Connection con;
ResultSet rs;
Statement st;
PreparedStatement pst;
String ids;
String u1 = form_login.username_1;
String type = form_login.login_type;
String ID = form_login.ID;

public static int okcancel(String theMessage) 
{
    int result = JOptionPane.showConfirmDialog((Component) null, theMessage,
    "alert", JOptionPane.OK_CANCEL_OPTION);
    return result;
    
}
    public form_mdi() throws SQLException 
    {
        con = (Connection) DriverManager.getConnection(URL, USER, PASS);
        st = (Statement) con.createStatement();
        int width = 906;
        int height = 554;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width)/2;
        int y = (screen.height - height - 130)/2;
        setBounds(x, y, width, height);
        initComponents();
        setDefaultCloseOperation(form_mdi.EXIT_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        account_menu = new javax.swing.JMenu();
        logout_submenu = new javax.swing.JMenuItem();
        ChangePassword_submenu = new javax.swing.JMenuItem();
        exit_submenu = new javax.swing.JMenuItem();
        attendance_menu = new javax.swing.JMenu();
        mark_in_submenu = new javax.swing.JMenuItem();
        mark_out_submenu = new javax.swing.JMenuItem();
        manage_staff_member_menu = new javax.swing.JMenu();
        add_member_submenu = new javax.swing.JMenuItem();
        update_member_submenu = new javax.swing.JMenuItem();
        delete_member_submenu = new javax.swing.JMenuItem();
        report_menu = new javax.swing.JMenu();
        generate_report_submenu = new javax.swing.JMenuItem();
        view_report_submenu = new javax.swing.JMenuItem();
        leave_menu = new javax.swing.JMenu();
        create_application_submenu = new javax.swing.JMenuItem();
        view_application_submenu = new javax.swing.JMenuItem();
        manage_application = new javax.swing.JMenuItem();
        help_menu = new javax.swing.JMenu();
        about_submenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Management");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance/src/splash.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance/src/splash.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        account_menu.setText("Account");

        logout_submenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout_submenu.setText("Logout");
        logout_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_submenuActionPerformed(evt);
            }
        });
        account_menu.add(logout_submenu);

        ChangePassword_submenu.setText("Change Password");
        ChangePassword_submenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePassword_submenuMouseClicked(evt);
            }
        });
        ChangePassword_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassword_submenuActionPerformed(evt);
            }
        });
        account_menu.add(ChangePassword_submenu);

        exit_submenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit_submenu.setText("Exit");
        exit_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_submenuActionPerformed(evt);
            }
        });
        account_menu.add(exit_submenu);

        menubar.add(account_menu);

        attendance_menu.setText("Attendance");

        mark_in_submenu.setText("Mark In");
        mark_in_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark_in_submenuActionPerformed(evt);
            }
        });
        attendance_menu.add(mark_in_submenu);

        mark_out_submenu.setText("Mark Out");
        mark_out_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark_out_submenuActionPerformed(evt);
            }
        });
        attendance_menu.add(mark_out_submenu);

        menubar.add(attendance_menu);

        manage_staff_member_menu.setText("Manage Staff Member");

        add_member_submenu.setText("Add Member");
        add_member_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_member_submenuActionPerformed(evt);
            }
        });
        manage_staff_member_menu.add(add_member_submenu);

        update_member_submenu.setText("Update Member Detail");
        update_member_submenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_member_submenuMouseClicked(evt);
            }
        });
        update_member_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_member_submenuActionPerformed(evt);
            }
        });
        manage_staff_member_menu.add(update_member_submenu);

        delete_member_submenu.setText("Delete Member");
        delete_member_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_member_submenuActionPerformed(evt);
            }
        });
        manage_staff_member_menu.add(delete_member_submenu);

        menubar.add(manage_staff_member_menu);

        report_menu.setText("Report");

        generate_report_submenu.setText("Generate Report");
        generate_report_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_report_submenuActionPerformed(evt);
            }
        });
        report_menu.add(generate_report_submenu);

        view_report_submenu.setText("View Report");
        view_report_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_report_submenuActionPerformed(evt);
            }
        });
        report_menu.add(view_report_submenu);

        menubar.add(report_menu);

        leave_menu.setText("leave Application");

        create_application_submenu.setText("Create Application");
        create_application_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_application_submenuActionPerformed(evt);
            }
        });
        leave_menu.add(create_application_submenu);

        view_application_submenu.setText("View Application");
        view_application_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_application_submenuActionPerformed(evt);
            }
        });
        leave_menu.add(view_application_submenu);

        manage_application.setText("Manage Application");
        manage_application.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_applicationActionPerformed(evt);
            }
        });
        leave_menu.add(manage_application);

        menubar.add(leave_menu);

        help_menu.setText("Help");

        about_submenu.setText("About");
        about_submenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_submenuMouseClicked(evt);
            }
        });
        about_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_submenuActionPerformed(evt);
            }
        });
        help_menu.add(about_submenu);

        menubar.add(help_menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void about_submenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_submenuMouseClicked
    }//GEN-LAST:event_about_submenuMouseClicked

    private void about_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_submenuActionPerformed
        new form_AboutBox().setVisible(true);
    }//GEN-LAST:event_about_submenuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void ChangePassword_submenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassword_submenuMouseClicked
        
    }//GEN-LAST:event_ChangePassword_submenuMouseClicked

    private void ChangePassword_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassword_submenuActionPerformed
         new form_change_password().setVisible(true);
    }//GEN-LAST:event_ChangePassword_submenuActionPerformed

    private void logout_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_submenuActionPerformed
        dispose();
        try 
        {
            form_message.show_message("Logout Successfully..!!", "Logout");
            new form_login().setVisible(true);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logout_submenuActionPerformed

    private void exit_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_submenuActionPerformed
      int i = okcancel("Exit Application..? Are You Sure..??");             
             if(i==0)
             {
                System.exit(0);
             }
    }//GEN-LAST:event_exit_submenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if("admin".equals(form_login.login_type))
        {
                create_application_submenu.setVisible(false);
                attendance_menu.setVisible(false);
        }
        else
        {
                generate_report_submenu.setVisible(false);
                manage_staff_member_menu.setVisible(false);
                manage_application.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mark_in_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark_in_submenuActionPerformed

         Calendar cal = Calendar.getInstance();
    	 cal.getTime();
         
    	 SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
         Date date = new Date();
         
         String current_date = dateFormat.format(date);
         String current_time = sdf.format(cal.getTime());
         
         String status = "00:00:00";
         try
         {
                rs = st.executeQuery("select * from attendance where S_ID='"+ID+"' and `date` = '"+current_date+"'");
                int i=0;
                if(rs.next())
                {
                        status = rs.getString(4);
                        i++;
                }
                if(i<=0)
                {

                        String sql = "INSERT INTO `attendance`.`attendance` (`S_ID` ,`Date` ,`In_time` )VALUES ( '"+ID+"', '"+current_date+"', '"+current_time+"')";
                        int executeUpdate = st.executeUpdate(sql);     
                        form_message.show_message("Your Mark in Is Successfully..!!", "Message");     
                } 
                else            
                {                
                        form_message.show_message("Meked In Already..!!", "Message");
                }
         }
         catch (SQLException ex) 
         {
                    Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
         }
       
       
       
    }//GEN-LAST:event_mark_in_submenuActionPerformed

    private void mark_out_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark_out_submenuActionPerformed
       
         Calendar cal = Calendar.getInstance();
    	 cal.getTime();
         
    	 SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
         Date date = new Date();
         String current_date = dateFormat.format(date);
        
         String current_time = sdf.format(cal.getTime());
         String status = "00:00:00";
         
        try {
              
               
            rs = st.executeQuery("select * from attendance where S_ID='"+ID+"' and `date` = '"+current_date+"'");
            int i=0;
            if(rs.next())
            {
                 
                status = rs.getString(5);
                i++;
                    
                
            }
            if(i != 0)
            {
                  if("00:00:00".equals(status))
                  {
                      String sql = "UPDATE attendance SET `Out_time` = '"+current_time+"' WHERE `S_ID` = '"+ID+"' and `date` = '"+current_date+"'";
                      int executeUpdate = st.executeUpdate(sql);     
                      form_message.show_message("Your Mark Out Is Successfully..!!", "Message");  
                  }
                  else
                  {
                        form_message.show_message("Your Marked Out Already", "Message");  
                  }
                      
            } 
            else            
            {                
                form_message.show_message("Not Marked In Today..!!", "Message");
            }
               
            
    
        
        } catch (SQLException ex) {
        }
       
       
    }//GEN-LAST:event_mark_out_submenuActionPerformed

    private void add_member_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_member_submenuActionPerformed
                new form_add_staff_member().setVisible(true);
    }//GEN-LAST:event_add_member_submenuActionPerformed

    private void update_member_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_member_submenuActionPerformed
             new form_modify_staff_member11().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_update_member_submenuActionPerformed

    private void delete_member_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_member_submenuActionPerformed
            new form_delete_staff_member().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_delete_member_submenuActionPerformed

    private void update_member_submenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_member_submenuMouseClicked
            new form_modify_staff_member11().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_update_member_submenuMouseClicked

    private void generate_report_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_report_submenuActionPerformed
              new form_GenerateReport().setVisible(true);        
    }//GEN-LAST:event_generate_report_submenuActionPerformed

    private void view_report_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_report_submenuActionPerformed

        if("staff".equals(form_login.login_type))
        {
            try 
            {
                con = (Connection) DriverManager.getConnection(URL, USER, PASS);
                st = (Statement) con.createStatement();
                String from_date = "";
                String to_date = "";
                rs = st.executeQuery("select * from generated_report where S_ID = '" + form_login.ID + "'");
                while(rs.next())
                {
                    from_date = rs.getString(3);
                    to_date = rs.getString(4);
                }
                try 
                {
                    new form_view_generated_report(""+from_date,""+to_date).setVisible(true);
                }
                catch (ParseException ex) 
                {
                    Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            catch (SQLException ex) 
            {
                Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            new form_view_report_admin().setVisible(true);
        }
    }//GEN-LAST:event_view_report_submenuActionPerformed

    private void create_application_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_application_submenuActionPerformed
        try 
        {
            new form_New_Application().setVisible(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_create_application_submenuActionPerformed

    private void view_application_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_application_submenuActionPerformed
        try 
        {
            new form_View_Application();
        } 
        catch (SQLException ex) {
            Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_view_application_submenuActionPerformed

    private void manage_applicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_applicationActionPerformed
          new form_manage_application().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_manage_applicationActionPerformed

   
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                    try 
                    {
                        new form_mdi().setVisible(true);
                    }
                    catch (SQLException ex) 
                    {
                        Logger.getLogger(form_mdi.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ChangePassword_submenu;
    private javax.swing.JMenuItem about_submenu;
    private javax.swing.JMenu account_menu;
    private javax.swing.JMenuItem add_member_submenu;
    private javax.swing.JMenu attendance_menu;
    private javax.swing.JMenuItem create_application_submenu;
    private javax.swing.JMenuItem delete_member_submenu;
    private javax.swing.JMenuItem exit_submenu;
    private javax.swing.JMenuItem generate_report_submenu;
    private javax.swing.JMenu help_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu leave_menu;
    private javax.swing.JMenuItem logout_submenu;
    private javax.swing.JMenuItem manage_application;
    private javax.swing.JMenu manage_staff_member_menu;
    private javax.swing.JMenuItem mark_in_submenu;
    private javax.swing.JMenuItem mark_out_submenu;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu report_menu;
    private javax.swing.JMenuItem update_member_submenu;
    private javax.swing.JMenuItem view_application_submenu;
    private javax.swing.JMenuItem view_report_submenu;
    // End of variables declaration//GEN-END:variables
}
