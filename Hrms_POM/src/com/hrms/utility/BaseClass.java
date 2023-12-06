package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
//driver
  public static WebDriver driver;
//openApplication
public static void openApplication() {
System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Reporter.log("Application opened");
}
//closeApplication
public static void closeApplication() {
driver.close();
Reporter.log("Application closed" );
}
}