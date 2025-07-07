package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("account?")).click();
		driver.quit();
		

	}

}
