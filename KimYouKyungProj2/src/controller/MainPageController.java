package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainPageController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("요청방식:"+req.getMethod());
		req.setAttribute("MainPage", "내일은 nail입니다. 환영합니다!" );
		req.getRequestDispatcher("/MainPage.jsp").forward(req, resp);
	}
}
