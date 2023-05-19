package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
	List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
        int count = allSugg.size();
        System.out.println(count);
        for(int i=0;i<count;i++) {
        	String text=allSugg.get(i).getText();
        	System.out.println(text);
        }
        String text = allSugg.get(0).getText();
        System.out.println(text);
        allSugg.get(count-1).click();
	}

}
