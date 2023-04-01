package com.oib.automation;
/*Test Case id: OIB-Admin-TC013
 * Test Title:Verify Admin- View Services Fun: with Valid userID,password.
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 08-Nov
 * Script Executed Date: 08-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application-->Mouse Over to Services-->Click On view Services-->
 *                                    Perform all required fields -->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC013_Admin_ViewServices {
	@Test
	public void viewservices()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.viewservices();
		obj.logout();
		obj.closeApplication();
	}

}
