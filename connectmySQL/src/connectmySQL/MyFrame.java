package connectmySQL;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MyFrame extends JFrame implements ActionListener{
	
	connection Cn = new connection();
	private JTable table = new JTable();
	private JTextField tfId, tfName, tfPoint;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		Cn.connect();
		add(createMainPanel());
		setTitle("Danh sach hoc sinh");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private JPanel createMainPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(createTable(), BorderLayout.CENTER);
		panel.add(createBottom(), BorderLayout.PAGE_END);
		return panel;
	}
	
	private JPanel createTable(){
		JPanel panel = new JPanel();
		panel.add(new JScrollPane(table));
		return panel;
	}
	
	private JPanel createBottom(){
		JPanel panel = new JPanel(new BorderLayout(10,10));
		panel.setBorder(new EmptyBorder(5, 70, 10, 10));
		panel.add(createButtonPanel(), BorderLayout.PAGE_END);
		panel.add(createInputPanel(), BorderLayout.CENTER);
		return panel;
	}
	
	private JPanel createInputPanel(){
		JPanel panel = new JPanel(new BorderLayout(10,10));
		
		JPanel panelLeft = new JPanel(new GridLayout(3,1,5,5));
		panelLeft.add(new JLabel("Id"));
		panelLeft.add(new JLabel("Name"));
		panelLeft.add(new JLabel("Point"));
		
		JPanel panelRight = new JPanel(new GridLayout(3,1,5,5));
		panelRight.add(tfId = new JTextField());
		panelRight.add(tfName = new JTextField());
		panelRight.add(tfPoint = new JTextField());
		
		panel.add(panelLeft, BorderLayout.WEST);
		panel.add(panelRight, BorderLayout.CENTER);
		return panel;
	}
	
	private JPanel createButtonPanel(){
		JPanel panel = new JPanel(new GridLayout(1,3,5,5));
		panel.add(createButton("Add"));
		panel.add(createButton("Update"));
		panel.add(createButton("Delete"));
		
		return panel;
	}
	
	private JButton createButton(String t){
		JButton bt = new JButton(t);
		bt.addActionListener(this);
		return bt;
	}
	
	private void loadData(){
		DefaultTableModel model = new DefaultTableModel();
		GetAllData getdata= new GetAllData();
		try {
			ResultSetMetaData rsMD = getdata.rs.getMetaData();
			int colNumber = rsMD.getColumnCount();
			String arr[] = new String[colNumber];
			for (int i=0;i<colNumber;i++){
				arr[i] = rsMD.getColumnName(i+1);
			}
			model.setColumnIdentifiers(arr);
			while (getdata.rs.next()){
				for (int i=0;i<colNumber;i++){
					arr[i]=getdata.rs.getString(i+1);
				}
				model.addRow(arr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table.setModel(model);
	}
		
	private void delete(){
		int row = table.getSelectedRow();
		if (row<0){
			JOptionPane.showMessageDialog(null, "Chon hang de xoa!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		int select = JOptionPane.showOptionDialog(null, "Are you sure?", null, 0, 
													JOptionPane.YES_NO_OPTION, null, null, 1);
		if (select==0){
			DeleteData del= new DeleteData();
			del.delete((String) table.getValueAt(row, 0));
			loadData();
		}
		
	}
	
	private Student getStudent(){
		String id = tfId.getText().trim();
		String name = tfName.getText().trim();
		double point;
		point = Double.parseDouble(tfPoint.getText().trim());
		return new Student(id, name, point);
	}
	
	private void update(){
		Student st = getStudent();
		UpdateData x = new UpdateData();
		x.update(st);
		loadData();
		clear();
	}
	
	private void add(){
		Student st = getStudent();
		InsertData x = new InsertData();
		x.Insert(st);
		loadData();
		clear();
	}
	
	private void clear(){
		tfId.setText("");
		tfName.setText("");
		tfPoint.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Delete"){
			delete();
			return;
		}
		if (e.getActionCommand() == "Update"){
			update();
			return;
		}
		if (e.getActionCommand() == "Add"){
			add();
			return;
		}
		
	}
	
	public static void main(String args[]){
		MyFrame myFrame = new MyFrame();
		myFrame.loadData();
	}
}
