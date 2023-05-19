package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonIsEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		boolean enable = d.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(enable==true)
		{
			System.out.println("enabled");
		}
		else {
			System.out.println("not enabled");
		}
		d.close();
	}

}
