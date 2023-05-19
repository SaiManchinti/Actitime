package Tabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTheTabsWQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> allWH = driver.getWindowHandles();
		int count = allWH.size();
		System.out.println(count);
		
		for (String wh : allWH) {
			driver.switchTo().window(wh);
		    String title = driver.getTitle();
		    System.out.println(title);
			driver.close();
		}
	}
}
