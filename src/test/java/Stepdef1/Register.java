package Stepdef1;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register 
{
   WebDriver driver;
   
@Given("User navigates to Registration account page")
public void user_navigates_to_registration_account_page()
{
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
     
}

@When("User enters below details into the fields")
public void user_enters_below_details_into_the_fields(DataTable dataTable) throws InterruptedException 
{
    Map<String,String> map = dataTable.asMap(String.class,String.class);	   
	
	
    
    driver.findElement(By.name("firstname")).sendKeys(map.get("firstname"));
    Thread.sleep(5000);
    driver.findElement(By.name("lastname")).sendKeys(map.get("lastname"));
    Thread.sleep(5000);
    driver.findElement(By.name("email")).sendKeys(map.get("emailaddress"));
    Thread.sleep(5000);
    driver.findElement(By.name("telephone")).sendKeys(map.get("telephone"));
    Thread.sleep(5000);
    driver.findElement(By.name("password")).sendKeys(map.get("password"));
    Thread.sleep(5000);
    driver.findElement(By.name("confirm")).sendKeys(map.get("confirmpassword"));
    
    }

@When("select the privacy policy field")
public void select_the_privacy_policy_field() 
{
   driver.findElement(By.xpath("//input[@type='checkbox' and  @value='1']")).click();
}

@When("click on continue button")
public void click_on_continue_button() 
{
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("Account should get successfully created")
public void account_should_get_successfully_created() 
{
    System.out.println("Account is created");
}

}
