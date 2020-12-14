package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;


public class MemberDAO {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;	

	public MemberDAO(ServletContext context) {		
		try {
			Context ctx = new InitialContext();
			DataSource source = (DataSource)ctx.lookup(context.getInitParameter("JNDI_ROOT")+"spring/KOSMO");
			conn = source.getConnection();
			System.out.println("접속성공");
		}
		catch(NamingException | SQLException e) {
			e.printStackTrace();
			System.out.println("접속 실패");
		}
	}///////////

	///자원반납
	public void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}
		catch(SQLException e) {e.printStackTrace();}
	}//////////close
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
	public MemberDTO join() {
		MemberDTO dto = new MemberDTO();		
		String sql="SELECT * FROM member";		
		try {
			psmt = conn.prepareStatement(sql);			
			rs = psmt.executeQuery();
			while(rs.next()) {
				psmt = conn.prepareStatement(sql);
				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setAge(rs.getInt(8));
				dto.setGender(rs.getString(9));
				dto.setAddr(rs.getString(4));
				dto.setTel(rs.getString(5));
				dto.setEmail(rs.getString(6));
				dto.setRegidate(rs.getDate(7));			
			}
		}
		catch(SQLException e) {e.printStackTrace();}
		
		return dto;
	}/////////////selectList
	
	public int insertMember(MemberDTO dto) {
		int affected = 0;
		System.out.println(dto.getName());
		String sql="INSERT INTO member(id,pwd,name,age,gender,addr,tel,email) VALUES(?,?,?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,dto.getId());
			psmt.setString(2,dto.getPwd());
			psmt.setString(3,dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setString(5, dto.getGender());
			psmt.setString(6, dto.getAddr());
			psmt.setString(7, dto.getTel());
			psmt.setString(8, dto.getEmail());
			affected = psmt.executeUpdate();
			System.out.println(affected);
		} 
		catch (SQLException e) {e.printStackTrace();}
		
		return affected;
	}////////
	public MemberDTO selectOne(String id) {
		MemberDTO dto=null;
		String sql="SELECT * FROM member WHERE id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setAge(rs.getInt(9));
				dto.setGender(rs.getString(8));
				dto.setAddr(rs.getString(4));
				dto.setTel(rs.getString(5));
				dto.setEmail(rs.getString(6));
				dto.setRegidate(rs.getDate(7));
			}
		}
		catch(SQLException e) {e.printStackTrace();}
		return dto;
	}/////////selectOne
	
}
