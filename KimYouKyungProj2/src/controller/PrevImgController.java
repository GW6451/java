package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.multi.MultiFileChooserUI;

import org.json.simple.JSONObject;

import com.oreilly.servlet.MultipartRequest;

import model.FileUtils;

public class PrevImgController extends HttpServlet{

	@Override
	protected void service(
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		MultipartRequest mr = FileUtils.upload(req, req.getServletContext().getRealPath("/Upload"));
		out.print(req.getServletContext().getRealPath("/Upload")+File.separator+mr.getOriginalFileName("url"));
		
	}///////
}///////////
