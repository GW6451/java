package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import model.FileUtils;
import model.GalleryDAO;
import model.GalleryDTO;

public class GalleryWriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Nailart/Write.jsp").forward(req, resp);
//		resp.sendRedirect("/KimYouKyungProj2/WebContent/Nailart/Write.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		MultipartRequest mr = FileUtils.upload(req, req.getServletContext().getRealPath("/Upload"));
		int successOrFail;
		String id,title,attachfile,content;
		int likecount=0;
		if(mr != null) {
			id = mr.getParameter("name");
			title = mr.getParameter("title");
			content = mr.getParameter("content");
			attachfile = mr.getFilesystemName("attachfile");
			
			GalleryDAO dao = new GalleryDAO(req.getServletContext(), user, password);
			GalleryDTO dto = new GalleryDTO();
			dto.setId(id);
			dto.setTitle(title);
			dto.setAttachfile(attachfile);
			dto.setContent(content);
			dto.setLikecount(likecount);
			
			successOrFail=dao.insert(dto);
			if(successOrFail ==0) {
				FileUtils.deleteFile(req, "/Upload", attachfile);
			}///			
		}///
		else {
			successOrFail=-1;
		}////
		req.setAttribute("SUCCFAIL", successOrFail);
		req.setAttribute("WHERE", "INS");
		req.getSession().setAttribute("user", user);
		req.getRequestDispatcher("Nailart/Message.jsp").forward(req, resp);
		
		
	}////////
	
}
