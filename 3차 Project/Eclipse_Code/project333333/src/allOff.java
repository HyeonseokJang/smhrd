

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/allOff")
public class allOff extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("alloff");
		
		
		PrintWriter out = response.getWriter();
		 //get parameter request로 해야
		DAO dao = new DAO();
		int cnt=dao.allOff(id);
		System.out.println(cnt+"업뎃이 되엇나");
		
		out.print(cnt);

	}

}
