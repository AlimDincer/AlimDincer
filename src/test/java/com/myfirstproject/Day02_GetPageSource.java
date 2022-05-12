package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//WINDOWS
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Navigate to google homepage
        driver.get("https://www.amazon.com");
    }
}
