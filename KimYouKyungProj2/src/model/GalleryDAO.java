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
			DataSource source = (DataSource)ctx.lookup(context.getInitParameter("JNDI_ROOT")+"spring/KOSMO");
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
	
	public int getTotalRecordCount() {
		int totalCount = 0;
		String sql = "SELECT COUNT(*) FROM gallery";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			rs.next();
			totalCount = rs.getInt(1);
		}
		catch (SQLException e) {e.printStackTrace();}
		return totalCount;
	}////////getTotalRecordCount
	
	public int insert(GalleryDTO dto) {
		int affected = 0;
		String sql="INSERT INTO gallery(no,id,title,attachfile,content) VALUES(SEQ_GALLERY.NEXTVAL,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getAttachfile());
			psmt.setString(4, dto.getContent());
			psmt.setInt(5, dto.getLikecount());
			affected=psmt.executeUpdate();
		}
		catch (SQLException e) {e.printStackTrace();}
		return affected;		
	}/////////insert
	
	public GalleryDTO selectOne(String no) {
		GalleryDTO dto = null;
		String sql="SELECT * FROM gallery WHERE no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, no);
			rs = psmt.executeQuery();
			if(rs.next()) {
				dto= new GalleryDTO();
				dto.setNo(rs.getInt(1));
				dto.setTitle(rs.getString(7));
				dto.setId(rs.getString(2));
				dto.setAttachfile(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setLikecount(rs.getInt(6));
			}/////if
		}
		catch (SQLException e) {e.printStackTrace();}
		return dto;
	}///////selectOne
	
}
