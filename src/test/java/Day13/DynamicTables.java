package Day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List columns= driver.findElements(By.xpath("//table/thead/tr/th"));
		List rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of columns ="+columns.size());
		System.out.println("Number of rows ="+rows.size());
		String max ;
		double m=0, hvalue=0;
		for(int i=1;i<rows.size();i++) {
			max= driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			m=Double.parseDouble(max);
			if(m>hvalue) {
				hvalue=m;
			}
			
		}
		System.out.println("Highest value = "+hvalue);
		

	}

}
