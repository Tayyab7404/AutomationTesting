import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Lab7
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tayyab7404.github.io/Login");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.id("submit"));
		
		Actions builder = new Actions(driver);
		
		Action action = builder.moveToElement(username)
							   .click()
							   .keyDown(username, Keys.SHIFT)
							   .sendKeys(username, "tayyab")
							   .keyUp(username, Keys.SHIFT)
							   .moveToElement(password)
							   .keyDown(password, Keys.SHIFT)
							   .sendKeys(password, "password")
							   .doubleClick(username)
				   			   .contextClick()
				   			   .build();
		
		action.perform();
		
		submit.click();
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}