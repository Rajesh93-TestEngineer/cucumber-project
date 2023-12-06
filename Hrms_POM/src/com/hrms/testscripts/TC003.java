package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.EditEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC003 {
@Test
public static void tc003() 
{
	BaseClass.openApplication();
	VerifyPage.verifyTitle("HRMS");
	LoginPage.login("nareshit","nareshit");
	VerifyPage.verifyTitle("Orange HRM");
	AddEmpPage.enterframe();
	EditEmpPage.Edtemply("selenium","Auto");
	AddEmpPage.exitframe();
	LogoutPage.logout();
	BaseClass.closeApplication();
	}
}
	



