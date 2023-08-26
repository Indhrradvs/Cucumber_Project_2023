package com.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
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

// Way-1 to pass parameters
	/*
	 * @When("user enters username and password") public void
	 * user_enters_username_and_password() throws InterruptedException {
	 * 
	 * System.out.println("Step 2: User entered Credentials successfully");
	 * 
	 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 * 
	 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	 * 
	 * Thread.sleep(1000); }
	 */

//Way-2 Parameterization- Passing value through Feature file and making changes in Step Definition file
	
	/* 
	 
	 @When("^user enters \"(.*)\" and \"(.*)\"$") //Entering Regular expression with Example Keyword
	
	public void user_enters_username_and_password(String uname, String pswd) throws InterruptedException {
		
		System.out.println("Step 2: User entered Credentials successfully");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pswd);
			
		Thread.sleep(1000);
		
	} */
	
//Way-3 Data Driver Testing in cucumber using scenario Outline - Passing values through Feature file
			
  @When("^user enters(.*)and(.*)$") //Entering Regular expression without Example Keyword
	
	public void user_enters_username_and_password(String uname, String pswd) throws InterruptedException {
		
		System.out.println("Step 2: User entered Credentials successfully");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pswd);
			
		Thread.sleep(1000);
	}

      @When("user enters credentails using DataTable")
  
      public void user_enters_credentails_using_data_table(DataTable dataTable) throws InterruptedException {
	  
	    System.out.println("Step 2: User entered Credentials successfully");
	    
	    List<List<String>> data = dataTable.cells(); //Creating Data and calling Cells method to get the data from data table
		 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
			
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
