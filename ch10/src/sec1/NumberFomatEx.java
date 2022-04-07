package sec1;
public class NumberFomatEx {
	public static void main(String[] args) {
		String data1 = "90";
		String data2 = "6.28";
		String data3 = "g90";
		
		try {
			System.out.println(Integer.parseInt(data1));
			System.out.println(Double.parseDouble(data2));
			System.out.println(Integer.parseInt(data3));
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
			e.printStackTrace();
		} finally {
			System.out.println("END");
		}
	}
}
