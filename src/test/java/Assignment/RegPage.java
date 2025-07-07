package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		s.selectByValue("CHINA");
		Thread.sleep(2000);
		s.selectByIndex(8);
		
		

	}

}
