package newgraph2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/graph2_MyRoom")
public class graph2_MyRoom extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		graph2DAO dao = new graph2DAO();
		PrintWriter out = response.getWriter();
	    
		String id=request.getParameter("roomId");
		
		String result=dao.My_room_house(id);
		System.out.println(result +" My room graph2 >> ");
		out.print(result);
	}

}
