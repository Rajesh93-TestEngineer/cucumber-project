package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerDetails {
	
	WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(options);
	   driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@When("Enter valid username and  valid password")
	public void Enter_valid_username_and_valid_password() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	   	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  	}

	@Then("user go to Homepage")
	public void user_go_to_Homepage() {
		String actual=driver.findElement(By.xpath("//div[@class='content-header']")).getText();
		  Assert.assertEquals("not matched", "Dashboard",actual);
	    	}
	@When("clik on customers option")
	public void clik_on_customers_option() {
		driver.findElement(By.xpath("//i[@class='nav-icon far fa-user']")).click();
	}
	@Given("click on customer")
	public void click_on_customer() {
		driver.findElement(By.xpath("(//i[@class='nav-icon far fa-dot-circle'])[13]")).click();

	}

	@Given("click on Add New button")
	public void click_on_add_new_button() {
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
   
	}

	@When("Enter valid Email and Valid Password")
	public void enter_valid_email_and_valid_password() {
		driver.findElement(By.id("Email")).sendKeys("hit456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hits1243");

	}

	@When("Enter valid FirstName and Vaild Lastname")
	public void enter_valid_first_name_and_vaild_lastname() {
		driver.findElement(By.id("Email")).sendKeys("hit");
		driver.findElement(By.id("Password")).sendKeys("man");
	}

	@When("click on Male Radio butn")
	public void click_on_male_radio_butn() {
	   driver.findElement(By.id("Gender_Male")).click();
	}

	@When("click on particular date")
	public void click_on_particular_date() {
		   //driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
		   driver.findElement(By.id("DateOfBirth")).sendKeys("11/22/2000");
           //Select st=new Select(driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]")));
           Select st=new Select(driver.findElement(By.id("SelectedCustomerRoleIds")));
		   st.selectByVisibleText("Registered");
	}

	@Then("click on save butn")
	public void click_on_save_butn() {
	  driver.findElement(By.name("save")).click();
	}

//	@Then("new customer add successfully")
//	public void new_customer_add_successfully() {
//	  String actual=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();
//	  String expect="The new customer has been added successfully.";
//	  Assert.assertEquals("data mismatched",expect,actual) ;
//	}
}
