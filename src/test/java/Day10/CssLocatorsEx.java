package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.cssSelector("input#user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButn = driver.findElement(By.cssSelector("input.submit-button"));
		loginButn.click();
		//input.submit-button[data-test='login-button']  -- using 2 properties
		driver.close();
		
		

	}

}
