package Record;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Lab7
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        
		Actions builder = new Actions(driver);
		Action action = builder.moveToElement(username) // mouse move over to the username field
				   			   .click()
				   			   .keyDown(username, Keys.SHIFT)
				   			   .sendKeys(username,"chaduko ra")
				   			   .keyUp(username, Keys.SHIFT)
				   			   .moveToElement(password) // mouse move over to the password field
				   			   .click()
				   			   .keyDown(password, Keys.SHIFT)
				   			   .sendKeys(password,"chaduko ra")
				   			   .keyUp(Keys.SHIFT)
				   			   .doubleClick(username)
				   			   .contextClick()
				   			   .build();
		
		action.perform();
		
		submit.click();
		
		driver.quit();
	}
}