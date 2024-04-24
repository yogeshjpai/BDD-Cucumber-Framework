package POMPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginLocators 
{
	public WebDriver driver;
	public AmazonLoginLocators(WebDriver d)
	{
		driver=d;
	}
	
	By signinLink= By.xpath("//*[@id='nav-link-accountList']/span[1]");
	By emailTxt= By.xpath("//*[@id='ap_email']");
	By contiBtn= By.xpath("//*[@id='continue']");
	By pwdTxt= By.xpath("//*[@id='ap_password']");
	By signinBtn= By.xpath("//*[@id='signInSubmit']");
	
	public void ClickSignInLink()
	{
		driver.findElement(signinLink);
	}
	public void EnterEmail()
	{
		driver.findElement(emailTxt);
	}
	public void ClickContinue()
	{
		driver.findElement(contiBtn);
	}
	public void EnterPwd()
	{
		driver.findElement(pwdTxt);
	}
	public void ClickSigninBtn()
	{
		driver.findElement(contiBtn);
	}

}
