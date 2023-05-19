package HandlingMouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickRightClickActi {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {
			
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com");
	   WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
	   Actions a=new Actions(driver);	
	   a.contextClick(target).perform();
	   Thread.sleep(2000);
	   
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_W);
	   driver.close();
}
}
