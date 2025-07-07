package Day16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelEx1 {
    WebDriver driver;

    @Test
    public void loginValidation() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        boolean elem = false;
        try {
            elem = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).isDisplayed();

        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        Assert.assertTrue(elem, "Login Failed");
    }

    @Test
    public void logoValidation() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();

        boolean elem = false;
        try {
            elem = driver.findElement(By.xpath("//img[@src='images/logo.gif']")).isDisplayed();

        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        Assert.assertTrue(elem, "logo doesnot exists");

    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        //  driver.close();
    }
}
