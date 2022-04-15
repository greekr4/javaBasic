package sec1;
//Generic<T> {} => 데이터 타입과 관계없이 그 값을 저장할 목적 -> 다목적
//Generic<T, M> {} => 데이터 타입과 값을 저장 및 전달 목적 -> 다목적 (키, 값)
//키(key) => 객체의 주소, 객체의 멤버이름
//값(value) => 객체가 가지고 있는 값
class Product<T,M>{
	private T kind;		//key(field)
	private M model;	//value(fiele 값)
	
	
	public T getKind() { return kind; }
	public void setKind(T kind) { this.kind = kind; }
	public M getModel() { return model;	}
	public void setModel(M model) {	this.model = model; }
	
}
class Tv{
	String model;
}
class Human {
	String name;
}

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("dd");
		System.out.println(p1.getModel());
		
		Tv t1 = p1.getKind();
		String tvModel = p1.getModel();
		System.out.println(tvModel);

		Product<Human, String> p2 = new Product<>();
		p2.setKind(new Human());
		p2.setModel("zz");
		Human t2 = p2.getKind();
		String Hname = p2.getModel();
		System.out.println(Hname);
		System.out.println(p2.getModel());
	}

}

