package vdveform;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample extends JFrame {
    public MenuExample() {
        init();
    }
   
    private void init() {
        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("E:/exit.png");
  
        JMenu file = new JMenu("File.png");
        file.setMnemonic(KeyEvent.VK_F);
  
        JMenuItem eMenuItem = new JMenuItem("Exit", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0); 
            }
        });
        file.add(eMenuItem);
        menubar.add(file);
  
        setJMenuBar(menubar);
  
        setTitle("Menu Example");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
         
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MenuExample ex = new MenuExample();
                ex.setVisible(true);
            }
        });
    }
}
