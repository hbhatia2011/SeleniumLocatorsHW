package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailaFriend {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //To open Browser
        driver = new ChromeDriver();
        //To maximise the Browser screen
        driver.manage().window().fullscreen();
        // To set the implicity wait for the driver object
        driver.manage().timeouts().implicitlyWait(85, TimeUnit.SECONDS);
        //To open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on Login tab - using Class locator
        driver.findElement(By.className("ico-login")).click();
        //enter email address - using by Name locator
        driver.findElement(By.name("Email")).sendKeys("test123@test.com");
        //enter password = using XPath locator
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test123");
        // Click on Login - using XPath Locator
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        //Select Apple MacBook Pro - using XPath Locator
        driver.findElement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //Click on Email a Friend tab - using XPath Locator
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //Enter Friend Email address- using XPath Locator
        driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("info@test.com");
        //Enter personal message - using XPath Locator
        driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Check this product");
        //Click on Send mail -  using Name Locator
        driver.findElement(By.name("send-email")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Close the browser
        driver.close();
    }
    }
