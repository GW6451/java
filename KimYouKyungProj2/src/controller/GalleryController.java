package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GalleryDAO;
import model.GalleryDTO;

public class GalleryController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		
		GalleryDAO dao = new GalleryDAO(req.getServletContext(),id,password);
		List<GalleryDTO> list = dao.selectList();
		dao.close();
		if(req.getSession().getAttribute("id")==null) {
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println("<script>");
			out.println("alert('회원만 이용가능합니다. 로그인 후 이용바랍니다.');");
			out.println("history.back();");
			out.println("</script>");
			return;
		}
		else {
			req.getSession().setAttribute("list", list);
			req.getRequestDispatcher("/Nailart/Gallery.jsp").forward(req, resp);
		}
	}
}
