package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYaxisOfLoginFb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
        WebDriver d=new ChromeDriver();
        d.get("https://www.facebook.com/");
       int xAxis = d.findElement(By.name("login")).getLocation().getX();
       int yAxis = d.findElement(By.name("login")).getLocation().getY();
       System.out.println("X-axis of fb login button "+xAxis);
       System.out.println("Y-axis of fb login button "+yAxis);
       d.close();
        
	}

}
