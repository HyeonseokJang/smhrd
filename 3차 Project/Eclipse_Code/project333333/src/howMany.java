

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/howMany")
public class howMany extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao  = new DAO();
		
		String result2="";
		int chochogi=0;
		PrintWriter out = response.getWriter();
		String id = request.getParameter("roomId");
		
		if(id!=null) {
			result2=dao.howMany2(id);
		chochogi=dao.choChogi(id);}
		
		System.out.println(chochogi);
		
	System.out.println(chochogi+"/"+result2);
		out.print(chochogi+"/"+result2);
		
	}

}
