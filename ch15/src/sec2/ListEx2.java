package sec2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;


class Board{
	private String subject;
	private String content;
	private String writer;
	private Date regdate;
	
	public Board(String subject, String content, String writer, Date regdate) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}

	public String getSubject() {		return subject;	}
	public void setSubject(String subject) {		this.subject = subject;	}
	public String getContent() {		return content;	}
	public void setContent(String content) {		this.content = content;	}
	public String getWriter() {		return writer;	}
	public void setWriter(String writer) {		this.writer = writer;	}
	public Date getRegdate() {		return regdate;	}
	public void setRegdate(Date regdate) {		this.regdate = regdate;	}
	
	
}
public class ListEx2 {

	public static void main(String[] args) {
		List<Board> boardlist = new Vector<Board>();
		Date today = new Date();
		
		boardlist.add(new Board("제목1","내용1","작성자1",today));
		boardlist.add(new Board("제목2","내용2","작성자2",today));
		boardlist.add(new Board("제목3","내용3","작성자3",today));
		boardlist.add(new Board("제목4","내용4","작성자4",today));
		boardlist.add(new Board("제목5","내용5","작성자5",today));
		SimpleDateFormat a = new SimpleDateFormat();
		System.out.println("제목\t내용\t작성자\t작성일");
		for(Board bd : boardlist)
		{
			System.out.print(bd.getSubject()+"\t");
			System.out.print(bd.getContent()+"\t");
			System.out.print(bd.getWriter()+"\t");
			System.out.print(bd.getRegdate()+"\n");
		}
	}

}
