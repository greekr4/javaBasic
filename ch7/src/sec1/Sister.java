package sec1;

public class Sister extends Parent{
	
	double filed3;
	
	Sister(){}
	Sister(int field1,String field2, double filed3)
	{
		this.filed1 = filed1;
		this.filed2 = filed2;
		this.filed3 = filed3;
		
	}
	
	
	@Override
	public void method2() {
		System.out.println("자매 메소드2");
	}
	
	public void method3() {
	}

}
