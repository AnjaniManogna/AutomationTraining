package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AspAutomationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Opening WebPage
		driver.get("https://demo.aspnetawesome.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Printing title
		/*
		 * WebElement title = driver.findElement(By.
		 * xpath("//h1[text()='ASP.net Core Awesome Controls overview']"));
		 * System.out.println(title.getText());
		 */
		
		//fields
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		 driver.findElement(By.id("Meal")).sendKeys("o");
//		
//		 List<WebElement> option= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@aria-live='polite']//li")));
//		 for (WebElement i : option) {
//			 System.out.println(i.getText());
//			 if (i.getText().equals("Potato")) {
//				 i.click();
//			 }
//		 driver.findElement(By.id("AllMeals-awed")).click();
//		 
//		 List<WebElement> opt= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@aria-labelledby='AllMeals-awed']//li")));
//		 for (WebElement q : opt) {
//			 System.out.println(q.getText());
//			 if (q.getText().equals("Broccoli")) {
//				 q.click();
//			 }	 
//			 
//		 }
		 driver.findElement(By.xpath("//button[@class='awe-btn awe-dpbtn o-icoc']//preceding::input[@name='DateTime1']")).click();
		 //printing month
		driver.findElement(By.xpath("//button[@id='DateTime1cm-awed']")).click();
		 List<WebElement> month = driver.findElements(By.xpath("//ul[@aria-labelledby='DateTime1cm-awed']"));
		 for (WebElement r : month) {
			 System.out.println(r.getText());
			 if (r.getText().equals("August")) {
				 r.click();
			 }	 
		 }
		 
		 
		
		
		 
	}
	}


			
		
		
		
		
		

	


