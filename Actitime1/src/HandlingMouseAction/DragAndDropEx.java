package HandlingMouseAction;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {
			
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	   driver.manage().window().maximize();
	   driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	   
	    WebElement drag = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement drop = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	    Thread.sleep(2000);
	   Actions a=new Actions(driver);
	   a.dragAndDrop(drag, drop).perform();
}
}
