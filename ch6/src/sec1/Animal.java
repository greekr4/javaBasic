package sec1;

public class Animal {

	private String name;
	private String type;
	private int legs;
	private int wings;
	private boolean spine;
	private int speed;
	int data;
	public Animal()
	{
	this("동물");
	}
	public Animal(String name)
	{
		this(name,"알 수 없음");
	}
	public Animal(String name, String type) {
		this(name,type,0);
	}
	public Animal(String name, String type, int legs) {
		this(name,type,legs,0);
	}
	public Animal(String name, String type, int legs, int wings) {
		this(name,type,legs,wings,false);
	}
	public Animal(String name, String type, int legs, int wings, boolean spine) {
		this(name,type,legs,wings,spine,0);
	}
	public Animal(String name, String type, int legs, int wings, boolean spine, int speed) {
		this.name = name;
		this.type = type;
		this.legs = legs;
		this.wings = wings;
		this.spine = spine;
		this.speed = speed;
		if (speed > 0)
		{
		System.out.println(name+"이(가) 시속 "+speed+"(km)로 달립니다.");
		} else
		{
		System.out.println(name+"이(가) 달립니다.");
		}
	}
	
	public void running() {
		System.out.println("동물이 달립니다.");
	}
	public void running(String name) {
		System.out.println(this.name+"이(가) 달립니다.");
	}
	public void running(String name,int speed) {
		System.out.println(name+"이(가) "+speed+"(km)로 달립니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
}
