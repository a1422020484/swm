package swm.jdbc;

//STEP 1. Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	// JDBC driver name and database URL
	// Database credentials
	static final String USER = "root";
	static final String PASS = "123456";
//	static final String DB_URL_ORACLE = "jdbc:oracle:thin:@172.17.6.48:1521:ORCL";
	static final String DB_URL_MYSQL = "jdbc:mysql://localhost:3306/goods?user=root&password=123456";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL_MYSQL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "select t.bid,t.author,t.press,t.bname from t_book t";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String id = rs.getString("bid");
				String age = rs.getString("bname");
				String first = rs.getString("author");
				String last = rs.getString("press");

				// Display values
				System.out.print("USERNAME: " + id);
				System.out.print(", ADDRESS: " + age);
				System.out.print(", PHONE: " + first);
				System.out.println(", USERID: " + last);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}
}
