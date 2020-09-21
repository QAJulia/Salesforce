package pages;

import elements.Input;
import elements.Select;
import io.qameta.allure.Step;
import modals.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewAccountModal extends BasePage {

    public static By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    public static By INPUTS = By.cssSelector(".input");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Step("Ввод корректных данных в поля формы создания аккаунта")
    public AccountsPage createAccount(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipCode());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipCode());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new Select(driver, "Industry").select(account.getIndustry());
        new Select(driver, "Type").select(account.getType());
        driver.findElement(SAVE_BUTTON).click();
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        return new AccountsPage(driver);
    }

    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUTS));
        return this;
    }

    public NewAccountModal openPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/new?count=6&nooverride=1&useRecordTypeCheck=1&navigationLocation=MRU_LIST&backgroundContext=%2Flightning%2Fo%2FAccount%2Flist%3FfilterName%3DRecent");
        isPageOpened();
        return this;
    }
}
