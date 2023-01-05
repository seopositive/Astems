package vo;

import java.sql.Date;

public class BoardVO {
	
	private int seq;
	private String writer;
	private String title;
	private String content;
	private Date day;
	
	
	public BoardVO() {}

	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDay() {
		return day;
	}


	public void setDay(Date day) {
		this.day = day;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	
	
	
	
	
	
}
