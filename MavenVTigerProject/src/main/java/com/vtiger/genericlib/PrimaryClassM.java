package com.vtiger.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.objectrepository.HomePageElementsM;
import com.vtiger.objectrepository.LoginPageElementsM;
import com.vtiger.genericlib.FeatchDataM;

public class PrimaryClassM {
	public static WebDriver driver;
	public FeatchDataM data = new FeatchDataM();
	@BeforeSuite
	public void ConficBS()
	{
	System.out.println("DB Connected");
	}
	@Parameters
	@BeforeClass
	public void ConfigBC() throws IOException
	{
	System.out.println("Browser Launching..");
	String browser = data.getDataFromProperty("browser");
	if(browser.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equals("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(data.getDataFromProperty("url"));
	System.out.println("Browser Closed..");
	}
	
	@BeforeMethod
	public void ConficBM() throws IOException
	{
	System.out.println("LogIn Starts..");
	LoginPageElementsM login = PageFactory.initElements(driver, LoginPageElementsM.class);
	login.LoginToApp(data.getDataFromProperty("username"), data.getDataFromProperty("password"));
	System.out.println("Login Ends..");
	}
	
	@AfterMethod
	public void ConficAM() throws IOException
	{
	System.out.println("Logout Starts..");
	HomePageElementsM hp = PageFactory.initElements(driver, HomePageElementsM.class);
	hp.LogOutFromApp();
	System.out.println("Logout Ends..");
	}
	
	@AfterClass
		public void configAC()
		{
			System.out.println("Browser Close");
			driver.quit();
		}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("DB Disconnect");
	}
}

