package Record;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab4
{
	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");

        System.out.println("Title: " + driver.getTitle());

        WebElement dropdownList1 = driver.findElement(By.name("country"));

        Select dropdown1 = new Select(dropdownList1);
        dropdown1.selectByVisibleText("India"); // selects the value in the dropdown menu
        System.out.println("Selected option in dropdown1: " + dropdown1.getFirstSelectedOption().getText());
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
        
        WebElement dropdownList2 = driver.findElement(By.name("country"));
        
        Select dropdown2 = new Select(dropdownList2);
        dropdown2.selectByVisibleText("ANTARCTICA");
        Thread.sleep(5000);
        dropdown2.selectByIndex(12); // selects the value in the dropdown menu using the index
        System.out.println("Selected option in dropdown2: " + dropdown2.getFirstSelectedOption().getText());
        
        driver.quit();
	}
}