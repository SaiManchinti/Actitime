package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementsDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver d=new ChromeDriver();
     d.get("https://www.flipkart.com/");
     List<WebElement> allLinks = d.findElements(By.tagName("a"));//xpath("//a")
     int count = allLinks.size();
     System.out.println(count);
     for(int i=0;i<count;i++) {
    	  WebElement text1 = allLinks.get(i);
    	  System.out.println(text1);
     }
     WebElement link = allLinks.get(0);
     String text = link.getText();
     System.out.println(text);
     d.close();
	}

}
