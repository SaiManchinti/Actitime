package HandlingPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HIddenPopUp2Ex {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
			driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("123");
		    driver.findElement(By.id("dob")).click();
		    
		    WebElement mAll = driver.findElement(By.className("ui-datepicker-month"));
		   
			Select s=new Select(mAll);
			s.selectByIndex(5);
			
		    WebElement yAll = driver.findElement(By.className("ui-datepicker-year"));
		   
			Select s1=new Select(yAll);
		    s1.selectByValue("2001");
		    
			driver.findElement(By.xpath("//a[text()='10']")).click();
		  
		   
			driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
			Thread.sleep(2000);
			driver.findElement(By.id("renew_policy_submit")).click();		
		}
}
