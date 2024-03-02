package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass 
{
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the window
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement text_input = driver.findElement(By.className("form-control"));
		text_input.sendKeys("Hello");
		
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("password");
		
		WebElement text_area = driver.findElement(By.name("my-textarea"));
		text_area.sendKeys("This is a sample text.");
		
		WebElement read_only_text = driver.findElement(By.name("my-readonly"));
		System.out.println(read_only_text.getAttribute("value"));
	}
}