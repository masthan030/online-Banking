package com.oib.automation;
/*Test Case id: OIB-Admin-TC019
 * Test Title:Verify Admin-View Profile : with valid user id, password.                 
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 14-Nov
 * Script Executed Date: 14-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Profile -->Click on View Profile
 *                                 -->  Logout Application--> Close Application
 */

import org.testng.annotations.Test;

import com.oib.lib.CommonFunctions;

public class TC021_Admin_Profile {
	@Test
	public void view_profile()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.profile();
		obj.logout();
		obj.closeApplication();
	}

}
