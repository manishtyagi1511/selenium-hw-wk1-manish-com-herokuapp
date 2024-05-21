package Project_1_NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    /**
     * 1. Setup chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Navigate to Url.
     * “https://demo.nopcommerce.com/login?returnUrl=
     * %2F”
     * 7. Print the current url.
     * 8. Navigate back to the home page.
     * 9. Navigate to the login page.
     * 10. Print the current url.
     * 11. Refresh the page.
     * 12. Enter the email to email field.
     * 13. Enter the password to password field.
     * 14. Click on Login Button.
     * 15. Close the browser.
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

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
