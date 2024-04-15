package Record;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab3
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        
        System.out.println("Title: " + driver.getTitle());
        
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        WebElement elementById = driver.findElement(By.id("inputEmail4"));
        elementById.sendKeys("tayyab@gmail.com");
        System.out.println(elementById.getAttribute("value"));

        WebElement elementByName = driver.findElement(By.name("name"));
        elementByName.sendKeys("Tayyab");
        System.out.println(elementByName.getAttribute("value"));
        
        driver.navigate().to("https://www.lambdatest.com/test-on-iphone-15");
        
        driver.navigate().back();
        
        driver.quit();
    }
}