package practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Q05 extends com.myfirstproject.utilities.TestBase {

    //Signup For Facebook by using Actions class
//Go to Facebook
//Click on Create New Account
//fill all the boxes by using keyboard actions

    @Test
    public void signUpFacebook() {

       driver.get("https://www.facebook.com");

        //Click on Create New Account
       driver.findElement(By.linkText("Creat New Account"));

        //fill all the boxes by using keyboard actions
        WebElement nameBox= driver.findElement(By.xpath("//input[@name='firsname']"));

Actions actions=new Actions(driver);
        actions.click(nameBox)
                .sendKeys("Ali")
                .sendKeys(Keys.TAB)
                .sendKeys("Can")
                .sendKeys(Keys.TAB)
                .sendKeys("alican@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("alican@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("alican")
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Jan")
                .sendKeys("2010")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

    }
}
