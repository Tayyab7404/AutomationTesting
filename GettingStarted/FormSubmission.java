package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmission 
{
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        System.out.println(driver.getTitle());
        
        WebElement textbox = driver.findElement(By.name("my-text"));
        textbox.sendKeys("Selenium");
        
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        submitButton.click();
        
        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
        
        // driver.quit();
    }
}
