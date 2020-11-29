package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

public class GalleryDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	//커넥션풀사용
	public GalleryDAO(ServletContext context,String user,String password) {
		
		try {
			Context ctx = new InitialContext();
			DataSource source = (DataSource)ctx.lookup(context.getInitParameter("JNDI_ROOT")+"/kosmo");
			conn = source.getConnection();
		}
		catch (NamingException | SQLException e) {e.printStackTrace();}		
	}///GalaryDAO
	//자원반납
	public void close() {
		try {
			//메모리 해제]
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}
		catch(SQLException e) { e.printStackTrace();}		
	}////close
	//회원여부 판단용
	public boolean isMember(String id, String password) {
		String sql="SELECT COUNT(*) FROM member WHERE id=? AND pwd=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2, password);
			rs = psmt.executeQuery();
			rs.next();
			if(rs.getInt(1)==0) return false;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}		
		return true;	
	}
	//전체목록
	public List<GalleryDTO> selectList() {
		List<GalleryDTO> list = new Vector<GalleryDTO>();
		String sql = "SELECT no,title,id,likecount FROM gallery ORDER BY no DESC";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				GalleryDTO dto = new GalleryDTO();
				dto.setNo(rs.getInt(1));
				dto.setTitle(rs.getString(2));
				dto.setId(rs.getString(3));
				dto.setLikecount(rs.getInt(6));
				list.add(dto);
			}
		}
		catch(SQLException e) {e.printStackTrace();}
		
		return list;
	}//////////selectList
	
}
