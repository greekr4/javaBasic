package sec3;

public class CarEx2 {

	public static void main(String[] args) {
		Car a = new Car();
		for(int i=0;i<=15;i++)
		{
			int errorTire = a.run();
			switch(errorTire) {
			case 1:
				System.out.println("앞 왼쪽타이어 고장");
				a.Front_Left_Tire = new KumhoTire("앞왼쪽");
			break;
			case 2:
				System.out.println("앞 오른쪽타이어 고장");
				a.Front_Right_Tire = new HankookTire("앞오른쪽");
			break;
			case 3:
				System.out.println("뒤 왼쪽 타이어 고장");	
				a.Back_Left_Tire = new MichelTire("뒤왼쪽");
			break;
			case 4:
				System.out.println("뒤 오른쪽 타이어 고장");
			break;
			}
			System.out.println("------------------------");
		}
		Tire tire0 = new Tire("그냥타이어",50);
		Tire tire1 = new KumhoTire("금호타이어");
		Tire tire2 = new MichelTire("미세린타이어");
		Tire tire3 = new HankookTire("한국타이어");
		MichelTire tire4 = new MichelTire("미쉐린타이어2");
		System.out.println("tire0는 Tire 클래스로 부터 만들어진 인스턴스인가?"+(tire0 instanceof Tire));
		System.out.println("tire1는 Tire 클래스로 부터 만들어진 인스턴스인가?"+(tire1 instanceof Tire));
		System.out.println("tire4는 Tire 클래스로 부터 만들어진 인스턴스인가?"+(tire4 instanceof Tire));
		//System.out.println("tire4는 Tire 클래스로 부터 만들어진 인스턴스인가?"+(tire4 instanceof HankookTire));
		
		
		
		
		
	}

}
