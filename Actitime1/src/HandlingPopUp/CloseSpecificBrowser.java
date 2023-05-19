package HandlingPopUp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			Set<String> Allwh = driver.getWindowHandles();
			System.out.println("enter the title which u need to close");
			Scanner sc= new Scanner(System.in) ;
				String expTitle=sc.nextLine();
				
				for (String str : Allwh) {
					driver.switchTo().window(str);
					String actTitle = driver.getTitle();
					
					if(actTitle.contains(expTitle))
					{
						driver.close();
					}
					
				}
			}		
		}

