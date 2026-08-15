

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DynamicResponse
 */
@WebServlet("/StudentServlet")
public class DynamicResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String sname =request.getParameter("name");
		String scity =request.getParameter("city");
		
		response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        out.println("<h2>Form Submitted Successfully!</h2>");

        out.println("<p><strong>Name:</strong> " + sname + "</p>");

        out.println("<p><strong>City:</strong> " + scity + "</p>");

        out.println("</body></html>");

    }

}