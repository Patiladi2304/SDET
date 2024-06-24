package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitHelper {
	
public 	WebDriver driver;
	public waitHelper(WebDriver driver) {
		this.driver=driver;
	}
	
//	public void eElement(WebElement element,Duration i) {
//		WebDriverWait wait=new  WebDriverWait (driver,i);
//		wait.until(ExpectedConditions.visibilityOf(element));
//		
//	}

	

}
