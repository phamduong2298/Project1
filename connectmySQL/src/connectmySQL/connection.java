package connectmySQL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connection {
	private final String url="jdbc:mysql://127.0.0.1:3306/new_schema";
	private final String className="com.mysql.jdbc.Driver";
	private final String user = "root";
	private final String password = "2121998";
	
	Connection cn;
	
	void connect(){
		try {
			Class.forName(className);
			cn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connect Error");
		}
		
	}
	
	public static void main(String args[]){
		connection con = new connection();
		con.connect();
	}
}
