package sec1;

import java.util.Scanner;

public class Hello4 {

	public static void main(String[] args) {

		int kor, mat, eng, total;	//변수 선언
		double aver;				//변수 선언
		Scanner sc = new Scanner (System.in);		// 키보드 생성
		System.out.println("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		mat = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = sc.nextInt();
		total = kor + mat + eng;				// 총점 더하여 total 변수에 저장
		aver = total / 3;						// 총점을 3으로 나눠 aver 변수에 저장
		System.out.println("당신의 총점은 " + total + "점이며, 평균은 " + aver + "점입니다.");
		System.out.println("당신의 총점은 " + (kor+mat+eng) + "점이며, 평균은 " + ((kor+mat+eng)/3) + "점입니다.");
		
	}

}
