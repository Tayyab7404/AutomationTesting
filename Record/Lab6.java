package Record;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab6
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        
        // Alert Box:
        driver.findElement(By.id("alertBox")).click(); // Click on the button that triggers the alert dialog
        Alert alert = driver.switchTo().alert(); // Switch to the alert dialog
        String alertText = alert.getText(); // Get the text from the alert dialog
        System.out.println("Alert Text: " + alertText);
        Thread.sleep(3000);
        alert.accept(); // Accept the alert (Clicking OK)
        System.out.println("Alert Text output: " + driver.findElement(By.id("output")).getText() + "\n");
        Thread.sleep(3000);
        
        // Confirmation Box:
        driver.findElement(By.id("confirmBox")).click(); // Click on the button that triggers the confirm dialog
        Alert confirm = driver.switchTo().alert(); // Switch to the conform dialog
        String confirmText = confirm.getText(); // Get the text from the conform dialog
        System.out.println("Confirm Text: " + confirmText);
        Thread.sleep(3000);
        confirm.accept(); // Accept the alert (Clicking OK)
        System.out.println("Confirm Text output: " + driver.findElement(By.id("output")).getText() + "\n");
        Thread.sleep(3000);
        
        // Prompt Box:
        driver.findElement(By.id("promptBox")).click(); // Click on the button that triggers the prompt dialog
        Alert prompt = driver.switchTo().alert(); // Switch to the prompt dialog
        String promptText = prompt.getText(); // Get the text from the prompt dialog
        System.out.println("Prompt Request Text: " + promptText);
        prompt.sendKeys("Tayyab");
        Thread.sleep(3000);
        prompt.accept(); // Accept the alert (Clicking OK)
        System.out.println("Prompt Text output: " + driver.findElement(By.id("output")).getText() + "\n");
        Thread.sleep(3000);
        
        driver.quit();
    }
}