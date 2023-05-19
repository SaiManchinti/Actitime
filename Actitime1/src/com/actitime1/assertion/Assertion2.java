package com.actitime1.assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion2 {
@Test
public void createUpendra() {
	Reporter.log("Upendra");   
}
@Test
public void modifyKeerthana() {
	Reporter.log("Keerthana",true);
}
@Test
public void deleteBharathi()  {
	Reporter.log("Bharathi",true);	
}
}
