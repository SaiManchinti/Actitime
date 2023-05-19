package com.actitime.mock1;

import org.openqa.selenium.By;//[5]th question
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteYourNameInSecondFrame {
static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/saima/Desktop/Page1.html");
	driver.findElement(By.id("t1")).sendKeys("sai");
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("f1")).sendKeys("manchinti");
	
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("reddy");
}
}
