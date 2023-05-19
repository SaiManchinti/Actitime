package HandlingPopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/saima/Desktop/Naukri.html");
     Thread.sleep(4000);
     File f=new File("./data/Resume.docx");
     String file = f.getAbsolutePath();
     driver.findElement(By.id("cv")).sendKeys(file);
	}

}
