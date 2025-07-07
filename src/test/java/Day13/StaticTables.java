package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		System.out.println("First row First column : "+ driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText());
		System.out.println("First row Second column : "+ driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText());
		System.out.println("Second row First column : "+ driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		System.out.println("Second row second column : "+ driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());

	}

}
