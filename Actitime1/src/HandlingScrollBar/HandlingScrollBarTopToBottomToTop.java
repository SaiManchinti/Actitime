package HandlingScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarTopToBottomToTop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bbc.com/");
	    Thread.sleep(2000);
	    JavascriptExecutor j=(JavascriptExecutor) driver; 
	    Thread.sleep(2000);
	    j.executeScript("window.scrollBy(0,document.body.scrollHeight)");//Scroll Top to Bottom
	    Thread.sleep(2000);
	    j.executeScript("window.scrollTo(0,0)");
	    
}
}
