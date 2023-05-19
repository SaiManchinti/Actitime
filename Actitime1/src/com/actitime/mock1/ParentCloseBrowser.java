package com.actitime.mock1;

//import java.util.Set;[2] Question

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentCloseBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		driver.close();
		
//		Set<String> allWh = driver.getWindowHandles();
//		int count = allWh.size();
//		String expTitle="Sign In | Indeed Accounts";
//		System.out.println(count);
//		
//	 		for(String wh:allWh) {
//	 			driver.switchTo().window(wh);
//	 			String title = driver.getTitle();
//	 			if(title.equals(expTitle))
//	 			{
//	 				driver.close();
//	 			}
//	 			System.out.println(title);
//	 		}
}
}
