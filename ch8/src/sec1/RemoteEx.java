package sec1;

public class RemoteEx {

	public static void main(String[] args) {
		RemoteControl rc1;	
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		System.out.println(rc1.getVolume());
		rc1.turnOff();
		//System.out.println(rc1.get채널());  => 인터페이스에 메소드가 없음
		rc1 = new AudioRemote();
		rc1.setVolume(20);
		System.out.println(rc1.getVolume());
		
		//클래스를 인터페이스로 시작 안하는 경우
		TvRemote rc2 = new TvRemote();
		rc2.volume = 30;
		rc2.channel = 20;
		RemoteControl rc3 = rc2;
		//AudioControl rc5 = (AudioControl)rc3;
		RemoteControl rc4 = rc2;
		TvRemote tv1 = new TvRemote();
		play(rc2);						//call by reference
		play(rc2.volume,rc2.channel);	//call by value
		
	}

	private static void play(TvRemote tv1) {
		System.out.println("TV의 볼륨 "+tv1.volume);
		System.out.println("채널 "+tv1.channel);
		System.out.println("플레이를 합니다.");
	}
	private static void play(int Voluem, int Channel) {
		System.out.println(Voluem);
		System.out.println(Channel);
		System.out.println("플레이를 합니다.");
	}
}
