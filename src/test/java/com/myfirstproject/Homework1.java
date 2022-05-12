package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

    /*
    Create a new class : Homework1 
Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title. 
Verify if the page URL contains facebook  if not, print the right url. 
Then Navigate to https://www.walmart.com/ 
Verify if the walmart page title includes “Walmart.com” 
Navigate back to facebook 
Refresh the page 
Maximize the window 
Close the browser

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//WINDOWS
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "facebook";
//        Navigate to google homepage
        driver.get("https://www.walmart.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Walmart.com";
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
            System.out.println("Expected : "+expectedTitle1);
            System.out.println("Actual : "+actualTitle1);
        }else{
            System.out.println("FAILED");
            System.out.println("Expected : "+expectedTitle1);
            System.out.println("Actual : "+actualTitle1);
        }
    }
}
/*
FAILED
ACTUAL : https://www.google.com/
EXPECTED : www.google.com
 */