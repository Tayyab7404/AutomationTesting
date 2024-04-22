import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tayyab7404.github.io/Login");
		
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Page Source:\n" + driver.getPageSource());
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.id("submit"));
		
		username.sendKeys("tayyab");
		password.sendKeys("password");
		submit.click();
		
		String originalWindow = driver.getWindowHandle();
		
		System.out.println("Window handle: " + originalWindow);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("hhtps://www.youtube.com");
		
		driver.close();
		
		driver.switchTo().window(originalWindow);
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}