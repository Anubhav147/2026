package jdbcPrepareStatementConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Utility.Utils;

public class InsertStatement {

	public static void main(String[] args) {
		
		Connection c= null;
		PreparedStatement s = null;
		
		try {
			c=Utils.getConnection();
			String sql = "Insert into students values(?, ?, ?)";
			s=c.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the students details");
			System.out.println("Enter the students id");
			int id =sc.nextInt();
			System.out.println("Enter the students name");
			String name =sc.next();
			System.out.println("Enter the students age");
			int age =sc.nextInt();
			
			s.setInt(1,id);
			s.setString(2,name);
			s.setInt(3,age);
			
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
