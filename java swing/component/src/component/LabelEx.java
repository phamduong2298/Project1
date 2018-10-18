package component;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx extends JFrame {
	public LabelEx() {
        
        initUI();
    }
     
    private void initUI() {
 
        String lyrics =  "<html>It's way too late to think of" + 
        "<br>Someone I would call now" + 
        "<br>And neon signs got tired" + 
        "<br>Red eye flights help the stars out" + 
        "<br>I'm safe in a corner" + 
        "<br>Just hours before me" + 
        "</html>";
  
        JLabel label = new JLabel(lyrics);
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setForeground(new Color(50, 50, 25));
 
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl); 
        gl.setAutoCreateContainerGaps(true);
 
        gl.setHorizontalGroup(gl.createSequentialGroup()
                             .addComponent(label));
 
        gl.setVerticalGroup(gl.createParallelGroup()
                            .addComponent(label));
 
        pack();
 
        setTitle("Component Example");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LabelEx ex = new LabelEx();
                ex.setVisible(true);
            }
        });
    }
}
