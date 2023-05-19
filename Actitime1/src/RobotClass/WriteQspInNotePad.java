package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class WriteQspInNotePad {
	static {
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
    Runtime.getRuntime().exec("notepad");
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_Q);
    r.keyRelease(KeyEvent.VK_SHIFT);
    
    r.keyPress(KeyEvent.VK_S);
    r.keyPress(KeyEvent.VK_P);
     
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_S);
    
    r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_Z);
    
    r.keyPress(KeyEvent.VK_ENTER);
    
    
	}

}
