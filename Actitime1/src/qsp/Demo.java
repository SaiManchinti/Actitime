package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
	    String title = d.getTitle();
	    System.out.println(title);
	    d.close();
	}
}
