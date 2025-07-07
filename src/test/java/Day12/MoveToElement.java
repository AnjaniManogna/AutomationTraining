package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testkru.com/Elements/Buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement hover= driver.findElement(By.xpath("//button[@id='colorChangeOnHover']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(hover).perform();

	}

}
