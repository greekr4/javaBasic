package sec3;

public class StringEx1 {

	public static void main(String[] args) {
		byte[] bytes = {74, 101, 107, 111, 34, 66};
		char[] chars = {'a','c','e'};
		//String 생성자는 문자배열이나 바이트배열을 문자열로 변환
		String str1 = new String(bytes);
		String str2 = new String(chars);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = new String(bytes,2,3);
		System.out.println(str3);
		
		String data = "김기태는 천사";
		System.out.println(data.charAt(2));
		System.out.println("문자배열의 주소 : "+data.getBytes());//주소
		System.out.println("태의 위치 : "+data.indexOf("태"));	//"vlaue"의 위치
		System.out.println("data의 글자수 : "+data.length());	//문자열 길이
		String a = data.replace("기태", "태균");				//찾아 바꾸기
		System.out.println(a);
		
		String jumin = "123456-2412118";
		System.out.println("출생년도 : "+jumin.substring(0, 2));	//자바스크립트와 같음
		System.out.print("성별 : ");
		int ma = Integer.parseInt(jumin.substring(7, 8));
		if (ma%2 == 1 && ma <=4 && ma >= 1) {
			System.out.println("남자");
		} else if (ma%2 == 0 && ma <=4 && ma >= 1) {
			System.out.println("여자");
		} else
		{
			System.out.println("잘못됨");
		}
		
		System.out.println("주민뒷자리 : " + jumin.substring(7));
		
		String learn = "    Java Web Programming";
		System.out.println(learn.toLowerCase());
		System.out.println(learn.toUpperCase());
		System.out.println("글자수 : "+learn.length());
		System.out.println("공백X : "+learn.trim().length());
		
		int b = 1004;
		float c = 32.128f;
		
		String d = String.valueOf(b); 	//b의 정수 1004를 문자열 "1004"로 변경
		int e = Integer.parseInt(d);	//d의 문자열 "1004"를 int 1004로 변경
		
		String f = String.valueOf(c);	//c의 실수 32.128을 문자열 "32.128"로
		float g = Float.parseFloat(f);	//f의 문자열 "32.128"을 실수 32.128로
		
		
		
		
		
		String name1 = "김기태";
		String name2 = "천사";
		if(name1.equals(name2)) {
			System.out.println("같");
		}else {
			System.out.println("다름");
		}
		
		
		
	}

}
