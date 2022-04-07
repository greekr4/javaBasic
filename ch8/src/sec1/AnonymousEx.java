package sec1;

public class AnonymousEx {

	public static void main(String[] args) {
		//익명의 클래스 : 자식(구현)클래스를 만들지 않고, 직접 생성자의 블록에서
		//			 구현내용을 기술해서 객체를 생성
		RemoteControl rc = new RemoteControl() {
			int Volume;
			public void turnOn() {System.out.println("ON");}
			public void turnOff() {System.out.println("OFF");}
			public void setVolume(int volume) {this.Volume=volume;}
			public int getVolume() {return 0;}
			};
			rc.turnOn();
		}
		

}

