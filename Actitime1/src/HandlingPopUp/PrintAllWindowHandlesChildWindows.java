package HandlingPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWindowHandlesChildWindows {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
  WebDriver driver=new ChromeDriver();
  driver.get("https://secure.indeed.com/");
  driver.findElement(By.id("apple-signin-button")).click();
  driver.findElement(By.id("login-facebook-button")).click();
	Set<String> allWh = driver.getWindowHandles();
	int count = allWh.size();
	System.out.println(count);
	for (String wh :allWh ) {
		System.out.println(wh);	//always we can get the address of parent bowser in first address..	
	}                           //next all the addresses of child browsers randomly..
	driver.quit();
	
	}
}
//write a script to print the address of all the browsers present in indeed after clicking apple and
//facebook buttons...