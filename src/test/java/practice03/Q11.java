package practice03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class Q11 {

    WebDriver driver;

    @Test
    public void name11() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


//        Description
//
//        1. Launch browser
//
//        2. Navigate to url 'http://automationexercise.com'
//
//        3. Verify that home page is visible successfully
//
//        4. Scroll down to footer
//
//        5. Verify text 'SUBSCRIPTION'
//
//        6. Enter email address in input and click arrow button
//
//        7. Verify success message 'You have been successfully subscribed!' is visible

       // 2. Navigate to url 'http://automationexercise.com'

        driver.get("http://automationexercise.com");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

        //        3. Verify that home page is visible successfully
WebElement  homePageIsVisible = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        Assert.assertTrue(homePageIsVisible.isDisplayed());
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));

        //        4. Scroll down to footer
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollInView()", homePageIsVisible);

// WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
//        js.executeScript("arguments[0].scrollIntoView(true);",ourRooms);
//        Thread.sleep(3000);
    }
}