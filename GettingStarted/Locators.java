package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Locators 
{

	public static void main(String[] args) 
	{
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("file:///Z:/3rd%20Year%202nd%20Sem/Selenium/NewSelenium/src/p1/ContactSelenium.html");
		
	    WebElement Name = driver.findElement(By.className("information"));
	    
	    System.out.println(Name.getText());
	}
}