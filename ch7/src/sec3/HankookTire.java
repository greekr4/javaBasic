package sec3;

public class HankookTire extends Tire{

	
	HankookTire(String location) {
		this(location,40);
	}
	
	HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		System.out.println("HankookTire로 운행");
		++accRotation;
		if(this.maxRotation>this.accRotation) {
		System.out.println(location+"HankookTire의 남은 수명 : "+(maxRotation-accRotation));
		return true;
	}else {
		System.out.println(location+"HankookTire가 고장났습니다.");
		return false;
	}
	}
	
	
}
