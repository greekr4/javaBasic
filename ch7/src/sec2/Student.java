package sec2;
//super() : 부모 생성자 호출
//this() : 현재 클래스의 생성자 호출
//super.필드명 : 부모의 필드
//this.필드명 : 현재 클래스의 필드
//super.메소드명() : 부모의 메소드
//this.메서드명() : 현재 클래스의 메소드

public class Student extends Human{
	public String no;
	public String part;
	
	Student(){}
	Student(String name, String jumin,int age,String no,String part){
		//부모의 생성자 호출 super(,,);
		super(name,jumin);
		//부모의 필드
		super.age = age;
		this.no = no;
		this.part = part;
		}
	
	public void method1() {
		System.out.println("학생 객체입니다.");
	}
	/*
	 Human클래스 > 메소드2는 final => 오버라이징이 안돼서 오류
	public void method2() {
		super.method1();
	}
	*/
	public void method3() {
		this.method1();
	}
	
	
}
