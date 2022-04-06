package sec3;

public class Car2 {
	Tire[] tires = {
			new Tire("앞왼쪽",20),
			new Tire("앞오른쪽",20),
			new Tire("뒤왼쪽",20),
			new Tire("뒤오른쪽",20)
	};
	
	public int run(){
	System.out.println("자동차 시작");
	for (int i=0;i<tires.length;i++) {
		if(tires[i].roll()==false) {
			stop();
			return i+1;
		}
	}
	return 0;
	}
	
	public void stop() {
		System.out.println("END");
	}
}
