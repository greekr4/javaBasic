package sec2;

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
	
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run)
		{
			int mode = 0;
			int money = 0;
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			mode = sc.nextInt();
			if (mode == 1)
			{
				System.out.print("예금액 > ");
				money = sc.nextInt();
				if (money>0)
				{
					balance += money;
					System.out.println(money+"원 입금되었습니다.");
				}else {
					System.out.println("입금할 수 없는 금액");
				}
				
			} else if (mode == 2)
			{
				System.out.print("출금액 > ");
				money = sc.nextInt();
				if (money>0 && balance >= money)
				{
				balance -= money;
				System.out.println(money+"원 출금되었습니다.");
				}
				else {
					System.out.println("출금할 수 없는 금액");
				}

			} else if (mode == 3)
			{
				System.out.println("잔고 > " + balance);
			}else if (mode == 4)
			{
				System.out.println("프로그램 종료");
				run = false;
				//break;
			}else
			{
				System.out.println("정확히 입력해주세요.");
			}
		
			
		}
	}

}
