package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class SauceLabs {
    WebDriver driver;

    @Test
    public void launchUrl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //Login Validation
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        //Verifying after login

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

        //Adding products to cart
        WebElement backpackPriceE = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']/preceding::div[@data-test='inventory-item-price']"));
        String backpackPrice = backpackPriceE.getText();
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
        WebElement bikeLightPriceE = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']/preceding-sibling::div[@data-test='inventory-item-price']"));
        String bikeLightPrice = bikeLightPriceE.getText();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();

        //Going to cart
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        //Verifying if the prices are the same
        WebElement pricebp_cart= driver.findElement(By.xpath("//div[text()='$'and text()='29.99']"));
        WebElement pricebl_cart= driver.findElement(By.xpath("//div[text()='$'and text()='9.99']"));
        Assert.assertEquals(pricebp_cart.getText(),backpackPrice);
        Assert.assertEquals(pricebl_cart.getText(),bikeLightPrice);

        //ContinueToPayment
        driver.findElement(By.id("checkout")).click();
        //Fill checkout details
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("reed");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500080");
        driver.findElement(By.xpath("//input[@id='continue']")).click();

        //Verifying prices and total in overview
        WebElement light_overview = driver.findElement(By.xpath("//div[@class='inventory_item_price' and text()='9.99']"));
        WebElement bp_overview = driver.findElement(By.xpath("//div[@class='inventory_item_price' and text()='29.99']"));
        Assert.assertEquals(light_overview.getText(),bikeLightPrice);
        Assert.assertEquals(bp_overview.getText(),backpackPrice);

        //converting to double values
        double bpvalue = Double.parseDouble(backpackPrice.replace("$",""));
        double blvalue = Double.parseDouble(bikeLightPrice.replace("$",""));
        double total_expected = bpvalue+blvalue;
        WebElement itemTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double itemTotal1 = Double.parseDouble(itemTotal.getText().replaceAll("[^\\d.]", ""));

        Assert.assertEquals(itemTotal1,total_expected);

        //Getting tax
        WebElement tax = driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
        double tax1 = Double.parseDouble(tax.getText().replaceAll("[^\\d.]", ""));
        //Adding tax to total and compare with total
        double Total = itemTotal1+tax1;
        WebElement actualtotal = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
        double actualTotal = Double.parseDouble(actualtotal.getText().replaceAll("[^\\d.]", ""));
        Assert.assertEquals(actualTotal,Total);

        //Order complete page
        driver.findElement(By.id("finish")).click();
        WebElement order = driver.findElement(By.xpath("//h2"));
        System.out.println(order.getText());
        driver.quit();



    }
}