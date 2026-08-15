package jdbcPrepareStatementConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Utility.Utils;

public class BatchStatement {

	public static void main(String[] args) {
		
		Connection c= null;
		PreparedStatement s = null;
		
		try {
			c=Utils.getConnection();
			String sql ="Update students set age=? where name=?";
			s=c.prepareStatement(sql);
			
			
			s.setInt(1,28);
			s.setString(2,"Anubhav");
			s.addBatch();
			s.setInt(1,26);
			s.setString(2,"vaibhav");
			s.addBatch();
			
			
		 s.executeBatch();
			
			System.out.println("Check the DB");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				Utils.closePreparedConnection(c, s);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
