package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeQspInPage1AjspInPage2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/saima/Desktop/Page1.html");
	driver.findElement(By.id("t1")).sendKeys("Qsp");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("Jsp");
	
}
}
