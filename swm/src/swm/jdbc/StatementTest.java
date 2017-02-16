package swm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	
	private final static String USERNAME = "sa";	
	private final static String PWD = "sa";
	private final static String DB_URL="jdbc:oracle:thin:@172.17.6.48:1521:ORCL";
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName(DRIVER);
			
			try {
				conn = DriverManager.getConnection(DB_URL, USERNAME, PWD);
				st = conn.createStatement();
				String sql = "select * from t_user2";
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()){
					int id = rs.getInt("username");
					int age = rs.getInt("address");
					String first = rs.getString("phone");
					String last = rs.getString("userid");

					// Display values
					System.out.print("USERNAME: " + id);
					System.out.print(", ADDRESS: " + age);
					System.out.print(", PHONE: " + first);
					System.out.println(", USERID: " + last);
				}
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
