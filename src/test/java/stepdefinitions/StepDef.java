package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	//^ -- starts with
	//$ -- ends with
	 public WebDriver driver;
	    @Given("^Open Application$")
	    public void openApplication(){
	 
	       
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        System.out.println("Application opened");
	    }
	    @And("^Verify Title$")
	    public void verifyTitle()    {
	        System.out.println("Verifying the Title");
	    }
	    @When("^Login into application$")
	    public void login() throws InterruptedException {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			Thread.sleep(2000);

	    }
	   
	   
	  
	   
	    @When("^Logout from application$")
	    public void logout() {
			driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
			Actions ac=new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']"))).click();
	    System.out.println("Logout completed");
	    }
	   
	    @Then("^Close Application$")
	    public void closeApplication()    {
	       
	        System.out.println("Login page should be shown");
	    }
	    
	    @Before
	    public void open() {
	    	
				  
		        driver = new ChromeDriver();
				
			}
	    @After
		public void teardown() {
			 driver.quit();
		}
	    
	   
	}
