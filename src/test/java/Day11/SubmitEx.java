package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("admin");
		driver.findElement(By.id("SubmitLogin")).submit();

	}

}
