package stepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.openqa.selenium.WebDriver;

import pageObject.Loginnp;
import pageObject.addCustomer;
import pageObject.searchCustomer;

public class BaseClass {
	public WebDriver driver;
	public	Loginnp  np;
	public addCustomer  ac;
	searchCustomer sc;
	
	//do tracing : creating for random generating email 
	public static String randomString() {
		String generatestring = RandomStringUtils.randomAlphabetic(5);
		return generatestring;
		
	}
}
