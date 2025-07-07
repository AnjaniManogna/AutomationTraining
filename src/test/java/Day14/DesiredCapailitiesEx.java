package Day14;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DesiredCapailitiesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.acceptInsecureCerts();
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.close();
		

	}

}
