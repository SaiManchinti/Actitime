package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyTextOneTbxToAnotherTbx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/saima/Desktop/Relative.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"a"+"c");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"a"+"v");
		//driver.close();	
	}
	
}
