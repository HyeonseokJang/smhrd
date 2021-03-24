package newgraph2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newgraph2Con")
public class newgraph2Con extends HttpServlet {
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		graph2DAO dao = new graph2DAO();
		String id = request.getParameter("roomId");
	
		System.out.println("graph2 come in!"+dao.graph2_month(id));
		out.print(dao.graph2_month(id));
		
		
	}

}
