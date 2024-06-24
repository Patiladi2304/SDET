package pageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addCustomer {
public WebDriver ldriver;
	  public addCustomer(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	  //locator
	  @FindBy(xpath = "//i[@class='nav-icon far fa-user']")
	  WebElement CustomersMenu ;
	  
	  @FindBy(xpath = "//p[.=' Customers']")
	  WebElement CustomersMenunav;
	  
	  @FindBy(xpath ="//a[@class='btn btn-primary']")
	  WebElement AddnewButton;
	  
	  @FindBy(xpath = "//input[@type='email']")
	  WebElement emailid;
	  
	  @FindBy(xpath = "//input[@type='password']")
	  WebElement password;
	  
	  @FindBy(id = "FirstName")
	  WebElement fname;
	  
	  @FindBy(id = "LastName")
	  WebElement lname;
	  
	  @FindBy(id= "Gender_Male")
	  WebElement gender;
	  
	  @FindBy(id = "DateOfBirth")
	  WebElement Dob;
	  
	  @FindBy(id = "Company")
	  WebElement cname;
	  
	  @FindBy(id = "SelectedNewsletterSubscriptionStoreIds")
	  WebElement newsletter;
	  
	  @FindBy (id = "SelectedCustomerRoleIds")
	  WebElement crole;
	  
	  @FindBy(xpath = "//*[@id=\"VendorId\"]")
	  WebElement vendor;
	  
	  @FindBy(xpath = "//textarea[@class='form-control']")
	  WebElement comm;
	  
	  @FindBy(xpath = "//button[@name='save']")
	  WebElement save;
	  //Method
	  public void clickOnCustomer() {
		 CustomersMenu.click();
	}
	  public void clickOnCustomerNav() {
		  CustomersMenunav.click();
		
	}
	  
	  public void clickOnAddButn() {
		AddnewButton.click();
	}
	  public void enterEmail() {
		  String email =RandomStringUtils.randomAlphabetic(9)+"@gmail.com";
		  emailid.sendKeys(email);
		
	}
	  public void enterPassword(String pass) {
		  password.sendKeys(pass);
		
	}
	  public void firstName() {
		  String firstname=RandomStringUtils.randomAlphabetic(5);
		  fname.sendKeys(firstname);
		
	}
	  public void lastName(String namel) {
		  String lastname=RandomStringUtils.randomAlphabetic(7);
		  lname.sendKeys(lastname);
		
	}
	  public void clickgender()
	  {	
		  gender.click();
	  }
	  public void dateOfBirth(String ddmmyy) {
		Dob.sendKeys(ddmmyy);
	}
	  
	  public void cName() {
		  String Comapnyname=RandomStringUtils.randomAlphabetic(10);
		cname.sendKeys(Comapnyname);
	}
	  
	  public void NLetter() {
		  Select s=new Select(newsletter);
		  s.selectByVisibleText("Your store name");
		 
		
	}
	  
	  public void customerRoles() {
		  Select s1=new Select(crole);
		  s1.selectByVisibleText("Administrators");
		//  s1.selectByVisibleText("Registered");
		
	}
	  public void selectVendor() {
		Select s2=new Select(vendor);
		s2.selectByIndex(2);
	}
	  public void addcomm() {
		  String comment=RandomStringUtils.randomAlphabetic(30);
		  comm.sendKeys(comment);
		
	}
	  public void clickOnSubmitButton() {
		save.click();
	}
}
