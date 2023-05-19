package com.actitime.testscript1;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseClass.Ex.BaseClass;

public class CustomerModule extends BaseClass {

	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	
	
}
