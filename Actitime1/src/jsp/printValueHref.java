package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printValueHref {
	static{
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		String value = d.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		
         System.out.println(value);
         d.close();
	}
}
