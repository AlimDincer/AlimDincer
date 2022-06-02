package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StageMovementTest extends com.myfirstproject.utilities.TestBase {

    @Test
    public void StageMovements() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement image1 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]"));

        //scroll to object
        scrollIntoViewByJS(image1);
//        Thread.sleep(5000);

        //to hover over image, need actions object
        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();
        Thread.sleep(5000);

//        click on add to cart
//        (//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]
        WebElement addToCartbutton = driver.findElement(By.xpath("(//span[.='Add to cart'])[1]"));
        addToCartbutton.click();
        Thread.sleep(5000);

        //add waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));//Product successfully added to your shopping cart

        //after getting the label element, assert
        String productText = product.getText();
        Assert.assertEquals("Product successfully added to your shopping cart",productText);

//        And verifies the color, size, quantity, price, shipping, Total Price
//        //span[@id='layer_cart_product_attributes']
//        Orange, S
        WebElement colorAndSize = driver.findElement(By.xpath("//span[@id='layer_cart_product_attributes']"));
        Assert.assertEquals("Orange, S",colorAndSize.getText());

        WebElement price = driver.findElement(By.xpath("//span[@id='layer_cart_product_price']"));
        String priceText = price.getText();
        Assert.assertEquals("$16.51",price.getText());

        Assert.assertEquals("1",driver.findElement(By.xpath("//span[@id='layer_cart_product_quantity']")).getText());
//        Assert.assertEquals("$16.51",driver.findElement(By.xpath("//span[@id='layer_cart_product_price']")).getText());
        Assert.assertEquals("$2.00",driver.findElement(By.xpath("//span[@class='ajax_cart_shipping_cost']")).getText());
        Assert.assertEquals("$18.51",driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']")).getText());

        driver.findElement(By.linkText("Proceed to checkout")).click();

//      Verify that user is on the summary stage, VERIFY => SHOPPING-CART SUMMARY is displayed
        WebElement cartSummary = driver.findElement(By.xpath("//h1[@id='cart_title']"));
        Assert.assertTrue(cartSummary.isDisplayed());

//        verify In Stock
        WebElement inStock = driver.findElement(By.xpath("//span[@class='label label-success']"));
        Assert.assertEquals("In stock",inStock.getText());

//        verify unit price
        WebElement unitPrice = driver.findElement(By.xpath("//span[@id='product_price_1_1_0']"));
        Assert.assertEquals(priceText,unitPrice.getText());


 //               And user clicks on + sign
        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

        Thread.sleep(3000);
//        Then verifies the TOTAL price is 2*price+shipping => 2 * 16.51 + 2.00 = 35.02
        WebElement totalPrice2 = driver.findElement(By.xpath("//span[@id='total_price']"));
        Assert.assertEquals("$35.02",totalPrice2.getText());

    }
}
