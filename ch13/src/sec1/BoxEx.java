package sec1;
//제네릭 : 숫자든 문자든 타입에 관계없이 저장 및 전달이 가능하도록 한 구조
//클래스이름<T> { private T t; get; set;
class Box<T>{
	private T t;
	public T get() { return t; }
	public void set(T t) {
		this.t = t;
	}
}
public class BoxEx {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("zzz");
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box2.get());

	}

}
