package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		//int a = null; 기본형은 null값 X
		String b = null;
		int c = 20; //기본형은 ==로나 !=로 비교할  수 있음
		int d = 20;
		System.out.println("c==d : "+(c==d));
		System.out.println("c!=d : "+(c!=d));
		
		int[] e = {10,20,30}; //참조형은 ==나 !=로 비교할 수 없음 : 주소와 주소를 비교하기 때문
		int[] f = {10,20,30};
		System.out.println("e == f : " + (e==f));
		System.out.println("e != f : " + (e!=f));
		
		System.out.println(e.equals(f));	//참조형은 비교를 .equals로 해야함
		
		String g = "김기태";
		String h = "김기태";
		System.out.println(g==h);
		
		String i = new String("김기태");	//new를 활용할 경우 참조형이 되므로, 주소를 비교함
		String j = new String("김기태");
		System.out.println(i==j);
		System.out.println("***********************");
		System.out.println(i.equals(j));
		
	}

}
