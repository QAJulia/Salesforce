package tests;

import modals.Account;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest{

    @Test
    public void createAccount(){
        Account julia = new Account("Julia", "375293663517", "2981175",
                "aaaa@web.com", "-", "10000$", "Minsk",
                "220000", "Minsk", "Belarus", "Minsk",
                "220000", "Minsk", "Belarus", "Banking",
                "Customer");
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .isPageOpened();
        accountsPage
                .openPage()
                .createNewAccountButtonClick()
                .createAccount(julia);
    }
}
