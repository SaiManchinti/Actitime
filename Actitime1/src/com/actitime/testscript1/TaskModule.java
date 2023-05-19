package com.actitime.testscript1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public void createTask() {
		Reporter.log("CreateTask",true);
	}
     @Test
 	public void modifierTask() {
 		Reporter.log("ModifierTask",true);
 	}
     @Test
  	public void deleteTask() {
  		Reporter.log("DeleteTask",true);
  	}
}
