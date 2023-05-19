package com.actitime.mock1;

import java.util.Iterator;//[1] question
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmzonLinks {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@SuppressWarnings("unused")
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	int count = allLinks.size();
	System.out.println(count);
//System.out.println("normal order");
	
//	for (int i = 0; i < allLinks.size(); i++) {
//		String text = allLinks.get(i).getText();
//		System.out.println(text);//normal order
//	}
//	
//	System.out.println("reverse order");
//	
//	for (int i = allLinks.size()-1; i >=0; i--) {
//		
//		String text = allLinks.get(i).getText();
//		System.out.println(text);
//	}
	
	System.out.println("using Iterator");
	
	Iterator<WebElement> links=allLinks.listIterator(allLinks.size());
	for (int i = allLinks.size()-1; i >=0; i--) {	
	String text = allLinks.get(i).getText();
	System.out.println(text);
	}
	allLinks.get(count-1).click();
	driver.close();
}
}
