package jdbcStatementConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Utility.Utils;

public class TestJDBC {

	public static void main(String[] args) {
		
		Connection connect = null;
		Statement st = null;
		
		//STEP 1
		
		//Load the Driver
		// however if you are using version above 4.0 then this will be not required
		// It will internally call DriverManager.register("org.postgres.Driver")
		
		try {
		//Class.forName("org.postgres.Driver");
		
			/* Deprecated 
			 * by
			 * Java
			 */
			
			
		//Now as your driver is loaded will move to STEP 2
		// Stablish the connection
		
//		String url ="jdbc:postgresql://localhost:5432/JDBC";
//		String user ="postgres";
//	    String password ="postgres";
//		 connect = DriverManager.getConnection(url,user,password);
			
			
			/* MOVED 
			 * TO
			 * UTIL
			 */
			
			connect = Utils.getConnection();
		
		// Connection done
		//STEP 4 Create Statement
		
		 st =connect.createStatement();
		
		String sql ="select * from students";
		ResultSet rs =st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+ rs.getInt(3));
		}
		
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				Utils.closeConnection(connect, st);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
