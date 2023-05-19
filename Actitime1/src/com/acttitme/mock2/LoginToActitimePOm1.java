package com.acttitme.mock2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToActitimePOm1 {
@FindBy(id="username")
public WebElement untbx;

@FindBy(name="pwd")
public WebElement pwtbx;

@FindBy(xpath="//div[.='Login ']")
public WebElement logbtn;

@FindBy(id="logoutLink")
public WebElement loutBtn;

public LoginToActitimePOm1(WebDriver driver)
{
	PageFactory.initElements(driver, this);//initialization...
}

public void setLogin(String un,String pwd) throws InterruptedException {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	logbtn.click();
	Thread.sleep(2000);
	loutBtn.click();
}

}
