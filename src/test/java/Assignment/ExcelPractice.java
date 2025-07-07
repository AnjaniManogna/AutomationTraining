package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelPractice {

        WebDriver driver;

        @Test
        public void registration() throws IOException, InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/newtours/register.php");
            driver.manage().window().maximize();
            String Filepath = System.getProperty("user.dir") + "/TestData/TestDataPractice.xlsx";
            File f = new File(Filepath);
            FileInputStream fis = new FileInputStream(f);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("Details");
            int rowCount = sheet.getLastRowNum();
            WebElement firstName = driver.findElement(By.name("firstName"));
            WebElement lastName = driver.findElement(By.name("lastName"));
            WebElement email = driver.findElement(By.name("userName"));
            WebElement mobile = driver.findElement(By.name("phone"));
            WebElement address = driver.findElement(By.name("address1"));
            WebElement city = driver.findElement(By.name("city"));
            WebElement state = driver.findElement(By.name("state"));
            WebElement postal = driver.findElement(By.name("postalCode"));
            WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
            WebElement submit = driver.findElement(By.name("submit"));

            for (int i = 1; i <= rowCount; i++) {
                firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
                lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
                mobile.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
                email.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
                address.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
                city.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
                state.sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
                postal.sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
                Select s = new Select(country);
                s.selectByVisibleText(sheet.getRow(i).getCell(8).getStringCellValue());
                submit.click();
                WebElement success = driver.findElement(By.xpath("//font[contains(text(),'Thank you')]"));
                XSSFCell cell = sheet.getRow(i).createCell(9);
                if (success.isDisplayed()){
                    cell.setCellValue("Pass");
                }
                else{
                    cell.setCellValue("Fail");
                }
                FileOutputStream fos = new FileOutputStream(f);
                wb.write(fos);
                Thread.sleep(5000);

            }
            wb.close();
            driver.close();
        }
    }
    

