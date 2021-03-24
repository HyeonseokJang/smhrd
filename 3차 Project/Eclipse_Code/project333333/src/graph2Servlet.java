
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/graph2Servlet")
public class graph2Servlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        DAO dao  = new DAO();
	
		PrintWriter out = response.getWriter();
		String id = request.getParameter("roomId");
		String result=dao.graph2(id);
		System.out.println("graph2"+result);
		out.print(result);
	}

}
