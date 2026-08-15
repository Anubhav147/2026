package jdbcPrepareStatementConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Utility.Utils;

public class DeleteStatement {

	public static void main(String[] args) {
		
		Connection c= null;
		PreparedStatement s = null;
		
		try {
			c=Utils.getConnection();
			String sql ="Delete from students where name = ?";
			s=c.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the students details");
			System.out.println("Enter the students name");
			String name =sc.next();
			
			s.setString(1,name);
			
			int rows = s.executeUpdate();
			
			
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
				Utils.closePreparedConnection(c, s);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
