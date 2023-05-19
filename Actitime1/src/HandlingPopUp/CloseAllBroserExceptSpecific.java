package HandlingPopUp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBroserExceptSpecific {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
   System.out.println("enter the title which u want to Stay");
   try (Scanner Sc = new Scanner(System.in)) {
	String expTitle=Sc.nextLine();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://secure.indeed.com/");
	   driver.findElement(By.id("apple-signin-button")).click();
	   driver.findElement(By.id("login-facebook-button")).click();
	   
	   Set<String> AllWh = driver.getWindowHandles();
	   
	   for(String wh1:AllWh)
	   {
		   driver.switchTo().window(wh1);
		   String actualTitle=driver.getTitle();
		   if(actualTitle.contains(expTitle))
		   {
			   
		   }
		   else
		   {
			   driver.close();
		   }
	   }
}
   }
}

//we can compare the titles as well as links with the using of equals(),contains() and
//containsEquals()
