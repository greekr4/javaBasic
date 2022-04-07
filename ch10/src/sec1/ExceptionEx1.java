package sec1;

import javax.lang.model.type.PrimitiveType;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int i;
		int a=20;
		int[] arr = {10,20,30};
		String b = "김기태";
	
		//System.out.println("i="+i);
		//예외상황 : 출력하는 내용에 null이 있어서 더이상 실행할 수 없음 -> NullPointerException
		
		//System.out.println("a/0 = "+(a/0));
		//특정 데이터를 0으로 나누려고 하여 더 이상 실행할 수 없음 - ZeroDivide
		
		//System.out.println(arr[5]);
		//배열 요소의 정해진 범위를 벗어난 경우 더이상 실행할 수 없음 - ArrayIndex
		
		//int c = (int) b;
		//그 결과가 문자열과 같이 숫자의 형태로 가공없어 더 이상 실행할 수 없음 - NumberFormatException 
		
		//KumhoTire tire = new HankookTire();
		//Hankook tire2 = tire;
		//참조형에서 형변환이 되지 않는 경우가 발생하여 더 이상 실행할 수 없음 - ClassCastException
		
		//연결하거나 참조한 패키지에서 해당 클래스를 찾을 수 없어 실행할 수 없음 - ClassNotFoundException
		
		try {
			System.out.println(Integer.parseInt(b));
			System.out.println(a / 0);
		} catch(NumberFormatException e) {
			System.out.println("예외상황 발생");
			System.out.println();
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("예외상황 발생2");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
