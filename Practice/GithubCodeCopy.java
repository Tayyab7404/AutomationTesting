package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		// Open URL:
		driver.get("https://github.com/Tayyab7404/AutomationTesting/blob/main/GettingStarted/FirstScript.java");
		
		// Wait for 2 seconds:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// Copy code in the text area:
		WebElement code_text = driver.findElement(By.id("read-only-cursor-text-area"));
		String code = code_text.getText();
		
		// Navigate to Toptal.com:
		driver.navigate().to("https://www.toptal.com/developers/paste-gd/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement title_area = driver.findElement(By.id("title"));
		WebElement text_area = driver.findElement(By.id("text"));

    		// Paste code into the text area:
		title_area.sendKeys("First Script");
		text_area.sendKeys(code);
	}
}
