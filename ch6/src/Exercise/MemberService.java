package Exercise;

public class MemberService {

	private String id;
	private String pw;
	public boolean login(String id,String pw)
	{
		if (id=="hong" && pw =="12345")
		{
		return true;
		}else {
		return false;
		}
		
	}
	public void logout(String id)
	{
		System.out.println("로그아웃 되었습니다.");
		
	}
}
