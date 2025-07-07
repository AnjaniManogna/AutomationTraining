package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//a[normalize-space(text())='BANK']"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='bank']//li"));
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		ac.dragAndDrop(source, target).perform();

	}

}
