package com.oib.automation;
/*Test Case id: OIB-Admin-TC010
 * Test Title:Verify Admin View Branch Fun: with Valid userID,password
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> mouse over to branches-->Click on View Branches-->
 *                                                 Logout Application--> Close Application
 */

import org.testng.annotations.Test;

import com.oib.lib.CommonFunctions;


public class TC010_Admin_ViewServices {

	@Test
	public void viewbranch()throws Exception{
		
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.view_Services();
		obj.logout();
		obj.closeApplication();
		
	}
}
