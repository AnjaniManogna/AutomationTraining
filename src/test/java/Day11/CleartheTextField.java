package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartheTextField {

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
		
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("submit")).click();

	}

}
