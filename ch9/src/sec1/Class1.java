package sec1;
class ClassSub {
	int field1;
	String filed2;
	double filed3;
}
public class Class1 {
	public static void main(String[] args) {
		ClassSub sub1 = new ClassSub();
		System.out.println(sub1.field1);
		meinMethod1();
	}
	public static void meinMethod1() {
		System.out.println("z");
	}
}
