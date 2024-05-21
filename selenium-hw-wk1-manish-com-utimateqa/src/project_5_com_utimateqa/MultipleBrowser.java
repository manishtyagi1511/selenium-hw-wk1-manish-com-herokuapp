package project_5_com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {


    static String browser = "Edge";
    static WebDriver driver;
    String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Invalid Browser");

        }

        String baseUrl = "https://courses.ultimateqa.com/";
        driver.get(baseUrl);
        //Print the title of the page.
        System.out.println("TITLE PAGE :" + driver.getTitle());
        //Print the current url.
        System.out.println("CURRENT URL :" + driver.getCurrentUrl());
        //Print the page source.
        System.out.println("PAGE SOURCE " + driver.getPageSource());
        //Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println("CURRENT URL1: " + driver.getCurrentUrl());
        //Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("manishtyagi@gmail.com");

        //Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("123456");
        //Click on Login Button
        driver.findElement(By.className("button")).click();
        //Navigate to baseUrl.
        driver.navigate().to(baseUrl);


        //Navigate forward to Homepage.
        driver.navigate().forward();

        //Navigate back to baseUrl.
        driver.navigate().back();

        //Refresh the page.
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());

        //Close the browser.
        driver.quit();


    }
}