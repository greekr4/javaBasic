package sec2;

public class sonicEx {

	public static void main(String[] args) {
		SupersonicAirplane a = new SupersonicAirplane();
		
		a.takeOff();
		a.fly();
		a.flyMode = 2;
		a.fly();
		a.flyMode = 1;
		a.fly();
		a.flyMode = a.SUPERSONIC;
		a.fly();
		a.landing();
		
		
		
	}

}
