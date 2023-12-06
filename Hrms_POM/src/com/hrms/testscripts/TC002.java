package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC002 {
	@Test
	public static void tc002()  throws Exception{
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		LoginPage.login("nareshit", "nareshit");
		VerifyPage.verifyTitle("Orange HRM");
		AddEmpPage.enterframe();
		AddEmpPage.addempy("rajesh", "selenium");
		AddEmpPage.exitframe();
		LogoutPage.logout();
		BaseClass.closeApplication();
		}
		}

