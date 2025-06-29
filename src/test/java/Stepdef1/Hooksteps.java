package Stepdef1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Hooksteps 
{
	WebDriver driver;
	@Before
	public void browsersetup()
	{
		System.out.println("this is beforehook-launch the browser beforelogin");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}	
	@After
	public void closebrowser()
	{
		System.out.println("this is afterhook- close the browser");
		driver.quit();
	}
	@Given("user is on signin page")
	public void user_is_on_signin_page() 
	{
	    
	}

	@When("user enters valid UN and PWD")
	public void user_enters_valid_un_and_pwd() 
	{
	    
	}

	@When("user clicks on Signin button")
	public void user_clicks_on_signin_button() 
	{
	   
	}

	@Then("user navigated to the next page")
	public void user_navigated_to_the_next_page()
	
	{
	    
	}




}
