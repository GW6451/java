package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MemberDAO;
import model.MemberDTO;

public class MyPageController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("요청방식:"+req.getMethod());
		String id = (String)req.getSession().getAttribute("id");
		MemberDAO dao = new MemberDAO(req.getServletContext());
		MemberDTO dto = dao.selectOne(id);
		if(req.getSession().getAttribute("id")==null) {
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println("<script>");
			out.println("alert('로그인 후 이용바랍니다.');");
			out.println("history.back();");
			out.println("</script>");
			return;
		}
		else {
			req.setAttribute("dto", dto);
			req.getRequestDispatcher("/NailartMember/MyPage.jsp").forward(req, resp);
		}
		
	}//////

}
