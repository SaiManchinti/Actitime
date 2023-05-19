package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/saima/Desktop/MultiListBox.html");
		WebElement cpListbox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListbox);
	    List<WebElement> selectedText = s.getAllSelectedOptions();
	    int count = selectedText.size();
	    for(int i=0;i<count;i++) {
	   String text = selectedText .get(i).getText();
	   System.out.println("All Selected Options are "+text);
	    }
	    
	    WebElement firstSelected = s.getFirstSelectedOption();
	    
	    String text1 = firstSelected.getText();
	    System.out.println("first selected OPtion is "+text1);
		

}
}
