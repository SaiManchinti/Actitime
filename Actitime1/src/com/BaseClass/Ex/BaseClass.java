package com.BaseClass.Ex;

//import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/grckodriver.exe");
}
public   WebDriver driver;

//Scanner sc=new Scanner(System.in);
@Parameters("browser")
@BeforeTest
public void openBrowser(String browser)
{ 
	//System.out.println("enter the browser name");
	//String browser1=sc.nextLine();
	
	if(browser.equals("chrome")) {
	driver=new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterTest
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
}
@BeforeMethod
public void login() {
	Reporter.log("login",true);
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login '] ")).click();
}
@AfterMethod
public void logOut() {
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}

}
