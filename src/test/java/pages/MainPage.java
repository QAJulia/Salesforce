package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MainPage extends BasePage {

    public static final By UNIQUE_LOCATOR = By.id("trial-subscribe-now");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        driver.get("https://ap16.lightning.force.com/lightning/page/home");
        isPageOpened();
        return this;
    }

    @Step("Проверка открытия главной страницы")
    public MainPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UNIQUE_LOCATOR));
        Assert.assertTrue(driver.findElement(UNIQUE_LOCATOR).isDisplayed());
        return this;
    }
}
