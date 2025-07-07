package Day14;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
public class FluentWaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        //fluent wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))        // Maximum wait time
                .pollingEvery(Duration.ofSeconds(2))        // Check every 2 seconds
                .ignoring(NoSuchElementException.class);    // Ignore if element is not found


        WebElement username = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//input[@name='userName']"));
            }
        });
// it will wait max time mentioned in the parameters before throughing No such element Exception and it is specific to element.

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        username.sendKeys("admin");
        password.sendKeys(("admin"));
        WebElement login = driver.findElement(By.xpath("//input[@name='submit']"));
        login.click();
        driver.close();
		

	}

}
