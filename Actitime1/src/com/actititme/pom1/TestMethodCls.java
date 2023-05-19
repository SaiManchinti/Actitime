package com.actititme.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void validLogin() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginToActitimePOm l=new LoginToActitimePOm(driver);
	l.setLogin("admin", "manager");
	}
}
