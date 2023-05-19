package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/saima/Desktop/Demo.html");
		 driver.findElement(By.xpath("/html//body/a")).click();
		 driver.navigate().back();
        driver.findElement(By.xpath("/html//body/a[2]")).click();  
	}

}
