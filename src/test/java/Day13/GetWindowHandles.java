package Day13;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		String currentwindow = driver.getWindowHandle();
		Set s= driver.getWindowHandles();
		Iterator itr =  s.iterator();
		while (itr.hasNext()) {
			String targetwindow = (String) itr.next();
			if (!currentwindow.equals(targetwindow) ) {
				driver.switchTo().window(targetwindow);
			}
			
		}
		
		
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("abc@gmail.com");
		WebElement submit = driver.findElement(By.name("btnLogin"));
		submit.click();

	}

}
