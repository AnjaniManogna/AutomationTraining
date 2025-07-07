package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeriesOfActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
		Actions act= new Actions(driver);
		act.moveToElement(email)
		.click().keyDown(email,Keys.SHIFT)
		.sendKeys("abcd@gmail.com")
		.keyUp(email,Keys.SHIFT).doubleClick()
		.contextClick().perform();
		

	}

}
