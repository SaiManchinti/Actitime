package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statusOfCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
 boolean checked = d.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(checked==true)
		{
			System.out.println("checked");
		}
		else {
			System.out.println("not checked");
		}
		d.close();
	}

}
