package Day14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		String expectedTitle = "Welcome: Mercury Tours";
		
		String actualTitle = driver.getTitle();
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Login Title validation successful");
		}
		else {
			System.out.println("Login Title validation failed");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName"))).sendKeys("admin");
		//driver.findElement(By.name("userName")).sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("admin");
		//driver.findElement(By.name("submit1")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("submit1"))).click();
		String expectedHpTitle = "Login: Mercury Tours";
		String actualHpTitle = driver.getTitle();
		if (expectedHpTitle.equalsIgnoreCase(actualHpTitle)) {
			System.out.println("Home Page Title validation successful");
		}
		else {
			System.out.println("Home page Title validation failed");
		}
		driver.close();


	}

}
