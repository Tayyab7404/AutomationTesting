package GettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FirstScript 
{
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        System.out.println(driver.getTitle());
        
        // driver.quit()
    }
}
