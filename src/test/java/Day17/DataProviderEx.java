package Day17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
    WebDriver driver;


    @Test(dataProvider = "loginData")
    public void homepageTitleValidation(String username, String password) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();

        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();
        String expectedHpTitle = "Login: Mercury Tours";
        String actualHpTitle = driver.getTitle();
        Assert.assertEquals(actualHpTitle, expectedHpTitle);
    }
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        Object[][] credentials = {
                {"admin", "admin"}, {"test", "test"}, {"demo", "demo"}
            };
            return credentials;

    }
}
