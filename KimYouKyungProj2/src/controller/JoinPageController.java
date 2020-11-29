package controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.concurrent.Executor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import model.MemberDAO;
import model.MemberDTO;

public class JoinPageController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("요청방식:"+req.getMethod());
		req.getRequestDispatcher("/NailartMember/Join.jsp").forward(req, resp);
	}//////
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String addr = req.getParameter("addr");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		
		MemberDAO dao = new MemberDAO(req.getServletContext());
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setName(name);
		dto.setAge(age);
		dto.setGender(gender);
		dto.setAddr(addr);
		dto.setTel(tel);
		dto.setEmail(email);
		int affected = dao.insertMember(dto);
		
		if(affected == 1) {
			
			resp.sendRedirect(req.getContextPath()+"/NailartMember/LoginPage.kosmo");
		}
	}

}
