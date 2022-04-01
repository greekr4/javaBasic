package sec1;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		int edps,pl,db,tot;
		double avg;
		String pan,hak,dv;		//합격여부 (pan) 학점 (hak) 장학생 (dv)
		Scanner sc = new Scanner (System.in);
		System.out.print("전산 점수 입력 : ");
		edps = sc.nextInt();
		System.out.print("프로그래밍 점수 입력 : ");
		pl = sc.nextInt();
		System.out.print("데이터베이스 점수 입력 : ");
		db = sc.nextInt();
		tot = edps+pl+db;
		avg = (double)tot/3;
		avg = Math.round(avg*100)/100.0;
		if (edps>=70 && pl>=70 && db>=70)
		{
			pan = "합격";
		} else
		{
			pan = "불합격";
		}
		if (avg >= 90)
		{
			hak = "A";
			if (avg >= 98)
			{
				hak += "+";
			} else if (avg >=94)
			{
				hak += "0";
			} else
			{
				hak += "-";
			}
		} else if (avg >= 80)
		{
			hak = "B";
			if (avg >= 88)
			{
				hak += "+";
			} else if (avg >=84)
			{
				hak += "0";
			} else
			{
				hak += "-";
			}
		}else if (avg >= 70)
		{
			hak = "C";
			if (avg >= 78)
			{
				hak += "+";
			} else if (avg >=74)
			{
				hak += "0";
			} else
			{
				hak += "-";
			}
		}else if (avg >= 60)
		{
			hak = "D";
			if (avg >= 68)
			{
				hak += "+";
			} else if (avg >=64)
			{
				hak += "0";
			} else
			{
				hak += "-";
			}
		}else
		{
			hak = "F";
		}
		if (edps >= 95 && pl >= 95 && db >= 95)
		{
			dv = "특장학생";
		} else if (edps >= 95 || pl >= 95 || db >= 95)
		{
			dv = "과목장학생";
		} else
		{
			dv = "일반학생";
		}
		//System.out.println("\n당신의 총점은 "+tot+"점 이며 평균은 "+avg+"점 입니다."+"\n그러므로 당신은 "+pan+" 입니다. \n또한 당신의 학점은 "+hak+" 이며 \n당신은 "+dv+" 입니다.");
		System.out.println("┌───────────────┐\n│  총점 : "+tot+"	│\n│  평균 : "+avg+"	│\n│  학점 : "+hak+"	│\n│  패스 : "+pan+"	│\n│  너는 : "+dv+"	│\n└───────────────┘");
		
	}

}
