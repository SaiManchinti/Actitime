package ListBox;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllOptionsWithOutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/saima/Desktop/MultiListBox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> selectAll = s.getOptions();
		HashSet<String> h1=new HashSet<String>();
		for(int i=0;i<selectAll.size();i++)
		{
			String text = selectAll.get(i).getText();
			if(h1.add(text)==false)
			{
		     break;
			}
			else {
				System.out.println(text);
			}
		}
		

}
}
