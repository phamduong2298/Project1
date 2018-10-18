package vdveform;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class QuitButtonEx extends JFrame {
	public QuitButtonEx() {
		InitUI();
	}
	
	private void InitUI() {
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		createLayout(quitButton);
		
		setTitle("QuitBotton");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent... arg) {
		Container pane = getContentPane();
		GroupLayout g1 = new GroupLayout(pane);
		pane.setLayout(g1);
		
		g1.setAutoCreateContainerGaps(true);
		g1.setHorizontalGroup(g1.createSequentialGroup().addComponent(arg[0]));
		g1.setVerticalGroup(g1.createSequentialGroup().addComponent(arg[0]));
		}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				QuitButtonEx ex = new QuitButtonEx();
				ex.setVisible(true);
			}
		});
	}
}
