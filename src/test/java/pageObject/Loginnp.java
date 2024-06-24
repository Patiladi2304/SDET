package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginnp {
	public WebDriver ldriver ;
	
	public Loginnp(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	@FindBy(xpath = "//input[@type='email']")
	WebElement  emailid;
	

	@FindBy(xpath = "//input[@class='password']")
	WebElement  password;
	

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement  login;
	

	@FindBy(linkText = "Logout")
	WebElement  logout;
	
	
	public void enterEmail(String email) {
		emailid.clear();
		emailid.sendKeys(email);
	}
	public void enterpwd(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	public void ClickOnLogin() {
		login.click();
	}
	public void clickOnLogout() {
		logout.click();
	}


}
