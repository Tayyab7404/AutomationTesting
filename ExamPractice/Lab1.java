import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1
{
	public static void main(String[] args) throws InterruptedException
	{	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.github.com/login");
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		System.out.println("Window size: " + driver.manage().window().getSize());
		System.out.println("Window position: " + driver.manage().window().getPosition());
		
		Point p = new Point(50, 50);
		driver.manage().window().setPosition(p);
		
		Dimension d = new Dimension(1000, 750);
		driver.manage().window().setSize(d);
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}