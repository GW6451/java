package model;

import java.sql.Date;

public class GalleryDTO {
	 private int no;
	 private String title;
	 private String id;
	 private String attachfile;
	 private String content;
	 private int likecount;
	 private Date postdate;
	 
	 public GalleryDTO() {}

	public GalleryDTO(int no, String title, String id, String attachfile, String content, int likecount,
			Date postdate) {
		super();
		this.no = no;
		this.title = title;
		this.id = id;
		this.attachfile = attachfile;
		this.content = content;
		this.likecount = likecount;
		this.postdate = postdate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String name) {
		this.id = id;
	}

	public String getAttachfile() {
		return attachfile;
	}

	public void setAttachfile(String attachfile) {
		this.attachfile = attachfile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikecount() {
		return likecount;
	}

	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}

	public Date getPostdate() {
		return postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	
	 
}
