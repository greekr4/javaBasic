package sec3;

public class Bike {
	Tire Front_Left_Tire = new Tire("앞왼쪽바퀴",20);		//1
	Tire Back_Left_Tire = new Tire("뒤왼쪽바퀴",20);		//2
	
	
	public int run(){
	System.out.println("바이크 시작");
	if(Front_Left_Tire.roll()==false) {
		stop();
		return 1;
	}
	if(Back_Left_Tire.roll()==false) {
		stop();
		return 2;
	}
	return 0;
	}
	
	public void stop() {
		System.out.println("바이크가 멈춥니다.");
	}
}
