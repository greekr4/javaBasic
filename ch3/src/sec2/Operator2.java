package sec2;

public class Operator2 {

	public static void main(String[] args) {

		//
		int a=20; boolean b=true; 		//컴파일러가 2줄로 인식
		
		System.out.println("a="+a		//컴파일러가 1줄로 인식
				+", b="+b);
		
		int c=20;		
		int d=a+c;			//이항연산
		boolean e = !b;		//단항연산
		String pass = a>=20 ? "합격" : "불합격";		//삼항연산
		
		// (operator) = 연산 = 명령어(Instruction)
		// op-code	operand
		// 연산자		피연산자
		// end							=> 				=> 제0주소 명령어 형식
		// !		b					=> 단항(unary)	=> 제1주소 명령어 형식
		// +		a,c					=> 이항(binary)	=> 제2주소 명령어 형식
		// ?:		조건, true, false		=> 기타			=> 제3주소 명령어 형식
		
		
		
		double x = 5.0;
		double y = 0.0;
		double z = x%y;
		
		System.out.println(z);
		
		if(z==1)
		{
			System.out.println(z);
		}

		
		
		
		
		
		
		
		
		
		
	}

}
