package attendance;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class form_spalsh extends JWindow {

    public static void main(String[] args) {
        new form_spalsh();
        
    }
    private double src;

    public form_spalsh() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_spalsh.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(form_spalsh.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(form_spalsh.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(form_spalsh.class.getName()).log(Level.SEVERE, null, ex);
                }
               

                showSplash();

            }
        });
    }

    public void showSplash() {

        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.blue);

        // Set the window's bounds, centering the window
        int width = 486;
        int height = 248;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        // Build the splash screen
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("src/splash.gif")));
       

        content.add(label, BorderLayout.CENTER);

        label.setLayout(new GridBagLayout());
           
            

            

    

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        

        //ImageIcon wait = new ImageIcon(getClass().getResource("/wait.gif"));
        //label.add(new JLabel(wait), gbc);

        
        

        // Display it
        setVisible(true);
        toFront();

        new ResourceLoader().execute();
    }

    public class ResourceLoader extends SwingWorker<Object, Object> {

        @Override
        protected Object doInBackground() throws Exception {

            // Wait a little while, maybe while loading resources
            
            try {
               synchronized (this) {
                        wait(5000);
               
               }		
            }
            catch (Exception e) 
            {
            }

            new form_login().setVisible(true);
                return null;
              
        }

        @Override
        protected void done() {
            setVisible(false);
            
        }


    }

}