package HandlingPopUp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllExceptSpecific {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		@SuppressWarnings({ "resource" })
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
	  driver.get("https://secure.indeed.com/");
	   driver.findElement(By.id("apple-signin-button")).click();
	   driver.findElement(By.id("login-facebook-button")).click();
	   Set<String> allWh = driver.getWindowHandles();
	   System.out.println("enter the url which u need to stay");
	   Scanner sc=new Scanner(System.in);
	   String Expurl=sc.nextLine();
	   
	   for (String str : allWh) {
		   driver.switchTo().window(str);
		  String acturl=driver.getCurrentUrl();
		  if(acturl.contains(Expurl))
		  {
			 
		  }
		  else
		  {
			  driver.close();
		  }
		
	}
	   
}
}
