package HandlingMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMoveToElement {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
   driver.manage().window().maximize();
   driver.get("https://www.vtiger.com/");
   
   WebElement Resources = driver.findElement(By.partialLinkText("Resources"));
   Actions a=new Actions(driver);
   a.moveToElement(Resources).perform();
   driver.findElement(By.partialLinkText("Contact ")).click();
   Thread.sleep(2000);
   String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
   System.out.println(text);
	}

}
