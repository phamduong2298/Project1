package component;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEx extends JFrame implements ItemListener {
	private JLabel display;
    private JComboBox<String> box;
    private String[] distros;
 
    public ComboBoxEx() {
 
        initUI();        
    }
 
    private void initUI() {
 
        distros = new String[]{"Ubuntu", "Redhat", "Arch",
            "Debian", "Mint"};
 
        box = new JComboBox<>(distros);
        box.addItemListener(this);
 
        display = new JLabel("Ubuntu");
         
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl); 
 
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
 
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(box)
            .addComponent(display));
 
        gl.setVerticalGroup(gl.createParallelGroup()
            .addComponent(box)
            .addComponent(display));
 
        pack();
 
        setTitle("Component Example"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
    }
     
    @Override
    public void itemStateChanged(ItemEvent e) {
 
        if (e.getStateChange() == ItemEvent.SELECTED) {
            display.setText(e.getItem().toString());
        }
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ComboBoxEx ex = new ComboBoxEx();
                ex.setVisible(true);
            }
        });
    }
}
