package sec3;

public class Gugudan {

	public static void main(String[] args) {
		//구구단 출력 프로그램 (이중for문)
		/*
		 * 2*1=2 3*1=3 4*1=4
		 * 2*2=4 ........
		 * ...........
		 * ............9*9 81 
		 */
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
