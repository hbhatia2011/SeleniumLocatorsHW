package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //To open Browser
        driver=new ChromeDriver();
        //To maximise the Browser screen
        driver.manage().window().fullscreen();
        // To set the implicity wait for the driver object
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        //To open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on Register tab - using Class locator
        driver.findElement(By.className("ico-register")).click();
        //enter firstname - using ID locator
        driver.findElement(By.id("FirstName")).sendKeys("Hema");
        //enter lastname - using ID locator
        driver.findElement(By.id("LastName")).sendKeys("Bhatia");
        //enter email address - using by Name locator
        driver.findElement(By.name("Email")).sendKeys("test000@test.com");
        //enter password = using XPath locator
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test123");
        //enter confirm password - using XPath locator
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("test123");
        // Click on Register - using ID Locator
        driver.findElement(By.id("register-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Close the browser
        driver.close();

    }
}
