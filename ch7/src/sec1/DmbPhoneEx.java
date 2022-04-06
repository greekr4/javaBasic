package sec1;

public class DmbPhoneEx {

	public static void main(String[] args) {

		DmbPhone dmb1 = new DmbPhone("아이폰XR","파랑",1);
		System.out.println("모델 : "+dmb1.model);
		System.out.println("색상 : "+dmb1.color);
		System.out.println("채널 : "+dmb1.channel);
		
		dmb1.powerON();
		dmb1.bell();
		dmb1.sendVoice("여보세요");
		dmb1.receiveVoice("안녕하셨습니까?");
		dmb1.hangUP();
		dmb1.turnOnDmb();
		dmb1.changeChannelDmb(12);
		dmb1.turnOffDmb();
		
		//dmb1.powerOFF();
		
		
		
		
		

	}

}
