package Day18.POM.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver hpdriver;
    public HomePage(WebDriver driver){
        hpdriver = driver;
    }
    By homePageText = By.tagName("h3");
    public String getHomePageText(){
        return hpdriver.findElement(homePageText).getText();
    }
}
