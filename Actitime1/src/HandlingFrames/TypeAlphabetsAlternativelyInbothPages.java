package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeAlphabetsAlternativelyInbothPages {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/saima/Desktop/Page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		
		driver.switchTo().frame("f1");//Any Attribute value
		driver.findElement(By.id("t2")).sendKeys("b");
		
		driver.switchTo().defaultContent();//OR ParentFrame
		driver.findElement(By.id("t1")).sendKeys("c");
		
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys("d");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("e");
		
	}
}
