package dractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class D02 {

    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1= driver.findElement(By.xpath("(//input[@type='checkboxes'])[1]"));
        WebElement checkBox2= driver.findElement(By.xpath("(//input[@type='checkboxes'])[2]"));
Thread.sleep(3000);
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        Thread.sleep(3000);
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }

    }



    @After
    public void tearDown(){
        driver.close();
    }

}
