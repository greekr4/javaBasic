package sec1;

public class Shift1 {

	public static void main(String[] args) {
		//시프트(자리이동) 연산자
		// 16	8	4	2	1
		// 1	0	1	0	0
		// a>>2 =
		// 0	0	1	0	1	0	0 즉 5
		
		// a<<2 =
		// 64	32	16	8	4	2	1
		// 1	0	1	0	0	0	0 즉 80
		
		int a = 20;
		System.out.println("a>>2 : " + (a>>2));		//산술
		System.out.println("a<<2 : " + (a<<2));		//산술
		System.out.println("a>>>2 : "+ (a>>>2));	//논리
													//a<<<2 는 없음
		
		
		

	}

}
