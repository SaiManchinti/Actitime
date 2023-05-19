package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCfisrtBUsinessNews {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bbc.com/");
			driver.findElement(By.xpath("(//span[text()='News'])[2]")).click();
			driver.findElement(By.xpath("(//span[text()='Business'])[1]/../../../li[9]/a[1]")).click();
			List<WebElement> allNews = driver.findElements(By.xpath("//span[text()='Business']"));
			int count = allNews.size();
			System.out.println(count);//h2[text()='Latest Business News']/..
			driver.close();
			
	}

}
