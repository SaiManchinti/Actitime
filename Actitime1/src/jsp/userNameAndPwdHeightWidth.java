package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userNameAndPwdHeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
       WebDriver d=new ChromeDriver();
       d.get("https://demo.actitime.com/login.do");
       int userH = d.findElement(By.id("username")).getSize().getHeight();
       int userW = d.findElement(By.id("username")).getSize().getWidth();
       
       int pwdH = d.findElement(By.name("pwd")).getSize().getHeight();
       int pwdW = d.findElement(By.name("pwd")).getSize().getWidth();
       if(userH+userW==pwdH+pwdW)
       {
    	   System.out.println("username and pwd text boxes are equal");
       }
       else {
    	   System.out.println("username and pwd text boxes are Not equal");
    	    }
       d.close();
	}

}
