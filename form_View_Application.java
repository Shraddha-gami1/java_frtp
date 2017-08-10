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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class form_View_Application extends javax.swing.JFrame 
{
            private String form;
            String URL = "jdbc:mysql://localhost/attendance";
            String USER = "root";
            String PASS = "";
            Connection con;
            ResultSet rs,rs1,rs3;
            Statement st,st1,st2;
            PreparedStatement pst;
            String ids;
public void showTableDataView() throws SQLException 
{
                setDefaultCloseOperation(form_View_Application.DISPOSE_ON_CLOSE);
                if(form_login.login_type == "admin")
                {
                    JFrame frame2 = new JFrame("View Leave Application");
                    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                    frame2.setSize(800, 600);
                    int width = 500;
                    int h =350;
                    int x = (screen.width - width) /2;
                    int y = (screen.height - h) / 2;
                    frame2.setBounds(x, y, width, h);
                    DefaultTableModel model = new DefaultTableModel();
                    String[] columnNames = {"Member Name","Date", "Subject", "Application","View_Status","Accept_status"};
                    model.setColumnIdentifiers(columnNames);
                    JTable table = new JTable();
                    table.setModel(model);
                    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                    table.setFillsViewportHeight(true);
                    JScrollPane scroll = new JScrollPane(table);
                    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                    String Date = "";
                    String Subject = "";
                    String Application = "";
                    String view = "";
                    String accept = "";
                    con = (Connection) DriverManager.getConnection(URL, USER, PASS);
                    st = (Statement) con.createStatement();
                    String name;
                    rs = st.executeQuery("select * from `leave` where `status` = 'Not Viewed'");
                    int i = 0;
                    rs = st.executeQuery("select * from `leave` where `status` = 'Not Viewed'");
                    while(rs.next())
                    {
                        java.sql.Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                        ResultSet srs = stmt.executeQuery( "select * from `staff` WHERE S_ID = '"+rs.getString(2)+"'" );
                        while(srs.next())
                        {
                            name = srs.getString(4);
                            Date = rs.getString(3);
                            Subject = rs.getString(4);
                            Application = rs.getString(5);
                            view = rs.getString(6);
                            accept = rs.getString(7);
                            model.addRow(new Object[]{name , Date, Subject, Application,view,accept});
                        }
                        i++;
                    }
                    frame2.add(scroll);
                    frame2.setVisible(true);
                }
                else
                {
                    JFrame frame2 = new JFrame("View Leave Application");
                    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                    frame2.setSize(800, 600);
                    int width = 500;
                    int h =350;
                    int x = (screen.width - width) /2;
                    int y = (screen.height - h) / 2;
                    frame2.setBounds(x, y, width, h);
                    DefaultTableModel model = new DefaultTableModel();
                    String[] columnNames = {"Date", "Subject", "Application","View_Status","Accept_status"};
                    model.setColumnIdentifiers(columnNames);
                    JTable table = new JTable();
                    table.setModel(model);
                    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                    table.setFillsViewportHeight(true);
                    JScrollPane scroll = new JScrollPane(table);
                    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                    String Date = "";
                    String Subject = "";
                    String Application = "";
                    String view = "";
                    String accept = "";
                    con = (Connection) DriverManager.getConnection(URL, USER, PASS);
                    st = (Statement) con.createStatement();
                    String name = null;
                    int i = 0;
                    rs = st.executeQuery("select * from `leave` where `S_ID` = '"+form_login.ID+"'");
                    while(rs.next())
                    {
                        Date = rs.getString(3);
                        Subject = rs.getString(4);
                        Application = rs.getString(5);
                        view = rs.getString(6);
                        accept = rs.getString(7);
                        model.addRow(new Object[]{Date, Subject, Application,view,accept});
                        i++;
                    }
                    frame2.add(scroll);
                    frame2.setVisible(true);
               }
}
public form_View_Application() throws SQLException 
{
        showTableDataView();
}
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Application");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void main(String args[]) 
{
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                try 
                {
                    new form_View_Application();
                } 
                catch (SQLException ex) {
                    Logger.getLogger(form_View_Application.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
