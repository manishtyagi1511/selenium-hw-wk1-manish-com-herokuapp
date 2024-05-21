package project_4_com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println(" TITLE: " + driver.getTitle());
        //Print the current url.
        System.out.println("CURRENT URL: " + driver.getCurrentUrl());
        //Print the page source.
        System.out.println("PAGE SOURCE :" + driver.getPageSource());

        //Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //Print the current url.
        System.out.println("CURRENT URL1 :" + driver.getCurrentUrl());

        //Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //Refresh the page.
        driver.navigate().refresh();

        //Close the browser.
        driver.quit();


    }

}
