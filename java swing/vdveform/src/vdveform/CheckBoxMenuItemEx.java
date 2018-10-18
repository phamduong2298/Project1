package vdveform;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class CheckBoxMenuItemEx extends JFrame {
	private JLabel statusbar;
	 
    public CheckBoxMenuItemEx() {
 
        initUI();
    }
 
    private void initUI() {
 
        JMenuBar menubar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
  
        JMenu viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V);
  
        JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show statusbar");
        showStatusBar.setMnemonic(KeyEvent.VK_S);
        showStatusBar.setDisplayedMnemonicIndex(5);
        showStatusBar.setSelected(true);
  
        showStatusBar.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent e) { 
                statusbar.setVisible(e.getStateChange() == ItemEvent.SELECTED);
            }
        });
  
        viewMenu.add(showStatusBar);
        menubar.add(fileMenu);
        menubar.add(viewMenu);
  
        setJMenuBar(menubar);
        setSize(200, 200);
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                CheckBoxMenuItemEx ex = new CheckBoxMenuItemEx();
                ex.setVisible(true);
            }
        });
    }
}
