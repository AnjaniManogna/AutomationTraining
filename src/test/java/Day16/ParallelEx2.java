package Day16;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelEx2 {
    WebDriver driver;
    @Test
    public void validateAlert() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("1234");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        // it will click on OK button on alert
        driver.switchTo().alert().accept();

    }
    @AfterMethod(alwaysRun = true)
    public void teardownbrowser(){
        driver.close();
    }

}
