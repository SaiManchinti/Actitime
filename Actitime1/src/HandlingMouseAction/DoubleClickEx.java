package HandlingMouseAction;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {
			
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://www.vtiger.com");
	   WebElement Resources = driver.findElement(By.partialLinkText("Resources"));
	   
	    Actions a=new Actions(driver);
	    a.moveToElement(Resources).perform();
	    driver.findElement(By.partialLinkText("Customers")).click();
	    
	    WebElement dblc = driver.findElement(By.xpath("//span[text()='Login']"));
	    a.doubleClick(dblc).perform();	
	    String at = "Login - Vtiger";
	    String et = driver.getTitle();
	    if(at.equals(et))
	    	System.out.println("displayed");
	    else
	    System.out.println("not displayed");
}
}