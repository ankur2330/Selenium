package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import pageObjects.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;

import java.util.concurrent.TimeUnit;

public class APACHE_POI_TC {
    private static WebDriver driver = null;
    public static void main(String[] args) throws Exception {

        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
        System.setProperty("webdriver.gecko.driver","/home/ankur/Downloads/idea-IC-181.4203.550/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
        SignIn_Action.Execute(driver);
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        driver.quit();
        //This is to send the PASS value to the Excel sheet in the result column.
        ExcelUtils.setCellData("Pass", 1, 3);
    }

}
