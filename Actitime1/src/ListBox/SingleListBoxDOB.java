package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleListBoxDOB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement monthListbox = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select s=new Select(monthListbox);
		s.selectByIndex(7);
		WebElement dateListbox = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select s1=new Select(dateListbox);
		s1.selectByValue("14");
		WebElement yearListbox = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select s2=new Select(yearListbox);
		s2.selectByVisibleText("2002");
		//driver.close();
}
}
