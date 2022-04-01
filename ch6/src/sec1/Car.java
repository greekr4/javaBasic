package sec1;

public class Car {
	private String name;
	private String style;
	private String company;
	private String fuel;
	private int tire;
	private int speed;
	private String num;
	private int usetime;
	private int fuel2;
	
	
	public Car() {
		this("자동차");
	}
	
	public Car(String name) {
		this(name,"승용차");
	}
	
	public Car(String name, String style) {
		this(name,style,"회사");
	}
	
	public Car(String name, String style, String company) {
		this(name,style,company,"휘발유");
	}
	
	public Car(String name, String style, String company, String fuel) {
		this(name,style,company,fuel,4);
	}
	public Car(String name, String style, String company, String fuel, int tire) {
		this(name,style,company,fuel,tire,0);
	}
	public Car(String name, String style, String company, String fuel, int tire, int speed) {
		this(name,style,company,fuel,tire,speed,"12-1234");
	}
	public Car(String name, String style, String company, String fuel, int tire, int speed, String num) {
		this(name,style,company,fuel,tire,speed,num,0);
	}
	
	public Car(String name, String style, String company, String fuel, int tire, int speed, String num, int usetime
			) {
		this(name,style,company,fuel,tire,speed,num,usetime,0);
	}
	
	public Car(String name, String style, String company, String fuel, int tire, int speed, String num, int usetime,
			int fuel2) {
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
		this.fuel2 = fuel2;
		
		System.out.println("차량 정보가 등록되었습니다.");
		System.out.println("차이름 : "+name);
		System.out.println("차종류 : "+style);
		System.out.println("회사 : "+company);
		System.out.println("연료 종류 : "+fuel);
		System.out.println("타이어 수 : " +tire);
		System.out.println("속도 : "+speed);
		System.out.println("차넘버 : "+num);
		System.out.println("주차시간 : "+usetime);
		System.out.println("연료량 : "+fuel2);
		
	}
	public void computerMoney()
	{
		System.out.println("차량정보를 확인할 수 없습니다.");
	}
	public void computerMoney(int usetime)
	{
		System.out.println("주차요금은 1분당 100원이므로 "+(usetime*100)+"원입니다.");
	}
	public void computerMoney(int usetime,String type)
	{
		System.out.println("주차요금은 1분당 100원이므로 "+(usetime*100)+"원입니다.");
		if (type == "경차")
		{
		System.out.println("경차 주차요금은 1분당 50원이므로 "+(usetime*50)+"원입니다.");
		} else if (type == "승용차")
		{
		System.out.println("승용차 주차요금은 1분당 100원이므로 "+(usetime*100)+"원입니다.");
		} else
		{
		System.out.println("주차요금은 1분당 200원이므로 "+(usetime*200)+"원입니다.");
		}
	}
	
	public void computerFuel()
	{
		System.out.println("주유량과 연료를 알 수 없습니다.");
	}
	public void computerFuel(int fuel2)
	{
		System.out.println("1당 100원이니 최대로 넣었을 때는"+((100-fuel2)*100)+"원입니다.");
	}
	public void computerFuel(int fuel2,String fuel)
	{
		if (fuel == "휘발유")
		{
		System.out.println("휘발유는 1당 2000원이니 최대로 넣었을 때는"+((100-fuel2)*2000)+"원입니다.");
		} else
		{
			System.out.println("경유는 1당 1500원이니 최대로 넣었을 때는"+((100-fuel2)*1500)+"원입니다.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getUsetime() {
		return usetime;
	}
	public void setUsetime(int usetime) {
		this.usetime = usetime;
	}
	public int getFuel2() {
		return fuel2;
	}
	public void setFuel2(int fuel2) {
		this.fuel2 = fuel2;
	}
	
	
	
	
	
	
	
	
	
}
