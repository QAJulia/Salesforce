package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public static final By USERNAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    @Step("Открытие страницы входа")
    public LoginPage openPage() {
        driver.get("https://login.salesforce.com");
        isPageOpened();
        return this;
    }

    public LoginPage loginWithoutRedirect(String username, String password){
        driver.findElement(USERNAME).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

    @Step("Ввод корректных данных для входа")
    public MainPage login(String username, String password){
        loginWithoutRedirect(username, password);
        return new MainPage(driver);
    }
}
