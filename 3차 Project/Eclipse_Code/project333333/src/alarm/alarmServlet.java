package alarm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;


@WebServlet("/alarmServlet")
public class alarmServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 alarmDAO dao = new alarmDAO();

		      //response.setCharacterEncoding("UTF-8");
		      //request.setCharacterEncoding("UTF-8");
		   
		      System.out.println("왔음!");
		      PrintWriter out = response.getWriter();
		      
		      String user_room = request.getParameter("user_room");
		      System.out.println("user_room의 값 "+user_room);
		      
		      if(user_room != null) {
		         System.out.println("적힘");
		         String alarmBill = dao.alarmBill(user_room);
		         System.out.println(alarmBill);
		         out.print(alarmBill);
		      }
		
		
	}

}
