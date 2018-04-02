package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import pageObjects.SignIn_Action;
import utility.Constant;

public class Global_Var_TC {
    public static WebDriver driver = null;
    public static void  main(String args[]) throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/ankur/Downloads/idea-IC-181.4203.550/geckodriver");
        driver = new FirefoxDriver();
        driver.get(Constant.URL);
        SignIn_Action.Execute(driver);
        System.out.println("Login is Successful");
        driver.quit();
    }
}
