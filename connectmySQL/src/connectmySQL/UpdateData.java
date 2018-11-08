package connectmySQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	connection Cn = new connection();
	boolean checkUpdate = true;
	public void update(Student st){
		Cn.connect();
		String sqlCommand = "update student set name=?, point=? where id=?";
		PreparedStatement pst = null;
		try {
			pst = Cn.cn.prepareStatement(sqlCommand);
			pst.setString(1, st.getName());
			pst.setDouble(2, st.getPoint());
			pst.setString(3, st.getId());
			pst.executeUpdate();
			if (pst.executeUpdate() > 0) {
				System.out.println("update success");
			} else {
				checkUpdate = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			checkUpdate = false;
		}
	}
}
