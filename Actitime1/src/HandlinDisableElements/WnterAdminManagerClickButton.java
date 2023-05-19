package HandlinDisableElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WnterAdminManagerClickButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//Upcasting
		driver.get("file:///C:/Users/saima/Desktop/Disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		
		RemoteWebDriver r=(RemoteWebDriver) driver;//Downcasting
		r.executeScript("document.getElementById('d2').value=\"manager\"");
		
}
}