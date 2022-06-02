package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class C1 extends com.myfirstproject.utilities.TestBase {
    @Test
    public void rB() throws InterruptedException {
     driver.get("https://www.amazon.com/");
     String handle1=driver.getWindowHandle();
     String actual=driver.getTitle();
     String expected="amazon";
Assert.assertTrue(actual.contains(expected));
        Thread.sleep(3000);
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.bestbuy.com");
        String handle2=driver.getWindowHandle();
String  actual1=driver.getTitle();
String expected1="Best Buy";
Assert.assertTrue(actual1.contains(expected1));
Thread.sleep(3000);

driver.switchTo().window(handle1);
String actual2=driver.getCurrentUrl();
String expected2="Java";



    }
}