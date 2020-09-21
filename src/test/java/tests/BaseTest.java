package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest{
    WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;
    NewAccountModal newAccountModal;
    NewContactModal newContactModal;
    AccountsPage accountsPage;
    ContactsPage contactsPage;
    public final static String USERNAME = "kira_2.94-ldu3@force.com";
    public final static String PASSWORD = "Q033008061zxcv";

    @BeforeMethod
    public void setUp(){
        //System.setProperty("webdriver.opera.driver", "src/test/resources/operadriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //driver = new OperaDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        newAccountModal = new NewAccountModal(driver);
        newContactModal = new NewContactModal(driver);
        accountsPage = new AccountsPage(driver);
        contactsPage = new ContactsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
