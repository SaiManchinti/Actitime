package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCfirstBusinessNews2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
List<WebElement> allNews = driver.findElements(By.xpath("//h2[text()='Latest Business News']/..//li/a/h3"));
		int count = allNews.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allNews.get(i).getText();
			System.out.println(text);
		}
		driver.close();

}
}
