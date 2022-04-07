package sec1;
//로컬클래스 :
//특정 클래스의 메서드 안에 내부 클래스를 정의하고, 객체를 만들어 실행할 수 있도록 한 클래스
class E {
	void method() { //멤버들은 public, private, static 키워드 활용 불가
		class F {
			F() {}
			int filed1;
			//static int filed2;
			void method1() {}
			//static void method2() {}
		}
		F f = new F();
		f.filed1 = 1004;
		f.method1();
	}
}

public class NestingEx3 {
	public static void main(String[] arg) {
		
			E e = new E();
			e.method();
			
	}
	
}
