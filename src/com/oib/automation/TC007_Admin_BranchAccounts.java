package com.oib.automation;
/*Test Case id: OIB-Admin-TC007
 * Test Title:Verify Admin Branch Account Registration Fun: with Valid userID,password,Branch Address
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application-->Mouse over to Branches-->Click on Brach Accounts
 *                                    perform all required Fields-->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

public class TC007_Admin_BranchAccounts {
	@Test
	public void branchacc()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.branch_accounts();
		obj.logout();
		obj.closeApplication();
	}



}
