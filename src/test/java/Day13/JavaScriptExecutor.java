package Day13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.name("userName"));
		WebElement password =driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.name("submit"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','admin')", username);
		js.executeScript("arguments[0].setAttribute('value','admin')", password);
		js.executeScript("arguments[0].click()", submit);
		driver.close();

	}

}
