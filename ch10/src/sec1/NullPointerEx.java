package sec1;

public class NullPointerEx {

	public static void main(String[] args) {
		String data = null;
		try {
		System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println("Null포인터 오류");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("기타 오류");
			e.printStackTrace();
		} finally {	//try가 되든 catch가 되든 관계없이 반드시 실행
			System.out.println("종료");
		}
	}

}
