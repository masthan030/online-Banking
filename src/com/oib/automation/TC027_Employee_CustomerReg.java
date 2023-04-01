package com.oib.automation;
/*Test Case id: OIB-Employee-TC025
 * Test Title:Verify Employee-Customer Registration: with Required data
 * Priority: High
 * Module Name: Employee
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 15-Nov
 * Script Executed Date: 15-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application As Employee
 *                                         -->mouse Over to Customer-->click on RegCustomer--> Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

public class TC027_Employee_CustomerReg {
	
	@Test
	
	public void cust_reg()throws Exception{
		
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.emp_login();
		obj.customer_reg();
		obj.logout();
		obj.closeApplication();

	}

}
