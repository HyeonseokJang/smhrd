

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/weeTotal")
public class weeTotal extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id = request.getParameter("id");
		
		
		PrintWriter out = response.getWriter();
		ArrayList<weekVO> list_total = new ArrayList<>();
		DAO dao = new DAO();
		
		
		
		
		
		
	}

}
