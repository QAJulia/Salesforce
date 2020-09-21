package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends BasePage{

    public static By UNIQUE_BUTTON = By.cssSelector("[title='Add to Campaign']");
    public static By NEW_BUTTON = By.cssSelector("[title=New]");

    public ContactsPage(WebDriver driver){
        super(driver);
    }

    public ContactsPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UNIQUE_BUTTON));
        return this;
    }

    @Step("Открытие страницы списка контактов")
    public ContactsPage openPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    @Step("Нажатие кнопки создания нового контакта и вызов соответствущей формы для заполнения")
    public NewContactModal createNewContactsButtonClick() {
        driver.findElement(NEW_BUTTON).click();
        return new NewContactModal(driver);
    }
}
