 package com.oib.automation;
/*Test Case id: OIB-Admin-TC027
 * Test Title:Verify Admin- Verify Employees Fun: with valid user id, password.                 
 * Priority: Low
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 23-Nov
 * Script Executed Date: 23-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Branches -->Click on View Branches
 *                                 -->  Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

public class TC_Admin_RetrieveData_ViewBranch {
	@Test
	
	public void retrieve_data()throws Exception{
		
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.retrieve_data();
		
		
		
	}

}





