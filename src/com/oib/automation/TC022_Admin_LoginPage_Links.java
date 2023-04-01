package com.oib.automation;
/*Test Case id: OIB-Admin-TC021
 * Test Title:Verify Admin- All Links in Login Page
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 10-Nov
 * Script Executed Date: 10-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC022_Admin_LoginPage_Links {
	@Test
	public void links_loginpage()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.links_inloginpage();
		obj.closeApplication();
	}



}
