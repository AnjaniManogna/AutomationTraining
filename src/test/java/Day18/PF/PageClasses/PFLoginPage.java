package Day18.PF.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PFLoginPage {
    //By userName = By.name("userName");
//    By password = By.name("password");
//    By submit = By.name("submit");
    @FindBy(name = "userName")
    WebElement userName;
    @FindBys({
            @FindBy(name = "password"),
            @FindBy(xpath = "//*[@name='password']")
    })
    WebElement password;
    @FindAll({
            @FindBy(name = "submit"),
            @FindBy(xpath = "//*[@name='submit']")
    })
    WebElement submit;

    public String expectedTitle = "Welcome: Mercury Tours";

    WebDriver lpdriver;
    public PFLoginPage(WebDriver driver){
        lpdriver = driver;
        PageFactory.initElements(lpdriver,this);
    }


    public void setUserName(String uname){
        userName.sendKeys(uname);
    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void clickLoginBtn(){
        submit.click();
    }
    public String getLoginPageTitle(){
       return lpdriver.getTitle();
    }

    public void loginIntoMercurySite(String uname,String pwd){
        setUserName(uname);
        setPassword(pwd);
        clickLoginBtn();
    }
}
