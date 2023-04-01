package com.oib.automation;
/*Test Case id: OIB-Admin-TC006
 * Test Title:Verify Admin-View Acc type Delete Fun: with Valid userID,password.
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> Mouse Over to Branches-->Click on View Acc type-->
 *                                        perform all required fields-->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;
	

public class TC006_Admin_ViewTypesDelete {
	@Test
	public void viewacctype_delete()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.viewAccTypes_Delete();
		obj.logout();
		obj.closeApplication();
	}


}
