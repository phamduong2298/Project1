package connectmySQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public void delete(String id){
		connection Cn = new connection();
		Cn.connect();
		String sqlCommand="delete from student where id = ?";
		PreparedStatement pst = null;
		try {
			pst = Cn.cn.prepareStatement(sqlCommand);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Delete Error");
		}
	}
	
	public static void main(String args[]){
		DeleteData a = new DeleteData();
		a.delete("06");;
		GetAllData z = new GetAllData();
		z.showData(z.rs);
	}
}
