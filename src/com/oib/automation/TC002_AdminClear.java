package com.oib.automation;
/*Test Case id: OIB-Admin-TC002
 * Test Title:Verify Admin Clear Fun: with Valid userID,password
 * Priority: Medium
 * Module Name: Admin
 * Designed By: Masthan
 * Executed By: Masthan
 * Script Designed Date: 07-Nov
 * Script Executed Date: 07-Nov
 * Pre_Condition: Url should be working
 * Dependencies: NA
 * Test Case Execution Flow: open Application--> Clear data
 */

import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;


public class TC002_AdminClear {
	@Test
	public void clear()throws Exception{
		CommonFunctions obj=new CommonFunctions();
		obj.openApplication();
		obj.clear();
		obj.closeApplication();
	}
}