package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() throws InterruptedException {
	    
		System.out.println("Step 1: User is on Login Page");		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		
		System.out.println("Step 2: User entered Credentials successfully");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
			
		Thread.sleep(1000);
	}

	
	  @When("click on Login button")
	  
	  public void click_on_login_button() {
	  
	  System.out.println("Step 3: Clicked on Login button successfully");
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	    
		System.out.println("Step 4: User successfully Logged in the Application");
	}

}
