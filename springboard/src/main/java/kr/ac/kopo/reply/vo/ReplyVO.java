package kr.ac.kopo.reply.vo;

public class ReplyVO {
	private int no;
	private int boardNo;
	private String content;
	private String writer;
	private String regDate;
	
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReplyVO(int no, int board_no, String content, String writer, String regDate) {
		super();
		this.no = no;
		this.boardNo = board_no;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int board_no) {
		this.boardNo = board_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "ReplyVO [no=" + no + ", boardNo=" + boardNo + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + "]";
	}
	
	
	

}
