/*
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class Selenium {
        private static WebDriver driver;
        private static final Logger logger = LogManager.getLogger(Selenium.class.getName());

        @Test (groups = {"ALL"})
        public static void test(){
                System.setProperty("Webdriver.gecko.driver","C:\\Users\\Ankur\\IdeaProjects\\Selenium\\geckodriver");
                driver = new FirefoxDriver();
                logger.info("New Driver Instantiated");


                logger.debug("Implicit wait applied on the driver for 10 seconds");

                driver.get("http://www.store.demoqa.com");

                logger.info("Web application launched");

                Reporter.log("Application Launched Successfully");

                WebElement element = driver.findElement(By.id("menu-item-72"));

                Assert.assertFalse(element.isDisplayed());

                driver.quit();

                Reporter.log("Application quit successfully");

        }
}

        @Test
    public void Testcase1() {
            System.out.println("This is test case 1");

        }

        @Test
        public void testcase2(){
            System.out.println("This is test case 2");

        }

        @BeforeMethod

        public void beforemethod(){

            System.out.println("This will execute before every Method");

        }


        @AfterMethod
        public void aftermethod(){

            System.out.println("This will execute after every Method");
        }

        @BeforeClass
        public void beforeclass(){

            System.out.println("This will execute before the Class");
        }

        @AfterClass
        public void afterclass(){
            System.out.println("This will execute after class");
        }

    @BeforeTest

    public void beforeTest() {

        System.out.println("This will execute before the Test");

    }

    @AfterTest

    public void afterTest() {

        System.out.println("This will execute after the Test");

    }

    @BeforeSuite

    public void beforeSuite() {

        System.out.println("This will execute before the Test Suite");

    }

    @AfterSuite

    public void afterSuite() {

        System.out.println("This will execute after the Test Suite");

    }
*/




