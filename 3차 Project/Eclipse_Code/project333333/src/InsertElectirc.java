
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertElectirc")
public class InsertElectirc extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mW = request.getParameter("mW");
		String sec = request.getParameter("time");
		String product = request.getParameter("product");
		
		float data_mW = Float.parseFloat(mW);
		float data_sec = Float.parseFloat(sec);
		
		
		float hour = data_sec/3600;
		float result_W = (float)(data_mW * 0.001) ; 
		float result_wH = (float)(data_mW / 3600) ;
		System.out.println(product +":"+ result_W + "/"+result_wH + "/"+hour);
		
		System.out.println(result_wH);
		SESVO vo = new SESVO(product,data_mW,hour,result_wH); // mW·Î »ðÀÔ
		RPDAO dao = new RPDAO();
		System.out.println(dao.ElectricInsert(vo));
		
	
	}

}

