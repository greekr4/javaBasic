package No1;
import java.awt.*;
import java.awt.event.*;
public class RobotEx{

	public static void main(String[] args) throws AWTException {
	Robot a = new Robot();
	a.delay(1000);
	for (int j=0;j<=5;j++)
	{
	for (int i=0;i<=9;i++)
	{
	int n = 96+i;
	a.delay(210);
	a.keyPress(KeyEvent.VK_E);
    a.keyRelease(KeyEvent.VK_E);
    a.keyPress(KeyEvent.VK_O);
    a.keyRelease(KeyEvent.VK_O);
    a.keyPress(KeyEvent.VK_E);
    a.keyRelease(KeyEvent.VK_E);
    a.keyPress(KeyEvent.VK_K);
    a.keyRelease(KeyEvent.VK_K);
    a.keyPress(KeyEvent.VK_Q);
    a.keyRelease(KeyEvent.VK_Q);
    a.keyPress(n);
    a.keyPress(KeyEvent.VK_ENTER);
    a.keyRelease(KeyEvent.VK_ENTER);
	}
	}
	}
}
