package sec3;

public class CarEx1 {

	public static void main(String[] args) {
		Car a = new Car();
		for(int i=0;i<=12;i++)
		{
			int errorTire = a.run();
			switch(errorTire) {
			case 1:
				System.out.println("앞 왼쪽타이어 고장");
			break;
			case 2:
				System.out.println("앞 오른쪽타이어 고장");
			break;
			case 3:
				System.out.println("뒤 왼쪽 타이어 고장");	
			break;
			case 4:
				System.out.println("뒤 오른쪽 타이어 고장");
			break;
			}
			System.out.println("------------------------");
		}
	}

}
