package com.oib.lib;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CommonFunctions extends ObjectRepository{
	 //All reusable functions
	   
    /*Created By:Masthan
     * Method name/Description:Which is used to OpenApplication by Enter:
     * Launch Browser&Enter URL
     */
   
   
    public void openApplication()throws Exception {
        System.setProperty("webdriver.edge.driver", "D:\\selenium-java\\Online_Banking_Project\\src\\drivers\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    Reporter.log("Application Opened");
    System.out.println("Application Opened");
    Thread.sleep(2000);
       
    }
    /*Created By:Masthan
     * Method Name/Description:Which is used to Close Application by Enter:
     * Close Application
     */
   
    public void closeApplication() {
        driver.close();
        Reporter.log("Application Closed");
        System.out.println("Application Closed");    
    }
   
    /*Creates By : Masthan
     * Method Name/Description:Which is used to Login Application by Enter:
     * Enter user id ,Enter Password,Click on Sign in Button
     */
    public void login() throws Exception{
        driver.findElement(By.name(txt_userid)).sendKeys(userid);
        Thread.sleep(2000);
        driver.findElement(By.name(txt_password)).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_signin)).click();
        System.out.println("Login Completed");
        Reporter.log("Login Completed");
        Thread.sleep(2000);
    }
   
    /*Created By : Masthan
     * Method Name/Description Which is used to Logout Application by Enter:
     * Click on Logout link
     */
   
    public void logout()throws Exception {
        driver.findElement(By.linkText(link_logout)).click();
        System.out.println("Logout Completed");
        Reporter.log("Logout Completed");
        Thread.sleep(2000);
    }
    /*Created By : Masthan
     * Method Name/Description Which is used to Clear Data by Enter:
     * Enter userid,Enter Password,Click on Clear Button
     */
    public void clear()throws Exception  {
        driver.findElement(By.name(txt_userid)).sendKeys(userid);
        Thread.sleep(2000);
        driver.findElement(By.name(txt_password)).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_clear)).click();
        Thread.sleep(2000);
        if(driver.findElement(By.name(txt_userid)).getAttribute("value").isEmpty())
        {
        	System.out.println("Data is Cleared");
        	Reporter.log("Data is Cleared");
        }
        else
        {
        	System.out.println("Data is not cleared");
        	Reporter.log("Data is  not cleared");
        	//System.out.println(driver.findElement(By.name(userid)).getAttribute("value"));
        	//Reporter.log(driver.findElement(By.name(userid)).getAttribute("value"));
        }
       
        Thread.sleep(2000);
       
    }
    /*Created By : Masthan
     * Method name/Desription Which is used to Branch registion by Enter:
     * OpenApplication,Login into Application,Mouse over to Branches,Click on Registration Branches
     */
    public void branch_Registration() throws Exception{
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(Branch))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath(Reg_Bran))).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Reg_Bran)).click();
        Thread.sleep(2000);
       
        Thread.sleep(2000);
        driver.findElement(By.name(Bra_Add)).sendKeys(BranchAddress);
        Thread.sleep(2000);
        driver.findElement(By.name(Bra_Emailid)).sendKeys(Branchemailid);
        Thread.sleep(2000);
        driver.findElement(By.name(Bra_phone1)).sendKeys(phone1);
        Thread.sleep(2000);
        driver.findElement(By.name(Bra_phone2)).sendKeys(phone2);
        Thread.sleep(2000);
        driver.findElement(By.name(Bra_phone3)).sendKeys(phone3);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_Register)).click();
        Thread.sleep(2000);
       
        System.out.println("Branch Registration Succesfull");
        Reporter.log("Branch Registration Succesfull");
       
    }
    /*Created By : Masthan
     * Method Name/Description Which is used to view Branches
     * OpenApplication,Login into Application,mouse over to Branches,click on view branches
     */
    public void view_Branches()throws Exception {
    Actions ac =new Actions(driver);
    ac.moveToElement(driver.findElement(By.name(Branch))).perform();
    Thread.sleep(2000);
    ac.moveToElement(driver.findElement(By.id(view_Branches))).perform();
    Thread.sleep(2000);
    driver.findElement(By.id(view_Branches)).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(chk_box)).click();
    Thread.sleep(2000);
    driver.findElement(By.name(btn_delate)).click();
    System.out.println("View Branch Delated Successfull");
    Reporter.log("View Branch Delated Successfull");
   
    }
   
    /*Created By : Masthan
     * Method Name/Description Which is used to Account Type
     * OpenApplication,Login into Application,mouse over into Branches,Click on Account types
     */
    public void account_Types() throws Exception{
        Actions ac =new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(Branch))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(Acc_Type))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(Acc_Type)).click();
        Thread.sleep(2000);

        Thread.sleep(2000);
        driver.findElement(By.name(Acc_typename)).sendKeys(Acctypename);
        Thread.sleep(2000);
        driver.findElement(By.name(Acc_Abb)).sendKeys(AccountAbb);
        Thread.sleep(2000);
        driver.findElement(By.name(min_openBal)).sendKeys(minopenblan);
        Thread.sleep(2000);
        driver.findElement(By.name(max_openBal)).sendKeys(maxopenblan);
        Thread.sleep(2000);
        driver.findElement(By.name(interset_App)).sendKeys(inteapplicable);
        Thread.sleep(2000);
        driver.findElement(By.name(Desc)).sendKeys(descr);
        Thread.sleep(2000);
        driver.findElement(By.name(Min_Bla_tobemaita)).sendKeys(minblamain);
        Thread.sleep(2000);
        Select st=new Select(driver.findElement(By.name(checkbookfacil)));
        st.selectByIndex(1);
        Thread.sleep(2000);
        Select st1=new Select(driver.findElement(By.name(Blance_type_bit)));
        st1.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_register)).click();
        Thread.sleep(2000);
        
       
        System.out.println("Account type Register Successfull");
        Reporter.log("Account type Register Successfull");
   
    }
   
   
    /*Created By : Masthan
     * Method name/Description Which is used to View Account type
     * openApplication,login into Application,mouse over to Branches,Click on View Account Types
     */
    public void view_account_Types()throws Exception
    {
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(Branch))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(view_acc_types))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id(view_acc_types)).click();
        Thread.sleep(2000);
        
        System.out.println("View Account Type Record Displayed");
        Reporter.log("View Account Type Records Displayed succesfull");
       
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Delete View Account type
     * openApplication,login into Application,mouse over to Branches,Click on View Account Types
     */
    public void viewAccTypes_Delete()throws Exception{
    	Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(Branch))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(view_acc_types))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id(view_acc_types)).click();
        Thread.sleep(2000);
        driver.findElement(By.name(chk_box_viewacctype)).click();
        Thread.sleep(2000);
        driver.findElement(By.name(btn_delete)).click();
        System.out.println("View Account Type Record Delated");
        Reporter.log("View Account Type Record Delated succesfull");
    	
    }
    
    /*Created By : Masthan
     * Method name/Description Which is used to Branch Accounts
     * openApplication,login into Application,mouse over to Branches,Click on Branch Accounts
     */
    public void branch_accounts()throws Exception
    {
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(Branch))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(Branch_Accounts))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(Branch_Accounts)).click();
        Thread.sleep(2000);
        Select st= new Select(driver.findElement(By.name(Branch_Addr)));
        st.selectByIndex(0);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_Reg)).click();
        System.out.println("Branch Account type Registeration Success");
        Reporter.log("Branch Account type Registeration Success");
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Branch Account Types
     * openApplication,login into Application,mouse over to Branches,Click on Branch Account Types
     */
   
    public void view_Branch_Acc_Type()throws Exception
    {
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(Branch))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(view_Bran_Acc_Types))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(view_Bran_Acc_Types)).click();
        Thread.sleep(2000);
        Select st= new Select(driver.findElement(By.name(Bran_Add)));
        st.selectByIndex(6);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_Search)).click();
        Thread.sleep(2000);
        System.out.println("View Branch Account Types Search Succesfully");
        Reporter.log("View Branch Account Types Search Succesfully");
       
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Service Registration
     * openApplication,login into Application,mouse over to Services,Click on Service Registration
     */
    public void services_Registeration()throws Exception
    {
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(services))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(Regi_Services))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(Regi_Services)).click();
        Thread.sleep(2000);
        driver.findElement(By.name(serv_name)).sendKeys(servname);
        Thread.sleep(2000);
        driver.findElement(By.name(serv_descr)).sendKeys(servdesc);
        Thread.sleep(2000);
        driver.findElement(By.name(serv_acti_state)).sendKeys(servactivestate);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_reg)).click();
        Thread.sleep(2000);
        
        System.out.println("Service Registration Succesfull");
        Reporter.log("Service Registration Succesfull");
       
    }
    /*Created By : Masthan
     * Method name/Description Which is used to View Services
     * openApplication,login into Application,mouse over to Services,Click on View Services
     */
   
    public void view_Services()throws Exception {
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(services))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(view_Serv))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(view_Serv)).click();
        Thread.sleep(2000);
        System.out.println("View Services Succesfull");
        Reporter.log("View Services Succesfull");
       
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Delete View Services
     * openApplication,login into Application,mouse over to Services,Click on View Services
     */
    public void viewService_Delete()throws Exception{
    	Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(services))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(view_Serv))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(view_Serv)).click();
        Thread.sleep(2000);
        driver.findElement(By.name(check_box)).click();
        Thread.sleep(2000);
        driver.findElement(By.name(btn_delete1)).click();
        Thread.sleep(2000);
        System.out.println("View Services Succesfull");
        Reporter.log("View Services Succesfull");
    	
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Register Branch Services Master Form
     * openApplication,login into Application,mouse over to Services,Click on Branch Services
     */
    public void branchServices_reg()throws Exception{
    	Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(services))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(branch_services_mouse))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(branch_services_mouse)).click();
        Thread.sleep(2000);
    if(driver.getPageSource().equals("Branch Services Master Form"))
    {
    	System.out.println("Branch Services Heading Is Displayed");
    }
    else
    {
    	System.out.println("Branch Services Not Displyed");
    }
         
    	Select tf=new Select(driver.findElement(By.name(ddown_brach_id)));
    	tf.selectByIndex(4);
    	Thread.sleep(2000);
    	Select rt=new Select(driver.findElement(By.name(ddown_servicename)));
    	rt.selectByIndex(0);
    	Thread.sleep(2000);
    	driver.findElement(By.name(btn_branchServices)).click();
    	Reporter.log("Branch Services Registration is Completed");
         Thread.sleep(2000);
    	
    	
    	
    }
    /*Created By : Masthan
     * Method name/Description Which is used to View Services
     * openApplication,login into Application,mouse over to services,click on view ServicesLogout Application,Close Application
     */
    public void viewservices()throws Exception{
    	Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(services))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(view_services_mouse))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(view_services_mouse)).click();
        Thread.sleep(2000);
        Select df=new Select(driver.findElement(By.name(ddown_view_branchservice)));
        df.selectByIndex(4);
        Thread.sleep(2000);
        driver.findElement(By.name(btn_view_Branchservices)).click();
        Reporter.log("Test Case Is Passed");
        Thread.sleep(2000);
    	
    }
    /*Created By : Masthan
     * Method name/Description Which is used to View Customer Locked Accounts
     * openApplication,login into Application,mouse over to Reports,click on Customer locked Accounts,Logout Application,Close Application
     */
    
    public void customer_lockedacc()throws Exception{
    	
    	Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(reports_mouse))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(viewCustomer_mouse))).perform();
        Thread.sleep(2000);
        driver.findElement(By.id(viewCustomer_mouse)).click();
        Thread.sleep(2000);
        Reporter.log("Test case is passed");
        System.out.println("Test Case is Passed");
    	
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Fund Transfer
     * openApplication,login into Application,mouse over to Reports,click on Fund Transfer,Logout Application,Close Application
     */
    public void fundTransfer()throws Exception{
    	
    	Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.name(reports_mouse))).perform();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.id(fundtransfer_mouse))).perform();
        Thread.sleep(2000);
                    //Verify Heading
        if(driver.getPageSource().equalsIgnoreCase("Fund Transaction "))
        {
        	System.out.println("Fund Transfer Page Heading is Displayed");
        }
        else
        {
        	System.out.println("Heading is not Displayed");
        }
        Thread.sleep(2000);
        driver.findElement(By.id(fundtransfer_mouse)).click();
        Thread.sleep(2000);	
    	  //from date calender click
        driver.findElement(By.xpath(fromdate_click)).click();
        Thread.sleep(2000);
        String parent=driver.getWindowHandle();
    	Set<String>s=driver.getWindowHandles();

     // Now iterate using Iterator
    	 Iterator<String> I1= s.iterator();
    	
    	 while(I1.hasNext())
    	 {
    		 String child_window=I1.next();
    		 	if(!parent.equals(child_window))
    		 		{
    		 			driver.switchTo().window(child_window);
    	
    		 			System.out.println(driver.switchTo().window(child_window).getTitle());
    		 			String ChildTitle = driver.getTitle();
    		 			System.out.println(ChildTitle);
    		 			
    		 			if(ChildTitle.equalsIgnoreCase("Calendar"))
    		 			{
    		 				driver.findElement(By.xpath("//*[@name='time']")).clear();
    		 				Thread.sleep(3000);
    		 			    driver.findElement(By.xpath("//*[@name='time']")).sendKeys("2022");
    		 			    Thread.sleep(3000);
    		 			  
    		 			  driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
    		 			}
    		 			
    		 			String month="March 2022";
    		 			String date="1";
    		 			while(true)
    		 			{
    		 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
    		 				if(text.equals(month))
    		 				{
    		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[7]/a")).click();
    		 					break;
    		 				}
    		 				else
    		 				{
    		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
    		 				}	
    		 				
    		 			}
    		 			driver.switchTo().window(parent);
    	
    	
    		 		}
    	 }
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath(todate_click)).click();
    	 Thread.sleep(2000);
    	 String parent1=driver.getWindowHandle();
     	Set<String>s1=driver.getWindowHandles();

      // Now iterate using Iterator
     	 Iterator<String> I2= s1.iterator();
     	
     	 while(I2.hasNext())
     	 {
     		 String child_window1=I2.next();
     		 	if(!parent1.equals(child_window1))
     		 		{
     		 			driver.switchTo().window(child_window1);
     	
     		 			System.out.println(driver.switchTo().window(child_window1).getTitle());
     		 			String ChildTitle1 = driver.getTitle();
     		 			System.out.println(ChildTitle1);
     		 			
     		 			if(ChildTitle1.equalsIgnoreCase("Calendar"))
     		 			{
     		 				driver.findElement(By.xpath("//*[@name='time']")).clear();
     		 				Thread.sleep(3000);
     		 			    driver.findElement(By.xpath("//*[@name='time']")).sendKeys("2022");
     		 			    Thread.sleep(3000);
     		 			  
     		 			  driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
     		 			}
     		 			
     		 			String month="November 2022";
     		 			String date="11";
     		 			
     		 			while(true)
     		 			{
     		 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
     		 				if(text.equals(month))
     		 				{
     		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[5]/a/font")).click();
     		 					break;
     		 				}
     		 				else
     		 				{
     		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
     		 				}	
     		 				
     		 			}
     		 			driver.switchTo().window(parent1);
     		 			Thread.sleep(2000);
     		 			Reporter.log("There is no Find Button");
     		 			System.out.println("There is no Find Button");
     	
     	
     		 		}
     	 }
    	
    	
    	
    }
    
    /*Created By : Masthan
     * Method name/Description Which is used to Retrieve All links In Admin Module
     * openApplication,login into Application,Logout Application,Close Application
     */
    public void retieveAllLinks_Admin()throws Exception{
    	
    List<WebElement>allLinks=driver.findElements(By.tagName("a"));
    System.out.println("Here all links in Admin Module");
    for(WebElement links:allLinks)
    {
    	Reporter.log(links+ links.getAttribute("href"));
    	System.out.println(links);
    }
    }
    /*Created By : Masthan
     * Method name/Description Which is used to All Links Retrieve
     * openApplication
     */
    public void links_inloginpage()throws Exception
    {
    	List<WebElement>allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Here all links in Login Page");
        for(WebElement links:allLinks)
        {
        	Reporter.log(links+ links.getAttribute("href"));
        	System.out.println(links+ links.getAttribute("href"));
        }
    		
    	}
   
    
    
    /*Created By : Masthan
     * Method name/Description Which is used to Employee Registration
     * openApplication,login into Application,mouse over to Employees ,Click on Register Employees
     */
    
    public void emp_registration()throws Exception{
    	Actions ac=new Actions(driver);
    	ac.moveToElement(driver.findElement(By.name(employee_mouse))).build().perform();
    	Thread.sleep(2000);
    	ac.moveToElement(driver.findElement(By.id(emp_reg))).build().perform();
    	Thread.sleep(2000);
    	driver.findElement(By.id(emp_reg)).click();
    	Thread.sleep(2000);
    	  //select Branch name
    	Select st=new Select(driver.findElement(By.name(ddown_branchname)));
    	    st.selectByIndex(6);
    	    Thread.sleep(2000);
    	    driver.findElement(By.name(txt_initialBalance)).sendKeys(emp_initialbalance);
    	    Thread.sleep(2000);
    	    driver.findElement(By.name(txt_firstname)).sendKeys(emp_firstname);
    	    Thread.sleep(2000);
    	    driver.findElement(By.name(txt_lastname)).sendKeys(emp_lastname);
    	    Thread.sleep(2000);
    	                    //calendar click
    	    driver.findElement(By.xpath(birthdateCalender_Click)).click();
    		Thread.sleep(2000);
    		String parent=driver.getWindowHandle();
    		Set<String>s=driver.getWindowHandles();

    	 // Now iterate using Iterator
    		 Iterator<String> I1= s.iterator();
    		
    		 while(I1.hasNext())
    		 {
    			 String child_window=I1.next();
    			 	if(!parent.equals(child_window))
    			 		{
    			 			driver.switchTo().window(child_window);
    		
    			 			System.out.println(driver.switchTo().window(child_window).getTitle());
    			 			String ChildTitle = driver.getTitle();
    			 			System.out.println(ChildTitle);
    			 			
    			 			if(ChildTitle.equalsIgnoreCase("Calendar"))
    			 			{
    			 				driver.findElement(By.xpath("//*[@name='time']")).clear();
    			 				Thread.sleep(3000);
    			 			    driver.findElement(By.xpath("//*[@name='time']")).sendKeys("1995");
    			 			    Thread.sleep(3000);
    			 			  
    			 			  driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
    			 			}
    			 			
    			 			String month="October 1995";
    			 			String date="1";
    			 			while(true)
    			 			{
    			 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
    			 				if(text.equals(month))
    			 				{
    			 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[7]/a")).click();
    			 					break;
    			 				}
    			 				else
    			 				{
    			 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
    			 				}	
    			 				
    			 			}
    			 			driver.switchTo().window(parent);
    			 			Thread.sleep(2000);
    	    driver.findElement(By.name(txt_houseno)).sendKeys(emp_houseno);
    	    Thread.sleep(2000);
    	    driver.findElement(By.name(txt_street)).sendKeys(emp_street);
    	    Thread.sleep(2000);
    	    //select City
    	    Select tr=new Select(driver.findElement(By.name(ddown_city)));
    	       tr.selectByIndex(1);
    	       Thread.sleep(2000);
    	       //Select State
    	       Select tr1=new Select(driver.findElement(By.name(ddown_state)));
    	       tr1.selectByIndex(1);
    	       Thread.sleep(2000);
    	       //select Country
    	       Select tr2=new Select(driver.findElement(By.name(ddown_country)));
    	       tr2.selectByIndex(0);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(txt_pincode)).sendKeys(emp_pincode);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(txt_contactno)).sendKeys(emp_contactno);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(txt_email)).sendKeys(emp_email);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(txt_loginname)).sendKeys(emp_loginname);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(txt_password)).sendKeys(emp_password);
    	       Thread.sleep(2000);
    	       //select Secret Question
    	       Select tr3=new Select(driver.findElement(By.name(ddown_secretquestion)));
    	       tr3.selectByIndex(1);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(txt_secretanswer)).sendKeys(emp_secretans);
    	       Thread.sleep(2000);
    	       driver.findElement(By.name(btn_empreg)).click();
    	       Thread.sleep(2000);
    	       Reporter.log("Employee Registration Completed");
    			 		}
    			 	}	       
    } 
    /*Created By : Masthan
     * Method name/Description Which is used to  Verify Employees
     * openApplication,login into Application,mouse over to Employees ,Click on View Employees
     */
    public void view_Employees()throws Exception{
    	Actions ac=new Actions(driver);
    	ac.moveToElement(driver.findElement(By.name(employee_mouse))).build().perform();
    	Thread.sleep(2000);
    	ac.moveToElement(driver.findElement(By.id(view_Employee))).build().perform();
    	Thread.sleep(2000);
    	driver.findElement(By.id(view_Employee)).click();
    	Thread.sleep(2000);
    	Reporter.log("Employee details should be displayed");
    	
    	
    }
    /*Created By : Masthan
     * Method name/Description Which is used to  View Profile
     * openApplication,login into Application,mouse over to Profile ,Click on View Profile
     */
    
    public void view_profile()throws Exception{
    	Actions ac=new Actions(driver);
    	ac.moveToElement(driver.findElement(By.id(profile_mouse))).build().perform();
    	Thread.sleep(2000);
    	ac.moveToElement(driver.findElement(By.id(view_profile))).build().perform();
    	Thread.sleep(2000);
    	driver.findElement(By.id(view_profile)).click();
    	Thread.sleep(2000);
    	Reporter.log("View Profile Page should be displayed");
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Find Customer Details
     * openApplication,login into Application,mouse over to Reports ,Click on View Customers
     */
    public void view_customers()throws Exception{
    	Actions ac=new Actions(driver);
    	ac.moveToElement(driver.findElement(By.id(reports_mouse))).build().perform();
    	Thread.sleep(2000);
    	ac.moveToElement(driver.findElement(By.id(view_customers))).build().perform();
    	Thread.sleep(2000);
    	driver.findElement(By.id(view_customers)).click();
    	Thread.sleep(2000);
    	driver.findElement(By.name(txt_accno)).sendKeys(customerdetails_accno);
    	Thread.sleep(2000);
    	driver.findElement(By.name(btn_find)).click();
    	Thread.sleep(2000);
    	
    	Reporter.log("View Customers Page should be displayed");
    }  
    /*Created By : Masthan
     * Method name/Description Which is used to Verify Title
     * openApplication,Login into Application
     */
    public void verifyTitle()throws Exception{
    	Thread.sleep(2000);
    	assertEquals(driver.getTitle(),"Internet Banking");
    	System.out.println("Title Matched");
    	Reporter.log("Title is matched");
    }
    	
    
    
                //Employee Module
    
    /*Created By : Masthan
     * Method name/Description Which is used to Login into Application
     * openApplication,Login into Application.
     */
    
    public void emp_login()throws Exception{
    	Thread.sleep(2000);
    	 driver.findElement(By.name(txt_userid)).sendKeys(emp_userid);
         Thread.sleep(2000);
         driver.findElement(By.name(txt_password)).sendKeys(emp_pass);
         Thread.sleep(2000);
         driver.findElement(By.name(btn_signin)).click();
         System.out.println("Login Completed");
         Reporter.log("Login Completed");
         Thread.sleep(2000);
    	
    }
    /*Created By : Masthan
     * Method name/Description Which is used to Verify Employee Module Welcome Text
     * openApplication,Login into Application.
     */
    
   public void welcome_text()throws Exception{
	   
	   
	  if(driver.getPageSource().contains("Welcome To Employee")) 
	  {
		  System.out.println("Welcome Title is Diplayed");
		  Reporter.log("Welcome Title is Diplayed");
	  }
	   
	  else
	  {
		  System.out.println("Not Diplayed Correct");
		  Reporter.log("Not Diplayed Correct");
	  }
	   
   }
   /*Created By : Masthan
    * Method name/Description Which is used to Verify Customer Registration
    * openApplication,Login into Application.
    */
   
   
   public void customer_reg()throws Exception{
	   
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.id(customers_mouse))).build().perform();
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.id(reg_customer))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.id(reg_customer)).click();
	Thread.sleep(2000);
	Select st=new Select(driver.findElement(By.name(ddown_branchName)));
	st.selectByIndex(1);
	Thread.sleep(2000);
	driver.findElement(By.name(initialBalance)).sendKeys(emp_custreg_initialbalance);
	Thread.sleep(2000);
	driver.findElement(By.name(txt_first_name)).sendKeys(emp_custreg_firstname);
	Thread.sleep(2000);
	driver.findElement(By.name(txt_last_name)).sendKeys(emp_custreg_lastname);
	Thread.sleep(2000);
	WebElement bd=driver.findElement(By.xpath(bdate_cal_click));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",bd);
	
	Thread.sleep(2000);
	String parent=driver.getWindowHandle();
	Set<String>m2=driver.getWindowHandles();

 // Now iterate using Iterator      
	 Iterator<String> I8= m2.iterator();
	
	 while(I8.hasNext())
	 {
		 String child_window=I8.next();
		 	if(!parent.equals(child_window))
		 		{
		 			driver.switchTo().window(child_window);
	
		 			System.out.println(driver.switchTo().window(child_window).getTitle());
		 			String ChildTitle = driver.getTitle();    
		 			System.out.println(ChildTitle);
		 			
		 			if(ChildTitle.equalsIgnoreCase("Calendar"))
		 			{
		 				driver.findElement(By.xpath("//*[@name='time']")).clear();
		 				Thread.sleep(3000);
		 			    driver.findElement(By.xpath("//*[@name='time']")).sendKeys("1998");
		 			    Thread.sleep(3000);
		 			  
		 			  driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
		 			}
		 			
		 			String month="June 1998";
		 			String date="19";
		 			while(true)
		 			{
		 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
		 				if(text.equals(month))
		 				{
		 					driver.findElement(By.xpath(dob)).click();
		 					break;
		 				}
		 				else
		 				{
		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
		 				}	
		 				
		 			}
		 		
		 			driver.switchTo().window(parent);
		 			Thread.sleep(2000);
		 	driver.findElement(By.name(house_no)).sendKeys(emp_custreg_houseno);
		 	Thread.sleep(2000);
		 	driver.findElement(By.name(street)).sendKeys(emp_cust_street);
		 	Thread.sleep(2000);
		 	     //Dropdown: City
		 	Select st4=new Select(driver.findElement(By.name( ddown_city_emp)));
	        st4.selectByIndex(1);
	        Thread.sleep(2000);
	        //Dropdown: State
	        Select st5=new Select(driver.findElement(By.name(ddown_state1)));
	        st5.selectByIndex(1);
	        Thread.sleep(2000);
	        //Dropdown: Country
	        
	        Select st8=new Select(driver.findElement(By.name(ddown_country1)));
	        st8.selectByIndex(0);
	        Thread.sleep(2000);
	        driver.findElement(By.name(pincode)).sendKeys(emp_custreg_pincode);
	        Thread.sleep(2000);
	        driver.findElement(By.name(contactno)).sendKeys( emp_custreg_contactno);
	        Thread.sleep(2000);
	        driver.findElement(By.name(email)).sendKeys(emp_custreg_email);
	        Thread.sleep(2000);
	        driver.findElement(By.name(loginname)).sendKeys(emp_custreg_loginname);
	        Thread.sleep(2000);
	        driver.findElement(By.name(txt_password_emp)).sendKeys(emp_custreg_password);
	        Thread.sleep(2000);
	        //Secret question
	        Select df=new Select(driver.findElement(By.name(select_question)));
	        df.selectByIndex(1);
	        Thread.sleep(2000);
	        driver.findElement(By.name(secret_answer)).sendKeys(emp_custreg_secretanswer);
	        Thread.sleep(2000);
	        driver.findElement(By.name(reg)).click();
	        Thread.sleep(2000);
	        Reporter.log("Customer Details Registered");
	        System.out.println("Customer Details Registered");
	        if(driver.getPageSource().equalsIgnoreCase("Registeration Fail"))
	        {
	        	System.out.println("Test Case Fail");
	        	Reporter.log("Test Case Fail");
	        }
	        else
	        {
	        	System.out.println("Test Case Pass");
	        	Reporter.log("Test Case Pass");
	        }
	        String bgclr=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr[1]/td/font/b")).getCssValue("color");
	         System.out.println(bgclr);
	         Reporter.log(bgclr);
		 		}   
	   
   }
   
   
   }
   /*Created By : Masthan
    * Method name/Description Which is used to Verify To Retrieve All the Data from Admin: View Branches
    * openApplication,Login into Application.
    */
   
   public void retrieve_data()throws Exception
   {
	   Actions ac =new Actions(driver);
	    ac.moveToElement(driver.findElement(By.name(Branch))).perform();
	    Thread.sleep(2000);
	    ac.moveToElement(driver.findElement(By.id(view_Branches))).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.id(view_Branches)).click();
	    Thread.sleep(2000);
	  //Row count
	  		int row=driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr")).size();
	  		System.out.println(row);
	  		
	  		              //Column count
	  		int col=driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr[1]/td")).size();
	  		System.out.println(col);
	  		
	  		Thread.sleep(2000);
	  		 //Column & Rows Count
	  		int row_col=driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr/td")).size();
	  		System.out.println(row_col);
	  		
	  		
	  		       //Retrieve data from one particular cell
	  		String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr[12]/td[3]/span")).getText();
	  		System.out.println(text);
	  		Reporter.log(text);
	  		
	  		           
	  		
	  		      //Retrieve all the text in rows
	  		
	  		for(int i=1;i<=row;i++)
	  		{
	  			String data=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr["+i+"]")).getText();
	  			System.out.println(data);
	  			Reporter.log(data);
	  		}
	  		System.out.println("Data should be Retrieved");
	  		Reporter.log("Data should be Retrieved");
	  		driver.quit();
	  		
	   
   }
   
   /*Created By : Masthan
    * Method name/Description Which is used to Verify View Profile
    * openApplication,Login into Application.
    */
   public void profile()throws Exception{
	   
	   Actions profile=new Actions(driver);
	   profile.moveToElement(driver.findElement(By.id(profile_mouseover))).build().perform();
	   Thread.sleep(2000);
	   profile.moveToElement(driver.findElement(By.id(view_profile1))).build().perform();
	   driver.findElement(By.id(view_profile1)).click();
	   Thread.sleep(3000);
	   System.out.println("View Profile Opened");
	   Reporter.log("View Profile Opened");
	   
   }
   /*Created By : Masthan
    * Method name/Description Which is used to Verify Admin: View Customer Transactions
    * openApplication,Login into Application.
    */
   
	   public void view_customertransactions()throws Exception{
		   Actions trans=new Actions(driver);
		   trans.moveToElement(driver.findElement(By.id(reports1_mouseover))).build().perform();
		   Thread.sleep(2000);
		   trans.moveToElement(driver.findElement(By.id(viewcustomer_transaction))).build().perform();
		   Thread.sleep(3000);
		   driver.findElement(By.id(viewcustomer_transaction)).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.findElement(By.xpath(fromdate_calendar)).click();
		   Thread.sleep(2000);
		   
		   String parent=driver.getWindowHandle();
	    	Set<String>s=driver.getWindowHandles();

	     // Now iterate using Iterator
	    	 Iterator<String> I1= s.iterator();
	    	
	    	 while(I1.hasNext())
	    	 {
	    		 String child_window=I1.next();
	    		 	if(!parent.equals(child_window))
	    		 		{
	    		 			driver.switchTo().window(child_window);
	    	
	    		 			System.out.println(driver.switchTo().window(child_window).getTitle());
	    		 			String ChildTitle = driver.getTitle();
	    		 			System.out.println(ChildTitle);
	    		 			
	    		 			if(ChildTitle.equalsIgnoreCase("Calendar"))
	    		 			{
	    		 				driver.findElement(By.xpath("//*[@name='time']")).clear();
	    		 				Thread.sleep(3000);
	    		 			    driver.findElement(By.xpath("//*[@name='time']")).sendKeys("2022");
	    		 			    Thread.sleep(3000);
	    		 			  
	    		 			  driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
	    		 			}
	    		 			
	    		 			String month="March 2022";
	    		 			String date="1";
	    		 			while(true)
	    		 			{
	    		 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
	    		 				if(text.equals(month))
	    		 				{
	    		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[7]/a")).click();
	    		 					break;
	    		 				}
	    		 				else
	    		 				{
	    		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
	    		 				}	
	    		 				
	    		 			}
	    		 			driver.switchTo().window(parent);
	    	
	    	
	    		 		}
	    	 }
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath(todate_calendar)).click();
	    	 Thread.sleep(2000);
	    	 String parent1=driver.getWindowHandle();
	     	Set<String>s1=driver.getWindowHandles();

	      // Now iterate using Iterator
	     	 Iterator<String> I2= s1.iterator();
	     	
	     	 while(I2.hasNext())
	     	 {
	     		 String child_window1=I2.next();
	     		 	if(!parent1.equals(child_window1))
	     		 		{
	     		 			driver.switchTo().window(child_window1);
	     	
	     		 			System.out.println(driver.switchTo().window(child_window1).getTitle());
	     		 			String ChildTitle1 = driver.getTitle();
	     		 			System.out.println(ChildTitle1);
	     		 			
	     		 			if(ChildTitle1.equalsIgnoreCase("Calendar"))
	     		 			{
	     		 				driver.findElement(By.xpath("//*[@name='time']")).clear();
	     		 				Thread.sleep(3000);
	     		 			    driver.findElement(By.xpath("//*[@name='time']")).sendKeys("2022");
	     		 			    Thread.sleep(3000);
	     		 			  
	     		 			  driver.findElement(By.xpath("//*[@class='clsOTable']/tbody/tr/td/table/tbody/tr[8]/td/input")).click();
	     		 			}
	     		 			
	     		 			String month="November 2022";
	     		 			String date="11";
	     		 			
	     		 			while(true)
	     		 			{
	     		 				String text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font")).getText();
	     		 				if(text.equals(month))
	     		 				{
	     		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[5]/a/font")).click();
	     		 					break;
	     		 				}
	     		 				else
	     		 				{
	     		 					driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img")).click();
	     		 				}	
	     		 				
	     		 			}
	     		 			driver.switchTo().window(parent1);
	     		 			Thread.sleep(2000);
	     		 			driver.findElement(By.name(find_button)).click();
	     		 			Thread.sleep(2000);
	     		 		}
	     	 }


		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}
