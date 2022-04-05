package sec1;

public class Parent {

		int filed1;
		String filed2;
		Parent(){}
		Parent(int filed1) {this.filed1=filed1;}
		Parent(int filed1, String filed2){
		this.filed1 = filed1;
		this.filed2 = filed2;
		}
		
		public void method1() {
			System.out.println("부모 메소드1");
		}
		public void method2() {
			System.out.println("부모 메소드2");
		}
		
		
}
