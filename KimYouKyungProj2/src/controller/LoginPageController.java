package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import model.GalleryDAO;
import model.MemberDAO;

public class LoginPageController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("요청방식:"+req.getMethod());
		req.getRequestDispatcher("/NailartMember/Login.jsp").forward(req, resp);

	}/////////
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		
		MemberDAO dao = new MemberDAO(req.getServletContext());
		boolean flag = dao.isMember(id, password);
		dao.close();
		if(!flag) {
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println("<script>");
			out.println("alert('아이디와 비밀번호가 일치하지 않습니다.');");
			out.println("history.back();");
			out.println("</script>");
			return;
		}
		else {
			req.getSession().setAttribute("id", id);
			req.getRequestDispatcher("/MainPage.jsp").forward(req, resp);
		}
	}////////////
	
}
