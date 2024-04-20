package Record;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab10 
{

	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)

	public void testLogin(String username, String password) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tayyab7404.github.io/Login/");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}