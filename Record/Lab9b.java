package Record;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab9b
{
	WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Test Case Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Test Case Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Test Case Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Test Case Before Method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Tayyab Executing Test Case 1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Test Case After Method");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Tayyab Executing Test Case 2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Test Case After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Test Case After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Test Case After Suite");
	}
}
