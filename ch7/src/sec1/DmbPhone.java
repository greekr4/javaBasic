package sec1;

public class DmbPhone extends CellPhone{
	int channel;
	
	DmbPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		}
	public void turnOnDmb(){
		System.out.println("현재 채널 : "+this.channel+"번 방송을 시작합니다.");
	}
	public void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("채널을 "+this.channel+"번 으로 변경합니다.");
	}
	public void turnOffDmb(){
		System.out.println("DMB 방송을 종료합니다.");
	}
	
	
}
