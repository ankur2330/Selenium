package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import pageObjects.Sign_in;
import utility.Constant;

public class Global_Var_TC {
    public static WebDriver driver = null;
    public static void  main(String args[]){
        System.setProperty("webdriver.gecko.driver","/home/ankur/Downloads/idea-IC-181.4203.550/geckodriver");
        driver = new FirefoxDriver();
        driver.get(Constant.URL);
        Sign_in.Execute(driver,Constant.Username,Constant.Password);
        System.out.println("Login is Successful");
        driver.quit();
    }
}
