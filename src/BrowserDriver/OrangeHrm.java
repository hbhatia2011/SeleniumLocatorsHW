package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {
    protected static WebDriver driver;
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        //to maximise the window browser
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //to open the website
        driver.get("https://opensource-demo.orangehrmlive.com");
        //Enter Username - using ID locator
        //driver.findElement(By.xpath("//input [@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //Enter password - using xpath locator
        driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
        //Click on Login button
        driver.findElement(By.id("btnLogin")).click();
        //Click on welcome Admin top right-hand side
        driver.findElement(By.linkText("Welcome Admin")).click();
        //Click onto Logout button
        driver.findElement(By.linkText("Logout")).click();
        //close the window
        driver.close();




    }
}
