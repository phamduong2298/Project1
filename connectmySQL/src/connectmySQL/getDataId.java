package connectmySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getDataId {
	public ResultSet getData(String id){
		connection myconnect = new connection();
		myconnect.connect();
		ResultSet rs = null;
		String sqlCommand ="select * from student where id=?";
		PreparedStatement pst = null;
		try {
			pst = myconnect.cn.prepareStatement(sqlCommand);
			pst.setString(1,id);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error get\n"+ toString());
		}
		return rs;
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
		getDataId a = new getDataId();
		a.showData(a.getData("04"));
	}
}
