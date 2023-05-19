package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExVisibility {
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
        d.findElement(By.id("logoutLink")).click();
        d.close();       

	}
}
//click on logout button using visibility by using ExplicitWait for FindElement() & findElements()
