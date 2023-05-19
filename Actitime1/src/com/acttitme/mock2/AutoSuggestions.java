package com.acttitme.mock2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutoSuggestions {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@SuppressWarnings("unused")
@Test
public void printAutoSuggestions() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("selenium");
	List<WebElement> sugs = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	Iterator<WebElement> l=sugs.listIterator(sugs.size());
    for(int i=sugs.size()-1;i>=0;i--) {
    	Reporter.log(sugs.get(i).getText(),true);
    }
}
}
