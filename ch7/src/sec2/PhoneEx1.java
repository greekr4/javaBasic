package sec2;

public class PhoneEx1 {

	public static void main(String[] args) {
		DmbPhone p1 = new DmbPhone("모델","빨강",1);
		p1.powerON();
		p1.powerOFF();
		p1.bell();
		p1.sendVoice("ㅋㅋ");
		p1.receiveVoice("ㅇㅇ");
		p1.hangUP();
		p1.turnOnDmb();
		p1.changeChannelDmb(2);
		p1.turnOffDmb();

	}

}
