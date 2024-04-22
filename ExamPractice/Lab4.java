import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab4
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement dropdownList = driver.findElement(By.name("my-select"));
		
		Select dropdown1 = new Select(dropdownList);
		
		dropdown1.selectByIndex(1);
		System.out.println("Selected option: " + dropdown1.getFirstSelectedOption().getText());
		
		dropdown1.selectByVisibleText("Two");
		System.out.println("Selected option: " + dropdown1.getFirstSelectedOption().getText());
		
		dropdown1.selectByValue("3");
		System.out.println("Selected option: " + dropdown1.getFirstSelectedOption().getText());
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}