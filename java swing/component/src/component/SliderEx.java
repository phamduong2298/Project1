package component;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderEx extends JFrame{
	private JSlider slider;
    private JLabel lbl;
    
    public SliderEx() {
         
        initUI();
    }
 
    private void initUI() {                      
         
        slider = new JSlider(0, 100, 0);
 
        slider.addChangeListener(new ChangeListener() {
  
            @Override
            public void stateChanged(ChangeEvent event) { 
                lbl.setText(String.valueOf(slider.getValue()));
            }
        });
 
        lbl = new JLabel("0", JLabel.CENTER);
 
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl); 
  
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
  
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(slider)
            .addComponent(lbl));
 
        gl.setVerticalGroup(gl.createParallelGroup()
            .addComponent(slider)
            .addComponent(lbl)); 
 
        pack();
  
        setTitle("Example Component");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SliderEx ex = new SliderEx();
                ex.setVisible(true);
            }
        });
    }
}
