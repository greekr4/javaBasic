package sec1;

public class MyFncEx1 {

	public static void main(String[] args) {
		MyFnc1 f1;
		f1 = () -> {
			System.out.println("f1.method1");
		};
		f1.method1();
		
		MyFnc2 f2;
		f2 = (x) -> {
			System.out.println(x*x);
		};
		
		f2.method2(5);
		
		MyFnc3 f3;
		f3 = () -> {
			return 1;
		};
		
		System.out.println(f3.method3());
		
		MyFnc4 f4;
		f4 = (x) -> {
			
			return x*x*x;
		};
		
		System.out.println(f4.method4(4));
		
	}

}
