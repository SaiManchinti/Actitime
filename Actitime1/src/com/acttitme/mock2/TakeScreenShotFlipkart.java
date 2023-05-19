package com.acttitme.mock2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotFlipkart {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	TakesScreenshot take=(TakesScreenshot) driver;
	File src = take.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/ss.png");//creating object of File class
	FileUtils.copyFile(src, dest);
	driver.close();	
}
}
