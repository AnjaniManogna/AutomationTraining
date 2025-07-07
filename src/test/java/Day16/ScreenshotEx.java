package Day16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotEx {
    WebDriver driver;
    @Test
    public void validateAlert() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("1234");
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(System.getProperty("user.dir")+"//screenshot//test.png"));
    }
}
