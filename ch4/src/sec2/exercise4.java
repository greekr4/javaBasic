package sec2;

public class exercise4 {

	public static void main(String[] args) {
	
		
		int i=0;
		while(i==0)
		{
			int a = (int) (Math.random() * 6)+1;
			int b = (int) (Math.random() * 6)+1;
			
			if (a+b == 5)
			{
				System.out.println("("+a+","+b+")");
				System.out.println("합이 5가 나왔습니다.");
				break;
			}
			else
			{
				System.out.println("("+a+","+b+")");
			}
		}
	}

}
