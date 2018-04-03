package pageObjects;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

import pageObjects.Login_page;

import pageObjects.Login_page;
import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {

    public static void Execute(WebDriver driver) throws Exception{

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

        String sUserName = ExcelUtils.getCellData(1, 1);

        String sPassword = ExcelUtils.getCellData(1, 2);

        Home_Page.lnk_Myaccount(driver).click();

        Login_page.txtbx_UserName(driver).sendKeys(sUserName);

        Login_page.txtbx_Password(driver).sendKeys(sPassword);

        Login_page.btn_LogIn(driver).click();

    }

}