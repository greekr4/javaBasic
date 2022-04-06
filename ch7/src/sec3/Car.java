package sec3;

public class Car {
	Tire Front_Left_Tire = new Tire("앞왼쪽바퀴",10);	//1
	Tire Front_Right_Tire = new Tire("앞오른쪽바퀴",10);	//2
	Tire Back_Left_Tire = new Tire("뒤왼쪽바퀴",10);		//3
	Tire Back_Right_Tire = new Tire("뒤오른쪽바퀴",10);	//4	
	
	
	//각 네 개의 바키가 동작(roll())을 하다가 만약 펑크가나면 stop();
	public int run(){
	System.out.println("자동차 시작");
	if(Front_Left_Tire.roll()==false) {
		stop();
		return 1;
	}
	if(Front_Right_Tire.roll()==false) {
		stop();
		return 2;
	}
	if(Back_Left_Tire.roll()==false) {
		stop();
		return 3;
	}
	if(Back_Right_Tire.roll()==false) {
		stop();
		return 4;
	}
	return 0;
	}

	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
