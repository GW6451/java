package eltag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import model.GalleryDAO;

public class MyTagLib {

	public static boolean isMember(ServletContext context,String user,String password) {
		GalleryDAO dao = new GalleryDAO(context, "KOSMO", "KOSMO");
		boolean flag=dao.isMember(user, password);
		dao.close();
		return flag;
	}////////////////////////
	public static List selectList(ServletContext context,int start,int end) {
		GalleryDAO dao = new GalleryDAO(context, "KOSMO", "KOSMO");
		Map map = new HashMap();
		map.put("start",start);
		map.put("end",end);
		List list=dao.selectList();
		dao.close();
		return list;
	}////////////////////////
	
}
