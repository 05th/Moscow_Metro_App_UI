package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void click(WebElement element) {
        waitForElementToBeClickable(element).click();
    }

//    protected void type(WebElement element, String text) {
//        WebElement el = waitForElementToBeVisible(element);
//        el.clear();
//        el.sendKeys(text);
//    }

//    protected String getPageTitle() {
//        return driver.getTitle();
//    }
//
//    protected String getCurrentUrl() {
//        return driver.getCurrentUrl();
//    }


}
