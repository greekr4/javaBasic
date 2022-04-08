package sec2;
//예외 떠 넘기기(thorws 구절) : 메서드명() throws 예외종류 {}
//만약 처리 내용이 문제가 발생하면, throws 구절을 이용하여 해당 예외(Exception)을 자바에서 처리하게 떠넘긴다


public class Exception5 {
	public static void main(String[] args) throws ClassNotFoundException{
		FindClass();
	}
	public static void FindClass() throws ClassNotFoundException{
		Class cla = Class.forName("java.lang.Math");
	}
}
