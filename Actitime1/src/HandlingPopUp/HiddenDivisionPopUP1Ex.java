package HandlingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUP1Ex {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");//here it will open directly login (hiddenPOpup)
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button)[2]")).click();			
}
}
