package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AttendancePortal
{

	public static void main(String[] args)
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("http://172.16.20.20/sis/studindex.php");
		
		WebElement regdno = driver.findElement(By.id("signup"));
		WebElement phonenumber = driver.findElement(By.id("pwd"));
		
		regdno.sendKeys(""); // Use your redg.no
		phonenumber.sendKeys(""); // Use your phone number
		
		driver.findElement(By.name("submit")).click();
	}

}
