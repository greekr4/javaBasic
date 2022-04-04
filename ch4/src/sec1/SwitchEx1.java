package sec1;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		//int 변수 = 2;
		//switch(변수) {
		//case n: 
		//      실행문장n;
		//		break;
		//default:
		//		실행문장default;
		//
		//
		//}
		Scanner sc = new Scanner(System.in);
		int test1;

		for (int i=1; i <= 10; i++)
		{
		test1 = sc.nextInt();
		switch(test1) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			default:
				System.out.println("모릅니다.");
		}
				}
	}

}
