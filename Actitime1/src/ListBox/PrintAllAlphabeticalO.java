package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllAlphabeticalO {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/saima/Desktop/MultiListBox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> AllOptions = s.getOptions();
		ArrayList<String> a1=new ArrayList<String>();
		for(int i=0;i<AllOptions.size();i++)
		{
			String text = AllOptions.get(i).getText();
			a1.add(text);
		}
		System.out.println("before sorting");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("after sorting");
		System.out.println(a1);
}
}
