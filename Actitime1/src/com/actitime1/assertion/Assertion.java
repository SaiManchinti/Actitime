package com.actitime1.assertion;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
@Test
public void createCustomer() {
	Reporter.log("sai",true);
}
@Test(dependsOnMethods = "createCustomer")
public void modifyCustomer() {
	Reporter.log("Radhika",true);
}
@Test
public void deleteCustomer()  {
	Reporter.log("kumar");
	
	
}
}
