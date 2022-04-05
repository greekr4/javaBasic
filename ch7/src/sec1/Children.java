package sec1;

//class 클래스명 extends 부모클래스명 {}
//부모 클래스 = 슈퍼 클래스
//자식 클래스 = 서브 클래스


public class Children extends Parent{
	double filed3;
	
	Children(){}
	Children(int field1,String field2, double filed3)
	{
		this.filed1 = filed1;
		this.filed2 = filed2;
		this.filed3 = filed3;
		
	}
	@Override
	public void method2() {
		System.out.println("자식 메소드2");
	}
	
	public void method3() {
	}

}
