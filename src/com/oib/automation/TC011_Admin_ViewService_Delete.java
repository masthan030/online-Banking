package com.oib.automation;
/*Test Case id: OIB-Admin-TC011
 * Test Title:Verify Admin -View Service Delete Fun: with Valid userID,password.
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 08-Nov
 * Script Executed Date: 08-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> Mouse over to services-->Click on View Services--> 
 *                          Perform all required fields  -->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC011_Admin_ViewService_Delete {
	@Test
	public void viewservice_delete()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.viewService_Delete();
		obj.logout();
		obj.closeApplication();
	}



}
