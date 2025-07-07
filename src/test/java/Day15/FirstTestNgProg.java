package Day15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNgProg {
    WebDriver driver;
    @BeforeMethod
            public void launchUrl() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();

        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public void homepageTitleValidation() {
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        String expectedHpTitle = "Login: Mercury Tours2";
        String actualHpTitle = driver.getTitle();
        Assert.assertEquals(actualHpTitle,expectedHpTitle);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
