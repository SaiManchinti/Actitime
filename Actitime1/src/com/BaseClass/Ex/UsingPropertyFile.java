package com.BaseClass.Ex;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class UsingPropertyFile {
public WebDriver driver;

@BeforeClass
public void openBrowser()  {
	Reporter.log("openBrowser",true);
	driver=new ChromeDriver();
}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();	
}
@BeforeClass
public void login() throws IOException {
	Reporter.log("login",true);
	FileInputStream fis=new FileInputStream("./data/commandata.property");
	Properties p=new Properties();
	p.load(fis);
	
	String url = p.getProperty("url");
	String pwd = p.getProperty("pwd");
	String un = p.getProperty("un");	
	driver.get(url);
	
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
}
public void logout() {
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}
}
