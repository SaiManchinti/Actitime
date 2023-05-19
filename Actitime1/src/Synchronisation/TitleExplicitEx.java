package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleExplicitEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
        d.findElement(By.id("username")).sendKeys("admin");
        d.findElement(By.name("pwd")).sendKeys("manager");
        d.findElement(By.xpath("//div[text()='Login ']")).click();
        WebDriverWait wait=new WebDriverWait(d, 10);
        wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        String title = d.getTitle();
        System.out.println(title);    
}
}
//getting title by using ExplicitWait titleIs() or titleConatins()




