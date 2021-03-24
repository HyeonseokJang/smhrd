package realtimeFee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import newgraph2.graph2DAO;


@WebServlet("/realtimeFeeServ")
public class realtimeFeeServ extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList<feeVO> list = new ArrayList<>();
		PrintWriter out = response.getWriter();
		feeDAO dao = new feeDAO();
		String id = request.getParameter("roomId");
	  
		double result=dao.realtime_fee(id)/3;
		list=dao.realtime_fee_2();
		double ratio = list.get(0).getFee();
		 
		 String result_=String.valueOf((Calculater_total(result)*ratio)/100);
		 int calculate = Calculater_total(result);
		 System.out.println(calculate+"total");
		 System.out.println("ratio"+ratio);
	//	 System.out.println(String.valueOf((Calculater_total(result)*ratio))+"Total Fee");
		 System.out.println("realtime>>" + result_);
		out.print(result_);
		
	}
	   public int Calculater_total(double Kwh) {
	
		   int section1 = 730;
		   int section2 = 1260;
		   int section3 = 6060;
		   double tax = 0;
		   double fare = 0;

		      double total_pay = 0;
		      if (Kwh > 400) {
		         total_pay  = (200  * 78.3) + (200  * 147.3) + ((Kwh - 400)* 215.6) + section3;
		      } else if (Kwh > 200) {
		         total_pay  = (200  * 78.3) + ((Kwh - 200)  * 147.3) + section2;
		      } else {
		         total_pay  = (Kwh * 78.3) + section1;
		      }
		      tax = total_pay * 0.1;
		      fare = total_pay * 0.037;
		      total_pay = total_pay + tax + fare;
		      return (int) total_pay;
		   }
		
}
