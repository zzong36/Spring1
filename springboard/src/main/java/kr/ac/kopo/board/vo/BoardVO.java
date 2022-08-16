package kr.ac.kopo.board.vo;

import javax.validation.constraints.NotEmpty;

public class BoardVO {
 
	
	private int no;
	@NotEmpty(message="제목은 필수사항입니다")
	private String title;
	@NotEmpty(message="작성자는 필수사항입니다")
	private String writer;
	@NotEmpty(message="내용은 필수사항입니다")
	private String content;
	private int viewCnt;
	private String regDate;

//	public BoardVO() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public BoardVO(int no, String title, String writer, String content, int viewCnt, String regDate) {
//		super();
//		this.no = no;
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//		this.viewCnt = viewCnt;
//		this.regDate = regDate;
//	}

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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", viewCnt="
				+ viewCnt + ", regDate=" + regDate + "]";
	}

}
