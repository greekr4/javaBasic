package sec1;
import java.awt.Toolkit;
public class ThreadEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"1","2","3","4","5","6","7","8","9","10"};
		
		for (int i=0;i<10;i++) {
		System.out.println(names[i]);
		if (names[i].equals("4")) {
			toolkit.beep();
			System.out.println("**침입자**");
			continue;
		}else
		{
			System.out.println("서비스 정상");
		}
		
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}
