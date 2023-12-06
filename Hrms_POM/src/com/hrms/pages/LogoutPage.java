package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
//object
static By link_logout=By.linkText("Logout");
//Functions
public static void logout() {
driver.findElement(link_logout).click();
Reporter.log("logout completed");
}
}
