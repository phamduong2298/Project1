package dialogue;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MessageDialogsEx extends JFrame {
	private JPanel panel;
	 
    public MessageDialogsEx() {
 
        initUI();
    }
 
    private void initUI() {
         
        panel = (JPanel) getContentPane();
  
        JMenuBar menubar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
  
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(
                    panel, 
                    "This is a modal MessageBox", 
                    "About", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
          
        fileMenu.add(about);
       
        menubar.add(fileMenu);
        setJMenuBar(menubar);
  
        setTitle("Dialog Example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MessageDialogsEx md = new MessageDialogsEx();
                md.setVisible(true);
            }
        });
    }
}
