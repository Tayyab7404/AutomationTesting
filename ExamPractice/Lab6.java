import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab6
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		System.out.println("Alert Text Output: " + driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmBox")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Confirm Text: " + confirm.getText());
		Thread.sleep(3000);
		confirm.accept();
		System.out.println("Alert Text Output: " + driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.id("promptBox")).click();
        Alert prompt = driver.switchTo().alert();
        System.out.println("Prompt Request Text: " + prompt.getText());
        prompt.sendKeys("Tayyab");
        Thread.sleep(3000);
        prompt.accept();
        System.out.println("Prompt Text output: " + driver.findElement(By.id("output")).getText() + "\n");        
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}