package com.oib.automation;
/*Test Case id: OIB-Admin-TC019
 * Test Title:Verify Admin- Customer Locked Accounts : with valid user id, password.                 
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 10-Nov
 * Script Executed Date: 10-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Reports -->Click on Customer Locked Accounts
 *                                 -->  Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC018_Admin_ViewCustomerLockedAcc {
	@Test
	public void lockedacc()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.customer_lockedacc();
		obj.logout();
		obj.closeApplication();
	}


}
