package Record;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        WebElement mainIframe = driver.findElement(By.id("name"));
        mainIframe.sendKeys("main frame"); // Entering text in the main frame
        
        Thread.sleep(2000);
       
        driver.switchTo().frame("frm1"); // switching to frame1
        
        WebElement course = driver.findElement(By.id("course")); // Selecting the dropdown menu in frame1
        Select courseName = new Select(course);
        courseName.selectByVisibleText("Java");
        
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent(); // redirecting  back to the main frame
        
        driver.findElement(By.id("name")).clear(); // cleared the main frame text
        driver.findElement(By.id("name")).sendKeys("returned to main webpage");

        driver.quit();
    }
}