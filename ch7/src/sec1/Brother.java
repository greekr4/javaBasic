package sec1;

public class Brother extends Parent{

	double filed3;
	
	Brother(){}
	Brother(int field1,String field2, double filed3)
	{
		this.filed1 = filed1;
		this.filed2 = filed2;
		this.filed3 = filed3;
		
	}
	
	
	@Override
	public void method2() {
		System.out.println("형제 메소드2");
	}
	
	public void method3() {
	}

	
}
