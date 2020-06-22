package cit285.book.dao;
import java.sql.*;



public class ConnectionDao {
// Use Heruko database crudentials to connect to JawsDB mySQL
	static Connection conn;
	public static Connection getSQLConnection() throws Exception {
		try {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "bd00f79a26c449";
		String password="58cdd7c1";
		String url = "jdbc:mysql://us-cdbr-east-05.cleardb.net/ad_4bbafc4fd3f4bf7?user=bd00f79a26c449&password=58cdd7c1";
		Class.forName(driver);
		conn = DriverManager.getConnection(url,user,password);
		System.out.println("Connected to SQL");
		return conn;
		}catch(Exception e) {System.out.println("Error connecting to Databse! "+e);}
		return null;
	}
	public static void closeConnection() throws SQLException {
		conn.close();
	}

}
