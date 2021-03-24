

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/graph1Servlet")
public class graph1Servlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		DAO dao = new DAO();
		String room=request.getParameter("room");
		String result = dao.graph1(room);
		System.out.println("graph1 들어오나>> "+room);
		System.out.println(result);
		out.print(result);
		
		
	}

}
