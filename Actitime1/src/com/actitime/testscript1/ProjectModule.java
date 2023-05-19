package com.actitime.testscript1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void createProject() {
		Reporter.log("CreateProject",true);
	}
     @Test
 	public void modifierProject() {
 		Reporter.log("ModifierProject",true);
 	}
     @Test
  	public void deleteProject() {
  		Reporter.log("DeleteProject",true);
  	}
}
