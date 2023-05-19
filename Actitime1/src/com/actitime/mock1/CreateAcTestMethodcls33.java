package com.actitime.mock1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAcTestMethodcls33 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void validLogin() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com/");
	CreateEmailAcountUsingPOm3 s=new CreateEmailAcountUsingPOm3(driver);
	s.setLogin("sai", "manchinti", "manchintisai", "Saii@12345");
}
}
