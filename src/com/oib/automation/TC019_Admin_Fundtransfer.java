package com.oib.automation;
/*Test Case id: OIB-Admin-TC020
 * Test Title:Verify Admin- Fund Transfer : with valid user id, password,From Date,To date.                
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 10-Nov
 * Script Executed Date: 10-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Reports -->Click on Fund Tranfer
 *                                 -->  Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC019_Admin_Fundtransfer {
	@Test
	public void fundtransfer()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.fundTransfer();
		obj.logout();
		obj.closeApplication();
	}



}
