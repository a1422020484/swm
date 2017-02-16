package swm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.17.6.48:1521:ORCL", "sa", "sa");
			PreparedStatement preStatement = conn.prepareStatement("select * from t_user2 where userid=? and username =?");
			preStatement.setString(1, "24");
			preStatement.setString(2, "1");
 
			ResultSet result = preStatement.executeQuery();
 
			while(result.next()){
			    System.out.println("username: " + result.getString("username"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
