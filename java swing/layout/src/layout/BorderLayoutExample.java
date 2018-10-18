package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class BorderLayoutExample extends JFrame {
	public BorderLayoutExample() {
		 
        initUI();
    }
 
    public final void initUI() {
 
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
  
        menubar.add(file);
        setJMenuBar(menubar);
  
        JToolBar horizontalToolbar = new JToolBar();
        horizontalToolbar.setFloatable(false);
        horizontalToolbar.setMargin(new Insets(10, 5, 5, 5));
  
        ImageIcon exitIcon = new ImageIcon("E:/exit.png");
        JButton exitButton = new JButton(exitIcon);
        exitButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        horizontalToolbar.add(exitButton);
  
        add(horizontalToolbar, BorderLayout.NORTH);
  
        JToolBar verticalToolbar = new JToolBar(JToolBar.VERTICAL);
        verticalToolbar.setFloatable(false);
        verticalToolbar.setMargin(new Insets(10, 5, 5, 5));
  
        ImageIcon driveIcon = new ImageIcon("E:/drive.png");
        ImageIcon computerIcon = new ImageIcon("E:/computer.png");
        ImageIcon printerIcon = new ImageIcon("E:/printer.png");
  
        JButton driveButton = new JButton(driveIcon);
        driveButton.setBorder(new EmptyBorder(3, 0, 3, 0));
  
        JButton computerButton = new JButton(computerIcon);
        computerButton.setBorder(new EmptyBorder(3, 0, 3, 0));
  
        JButton printerButton = new JButton(printerIcon);
        printerButton.setBorder(new EmptyBorder(3, 0, 3, 0));
  
        verticalToolbar.add(driveButton);
        verticalToolbar.add(computerButton);
        verticalToolbar.add(printerButton);
  
        add(verticalToolbar, BorderLayout.WEST);
  
        add(new JTextArea(), BorderLayout.CENTER);
  
        JLabel statusbar = new JLabel("Statusbar");
        statusbar.setPreferredSize(new Dimension(-1, 22));
        statusbar.setBorder(LineBorder.createGrayLineBorder());
        add(statusbar, BorderLayout.SOUTH);
   
        setSize(350, 300);
        setTitle("Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
 
        SwingUtilities.invokeLater(new Runnable() {
 
            public void run() {
                BorderLayoutExample ex = new BorderLayoutExample();
                ex.setVisible(true);
            }
        });
    }
}
