package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrmLive {

    public static void main(String[] args) {
        //Setup chrome browser.
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Open URL.
        driver.get(baseUrl);
        //Print the title of the page.
        System.out.println(" Title Page " + driver.getTitle());
        //Print the current url.
        System.out.println(" Current URL " + driver.getCurrentUrl());
        // Print the page source.
        System.out.println(" Page Source " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Click on ‘Forgot your password?’ link.
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //  driver.findElement(By.name("oxd-text oxd-text--p orangehrm-login-forgot-header")).click();

        //Print the current url.
        System.out.println(" Current URL " + driver.getCurrentUrl());

        //Navigate back to the login page.
        //  String loginL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        // System.out.println(" Login Page" + loginL);
        //  System.out.println(driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        driver.findElement(By.tagName("button")).click();

        //Refresh the page.
        driver.navigate().refresh();


        //Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Enter the password to password field.
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //close the browser
      //  driver.quit();


    }

}
