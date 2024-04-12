package Record;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 
{
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver(); // to initialize a new ChromeDriver instance

        driver.get("https://www.google.com"); // to open a website
        
        driver.manage().window().minimize(); // to minimize the window
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().window().fullscreen(); // to make the window fullscreen

        System.out.println("Main Window Handle: " + driver.getWindowHandle());
        System.out.println("Position of the Window: " + driver.manage().window().getPosition());
        System.out.println("Size of the Window: " + driver.manage().window().getSize());

        Point p = new Point(0,0); // to create an object of Point class
        driver.manage().window().setPosition(p);

        Dimension d = new Dimension(500,1000); // to create an object of Dimension class
        driver.manage().window().setSize(d);

        driver.quit(); // to close the WebDriver session
    }
}