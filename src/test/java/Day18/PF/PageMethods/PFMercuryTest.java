package Day18.PF.PageMethods;

import Day18.PF.PageClasses.PFHomePage;
import Day18.PF.PageClasses.PFLoginPage;
import Day18.POM.PageClasses.HomePage;
import Day18.POM.PageClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PFMercuryTest {
    WebDriver driver;
    PFLoginPage lp;
    PFHomePage hp;
    @BeforeMethod
    public void launchUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();

    }
    @Test
    public void homepageTitleValidation() {
        lp = new PFLoginPage(driver);
        hp = new PFHomePage(driver);
        Assert.assertEquals(lp.getLoginPageTitle(),lp.expectedTitle);
        lp.loginIntoMercurySite("admin","admin");
        Assert.assertEquals(hp.getHomePageText(),"Login Successfully");

    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
