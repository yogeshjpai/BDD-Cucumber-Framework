package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import POMPage.AmazonLoginLocators;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import testRunner.AmazonLogin;

public class Steps
{
	public WebDriver driver;
	public AmazonLoginLocators al;
	
	@Given("user launch Firefox browser")
	public void user_launch_Firefox_browser() 
	{
	   WebDriverManager.firefoxdriver().browserVersion("124").setup();
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   
	   al= new AmazonLoginLocators(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) throws Exception 
	{
	   driver.get(url);
	   Thread.sleep(6000);
	}

	@When("user click on Signin button")
	public void user_click_on_Signin_button() 
	{
	    al.ClickSignInLink();
	}

	@When("user enter email as {string}")
	public void user_enter_email_as(String email) 
	{
	    al.EnterEmail();
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() 
	{
	    al.ClickContinue();
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) 
	{
	    al.EnterPwd();
	}

	@When("user click on Login button")
	public void user_click_on_Login_button() 
	{
	    al.ClickSigninBtn();
	}

	@Then("page url should be {string}")
	public void page_url_should_be(String expUrl)
	{
	    String actUrl= driver.getCurrentUrl();
	    Assert.assertEquals(expUrl,  actUrl);
	}

}
