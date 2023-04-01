package com.oib.automation;
/*Test Case id: OIB-Admin-TC022
 * Test Title:Verify Admin- Verify Title
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 11-Nov
 * Script Executed Date: 11-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application -->Login into Application -->Logout Application -->Close Application
 */

import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC023_Verify_Title {

	@Test
	public void title()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.verifyTitle();
		obj.closeApplication();
	}



}
