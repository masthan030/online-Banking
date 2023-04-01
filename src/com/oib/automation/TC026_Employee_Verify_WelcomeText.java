package com.oib.automation;
/*Test Case id: OIB-Employee-TC025
 * Test Title:Verify Employee-Welcome text: with Valid userID,password
 * Priority: High
 * Module Name: Employee
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 13-Nov
 * Script Executed Date: 13-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> Logout Application--> Close Application
 */

import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

public class TC026_Employee_Verify_WelcomeText {
	
	@Test
	
	public void welcome_verify()throws Exception{
		
		CommonFunctions obj=new CommonFunctions();
		
		  obj.openApplication();
		  obj.emp_login();
		  obj.welcome_text();
		  obj.logout();
		  obj.closeApplication();

	}




}
