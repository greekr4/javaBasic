package sec3;

public class MichelTire extends Tire{

	
	MichelTire(String location) {
		this(location,50);
	}
	
	MichelTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		System.out.println("MichelTire로 운행");
		++accRotation;
		if(this.maxRotation>this.accRotation) {
		System.out.println(location+"MichelTire의 남은 수명 : "+(maxRotation-accRotation));
		return true;
	}else {
		System.out.println(location+"MichelTire가 고장났습니다.");
		return false;
	}
	}
	
}
