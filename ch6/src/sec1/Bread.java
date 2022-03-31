package sec1;

public class Bread {


	
	private String name;
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	
	
	Bread()
	{
		this("빵");
	}
	Bread(String name) {
		this(name,"알 수 없음");
	}
	Bread(String name, String matrial) {
		this(name,matrial,90);
	}
	Bread(String name, String matrial, int gram) {
		this(name,matrial,gram,900);
	}
	Bread(String name, String matrial, int gram, int price) {
		this(name,matrial,gram,price,1);
	}
	Bread(String name, String matrial, int gram, int price, int cnt) {
		this.name = name;
		this.matrial = matrial;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}
	
	void info()
	{
		System.out.println("빵이름 : "+this.name);
		System.out.println("재료 : "+this.matrial);
		System.out.println("중량 : "+this.gram);
		System.out.println("가격 : "+this.price);
		System.out.println("남은개수 : "+this.cnt);
	}
	
	public int computerTotal() {
		return this.price*this.cnt;
	}
	public int computerTotal(int price) {
		return price*this.cnt;
	}
	public int computerTotal(int price,int cnt) {
		return price*cnt;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatrial() {
		return matrial;
	}

	public void setMatrial(String matrial) {
		this.matrial = matrial;
	}

	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	


	
}
