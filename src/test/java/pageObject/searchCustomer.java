package pageObject;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.waitHelper;

public class searchCustomer {
	public WebDriver ldriver;

	waitHelper ww;

	public searchCustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		ww = new waitHelper(ldriver);

	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement searchemail;

	@FindBy(id = "SearchFirstName")
	WebElement fname;

	@FindBy(id = "SearchLastName")
	WebElement lname;

	@FindBy(id = "search-customers")
	WebElement searchbtn;

	@FindBy(xpath = "//table[@id='customers-grid']")
	WebElement table;

	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr")
	List<WebElement> trows;

	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr")
	List<WebElement> tcolumns;
//	//for dob
//	@FindBy(id = "SearchMonthOfBirth")
//	WebElement month;
//	
//	@FindBy(id = "SearchDayOfBirth")
//	WebElement date;
//	
//	//Registration date from
//@FindBy(id = "SearchRegistrationDateFrom")
//WebElement  rdatefrom;
//
//@FindBy(id ="SearchCompany")
//WebElement company;
//
//@FindBy(id = "SelectedCustomerRoleIds")
//WebElement crole;

//methods 
	public void searchEmail(String email) throws InterruptedException {
		Thread.sleep(3000);
		searchemail.clear();
		searchemail.sendKeys(email);

	}

	public void searchFname(String firstname) {

		fname.sendKeys(firstname);

	}

	public void searchLname(String lastname) {

		lname.sendKeys(lastname);
	}

	public void clickOnSearchButton() throws InterruptedException {

		searchbtn.click();

	}

	public int noOfrows() {
		return (trows.size());

	}

	public int noOfColumns() {
		return (tcolumns.size());

	}

	public boolean searchCustomerByemail(String email) {
		boolean flag = false;
		for (int i = 0; i < noOfrows(); i++) {

			String emailId = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr/td[2]")).getText();
			if (emailId.equals(email)) {
				flag = true;
			}
		}
		return flag;
	}

//name logic

	public boolean searchCustomerByName(String name) {
		boolean flag = false;

		for (int i = 0; i < noOfrows(); i++) {
			System.out.println("Number of Rows:" + noOfrows());

			String getname = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr/td[3]")).getText();
			String names[] = getname.split(" ");  //split is use seprate string 
			System.out.println(names.toString());

//			System.out.println(names.toString());
//			System.out.println(Arrays.toString(names));
			System.out.println(names.toString());
			if (names[0].equals("Virat") && names[1].equals("Kohli"))
				flag = true;

		}

		return flag;
	}

//public void selectBirthMonth() {
//	Select s=new Select(month);
//	s.selectByIndex(4);
//	
//}
//public void name() {
//	Select s1=new Select(date);
//	s1.selectByIndex(22);
//	
//}
//
//public void searchRdate(String ddmmyy) {
//	rdatefrom.sendKeys(ddmmyy);
//	
//}
//public void searchCname(String name) {
//	company.sendKeys(name);
//	
//}
//public void selectRole() {
//	Select s2=new Select(crole);
//	s2.selectByIndex(3);
//}
}
