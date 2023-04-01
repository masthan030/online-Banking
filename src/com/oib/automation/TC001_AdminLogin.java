package com.oib.automation;
/*Test Case id: OIB-Admin-TC001
 * Test Title:Verify Admin Login Fun: with Valid userID,password
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC001_AdminLogin {
	

	@Test
	public void login()throws Exception{
		
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
	}
}