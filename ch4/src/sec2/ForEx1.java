package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		//for(초기값;조건식;증감식) { 반복 실행할 문장; }
		for(int i=1;i<=10;i++)
		{
			//System.out.println(i+"번째-----------");
			// (1) (2) (3) {4}
			
			//(1)은 처음 한 번만 실행
			//(2) 실행
			//{4} 실행
			//(3) 실행
			//(2) 실행
			//{4} 실행
			//(3),(2),{4} (2번)조건이 만족하면 반복

		}
		for(int i=0;i<=10;i++) { 
			if(i % 2 ==0) //짝수 일 경우 건너띄기
			{
				continue;
			}
				//System.out.println("i : "+ i);
		}
		for(int i=1;i<=10;i+=2)
		{
			//System.out.println(i);
		}
		
		//1+2+3+4...~98+99+100까지의 합계
		int sum = 0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;

		}
		System.out.println(sum);
		
		//1~100까지의 3의 배수의 합계
		int sum2 = 0;
		for(int i=3;i<=100;i+=3)
		{
			sum2+=i;
			System.out.println(sum2);
		}
		
	}

}
