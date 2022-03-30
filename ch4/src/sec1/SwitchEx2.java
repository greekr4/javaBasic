package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i = 1,m;
		while(i==1)
		{
		System.out.print("탄생석을 알고 싶은 월 : ");
		m = sc.nextInt();
		switch(m)
		{
			case 1:
			System.out.println("가넷");
			break;
			case 2:
			System.out.println("자수정");
			break;
			case 3:
			System.out.println("아쿠아마린");
			break;
			case 4:
			System.out.println("다이아몬드");
			break;
			case 5:
			System.out.println("에메랄드");
			break;
			case 6:
			System.out.println("진주");
			break;
			case 7:
			System.out.println("루비");
			break;
			case 8:
			System.out.println("페리도트");
			break;
			case 9:
			System.out.println("사파이어");
			break;
			case 10:
			System.out.println("오팔");
			break;
			case 11:
			System.out.println("토파즈");
			break;
			case 12:
			System.out.println("터키석");
			break;
			default:
			System.out.println("정확한 월을 입력해주세요");

			
		}
		
		}
	}

}
