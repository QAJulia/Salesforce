package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Тест на логин")
    @Description("Логин, используя корректные данные, и проверка, что после логина" +
            "отобразилась главная страница")
    public void login() {
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .isPageOpened();
    }
}
