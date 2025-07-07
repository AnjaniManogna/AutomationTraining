package Day9;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SeleniumfirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
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
