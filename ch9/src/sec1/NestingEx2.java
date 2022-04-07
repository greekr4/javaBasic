package sec1;
//정적 멤버 클래스
class C {	
	static class d {
		int filed1;
		static int filed2;
		void method1() {}
		static void method2() {}
		
	}
}

public class NestingEx2 {
	public static void main(String[] args) {
		C c = new C();
		C.d d = new C.d();
		//C.d = new C.new D();
		d.filed1 = 1004;
		C.d.filed2 =0x2C8;
		d.method1();
		C.d.method2();
		
		
	}
	
}