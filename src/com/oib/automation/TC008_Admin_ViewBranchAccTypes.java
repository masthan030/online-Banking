package com.oib.automation;
/*Test Case id: OIB-Admin-TC008
 * Test Title:Verify Admin View Branch Acc Types Fun: with Valid userID,password,Branch Address
 * Priority: Low
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application-->Mouse over to Branches-->
 *                            Click On View Branch--> Perform all required fields -->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC008_Admin_ViewBranchAccTypes {
	@Test
	public void viewbrachacctypes()throws Exception{
		CommonFunctions object=new CommonFunctions();
		object.openApplication();
		object.login();
		object.view_Branch_Acc_Type();
		object.logout();
		object.closeApplication();
		
		
		
	}

}
