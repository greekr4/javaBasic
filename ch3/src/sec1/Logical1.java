package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//&&, ||, !, &, |
		int a = 30; // 1 1110
		int b = 20; // 1 0100
		int c = 10; // 0 1010
		
		System.out.println("a와 b의 AND 연산 : " + (a & b));
		System.out.println("a와 b의 OR 연산 : " + (a | b));
		System.out.println("a와 b의 XOR 연산 : " + (a ^ b));
		System.out.println("~a -> 비트 Not (보수) : " + (~a));
		
		
		
		/*
		 
		
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)연산 : 입력값이 모두 참일 때만 true
		System.out.println("&& => AND연산의 결과1 : "+(d && e));
		System.out.println("&& => AND연산의 결과2 : "+(d && f));
		System.out.println("&& => AND연산의 결과3 : "+(d && f));
		System.out.println("&& => AND연산의 결과4 : "+(f && f)+"\n");
		//||(OR)연산 : 어느 하나라도 입력이 참이 있으면 true
		System.out.println("|| => OR연산의 결과1 : "+(d || e));
		System.out.println("|| => OR연산의 결과2 : "+(d || f));
		System.out.println("|| => OR연산의 결과3 : "+(d || f));
		System.out.println("|| => OR연산의 결과4 : "+(f || f)+"\n");
		//!(NOT) : 입력된 논리값을 true는 false로, false는 true로
		System.out.println(d+"! => NOT연산의 결과1 : "+(!d));
		System.out.println(f+"! => NOT연산의 결과2 : "+(!f));

		 */
	}

}
