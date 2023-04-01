package com.oib.automation;
/*Test Case id: OIB-Admin-TC015
* Test Title:Verify Admin -Retrieve All links: with Valid userID,password.
* Priority: High
* Module Name: Admin
* Designed By: Masthan
* Executed By: Masthan
* Script Designed Date: 10-Nov
* Script Executed Date: 10-Nov
* Pre_Condition: Url should be working
* Dependencies: NA
* Test Case Execution Flow: open Application--> Login Application-logout Application--> Close Application
*/
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;



public class TC014_Admin_RetrieveAllLinks {

@Test
public void alllinks()throws Exception{
	CommonFunctions obj=new CommonFunctions();
	obj.openApplication();
	obj.login();
	obj.retieveAllLinks_Admin();
	obj.logout();
	obj.closeApplication();
}
	
	
	



}
