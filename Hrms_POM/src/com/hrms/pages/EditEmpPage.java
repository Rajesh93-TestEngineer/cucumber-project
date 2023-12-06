package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.utility.BaseClass;

public class EditEmpPage extends BaseClass{
	static By txt_EFN    =By.name("txtEmpFirstName");
	static By txt_ELN    =By.name("txtEmpLastName");
	static By Em_name    =By.xpath("//*[@id='standardView']/table/tbody/tr[14]/td[3]/a");
	static By Edit_EFN   =By.name("txtEmpFirstName");
	static By Edit_ELN   =By.name("txtEmpLastName");
	
    static By btn_Edit   =By.name("EditMain");
    //edit button
	static By btn_save   =By.xpath("//input[@name='EditMain']");
	//functions
	public static void Edtemply(String edfn,String edln) 
	{
	driver.findElement(Em_name).click();
	driver.findElement(txt_EFN).clear();
	driver.findElement(txt_ELN).clear();
	driver.findElement(Edit_EFN).sendKeys("edfn");
	driver.findElement(Edit_ELN).sendKeys("edln");
	driver.findElement(btn_Edit).click();
	driver.findElement(btn_save).click();
	}
}
