package com.oib.automation;

import org.testng.annotations.Test;

import com.oib.lib.CommonFunctions;

/*Test Case id: OIB-Admin-TC016
 * Test Title:Verify Admin Employee Register Fun: with valid user id, password,Branch name,initial balance,first name,last name
 *   birth date,hno,street,city,state,country,pincode,contact no,email,login name,
 *   password,Secret question,secret ans
 *                  
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 14-Nov
 * Script Executed Date: 14-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Reports-->Click on View Customer Transaction
 *                                 -->Perform All required fields -->  Logout Application--> Close Application
 */
public class TC020_Admin_ViewCustomer_Transactions {
	@Test
	public void customer_transaction()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.view_customertransactions();
		obj.logout();
		obj.closeApplication();
	}

}
