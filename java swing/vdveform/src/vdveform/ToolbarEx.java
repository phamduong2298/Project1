package vdveform;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class ToolbarEx extends JFrame {
	public ToolbarEx() {
		initUI();
	}
	
	private void initUI() {
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menubar.add(fileMenu);
		setJMenuBar(menubar);
		
		JToolBar toolbar = new JToolBar();
		ImageIcon icon = new ImageIcon("E:/exit.png");
		JButton exitButton = new JButton(icon);
		toolbar.add(exitButton);
		
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		setTitle("ToolbarExample");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ToolbarEx ex = new ToolbarEx();
				ex.setVisible(true);
			}
		});
	}
}
