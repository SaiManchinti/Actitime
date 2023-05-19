package Tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTabsinActitimeinc {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> Allwh = driver.getWindowHandles();
		int count = Allwh.size();
		System.out.println("All tabs ="+count);
		for(String wh:Allwh)
		{
			driver.switchTo().window(wh);
			System.out.println(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();	
	}
}
