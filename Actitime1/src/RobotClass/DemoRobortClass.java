package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DemoRobortClass {
public static void main(String[] args) throws AWTException {
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_SHIFT);
	  r.keyPress(KeyEvent.VK_Q);
	  r.keyRelease(KeyEvent.VK_SHIFT);
	  r.keyPress(KeyEvent.VK_S);
	  r.keyPress(KeyEvent.VK_P);
	  
	  
}
}
