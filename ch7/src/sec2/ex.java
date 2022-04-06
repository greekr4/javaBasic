package sec2;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student("d","d",1,"d","d");
		
		a.method1();
		a.method2();
		a.method3();
		
		Calculator b = new Calculator();
		System.out.println(b.areaCircle(10));
		
		Computer c = new Computer();
		System.out.println(c.areaCircle(10));
		
	}

}
