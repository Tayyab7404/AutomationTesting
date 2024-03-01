package p1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window:
		driver.manage().window().maximize();
		
		// Open URL:
		driver.get("https://github.com/Tayyab7404/AutomationTesting/blob/main/GettingStarted/FirstScript.java");
		
		// Wait for 2 seconds:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// Copy code in the text area:
		WebElement code_text = driver.findElement(By.id("read-only-cursor-text-area"));
		String code = code_text.getText();
		
		// Navigate to Toptal.com:
		driver.navigate().to("https://www.toptal.com/developers/paste-gd/");
		
		// Make the window to full screen:
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement title_area = driver.findElement(By.id("title"));
		WebElement text_area = driver.findElement(By.id("text"));
		
		title_area.sendKeys("First Script");
		text_area.sendKeys(code);
		
		Dimension d = new Dimension(500, 500);
		
		driver.manage().window().setSize(d);
	}
}