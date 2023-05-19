package com.actitime1.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComapareTheTitleOfGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void googleTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String actTitle = driver.getTitle();
	String expTitle = "Soogle";
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actTitle, expTitle);
	
	//Assert.assertEquals(actTitle, expTitle);//after failing the testcase remaining statements cannot execute...in Assert class(hard code) 
	
	driver.close();
	sa.assertAll();	
}

//In softAssert class All the methods are non static methods..
//In Assert class All the methods are static methods..
}
