package attendance;

import java.sql.*;

public class connection 
{
    public static void DatabaseConnectivity()
    {
        try
        {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            String URL = "jdbc:mysql://localhost/attendance";
            String USER = "root";
            String PASS = "";
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connection Successful");
            form_message.show_message("Connection Successful!", "Success");
        } 
        catch (Exception e) 
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            form_message.show_message("Got an Exception!", "Error");
            form_message.show_message(e.getMessage(), "Error");
        }
    }
    public static void main(String args[])
    {
            DatabaseConnectivity();
    }
}
            

