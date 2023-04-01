package com.oib.automation;
/*Test Case id: OIB-Admin-TC005
 * Test Title:Verify Admin View Acc Type Fun: with Valid userID,password
 * Priority: Low
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> Mouse Over to Branches-->
 *                                        Click On View Acc Type-->Logout Application--> Close Application
 */

import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

	
public class TC005_Admin_ViewAccType {
	@Test
	public void viewacctype()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.view_account_Types();
		obj.logout();
		obj.closeApplication();
	}
}


