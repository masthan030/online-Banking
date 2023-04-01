package com.oib.automation;
/*Test Case id: OIB-Admin-TC017
 * Test Title:Verify Admin- Verify Employees Fun: with valid user id, password.                 
 * Priority: Low
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 09-Nov
 * Script Executed Date: 09-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Employees -->Click on View Employees
 *                                 -->  Logout Application--> Close Application
 */

import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC016_Admin_ViewEmployees {
	@Test
	public void viewemp()throws Exception{
		
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.view_Employees();
		obj.logout();
		obj.closeApplication();
		
		
	}



}
