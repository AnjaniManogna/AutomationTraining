package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		WebElement icon = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		System.out.println(icon.getAttribute("title"));

	}

}
