
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Json")
public class Json extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RPDAO dao = new RPDAO();
		ArrayList<ProductVO> list = dao.ProductONOFF();

		String JsonString = "{";

		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = list.get(i);
			JsonString += "\"" + vo.getSes_product() + "\":" + "\"" + vo.getSes_status() + "\"";

			if (i != list.size() - 1) {
				JsonString += ",";
			}

		}
		JsonString += "}";
		System.out.println(JsonString);
		response.getWriter().print(JsonString);

	}

}
