package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

import pageObjects.Home_Page;

import pageObjects.Login_page;

public class POM_TC {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        System.setProperty("Webdriver.gecko.driver","C:\\Users\\Ankur\\IdeaProjects\\Selenium\\geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.store.demoqa.com");

        // Use page Object library now

        Home_Page.lnk_Myaccount(driver).click();
        Login_page.txtbx_UserName(driver).sendKeys("testuser_1");
        Login_page.txtbx_Password(driver).sendKeys("Test@123");
        Login_page.btn_LogIn(driver).click();

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        Home_Page.lnk_logout(driver).click();

        driver.quit();

    }

}