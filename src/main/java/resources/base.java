package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base   {

	public Properties prop;
	public WebDriver driver;

public WebDriver driverinitialization() throws IOException {
	
System.out.println("this is my test");
	prop = new Properties();
	FileInputStream fis = new FileInputStream("D:\\Backup\\C_Root\\Users\\Temp-User\\eclipse-workspace\\TestingOuter\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browsername = prop.getProperty("Browser");
	//("D:\Backup\C_Root\chromedriver_93\chromedriver.exe");
	
	System.out.println(browsername);
	
	if(browsername.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		//D://chromedriver.exe
	}
	
	else if (browsername.equals("firefox"))
	{
		 driver= new FirefoxDriver();
	}
	
	else if (browsername.equals("IE"))
	{
//		IE code
	}
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	return driver;
}
}
