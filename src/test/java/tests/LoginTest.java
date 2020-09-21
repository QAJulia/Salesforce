package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .isPageOpened();
    }
}
