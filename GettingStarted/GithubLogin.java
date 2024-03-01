package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;

public class GithubLogin 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.github.com/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		System.out.println("Title of the page is: " + driver.getTitle());

		WebElement username = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submitButton = driver.findElement(By.name("commit"));

		username.sendKeys("");
		password.sendKeys("");
		submitButton.click();
	}
}