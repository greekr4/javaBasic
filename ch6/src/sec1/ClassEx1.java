package sec1;

public class ClassEx1 {

	public static void main(String[] args) {
		int filed1;
		//객체 생성
		//클래스명 객체명 =  new 생성자함수();
		Sample1 obj1 = new Sample1();
		System.out.println(obj1.field1);
		obj1.field1 = 100;
		System.out.println(obj1.field1);
		obj1.field1 = 200;
		System.out.println(obj1.field1);
		//obj1.filed2 = 3.28f;	- filed2가 private이므로 직접 접근 X
		//							=> getter, setter를 통해 접근 가능
		Sample1 obj2 = new Sample1(10);

		obj2.setField2(3.18f);
		System.out.println(obj2.field1);
		System.out.println(obj2.getField1());
		System.out.println(obj2.getField2());
		
		Sample1 obj3 = new Sample1(20,3.14f);
		obj3.setField2(3.11f);
		System.out.println("*******obj3******");
		System.out.println(obj3.field1);
		System.out.println(obj3.getField2());
		
	}

}
