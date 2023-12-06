package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class AllLoginCrenditails {
	
	WebDriver driver;
	@Given("open the url of login functionality")
	public void open_the_url_of_login_functionality() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(options);
	   driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@When("Enter username and password")
	public void Enter_username_and_password() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	   	}

	@When("click on Login button")
	public void click_on_Login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	  	}

	@Then("user Navigate to Home page")
	public void user_Navigate_to_Home_page() {
		String actual=driver.findElement(By.xpath("//div[@class='content-header']")).getText();
		  Assert.assertEquals("not matched", "Dashboard",actual);
	    	}
	
	//INValid Credentails
	

	@When("User Enter InValidUserName and Enter InValidPassword")
	public void User_Enter_InValidUserName_and_Enter_InValidPassword() {
		driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys("admin12@yourstore.com");
	driver.findElement(By.id("Password")).clear();
	driver.findElement(By.id("Password")).sendKeys("admin345");
	   	}
   	
    @When("Click on Login btn")
     public void click_on_login_btn() {
	driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
	   	}

	@Then("Its throws Error invalid Username and Invalid Password")
    public void Its_throws_Error_invalid_Username_and_Invalid_Password() throws Exception {
   String actualerror=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
    String exceptederror="Login was unsuccessful Please correct the errors and try again. No customer account found";
		Assert.assertEquals( "data is mismatched",exceptederror,actualerror);
	}

}


