package com.actitime1.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertHardAssert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	@Test
	public void getTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		String expTitle = "Google";
	    
		Assert.assertEquals(actTitle, expTitle);
		
		driver.close();
	}
}
