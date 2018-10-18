package component;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TextAreaExample extends JFrame {
	public TextAreaExample() {
        
        initUI();
    }
 
    private void initUI() {
 
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
 
        JScrollPane pane = new JScrollPane();
        JTextArea area = new JTextArea();
 
        area.setLineWrap(true);       
        area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
 
        pane.getViewport().add(area);
        panel.add(pane);
 
        add(panel);
 
        setTitle("Component Example");
        setSize(new Dimension(350, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TextAreaExample ex = new TextAreaExample();
                ex.setVisible(true);
            }
        });
    }
}
