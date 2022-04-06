package sec3;

public class BikeEx {

	public static void main(String[] args) {
		
		Bike a = new Bike();
		for(int i=0;i<=21;i++)
		{
			int errorTire = a.run();
			switch(errorTire) {
			case 1:
			System.out.println("바이크 앞바퀴 고장");
			break;
			case 2:
			System.out.println("바이크 뒷바퀴 고장");
			break;
			}
			System.out.println("------------------------");
	}

}
}
