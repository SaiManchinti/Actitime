package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenshot {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void screenShot() throws IOException  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	TakesScreenshot take=(TakesScreenshot) driver;//downcasting
	File src = take.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./screenshot/ss.png");//creating object of File class
	FileUtils.copyFile(src, dest);
	driver.close();
	
}
}
