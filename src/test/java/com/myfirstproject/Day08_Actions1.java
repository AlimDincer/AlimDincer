package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions1 extends com.myfirstproject.utilities.TestBase {


    /*
    Create a class: Actions1
Create a test method : contextClickMethod() and test the following scenario:
Given user is on the https://the-internet.herokuapp.com/context_menu
When use Right clicks on the box
Then verify the alert message is “You selected a context menu”
Then accept the alert
     */
    @Test
    public void contextClickTest(){

        //Given user is on the https://the-internet.herokuapp.com/context_menu
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //When use Right clicks on the box
        WebElement box= driver.findElement(By.xpath("//div[@id='hot-shot']"));
      //  box.click();normal click no need actions class

        // 1. Creat Action object
        Actions actions=new Actions(driver);
        //2.Perform the action
        actions.contextClick(box).perform();


        //Then verify the alert message is “You selected a context menu”
       String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals("DISPLAY FAILED IF TAST CASE IS FAILED",
                "You selected a context menu",alertText);

        //Then accept the alert
        driver.switchTo().alert().accept();
    }
}
