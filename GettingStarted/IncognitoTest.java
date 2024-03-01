package p1;

//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class IncognitoTest 
{
	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		
		//Actions act = new Actions(driver);
		
		//act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("n");
		
		//driver.navigate().to("https://google.com");
	}
}