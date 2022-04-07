package sec2;

public class CellPhone {
	String model;
	String color;
	
	public void powerON(){
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOFF(){
		System.out.println("전원을 켭니다.");
	}
	
	public void bell(){
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String m){
		System.out.println("메세지를 보냈습니다.\n> "+m);
	}
	public void receiveVoice(String m){
		System.out.println("메세지가 왔습니다.\n> "+m);
	}
	public void hangUP(){
		System.out.println("전화를 끊었습니다.");
	}
	
	
}
