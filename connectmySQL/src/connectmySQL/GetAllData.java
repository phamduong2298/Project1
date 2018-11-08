package connectmySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllData {
	public ResultSet rs;
	public GetAllData() {
		connection Cn = new connection();
		Cn.connect();
		String sqlCommand="select * from student";
		Statement st = null;
		try {
			st=Cn.cn.createStatement();
			rs=st.executeQuery(sqlCommand);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void showData(ResultSet rs){
		try {
			while (rs.next()){
				System.out.printf("%-5s %-20s %-2.1f\n" , rs.getString(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
	}
	
	public static void main(String args[]){
		GetAllData a = new GetAllData();
		a.showData(a.rs);
	}
}
