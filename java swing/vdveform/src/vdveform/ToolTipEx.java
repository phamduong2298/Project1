package vdveform;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToolTipEx extends JFrame {
	public ToolTipEx() {
		initUI();
	}
	private void initUI() {
		JButton btn= new JButton("Button");
		btn.setToolTipText("A Button Component");
		createLayout(btn);
		
		setTitle("Tooltip");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent... arg) {
		JPanel pane = (JPanel) getContentPane();
		GroupLayout g1 = new GroupLayout(pane);
		pane.setLayout(g1);
		
		pane.setToolTipText("Content pane");
		g1.setAutoCreateContainerGaps(true);
		g1.setHorizontalGroup(g1.createSequentialGroup().addComponent(arg[0]).addGap(200));
		g1.setVerticalGroup(g1.createSequentialGroup().addComponent(arg[0]).addGap(120));
		pack();
	}
	
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ToolTipEx ex = new ToolTipEx();
				ex.setVisible(true);
			}
		});
	}
}
