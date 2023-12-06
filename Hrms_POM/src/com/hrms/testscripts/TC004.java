package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.DeleteEmpPage;
import com.hrms.pages.EditEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC004 {
	@Test
	public static void tc004() 
	{
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		LoginPage.login("nareshit","nareshit");
		VerifyPage.verifyTitle("Orange HRM");
		AddEmpPage.enterframe();
		//EditEmpPage.Edtemply("selenium","Auto");
		DeleteEmpPage.deltemppage("10008");
		AddEmpPage.exitframe();
		LogoutPage.logout();
		BaseClass.closeApplication();
		}	
	}

