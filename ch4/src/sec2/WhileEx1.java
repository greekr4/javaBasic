package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		//카운트변수초기화; wilhe(조건식) { 반복수행문; 증감식 }
		int i = 0, sum = 0;
		while(i<=10)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		//1~100까지 4의 배수의 합
		i = 0;
		sum = 0;
		while(i<=100){
			sum += i;
			i += 4;	
		}
		System.out.println(sum);
		
	}


}
