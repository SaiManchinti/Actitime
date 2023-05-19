package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCFirstBusinessNews1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/");
		 List<WebElement> allNews = d.findElements(By.className("top-list__heading")); 
		 int count=allNews.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++) {		
			 String text = allNews.get(i).getText();
			 System.out.println(text);
		 }
        d.close();
	}

}
///wrong we are not getting excepected output..
