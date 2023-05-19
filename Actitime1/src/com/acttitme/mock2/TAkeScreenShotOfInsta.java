package com.acttitme.mock2;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAkeScreenShotOfInsta {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		TakesScreenshot take=(TakesScreenshot) driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File f=new File("./screenshot/ss.png");
		FileUtils.copyFile(src, f);
		driver.close();
}
}