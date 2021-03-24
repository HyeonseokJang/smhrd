

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

@WebServlet("/AllSelectServlet")
public class AllSelectServlet extends HttpServlet {
	DAO dao = new DAO();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
	
		boolean a = false;
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean check = dao.login(id, pw);
		
		System.out.println(check);
		if(check) {
		String check2 = dao.allSelect(id);
		out.print(check2);
		}else {
			out.print(a);
		}
	
	}

}
