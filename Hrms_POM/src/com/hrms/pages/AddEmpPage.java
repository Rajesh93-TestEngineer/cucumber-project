package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class AddEmpPage extends BaseClass {
//objects
static By add_emp=By.xpath("//input[@value='Add']");
static By EFN=By.name("txtEmpFirstName");
static By ELN=By.name("txtEmpLastName");
static By btn_save=By.xpath("//input[@id='btnEdit']");
//Functions
public static void addempy(String frstname,String lastname) throws Exception{
driver.findElement(add_emp).click();
driver.findElement(EFN).sendKeys(frstname);
driver.findElement(ELN).sendKeys(lastname);
driver.findElement(btn_save).click();
Reporter.log("addemploye open"); 
Thread.sleep(3000);
}
//public static void add_btn() {
//driver.findElement(add_emp).click();
//Reporter.log(" click addemploye");
public static void enterframe() {
driver.switchTo().frame("rightMenu");
Reporter.log("enter into frame");
}
public static void exitframe() {
driver.switchTo().defaultContent();
Reporter.log("exit into frame");
}

}

