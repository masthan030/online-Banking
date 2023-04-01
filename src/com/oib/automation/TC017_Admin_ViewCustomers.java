package com.oib.automation;
/*Test Case id: OIB-Admin-TC018
 * Test Title:Verify Admin- Verify Employees Fun: with valid user id, password,Accopunt no.                 
 * Priority: Low
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 09-Nov
 * Script Executed Date: 09-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Reports -->Click on View Customers
 *                                 -->  Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC017_Admin_ViewCustomers {
	@Test
	public void viewcustomer()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.view_customers();
		obj.logout();
		obj.closeApplication();
	}




}
