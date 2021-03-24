

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sensorCon")
public class sensorCon extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DAO dao  = new DAO();
		String result="";
		PrintWriter out = response.getWriter();
		String id=request.getParameter("roomId");
		String sr = request.getParameter("sr");
		String onOff = request.getParameter("onOff");
		
		//System.out.println(sr+"/"+onOff);
		
		
		
		
		result=sr+"/"+dao.sensorIndividual(id,sr,onOff)+"/"+dao.howMany(id);
		

		
		System.out.println(result);
		out.print(result);
		
		
	}

}
