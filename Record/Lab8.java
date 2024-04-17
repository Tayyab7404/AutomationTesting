package Record;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab8
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/");
		
		Thread.sleep(5000);
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		
		File srcfle = tk.getScreenshotAs(OutputType.FILE);
		File Destfle = new File("E:/screenshot.png"); // Stores the screenshot in E drive as screenshot.png 
		// You can also change the path to either C drive, D drive or to downloads
		
		try
		{
			FileUtils.copyFile(srcfle,Destfle);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}