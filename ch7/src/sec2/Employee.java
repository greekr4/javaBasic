package sec2;

public class Employee extends Human{
	public final static int EYE = 4;
	//허용은 되나
	//super.EYE는 2이고
	//this.EYE는 4로 별도이다
	
	
	
	@Override
	public void method1() {
		super.method1();
	}
	
	/*
	 Human클래스 > 메소드2는 final => 오버라이징이 안돼서 오류
	 
	public void method2() {
		System.out.println("파이널 메소드 테스트");
	}
	 */	
	
	
}
