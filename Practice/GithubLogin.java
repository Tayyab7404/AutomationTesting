package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLogin
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		System.out.println(driver.getTitle());
		
		WebElement username = driver.findElement(By.id("login_field"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submitbutton = driver.findElement(By.name("commit"));
		
		username.sendKeys(""); // Use your username
		password.sendKeys(""); // Use your password
		submitbutton.click();
		
		System.out.println(driver.getTitle());
		
		// driver.quit()
	}
}
