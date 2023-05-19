package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshotExActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void screenshot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		TakesScreenshot take=(TakesScreenshot) driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/ss.png");
		
		FileUtils.copyFile(src, dest);
		 driver.close();
	}
}
