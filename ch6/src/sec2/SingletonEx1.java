package sec2;

public class SingletonEx1 {

	public static void main(String[] args) {
		//싱글톤은 객체를 한 번에 한 개만 생성 가능
		//아무리 객체를 다른이름으로 생성해도 어차피 같은 객체가 됨
		//또한, static은 정적 데이터가 되므로, 객체가 달라도 같은 저장소를
		//공유하고 있어 공유메모리이며, 정적 필드의 값은 객체가 달라도 같다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		obj1.z = 100;
		System.out.println(obj2.z);
		obj2.z = 200;
		System.out.println(obj1.z);
	}

}
