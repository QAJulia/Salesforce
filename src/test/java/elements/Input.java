package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String locator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    String optionLocator = "//li//a//div[@title='%s']";

    public Input(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }

    public void write(String text){
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }

    public void click(String accountName) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, accountName))).click();
    }
}
