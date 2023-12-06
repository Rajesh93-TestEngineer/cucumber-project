package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class ProductSearch {
	WebDriver driver;
	@Given("open the url of NopCom application")
	public void open_the_url_of_nop_com_application() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		  driver.get("https://admin-demo.nopcommerce.com/login");
	    	}
	@When("user enter valid username")
	public void user_enter_valid_username() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com"); 
	}

	@When("user enter valid password")
	public void user_enter_valid_password(){
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin"); 
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   	}

	@Then("user navigate to Homepage")
	public void user_navigate_to_homepage() {
		String actual=driver.findElement(By.xpath("//div[@class='content-header']")).getText();
		  Assert.assertEquals("not matched", "Dashboard",actual);
	    	} 
	

	@When("clik on customers link and click on product link")
	public void clik_on_customers_link_and_click_on_product_link() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-book']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='nav-icon far fa-dot-circle']")).click();

	 	}

	@Then("it navigate to product page")
	public void it_navigate_to_product_page() {
		String actual=driver.findElement(By.xpath("//h1[@class='float-left']")).getText();
		Assert.assertEquals("not matched","Products",actual);
	   	}

	@When("^enter product name as(.*)$")
	public void enter_product_name_as(String productname) {
		driver.findElement(By.id("SearchProductName")).sendKeys(productname);
	   	}

	@When("click on serach button")
	public void click_on_serach_button() throws Exception {
		driver.findElement(By.id("search-products")).click();
		Thread.sleep(3000);
	   	}

	@Then("particular record should be displayed")
	public void particular_record_should_be_displayed() {
	    System.out.println("products are displayed");
	}
}
