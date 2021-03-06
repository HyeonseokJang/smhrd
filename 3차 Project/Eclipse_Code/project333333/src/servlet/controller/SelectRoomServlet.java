package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.JsonObject;

import Model.MemberDAO;

@WebServlet("/SelectRoom.do")
public class SelectRoomServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain; charset=UTF-8");
		request.setCharacterEncoding("EUC-KR");
		
		String roomnum = request.getParameter("roomnum");
		
		
		MemberDAO dao = new MemberDAO();
		boolean roomcheck = dao.searchroom(roomnum);
		PrintWriter out = response.getWriter();
		
		out.print(roomcheck);
	}
	
}
