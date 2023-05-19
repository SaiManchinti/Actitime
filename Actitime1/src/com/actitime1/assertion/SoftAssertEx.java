package com.actitime1.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
@Test
public void getTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	String actTitle = driver.getTitle();
	String expTitle = "Google";
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actTitle,expTitle);
	driver.close();
	sa.assertAll();//whenever we are using softAssert we should use assetAll() method at the last
}
}
