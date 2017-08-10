package attendance;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
 
public class form_view_generated_report extends javax.swing.JFrame 
{
   
    String from = form_GenerateReport.staff_member_selected;    
    String from_date;
    String to_date;
    int count = 0;
      
    public form_view_generated_report(String from2,String to) throws SQLException, ParseException 
    {
        if("admin".equals(form_login.login_type))
        {
            if("154".equals(form_view_report_admin.staff_member_selected))
            {
               from = form_GenerateReport.staff_member_selected;
            }
            else
            {
               from = form_view_report_admin.staff_member_selected;
            }
        }
        else
        {
            from = form_login.username_1;
        }

        from_date = from2;
        to_date = to;
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
        rs = st.executeQuery("select * from staff where Username = '" + from + "'");
        System.out.println("11select * from staff where Username ='" + from + "'");
            while(rs.next())
            {
                   System.out.println(from);
                   System.out.println( rs.getString(1));
                   from = rs.getString(1);
            }
        initComponents();
        int width = 680;
        int height = 557;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width)/2;
        int y = (screen.height - height - 130)/2;
        setBounds(x, y, width, height);
        setDefaultCloseOperation(form_view_generated_report.DISPOSE_ON_CLOSE);            
        SimpleDateFormat formatter =  new SimpleDateFormat("yyyy-MM-dd");
        Date aDate; 
        Date bDate;
        int withDAY;
        int toDAY;
        int diffDay;
        if(!"admin".equals(form_login.login_type))
        {
            title_lbl.setText(form_login.username_1+" Report");
            save_btn.setVisible(false);
            aDate = formatter.parse(""+from_date+"");
            bDate = formatter.parse(""+to_date+"");
            Calendar with = Calendar.getInstance();
            with.setTime(aDate);
            Calendar to_to = Calendar.getInstance();
            to_to.setTime(bDate);
            to_to.set(Calendar.YEAR, with.get(Calendar.YEAR));
            withDAY = with.get(Calendar.DAY_OF_YEAR);
            toDAY = to_to.get(Calendar.DAY_OF_YEAR);
            diffDay =  toDAY  - withDAY;
            diffDay++;
            total_days_lbl.setText(diffDay+" Days.");
            System.out.println("Total Days:"+diffDay);
            System.out.println("Total Present:"+count);
            int a = diffDay - count;
            absent_days_lbl.setText(a+" Days.");
            double percentage = (100*count)/diffDay;
            pre_lbl.setText(percentage+" %");
            double absent = 100 - percentage;
            absent_lbl.setText(absent+" %");
        }

        if("admin".equals(form_login.login_type))
        {
            if(form_login.login_type == "admin")
            {
                if("154".equals(form_view_report_admin.staff_member_selected))
                {
                    title_lbl.setText("Generated Report");
                }
                else
                {
                    title_lbl.setText("View Report Of "+ form_view_report_admin.staff_member_selected);
                    save_btn.setVisible(false);
               }
           }
                aDate = formatter.parse(""+from_date_text.getText()+"");
                bDate = formatter.parse(""+data2.getText()+"");
                Calendar with = Calendar.getInstance();
                with.setTime(aDate);
                Calendar to_to = Calendar.getInstance();
                to_to.setTime(bDate);
                to_to.set(Calendar.YEAR, with.get(Calendar.YEAR));
                withDAY = with.get(Calendar.DAY_OF_YEAR);
                toDAY = to_to.get(Calendar.DAY_OF_YEAR);
                diffDay =  toDAY  - withDAY;
                diffDay++;
                 total_days_lbl.setText(diffDay+" Days.");
                System.out.println("Total Days:"+diffDay);
                System.out.println("Total Present:"+count);
                int a = diffDay - count;
                absent_days_lbl.setText(a+" Days.");
                double percentage = (100*count)/diffDay;
                pre_lbl.setText(percentage+" %");
                double absent = 100 - percentage;

                absent_lbl.setText(absent+" %");
       }
       save_btn.addActionListener(new java.awt.event.ActionListener() 
       {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                dispose();
                String URL = "jdbc:mysql://localhost/attendance";
                String USER = "root";
                String PASS = "";
                Connection conn;
                ResultSet rs1;
                try 
                {
                    Statement st1;
                    conn = (Connection) DriverManager.getConnection(URL, USER, PASS);
                    st1 = (Statement) conn.createStatement();
                    String sql = "INSERT INTO `attendance`.`generated_report` (`S_ID` ,`from` ,`to`) VALUES ('"+from+"', '"+from_date+"', '"+to_date+"');";
                    int executeUpdate = st1.executeUpdate(sql);
                    form_message.show_message("Report For "+data.getText()+" Is Successfully Saved..!!", "Success");
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(form_view_generated_report.class.getName()).log(Level.SEVERE, null, ex);
                }
          }
       });
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        title_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        pre_lbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        absent_lbl = new javax.swing.JLabel();
        cancle_btn = new javax.swing.JButton();
        data = new javax.swing.JTextField();
        to_date_text = new javax.swing.JTextField();
        from_date_text = new javax.swing.JTextField();
        data2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total_days_lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        absent_days_lbl = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(80, 119, 236));

        title_lbl.setFont(new java.awt.Font("Tahoma", 1, 24));
        title_lbl.setForeground(new java.awt.Color(255, 255, 255));
        title_lbl.setText("Generated Report ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("This Report Is Generated For ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("From Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("To Date");

        String[] columnNames = {"Date", "Mark In Time", "Mark Out Time"};

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);
        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(model);
        String URL = "jdbc:mysql://localhost/attendance";
        String USER = "root";
        String PASS = "";
        Connection con;
        int i =0;

        ResultSet rs;

        Statement st;

        PreparedStatement pst;

        String ids;
        try{

            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();

            rs = st.executeQuery("select * from attendance where S_ID ='"+from+"' AND Date BETWEEN '"+from_date+"' AND '"+to_date+"' ");
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(3), rs.getString(4), rs.getString(5)});
                i++;
                count++;

            }
            System.out.println("number of rows :"+i);
        }

        catch(Exception e)
        {

        }
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(15);
        jTable1.setRowMargin(2);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel8.setText("Total Attendance :");

        pre_lbl.setText("100%");

        jLabel10.setText("Absent :");

        absent_lbl.setForeground(new java.awt.Color(255, 51, 0));
        absent_lbl.setText("0%");

        cancle_btn.setText("Close");
        cancle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancle_btnActionPerformed(evt);
            }
        });

        try{

            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            st = (Statement) con.createStatement();

            rs = st.executeQuery("select * from staff where S_ID ='"+from+"'");
            while(rs.next())
            {

                data.setText(rs.getString(4));
                from_date_text.setText(from_date);
                data2.setText(to_date);
            }
        }
        catch(Exception e)
        {

        }
        data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 51, 51));
        data.setBorder(null);
        data.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        data.setEnabled(false);
        data.setOpaque(false);

        to_date_text.setBorder(null);
        to_date_text.setEnabled(false);
        to_date_text.setOpaque(false);

        from_date_text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        from_date_text.setForeground(new java.awt.Color(255, 51, 51));
        from_date_text.setBorder(null);
        from_date_text.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        from_date_text.setEnabled(false);
        from_date_text.setOpaque(false);

        data2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        data2.setForeground(new java.awt.Color(255, 51, 51));
        data2.setBorder(null);
        data2.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        data2.setEnabled(false);
        data2.setOpaque(false);

        jLabel3.setText(" Report Generated For Days :");

        total_days_lbl.setText("5 Days");

        jLabel7.setText("Absent Out Of Total Days :");

        absent_days_lbl.setText("1 Days");

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(from_date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)
                                    .addComponent(to_date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(total_days_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(absent_days_lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(pre_lbl))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(absent_lbl))))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(from_date_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(to_date_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pre_lbl)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(absent_lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(total_days_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(absent_days_lbl))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(save_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancle_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancle_btnActionPerformed
            dispose();
    }//GEN-LAST:event_cancle_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        try 
        {
            dispose();
            form_view_generated_report a1 = new form_view_generated_report(from_date_text.getText(),to_date_text.getText()); 
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_save_btnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absent_days_lbl;
    private javax.swing.JLabel absent_lbl;
    private javax.swing.JButton cancle_btn;
    private javax.swing.JTextField data;
    private javax.swing.JTextField data2;
    private javax.swing.JTextField from_date_text;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel pre_lbl;
    public javax.swing.JButton save_btn;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JTextField to_date_text;
    private javax.swing.JLabel total_days_lbl;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
