package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage{

    public static By NEW_BUTTON = By.cssSelector("[title=New]");

    public AccountsPage(WebDriver driver){
        super(driver);
    }

    public AccountsPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        return this;
    }

    public AccountsPage openPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    public NewAccountModal createNewAccountButtonClick() {
    driver.findElement(NEW_BUTTON).click();
    return new NewAccountModal(driver);
    }
}
