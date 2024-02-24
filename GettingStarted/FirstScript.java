package GettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FirstScript 
{
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
        WebElement textbox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        
        textbox.sendKeys("Selenium");
        submitButton.click();
        
        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
        
        driver.quit();
    }
}
