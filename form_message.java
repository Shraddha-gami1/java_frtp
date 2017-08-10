package attendance;

import javax.swing.JOptionPane;

public class form_message{

public static void show_message(String infoMessage, String location)
    {
        
        JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);
    }
}