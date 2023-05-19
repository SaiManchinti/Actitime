package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.org/");
		 String eURL = ("https://selenium.dev/");	
		 String aURL = driver.getCurrentUrl();
		 if(aURL.equals(eURL))
		 {
			 System.out.println("passed");
		 }else {
			 System.out.println("failed");
		 }
		 driver.close();
	         
		}

}
