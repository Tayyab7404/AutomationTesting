package Record;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximizes the window
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.facebook.com"); // navigating to a new website
		
		driver.navigate().back(); // navigating back to the previous website
		
		driver.navigate().forward(); // navigating forward to a website
		
		driver.navigate().refresh(); // refreshing the website
		
		System.out.println("Title: " + driver.getTitle());

		System.out.println("Current URl: " + driver.getCurrentUrl());
		
		driver.quit();
	}
}