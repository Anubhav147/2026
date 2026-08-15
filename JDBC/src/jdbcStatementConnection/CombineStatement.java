package jdbcStatementConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Utility.Utils;

public class CombineStatement {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;

		try {
			c = Utils.getConnection();
			s = c.createStatement();
			String sql = "Insert into students values(7, 'Anubhav', 28)";
			boolean rows = s.execute(sql);
			if (rows) {
				ResultSet rs = s.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				}
			} else {
				int q = s.getUpdateCount();
				if (q == 0) {
					System.out.println("Query Execution failed");
				} else {
					System.out.println("Query Processed : No of rows affected : " + q);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Utils.closeConnection(c, s);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
