package TestingInner.TestingOuter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactoryclass {
	
	WebDriver driver;
	
	public pagefactoryclass(WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
		
	}

	
	
	
	@FindBy(id="")
	WebElement username;
	
	
	
	


	public WebElement emailid() {
		return username;
	}

}
