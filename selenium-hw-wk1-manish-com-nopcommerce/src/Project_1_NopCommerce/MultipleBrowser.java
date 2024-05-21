package Project_1_NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

    static String browser= "Firefox";

    String baseUrl="https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();

        }else if (browser.equalsIgnoreCase("Firefox")){
            driver= new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver= new EdgeDriver();

        }else {
            System.out.println("Wrong Browser Name");
        }

        String baseUrl = "https://demo.nopcommerce.com/";
        driver.get(baseUrl); //open url
        System.out.println("The title of the page " + driver.getTitle());// get the title of the page
        System.out.println("Current URL " + driver.getCurrentUrl());// get the current url
        System.out.println("Page Source " + driver.getPageSource());// get the page source

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl); // navigate to url

        System.out.println("Current URL " + driver.getCurrentUrl()); //get the current url

        driver.navigate().back(); // navigate back to homepage
        System.out.println("HomePage " + driver.getCurrentUrl());

        //Navigate to the login page.

        driver.navigate().to(loginUrl);
        System.out.println("Login Url " + loginUrl);

        //Print the current url.
        System.out.println("Current URL " + driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();

        //Enter the email to email field.
        WebElement emailID = driver.findElement(By.id("Email"));
        emailID.sendKeys("manishtyagi@gmail.com");

        //Enter the password to password field.

        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("12345678");

        //Click on Login Button.
        driver.findElement(By.className("login-button")).click();

        //close the browser
        driver.quit();
    }

}
