package com.oib.automation;
/*Test Case id: OIB-Employee-TC023
 * Test Title:Verify Employee- Login Fun: with Valid userID,password
 * Priority: High
 * Module Name: Employee
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 12-Nov
 * Script Executed Date: 12-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC024_Employee_Login {
	@Test
	public void login()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.emp_login();
		obj.logout();
		obj.closeApplication();
		
	}




}
