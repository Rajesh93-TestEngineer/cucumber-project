package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.BaseClass;

public class DeleteEmpPage extends BaseClass {
static By txt_Searchby   =By.name("loc_code");
static By txt_Searchfor  =By.name("loc_name");
static By btn_search     =By.xpath("//input[@value='Search']");
static By checkbox       = By.name("chkLocID[]");
static By btn_delete     =By.xpath("//input[@value='Delete']");
public static void deltemppage(String idi) {
	Select st=new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp. ID");	
driver.findElement(txt_Searchfor).sendKeys("10008");
driver.findElement(btn_search).click();
driver.findElement(checkbox).click();
driver.findElement(btn_delete).click();
}
}
