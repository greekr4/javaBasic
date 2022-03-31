package sec1;

public class Car2 {

	public static void main(String[] args) {
		/*
	private String name;
	private String style; 자동차종류 //경차,승용차,승합차,화물차
	private String company;
	private String fuel; fuel 연료	//경유, 등유, 휘발유, 가스, 전기, 수소
	private int tire;
	private int speed;
	private String num;
	private int usetime;
	private int fuel2;
		 */
		
		Car a = new Car("1번차","경차","현대","휘발유");
		a.setFuel2(10);
		a.computerFuel(a.getFuel(),a.getFuel2());
		a.computerMoney();
		
		
		

	}

}
