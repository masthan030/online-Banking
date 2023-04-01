package com.oib.automation;
/*Test Case id: OIB-Admin-TC012
 * Test Title:Verify Admin -Branch Services Reg Fun: with Valid userID,password,Branch Address,Service name.
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 10-Nov
 * Script Executed Date: 10-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application--> Mouse over to services-->Click on Branch Services Reg--> 
 *                          Perform all required fields  -->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC012_Admin_BranchServices_Reg {
	@Test
	public void branchreg()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.branchServices_reg();
		obj.logout();
		obj.closeApplication();
	}




}
