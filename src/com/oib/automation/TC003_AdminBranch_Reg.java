package com.oib.automation;
/*Test Case id: OIB-Admin-TC003
 * Test Title:Verify Admin Branch Register Fun: with valid user id, password,Branch address,
 *                  branch email id,branch phone1.branch phone2,branch phone3,
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to branches -->Click register branches
 *                                 -->Registartion  -->  Logout Application--> Close Application
 */

import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;
public class TC003_AdminBranch_Reg {
@Test
	
	public void branchreg()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.branch_Registration();
		obj.logout();
		obj.closeApplication();
	}
}


