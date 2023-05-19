package com.actitime.mock1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmailAcountUsingPOm3 {
	
	@FindBy(xpath="//span[.='Create account']")
	private WebElement crtBtn;
	
	@FindBy(xpath="//span[.='For my personal use']")
	private WebElement optBtn;
	
	@FindBy(name="firstName")
	private WebElement ntbx;
	
	@FindBy(name="lastName")
	private WebElement snametbx;
	
	@FindBy(name="Username")
	private WebElement untbx;
	
	@FindBy(id="passwd")
	private WebElement pwtbx;
	
	@FindBy(id="confirm-passwd")
	private WebElement conTbx;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement nbtn;
	
	public CreateEmailAcountUsingPOm3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String name,String sname,String un,String pwd) {
		crtBtn.click();
		optBtn.click();
		ntbx.sendKeys(name);
		snametbx.sendKeys(sname);
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		conTbx.sendKeys(pwd);
		nbtn.click();
	}
	
	
}
