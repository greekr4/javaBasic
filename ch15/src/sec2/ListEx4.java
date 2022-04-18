package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	private String email;
	private String tel;
	public Member(String uid, String pw, String email, String tel) {
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}


public class ListEx4 {

	public static void main(String[] args) {
	 List<Member> m1 = new ArrayList<>();

	 m1.add(new Member("test1","a1234","test1@test.com","010-111-1111"));
	 m1.add(new Member("test2","a1234","test2@test.com","010-222-1111"));
	 m1.add(new Member("test3","a1234","test3@test.com","010-333-1111"));
	 m1.add(new Member("test4","a1234","test4@test.com","010-444-1111"));
	 m1.add(new Member("test5","a1234","test5@test.com","010-555-1111"));
	 
	 System.out.println("ID\tPW\tEmail\t\tTel");
	 for (Member i : m1) {
		 System.out.print(i.getUid()+"\t");
		 System.out.print(i.getPw()+"\t");
		 System.out.print(i.getEmail()+"\t");
		 System.out.print(i.getTel()+"\n");
	 }
	 
	 
	 
	 
	 
	}

}
