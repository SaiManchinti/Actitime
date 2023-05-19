package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CustomWaitEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
        d.findElement(By.id("username")).sendKeys("admin");
        d.findElement(By.name("pwd")).sendKeys("manager");
        d.findElement(By.xpath("//div[text()='Login ']")).click();
        int i=0;
       // while(true)
        while(i<100)
        try {
        d.findElement(By.id("logoutLink")).click();
      //  System.out.println("pinki");
        break;
        }
        catch(Exception e) {
       // 	System.out.println("pongay");
        	i++;
        }
        d.close();       
}
}
