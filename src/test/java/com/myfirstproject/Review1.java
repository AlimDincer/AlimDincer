package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        String expectedURL = "www.youtube.com";
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";driver.navigate().to("https://www.amazon.com");
       driver.navigate().back();
       driver.navigate().refresh();

        driver.navigate().back();
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Amazon";
        driver.manage().window().maximize();
        String actualURL = driver.getCurrentUrl();
        driver.quit();

        if (actualURL.equals(expectedURL)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("ACTUAL : " + actualURL);
            System.out.println("EXPECTED : " + expectedURL);
        }

        /*
        FAILED
ACTUAL : https://www.amazon.com/
EXPECTED : www.youtube.com

Process finished with exit code 0
         */
    }
}
