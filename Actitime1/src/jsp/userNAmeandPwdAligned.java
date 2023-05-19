package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userNAmeandPwdAligned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		int userX = d.findElement(By.id("username")).getLocation().getX();
		int pwdX = d.findElement(By.name("pwd")).getLocation().getX();
		if(userX==pwdX)
		{
			System.out.println("username and pwd textboxes properly aligned");
		}
		else {
			System.out.println("username and pwd textboxes NOT properly aligned");
		}
		d.close();
	}

}
