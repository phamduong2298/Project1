package connectmySQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public void Insert(Student s){
		connection Cn = new connection();
		Cn.connect();
		String sqlCommand = "insert into student value(?, ?, ?)";
		PreparedStatement pst = null;
		try {
			pst = Cn.cn.prepareStatement(sqlCommand);
			pst.setString(1, s.getId());
			pst.setString(2, s.getName());
			pst.setDouble(3, s.getPoint());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("insert error");
		}
	}
	
	public static void main(String args[]){
		InsertData a = new InsertData();
		Student x = new Student("07", "Nguyen Ngoc Duong", 8.0);
		a.Insert(x);
		GetAllData z = new GetAllData();
		z.showData(z.rs);
	}
}
