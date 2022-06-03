package practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erd {

    WebDriver driver;

    @Test
    public void name2() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mynet.com/galeri/cumhurbaskani-erdogan-in-kitabi-daha-adil-bir-dunya-mumkun-un-konusu-nedir-110106850699/1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@src='https://imgrosetta.mynet.com.tr/file/13420844/728xauto.jpg']"));
    }
}