package com.actitime.mock1;

import org.openqa.selenium.JavascriptExecutor;//[3rd] question
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToActtimeUsingJavascript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='admin'");
		js.executeScript("document.getElementsByName('pwd').value='manager'");		
}
}
