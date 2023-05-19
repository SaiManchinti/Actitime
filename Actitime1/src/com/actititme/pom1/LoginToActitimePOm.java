package com.actititme.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToActitimePOm {
@FindBy(id="username")
public WebElement untbx;

@FindBy(name="pwd")
public WebElement pwtbx;

@FindBy(xpath="//div[.='Login ']")
public WebElement logbtn;

public LoginToActitimePOm(WebDriver driver)
{
	PageFactory.initElements(driver, this);//initialization...
}

public void setLogin(String un,String pwd) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	logbtn.click();
}
}
