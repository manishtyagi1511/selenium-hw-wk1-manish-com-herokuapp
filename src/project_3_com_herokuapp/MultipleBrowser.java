package project_3_com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

    static String browser="Edge";
    static WebDriver driver;
    String baseUrl="http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver= new EdgeDriver();

        }else {
            System.out.println("Invalid Browser");

        }
        //Open URL
        String baseUrl= "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println(" Title " +driver.getTitle());
        // Print the current url.
        System.out.println(" Current URL "+driver.getCurrentUrl());
        //Print the page source.
        System.out.println(" Page Source "+driver.getPageSource());

        //Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("tomsmith");

        //Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //Click on Login Button.
        driver.findElement(By.className("radius")).click();
        //driver.findElement(By.class)

        //Print the current url.
        System.out.println(" Current URL " +driver.getCurrentUrl());

        //Refresh the page.
        driver.navigate().refresh();

        //Close the broswer
        driver.quit();


    }

}
