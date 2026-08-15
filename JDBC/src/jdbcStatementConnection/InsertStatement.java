package jdbcStatementConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Utility.Utils;

public class InsertStatement {
	
	public static void main(String[] args) {
		Connection connect = null;
		Statement st= null;
		
		
		try {
			connect= Utils.getConnection();
			st=connect.createStatement();
			
			String sql ="Insert into students values(7, 'Anubhav', 28)";
			int rows = st.executeUpdate(sql);
			
			if(rows==0) {
				System.out.println("Query Execution failed");
			}else {
				System.out.println("Query Processed : No of rows affected : "+ rows);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				Utils.closeConnection(connect, st);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
