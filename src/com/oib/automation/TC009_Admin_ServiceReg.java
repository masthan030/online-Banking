package com.oib.automation;
/*Test Case id: OIB-Admin-TC009
 * Test Title:Verify Admin Service Registration Fun: with Valid userID,password,Service name,service description,service Active state
 * Priority: High
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 08-Nov
 * Script Executed Date: 08-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Login Application-->Mouse over to Services-->Click on Register Services-->Perform all required Fields
 *                             Logout Application--> Close Application
 */
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC009_Admin_ServiceReg {
	@Test
	public void servicereg()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.services_Registeration();
		obj.logout();
		obj.closeApplication();
		
	}

}
