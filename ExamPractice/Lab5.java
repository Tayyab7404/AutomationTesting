import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab5
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement input = driver.findElement(By.id("name"));
		input.sendKeys("Main frame");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frm1");
		
		WebElement course = driver.findElement(By.id("course"));
		Select courseName = new Select(course);
		courseName.selectByIndex(1);
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		input.clear();
		input.sendKeys("Returned to main frame");
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}