package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/saima/Desktop/Demo.html");
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
		String text= allLinks.get(0).getText();
	   // WebElement link = allLinks.get(0);	
	    //String text = link.getText();
	    System.out.println(text);
	    d.close();

	}

}
