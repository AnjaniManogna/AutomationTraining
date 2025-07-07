package Day18.PF.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFHomePage {
    WebDriver hpdriver;
    public PFHomePage(WebDriver driver){
        hpdriver = driver;
        PageFactory.initElements(hpdriver,this);
    }
//    By homePageText = By.tagName("h3");
    @FindBy(tagName = "h3")
    WebElement homePageText;
    public String getHomePageText(){
        return homePageText.getText();
    }
}
