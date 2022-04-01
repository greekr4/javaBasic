package sec1;
//제어문 : 프로그래밍에서 프로그램의 흐름을 제어하는 것으로
//조건분기문 : 조건에 따라 실행내용이 달라지게 하는 것(if/elseif/else)
//switch : switch/case
//반복문 : 프로그래밍상 같은 실행문으로 여러번 실행하게 하는 것
//for, while, do~while
//기타 제어문
//break, continue
public class IfEx1 {

	public static void main(String[] args) {
		String name = "가나다";
		int kor = 100;
		int eng = 100;
		int mat = 100;
		int tot = kor + eng + mat;
		String pass = "불합격";
		//if(조건식) { }
		if (tot >= 200)
		{
			pass = "합격";
		}
		System.out.println(pass);
		
		if (kor>=90 || eng >=90 || mat >= 90)
		{
			System.out.println("과목 우수자");
		} else {
			System.out.println("대상 아님");
		}
		
		if(kor>=90 && eng>=90 && mat >= 90)
		{
			System.out.println("장학생");
		} else {System.out.println("일반학생");
		}
		
		System.out.print("학점 : ");
		if (tot >= 270)
		{
		System.out.println("A");	
		}
		else if (tot >= 240)
		{
		System.out.println("B");	
		}
		else if (tot >= 210)
		{
		System.out.println("C");
		}
		else if (tot >= 180)
		{
		System.out.println("D");
		}
		else
		{
		System.out.println("F");
		}
		
		if(tot >=270)
		{
			
			System.out.print("A");
			if(tot>=290)
			{
				System.out.println("+");
			} else if(tot>=280)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print("-");
			}
		}
		
		else if(tot >=240)
		{
			
			System.out.print("B");
			if(tot>=260)
			{
				System.out.println("+");
			} else if(tot>=250)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print("-");
			}
		}
		
		
	}
	
}
