package com.acttitme.mock2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllTheLinksInAmazon {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@SuppressWarnings("unused")
@Test
public void getLInks() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//	int count = allLinks.size();
	Iterator<WebElement> rs=allLinks.listIterator(allLinks.size());
	for(int i=allLinks.size()-1;i>=0;i--) {
		String text = allLinks.get(i).getText();
		System.out.println(text);
	}
}
}
