package com.actitime.mock1;

import java.util.HashSet;//[4th] question
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueOptionsMtrlist {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/saima/Desktop/MultiListBox.html");
	 WebElement mtrList = driver.findElement(By.id("mtr"));
	 Select s=new Select(mtrList);
	 
	 List<WebElement> allOPt = s.getOptions();
	 HashSet<String> h1=new HashSet<String>();
	 
	for (int i = 0; i < allOPt.size(); i++) {
		String text = allOPt.get(i).getText();
		
		if(h1.add(text)==false) {
			break;
		  }
		else {
		System.out.println(text);	
	    }
	}
}
}
