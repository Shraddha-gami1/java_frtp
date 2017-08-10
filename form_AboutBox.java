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

public class form_AboutBox extends JWindow 
{
    public static void main(String[] args) 
    {
       new form_AboutBox();
    }

    public form_AboutBox() 
    {
    EventQueue.invokeLater(new Runnable() 
    {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
               
                aboutbbb();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_AboutBox.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(form_AboutBox.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(form_AboutBox.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(form_AboutBox.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
    });
}
public void aboutbbb() 
{
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.blue);
        int width = 483;
        int height = 248;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("src/splash.jpg")));
        content.add(label, BorderLayout.CENTER);
        label.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        setVisible(true);
        toFront();
        new ResourceLoader().execute();
}
public class ResourceLoader extends SwingWorker<Object, Object> 
{
    @Override
    protected Object doInBackground() throws Exception 
    {
        try 
        {
            synchronized (this) 
            {
                wait(10000);
            }		
        } catch (Exception e) 
        {
        }
    return null;
    }
    @Override
    protected void done()
    {
        setVisible(false);
    }
}

}
