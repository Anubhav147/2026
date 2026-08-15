package Utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Utils {

	
	public static Connection getConnection() throws SQLException {
		String url ="jdbc:postgresql://localhost:5432/JDBC";
		String user ="postgres";
	    String password ="postgres";
	    return DriverManager.getConnection(url,user,password);
		
	}
	
	// Connection done
	
	public static void closeConnection(Connection connect,Statement st) throws SQLException{
		connect.close();
		st.close();
	}
	
	public static void closePreparedConnection(Connection connect,PreparedStatement st) throws SQLException{
		connect.close();
		st.close();
	}

}
