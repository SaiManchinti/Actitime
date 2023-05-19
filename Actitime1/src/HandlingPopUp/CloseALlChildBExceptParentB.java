package HandlingPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseALlChildBExceptParentB {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String Pwh = driver.getWindowHandle();
	    Set<String> AllWh = driver.getWindowHandles();
	    for(String wh:AllWh)
	    {
	    	driver.switchTo().window(wh);
	    	if(wh.equals(Pwh))
	    	{
	    		
	    	}
	    	else 
	    	{	
	    	driver.close();		
	    	}
	    }	    
}
}



