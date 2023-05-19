package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidthEmailTbxFb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
      WebDriver d=new ChromeDriver();
      d.get("https://www.facebook.com");
      int height = d.findElement(By.id("email")).getSize().getHeight();
      int width = d.findElement(By.id("email")).getSize().getWidth();
      
      System.out.println(height);
      System.out.println(width);
      d.close();
	}

}
