package sec3;

public class KumhoTire extends Tire{

	
	KumhoTire(String location) {
		this(location,30);
	}
	
	KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		System.out.println("KumhoTire로 운행");
		++accRotation;
		if(this.maxRotation>this.accRotation) {
		System.out.println(location+"KumhoTire의 남은 수명 : "+(maxRotation-accRotation));
		return true;
	}else {
		System.out.println(location+"KumhoTire가 고장났습니다.");
		return false;
	}
	}
	
}
