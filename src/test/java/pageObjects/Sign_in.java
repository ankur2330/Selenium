package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_in {
    public static void Execute(WebDriver driver,String sUsername,String sPassword){
        Home_Page.lnk_Myaccount(driver).click();
        Login_page.txtbx_UserName(driver).click();
        Login_page.txtbx_Password(driver).click();
        Login_page.btn_LogIn(driver). click();
    }
}
