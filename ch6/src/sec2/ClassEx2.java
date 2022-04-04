package sec2;

public class ClassEx2 {

	public static void main(String[] args) {
		Class2 obj1 = new Class2();	//객체는 동적 할당
		obj1.method1();
		//obj1.method2();	  (X)
		Class2.method2();	//(O)
		Class2.num = 1;
		obj1.cnt = 1;
	}

}
