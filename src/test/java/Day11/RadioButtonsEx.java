package Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement opt1 = driver.findElement(By.xpath("//input[@value = 'Option 1']"));
		opt1.click();
		System.out.println("Is Radio button selected: " +opt1.isSelected());
		
		List <WebElement> radio= driver.findElements(By.xpath("//input[@type = 'radio']"));
		for(int i=0;i<radio.size();i++) {
			radio.get(i).click();
			System.out.println(radio.get(i).getAttribute("value")+"-->"+radio.get(i).isSelected());
		}

	}

}
