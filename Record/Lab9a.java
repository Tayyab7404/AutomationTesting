package Record;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab9a
{
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void Before()
	{
		System.out.println("Starting the Browers to Launch");
	}
	
	@Test
	public void testAssert()
	{
		driver.get("https://www.w3schools.com/");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | browserstack";
		
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
		System.out.println("The Actual Title is: " + ActualTitle);
	}
	
	@AfterMethod
	public void After()
	{
	    driver.quit();
		System.out.println("The Launch Completed");
	}
}
