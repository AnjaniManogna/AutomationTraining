package Day18.POM.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    By userName = By.name("userName");
    By password = By.name("password");
    By submit = By.name("submit");
    public String expectedTitle = "Welcome: Mercury Tours";

    WebDriver lpdriver;
    public LoginPage(WebDriver driver){
        lpdriver = driver;
    }


    public void setUserName(String uname){
        lpdriver.findElement(userName).sendKeys(uname);
    }
    public void setPassword(String pwd){
        lpdriver.findElement(password).sendKeys(pwd);
    }
    public void clickLoginBtn(){
        lpdriver.findElement(submit).click();
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
