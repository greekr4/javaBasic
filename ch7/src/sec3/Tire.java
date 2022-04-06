package sec3;

public class Tire {
	int maxRotation;		//최대 회전수(수명)
	int accRotation;		//누적 회전수
	String location;		//타이어 위치
	
	Tire(String location,int maxRotation){
	this.location = location;
	this.maxRotation = maxRotation;
	}
	public boolean roll(){
		++accRotation;
		if(this.maxRotation>this.accRotation) {
			System.out.println(location+"의 남은 수명 : "+(maxRotation-accRotation));
			return true;
		}else {
			System.out.println(location+"가 고장났습니다.");
			return false;
		}
	}
	
	
	
	
}
