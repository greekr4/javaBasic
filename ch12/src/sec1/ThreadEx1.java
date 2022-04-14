package sec1;
import java.awt.Toolkit;
public class ThreadEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"1","2","3","4","5","6","7","8","9","10"};
		
		for (int i=0;i<10;i++) {
		toolkit.beep();
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}
