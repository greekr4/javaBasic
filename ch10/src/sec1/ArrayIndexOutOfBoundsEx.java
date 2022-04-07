package sec1;
class Student{
	int num;
	String name;
}
public class ArrayIndexOutOfBoundsEx {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		try {
			System.out.println(s[100].num);
			System.out.println(s[100].name);	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과 오류");
			e.printStackTrace();
		} finally {
			System.out.println("END");
		}
	}
}
