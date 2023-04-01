package com.oib.automation;
/*Test Case id: OIB-Admin-TC004
 * Test Title:Verify Admin Acc Type Register Fun: with Valid userID,password,Acc Type Name,Acc Abbreviation,min Open balance,max open balance
 *                interest applicable,interest applicable,Description,Min balance to be maintain,Check book facility bit,balance type bit
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application-->Mouse Over Branches-->Click on Acc Types-->Perform all required fields-->
 *                                   --> Click on Register button -->Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC004_AdminAccTypes {
	@Test
	public void acctype()throws Exception{
		
	CommonFunctions obj=new CommonFunctions();
	obj.openApplication();
	obj.login();
	obj.account_Types();
	obj.logout();
	obj.closeApplication();

}
}
