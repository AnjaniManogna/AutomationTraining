package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Login Title validation successful");
		}
		else {
			System.out.println("Login Title validation failed");
		}
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
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
