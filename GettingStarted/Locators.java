package GettingStarted;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		// className:
		WebElement text_input = driver.findElement(By.className("form-control"));
		text_input.sendKeys("Hello");
		
		// cssSelector:
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("password");
		
		// name:
		WebElement text_area = driver.findElement(By.name("my-textarea"));
		text_area.sendKeys("This is a sample text.");
		
		WebElement read_only_text = driver.findElement(By.name("my-readonly"));
		System.out.println(read_only_text.getAttribute("value"));
		
		// id:
		WebElement radio_button2 = driver.findElement(By.id("my-radio-2"));
		radio_button2.click();
		
		// linkText:
		WebElement index = driver.findElement(By.linkText("Return to index"));
		index.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// partialLinkText:
		WebElement web_form = driver.findElement(By.partialLinkText("web-form"));
		web_form.click();
		
		// tagName
		WebElement submit_button = driver.findElement(By.tagName("button"));
		submit_button.click();
	}
}