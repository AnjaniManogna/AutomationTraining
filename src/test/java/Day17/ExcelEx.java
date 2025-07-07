package Day17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;

public class ExcelEx {
    WebDriver driver;
    @Test
    public void registration() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        String Filepath = System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"TestData.xlsx";
        File f = new File(Filepath);
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Data");
        int rowCount = sheet.getLastRowNum();
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
        WebElement mobile = driver.findElement(By.id("userNumber"));
        WebElement address = driver.findElement(By.id("currentAddress"));
        WebElement submit = driver.findElement(By.id("submit"));
        for (int i =1;i<=rowCount;i++){
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (sheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Male")){
                //male.click();
                js.executeScript("arguments[0].click()",male);
            }
            else {
                //female.click();
                js.executeScript("arguments[0].click()",female);
            }
            mobile.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
            address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
            js.executeScript("arguments[0].click()",submit);
            WebElement success = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            XSSFCell cell = sheet.getRow(i).createCell(6);
            if (success.isDisplayed()){
                cell.setCellValue("Pass");
            }
            else{
                cell.setCellValue("Fail");
            }
            FileOutputStream fos = new FileOutputStream(f);
            wb.write(fos);
            WebElement closePopup = driver.findElement(By.id("closeLargeModal"));
            js.executeScript("arguments[0].click()",closePopup);
            Thread.sleep(5000);

        }
        wb.close();
        driver.close();







    }
}
