

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sid =request.getParameter("id");
		
		String sname=request.getParameter("name");
		
		String sage =request.getParameter("age");
		
		try {
		//load the class and register the driver
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//connection 
		String url ="jdbc:postgresql://localhost:5432/JDBC";
		String user ="postgres";
	    String password ="postgres";
	    Connection connect = DriverManager.getConnection(url,user,password);
		String sql=("Insert into students values (?,?,?)");
		//statement create
		PreparedStatement statement = connect.prepareStatement(sql);
		
		int id = Integer.parseInt(sid);

		int age = Integer.parseInt(sage);
	statement.setInt(1,id);
	statement.setString(2,sname);
	statement.setInt(3, age);
		

	int	rows = statement.executeUpdate();
	
	
	if(rows==0) {
		System.out.println("Query Execution failed");
	}else {
		System.out.println("Query Processed : No of rows affected : "+ rows);
	}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
