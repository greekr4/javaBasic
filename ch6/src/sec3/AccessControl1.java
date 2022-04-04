package sec3;
import sec1.Animal;
//클래스, 필드, 생성자, 메서드
//public : 패키지가 달라도 import만 하면 사용이 가능 -> 클래스, 필드, 생성자, 메서드
//protected : 자식클래스만 사용 가능 -> 필드,생성자,메서드
//default : 같은 패키지에서만 사용 가능 -> 필드, 생성자, 메서드
//private : 같은 클래스 내에서만 사용이 가능 -> 필드
//public > protected > default > private
class Data1{	
	//하나의 java파일 안 여러개의 클래스 가능
	//(public은 1개만 가능)
	int field1;
}
public class AccessControl1 {

	public static void main(String[] args) {
		Animal cat = new Animal();
		
	}

}
