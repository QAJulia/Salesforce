package pages;

import elements.Input;
import elements.Select;
import modals.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewContactModal extends BasePage{

    public static By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    public static By INPUTS = By.cssSelector(".input");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    public NewContactModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUTS));
        return this;
    }

    public NewContactModal openPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent");
        isPageOpened();
        return this;
    }

    public ContactsPage createContact(Contact contact) {
        new Select(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Account Name").click(contact.getAccountName());
        driver.findElement(SAVE_BUTTON).click();
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        return new ContactsPage(driver);
    }

}
