package jdbcStatementConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Utility.Utils;

public class DeleteStatement {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		
		try {
			c=Utils.getConnection();
			s=c.createStatement();
			String sql ="Delete from students where name = 'Amit'";
			int rows =s.executeUpdate(sql);
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
				Utils.closeConnection(c, s);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
