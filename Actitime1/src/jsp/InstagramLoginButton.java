package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
       WebDriver d=new ChromeDriver();
       d.get("https://www.instagram.com");
       boolean rs = d.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
       if(rs)
    	   System.out.println("enabled");
       else
    	   System.out.println("not enabled");
	}

}
