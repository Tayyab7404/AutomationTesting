package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///Z:/3rd%20Year%202nd%20Sem/Selenium/NewSelenium/src/GettingStarted/xpathDemo.html");
		
		// Absolute xpath:
		WebElement input_1 = driver.findElement((By.xpath("/html/body/div[1]/input[1]")));
		input_1.sendKeys("Tayyab");
		
		WebElement input_2 = driver.findElement((By.xpath("/html/body/div[1]/input[2]")));
		input_2.sendKeys("Neeraj");
		
		WebElement input_3 = driver.findElement((By.xpath("/html/body/div[2]/input[1]")));
		input_3.sendKeys("Shreyas");
		
		WebElement input_4 = driver.findElement((By.xpath("/html/body/div[2]/input[2]")));
		input_4.sendKeys("Karthik");
		
		
		// Relative xpath:
		WebElement input_A = driver.findElement(By.xpath("//input[@name='A']"));
		input_A.clear();
		input_A.sendKeys("Tayyab2");
		
		WebElement input_B = driver.findElement(By.xpath("//input[@name='B']"));
		input_B.clear();
		input_B.sendKeys("Neeraj2");
		
		WebElement input_C = driver.findElement(By.xpath("//input[@name='C']"));
		input_C.clear();
		input_C.sendKeys("Shreyas2");
		
		WebElement input_D = driver.findElement(By.xpath("//input[@name='D']"));
		input_D.clear();
		input_D.sendKeys("Karthik2");
	}
}