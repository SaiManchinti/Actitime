package HandlingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUpUsingLocOfResume {
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/saima/Desktop/Naukri.html");
		driver.findElement(By.id("cv")).sendKeys("D:\\slenium\\Automation2\\src\\data\\Resume.docx");
		

	}

}
