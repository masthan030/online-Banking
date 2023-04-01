package com.oib.automation;
/*Test Case id: OIB-Admin-TC016
 * Test Title:Verify Admin Employee Register Fun: with valid user id, password,Branch name,initial balance,first name,last name
 *   birth date,hno,street,city,state,country,pincode,contact no,email,login name,
 *   password,Secret question,secret ans
 *                  
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 09-Nov
 * Script Executed Date: 09-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: Open Application--> Login Application--> --> Mouse over to Employee -->Click register Employee
 *                                 -->Perform All required fields -->  Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

public class TC015_Admin_EmployeeReg {
	@Test
	public void emp_reg()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.emp_registration();
		obj.logout();
		obj.closeApplication(); 
	}




}
