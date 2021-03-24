

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/weekGraph")
public class weekGraph extends HttpServlet {
int db_today=0;
int today_=-1;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String id = request.getParameter("id");
		Gson gson = new Gson();
		
		PrintWriter out = response.getWriter();
		ArrayList<weekVO> list_total = new ArrayList<>();
		ArrayList<weekVO> list_week7 = new ArrayList<>();
		ArrayList<weekVO> total = new ArrayList<>();
		DAO dao = new DAO();


		list_total=dao.week_total();
		
		list_week7=dao.week_use(id);
		
		
		for(int i=0;i<list_total.size();i++) {
			total.add(new weekVO(list_total.get(i).getUse(),list_week7.get(i).getUse()));
		}
		
		String result=gson.toJson(total);
		
		
		System.out.println("WEEK GRAPH >> "+result);
		out.write(result);
		
	
		
			//1. insert yesterday's value to week_use's new
			
			
			//2. dao.week_use
			//2+3 combine result
			
		
	}

}
