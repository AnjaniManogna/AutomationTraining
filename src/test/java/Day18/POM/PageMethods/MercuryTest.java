package Day18.POM.PageMethods;

import Day18.POM.PageClasses.HomePage;
import Day18.POM.PageClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MercuryTest {
    WebDriver driver;
    LoginPage lp;
    HomePage hp;
    @BeforeMethod
    public void launchUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();

    }
    @Test
    public void homepageTitleValidation() {
        lp = new LoginPage(driver);
        hp = new HomePage(driver);
        Assert.assertEquals(lp.getLoginPageTitle(),lp.expectedTitle);
        lp.loginIntoMercurySite("admin","admin");
        Assert.assertEquals(hp.getHomePageText(),"Login Successfully");

    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
