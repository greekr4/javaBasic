package sec3;

public class Bus {
	Tire[] tires = {
		new Tire("1번바퀴",20),
		new Tire("2번바퀴",20),
		new Tire("3번바퀴",20),
		new Tire("4번바퀴",20),
		new Tire("5번바퀴",20),
		new Tire("6번바퀴",20)	
	};
	public int run(){
		System.out.println("버스 시작");
		for (int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
		}
		
		public void stop() {
			System.out.println("버스 END");
		}
}
