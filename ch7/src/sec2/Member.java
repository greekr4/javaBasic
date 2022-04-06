package sec2;

//final class는 상속받을 수 없다
public final class Member extends Human{
	String id;
	String pw;
	public void join()
	{
		System.out.println("회원 가입");
	}
	public void login()
	{
		System.out.println("로그인");
	}
	public void modify()
	{
		System.out.println("회원정보 수정");
	}
}
