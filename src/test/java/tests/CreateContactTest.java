package tests;

import modals.Account;
import modals.Contact;
import org.testng.annotations.Test;

public class CreateContactTest extends BaseTest{

    @Test
    public void createContact(){
        Account juliaAccount = new Account("Julia", "375293663517", "2981175",
                "aaaa@web.com", "-", "10000$", "Minsk",
                "220000", "Minsk", "Belarus", "Minsk",
                "220000", "Minsk", "Belarus", "Banking",
                "Customer");
        Contact juliaContact = new Contact("Mrs.", "Julia", "Petrova",
                "2981175","375293663517", "blabla", "blabla@bla.com", "Julia");

        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .isPageOpened();
        accountsPage
                .openPage()
                .createNewAccountButtonClick()
                .createAccount(juliaAccount);
        contactsPage
                .openPage()
                .createNewContactsButtonClick()
                .createContact(juliaContact);
    }
}
