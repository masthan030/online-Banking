package com.oib.lib;

import org.openqa.selenium.WebDriver;

public class ObjectRepository {
	//test data and objects
	   
    public WebDriver driver;
   
                   //Test data
   
    public String url="http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp";
    public String userid="nareshit";
    public String password="nareshit";
    
    public String BranchAddress="Ammerpet Hyderabad 530024";
    public String Branchemailid="masthan@gmail.com";
    public String phone1="8106296323";
    public String phone2="7306533221";
    public String phone3="998511051";
    public String Acctypename="masthan";
    public String AccountAbb="ID";
    public String minopenblan="5000";
    public String maxopenblan="60000";
    public String inteapplicable="2%";
    public String descr="Job purpose";
    public String minblamain="9000";
    public String servname="Bank" ;
    public String servdesc="Fund Transfer";
    public String servactivestate="Active";
    public String emp_initialbalance="2000";
    public String emp_firstname="Shaik";
    public String emp_lastname="Masthan";
    public String emp_bdate="01-10-1995";
    public String emp_houseno="18-8-204";
    public String emp_street="Yellareddy guda";
    public String emp_pincode="500073";
    public String emp_contactno="8919195484";
    public String emp_email="masthanshaik0307@gmail.com";
    public String emp_loginname="Shaik Masthan";
    public String emp_password="mrd@0307";
    public String emp_secretans="NTR";
    public String customerdetails_accno="108";
   
   
            //Employee module data
    public String emp_userid="kavya";
    public String emp_pass="kavya0333";
        //Emp: Customer Reg
    public String emp_custreg_initialbalance="2000";
    public String emp_custreg_firstname="kavya";
    public String emp_custreg_lastname="kandukuri";
    public String emp_custreg_houseno="2-234";
    public String emp_cust_street="sr nagar";
    public String emp_custreg_pincode="500033";
    public String emp_custreg_contactno="8934876509";
    public String emp_custreg_email="masthan03@gmail.com";
    public String emp_custreg_loginname="kavya143";
    public String emp_custreg_password="kavya143";
    public String emp_custreg_secretanswer="aa";
    
   
    
    
         //Login and Logout Object identification
    public String txt_userid="username";
    public String txt_password="password";
    public String btn_signin="Submit";
    public String btn_clear="Input2";
    public String link_logout="Logout";
    
    
    
                    //Object Identification
   
    //Branches in Register Branches sub menu object identifications
    public String Branch="link7";                                                                      //name
    public String Reg_Bran="//*[@id=\"menuItemHilite0\"]";                                             //xpath
    public String Bra_Add="branchAddr";                                                                //name
    public String Bra_Emailid="branchEmailId";                                                         //name
    public String Bra_phone1="branchPhNo1";                                                            //name
    public String Bra_phone2="branchPhNo2";                                                            //name
    public String Bra_phone3="branchPhNo3";                                                            //name
    public String btn_Register="Register";                                                             //name
   
   
   
    // Data Object Identification For Branches in view Branches                    
                                     
    public String view_Branches="menuItemHilite1";                                                                              //id
    public String chk_box="/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3/form/table/tbody/tr[19]/td[1]/input";     //xpath
    public String btn_delate="Delete";                                                                                          //name
   
   
   
    
   
  //Object Identification For Branches in Account Types
    public String Acc_Type="menuItemHilite2";                                                                                 //name
    public String Acc_typename="typeName";                                                                                    //name
    public String Acc_Abb="abbr";                                                                                             //name
    public String min_openBal="minOpenBal";                                                                              //name  
    public String max_openBal="maxOpenBal";                                                                                   //name
    public String interset_App="intrestApplicable";                                                                           //name
    public String Desc="description";                                                                                         //name
    public String Min_Bla_tobemaita="minBalToBeMaintain";                                                                     //name
    public String checkbookfacil="checkbookFacilityBit";                                                                      //name
    public String Blance_type_bit="balanceTypeBit";                                                                             //name
    public String btn_register="Register";                                                                                     //name
   
   
    // Object identification for Branches in view Account Type
    public String view_acc_types ="menuItemHilite3";                                                                               //id
    public String chk_box_viewacctype="TypeId";                                                                                 //name
    public String btn_delete="Delete";                                                                                          //name
   
    // Object Identifications for Branches in Branch Accounts
    public String Branch_Accounts="menuItemHilite4";                                                                          //id
    public String Branch_Addr="branchId";                                                                                      //name
    public String btn_Reg="Submit";                                                                                           //name
   
    //Data Object Identifications for Branches in View Branch Account Types
    public String view_Bran_Acc_Types="menuItemHilite5";                                                               //id
    public String Bran_Add="branchId";                                                                                 //name
    public String btn_Search="send";                                                                                   //name
   
    //ObjectIdentification for Services Main Menu- Register Services
    public String services="link6";                                                      //name
    public String Regi_Services="menuItemHilite6";                                       //id
    public String serv_name="serviceName";                                               //name
    public String serv_descr="serviceDesc";                                              //name
    public String serv_acti_state="serviceActivestate";                                  //name
    public String btn_reg="Register";                                                   //name
   
   
    // Data Object Identification for Service in View Services
    public String view_Serv="menuItemHilite7";                                            //id
    public String check_box="TypeId";                                                     //name
    public String btn_delete1="Delete";
    public String viewCustomer_transaction="menuItemHilite14";                            //id
      //object identification for Branch Services
    public String branch_services_mouse="menuItemHilite8";
    public String ddown_brach_id="branchId";
    public String ddown_servicename="serviceid";
    public String btn_branchServices="Submit";
    //object identification for View Services
    public String view_services_mouse="menuItemHilite9";
    public String ddown_view_branchservice="branchId";
    public String btn_view_Branchservices="send";
    
    //object identification for Employee menu
    
    public String employee_mouse="link5";                 //id
    public String emp_reg="menuItem10";                   //id
    public String ddown_branchname="branchaddress";
    public String txt_initialBalance="accountInitialBalance";
    public String txt_firstname="firstname";
    public String txt_lastname="lastname";
    public String birthdateCalender_Click="//*[@name='register']/fieldset/table/tbody/tr[5]/td[2]/a";
    public String calender_txt="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/font/input";
    public String calender_get="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/input";
    public String calender_next="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img";
    public String date_click="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[6]/a/font";
    public String txt_houseno="hno";                       //name
    public String txt_street="street";                     //name
    public String ddown_city="city";                       //name
    public String ddown_state="state";                     //name
    public String ddown_country="country";                 //name
    public String txt_pincode="pincode";                   //name
    public String txt_contactno="phoneNo";                 //name
    public String txt_email="email";                       //name
    public String txt_loginname="loginID";                 //name
    public String txt_password1="password";                 //name
    public String ddown_secretquestion="secretqid";         //name
    public String txt_secretanswer="secretqans";
    public String btn_empreg="Input";
    public String view_Employee="menuItemHilite11";
    
    //Object identification for Profile menu
    public String profile_mouse="link4";                        //id
    public String view_profile="menuItemHilite12";              //id
    
     //Object identification for Reports Menu
    public String reports_mouse="link8";                        //id
    public String view_customers="menuItemHilite13";            //id
    public String txt_accno="accountno";                        //name
    public String btn_find="send";                              //name
    
       //Object identification for View Customer Transactions
    public String viewCustomerTrans_mouse="menuItemHilite14";               //id
    public String from_Date_click="//tbody/tr[1]/td[2]/a[1]/img[1]"; 
    public String to_date_click="//tbody/tr[2]/td[2]/a[1]/img[1]";        //id
    public String btn_customerdetails="send";
    
      //object identification for View Customer Locked Account
    public String viewCustomer_mouse="menuItemHilite15";                     //id
          //Object identification for Fund Transfer
    public String fundtransfer_mouse="menuItemHilite16";
    public String fromdate_click="//tbody/tr[1]/td[2]/a[1]/img[1]";           
    public String todate_click="//tbody/tr[2]/td[2]/a[1]/img[1]";              
   
           //Emp: Customer Reg
    public String customers_mouse="link1";               //id
    public String reg_customer="menuItemHilite0";
    public String ddown_branchName="branchaddress";      //name
    public String initialBalance="accountInitialBalance";
    public String txt_first_name="firstname";
    public String txt_last_name="lastname";
    public String bdate_cal_click="/html/body/table/tbody/tr/td/table[3]/tbody/tr[2]/td/div/form/fieldset/table/tbody/tr[5]/td[2]/a/img";
    public String dob="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[5]/a/font";
    public String house_no="hno";
    public String street="street";
    public String ddown_city_emp="city";
    public String ddown_state1="state";
    public String ddown_country1="country";
    public String pincode="pincode";
    public String contactno="phoneNo";
    public String email="email";
    public String loginname="loginID";
    public String txt_password_emp="password";
    public String select_question="secretqid";
    public String secret_answer="secretqans";
    public String reg="Input";
    
    
         //Admin: Profile
    public String profile_mouseover="link4";
    public String view_profile1="menuItemHilite12";
    
      //Admin: Reports -> View Customer Transaction
    public String reports1_mouseover="link8";
    public String viewcustomer_transaction="menuItemHilite14";
    public String fromdate_calendar="//tbody/tr[1]/td[2]/a[1]/img[1]";
    public String todate_calendar="/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/form/table/tbody/tr[2]/td[2]/a/img";
    public String find_button="send";
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
