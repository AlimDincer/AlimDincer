package practice03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Q2  {
  WebDriver driver;
    @Test
    public void name2() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//      1. Launch browser
//
//        2. Navigate to URL 'http://automationexercise.com'
//
//        3. Verify that the home page is visible successfully
//
//        4. Click on the 'Signup / Login' button
//
//        5. Verify that 'Login to your account' is visible
//
//        6. Enter correct email address and password
//
//        7. Click 'login' button
//
//        8. Verify that 'Logged in as username' is visible
//
//        9. Click 'Delete Account' button
//
//        10. Verify that 'ACCOUNT DELETED!' is visible


        // Navigate to URL 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //     3. Verify that the home page is visible successfully
        WebElement homePageIsVisible = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        if (homePageIsVisible.isDisplayed()) {
            System.out.println("home page is visible PASSED");
        } else {
            System.out.println("home page is visible FAILED");
        }
        Thread.sleep(5000);


        // 4. Click on the 'Signup / Login' button
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
        Thread.sleep(5000);

        // 5. Verify that 'Login to your account' is visible
        WebElement LoginToYourAccountIsVisible = driver.findElement(By.xpath("//div[@class='login-form']//h2"));
        Assert.assertTrue(LoginToYourAccountIsVisible.isDisplayed());
//        if (LoginToYourAccountIsVisible.isDisplayed()) {
//            System.out.println("'Login to your account' is visible PASSED");
//        } else {
//            System.out.println("'Login to your account' is visible FAILED");
//        }
        Thread.sleep(5000);
        //6.Enter correct email address and password
        WebElement emailElement= driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        WebElement passwordElement= driver.findElement(By.xpath("//input[@type='password']"));
       emailElement.sendKeys("demo24@gmail.com");
       passwordElement.sendKeys("3135153Ad");

        Thread.sleep(5000);
        // 7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        Thread.sleep(5000);



//         //       8. Verify that 'Logged in as username' is visible

       WebElement loggedInAsUsernameIsVisible = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
       Assert.assertTrue(loggedInAsUsernameIsVisible.isDisplayed());





    }
}
