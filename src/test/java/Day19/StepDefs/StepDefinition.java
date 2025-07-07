package Day19.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class StepDefinition {
    WebDriver driver;
    PropertyFileReader pf = new PropertyFileReader();

    @Given("I launch the Mercury url")
    public void i_launch_the_mercury_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
    }
    @When("I enter {string} as {string}")
    public void i_enter_as(String WebEle, String value) throws IOException {
        driver.findElement(By.xpath(pf.getPropertyValue(WebEle))).sendKeys(value);



    }
    @When("I click on {string} button")
    public void i_click_on_button(String WebEle) throws IOException {
        driver.findElement(By.xpath(pf.getPropertyValue(WebEle))).click();
    }
    @Then("I should see {string} text")
    public void i_should_see_text(String expTxt) {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'"+expTxt+"')]")).isDisplayed());
    }
    @Given("The following UI actions are performed:")
    public void the_following_ui_actions_are_performed(io.cucumber.datatable.DataTable dataTable) throws IOException {

        List<Map<String, String>> actions = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : actions) {
            String action = row.get("action").toLowerCase();
            String element = row.get("element");
            String value = row.get("value");

            By locator = By.xpath(pf.getPropertyValue(element)); // Map element names to locators

            switch (action) {
                case "click":
                    driver.findElement(locator).click();
                    break;
                case "enter":
                    driver.findElement(locator).clear();
                    driver.findElement(locator).sendKeys(value);
                    break;
                case "select":
                    new Select(driver.findElement(locator)).selectByVisibleText(value);
                    break;
                default:
                    System.out.println("Unknown action: " + action);
            }
        }
    }
    @Given("Launch Swag Labs url")
    public void launch_swag_labs_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @Given("Enter {string} as {string}")
    public void enter_as(String elementName, String elementValue) throws IOException {
        driver.findElement(By.xpath(pf.getPropertyValue(elementName))).sendKeys(elementValue);

    }
    @When("click {string} button")
    public void click_button(String login) throws IOException {
        driver.findElement(By.xpath(pf.getPropertyValue(login))).click();

    }
    @Then("Should see correct home Page url")
    public void should_see() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

    }
    }




