package sec1;
//기본 API : 자바에서 제공해주는 참조형(클래스)로 제공함 - java.lang.클래스이름, java.util.클래스이름
public class ClassNotFoundEx {
	public static void main(String[] args) {
	try {
		Class cl1 = Class.forName("java.lang.String");
	}catch(ClassNotFoundException e){
		System.out.println("해당 클래스는 존재하지 않음");
		e.printStackTrace();
	}catch(Exception e){
		System.out.println("알수없음");
		e.printStackTrace();
	}finally {
		System.out.println("끝");
	}
	}
}
