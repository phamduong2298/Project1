package vdveform;

import javax.swing.JFrame;

public class Window extends JFrame{
	public Window() {
		initUI();
	}
	private void initUI() {
		setTitle("Simple Window");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Window wd = new Window();
				wd.setVisible(true);
			}
		});
	}
}
