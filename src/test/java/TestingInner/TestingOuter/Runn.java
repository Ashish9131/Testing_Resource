package TestingInner.TestingOuter;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.base;

public class Runn extends base {
  
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test

	public void pagetrigger() throws IOException {
		driver = driverinitialization();
		

		driver.get("https://www.flipkart.com/");
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))).click();
		 
		WebElement mor = driver.findElement(By.linkText("Login"));
		Actions a = new Actions(driver);
		a.moveToElement(mor);
	
		//driver.navigate().refresh();
		log.info("we have reached testimonials");
		log.debug("this is great");
		log.error("This is great to have some errors");

		
		
	}
	
	pagefactoryclass c = new pagefactoryclass(driver);
	

	@BeforeMethod

	public void hold1()

	{
		System.out.println("this is hold 1");
	}

	
	public void hold2()

	{
		System.out.println("this is hold 2");
	}

}
